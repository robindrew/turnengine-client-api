package com.turnengine.client.api.executable.executor.type;

import static com.google.common.base.Charsets.UTF_8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.codegenerator.api.executable.bean.IExecutableBeanResponse;
import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.XmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.stax.StaxXmlReader;
import com.robindrew.common.util.Java;
import com.turnengine.client.api.global.common.GlobalReturnTypeXmlSerializerFactory;
import com.turnengine.client.api.global.common.GlobalXmlSerializerFactory;
import com.turnengine.client.api.serializer.xml.BeanRequestListXmlSerializer;
import com.turnengine.client.api.serializer.xml.BeanRequestXmlSerializer;
import com.turnengine.client.api.serializer.xml.BeanResponseListXmlSerializer;
import com.turnengine.client.api.serializer.xml.BeanResponseXmlSerializer;

/**
 * A XML serializer for reading and writing {@link IExecutableBean} and {@link IExecutableBeanResponse}.
 */
public class XmlContentTypeSerializer implements IContentTypeSerializer {

	private final IXmlSerializer<List<IExecutableBean<?>>> beanListSerializer;
	private final IXmlSerializer<List<IExecutableBeanResponse<?>>> responseListSerializer;

	public XmlContentTypeSerializer() {

		GlobalXmlSerializerFactory beanSerializerFactory = new GlobalXmlSerializerFactory();
		GlobalReturnTypeXmlSerializerFactory responseSerializerFactory = new GlobalReturnTypeXmlSerializerFactory();

		// Bean List Serializer
		beanListSerializer = new BeanRequestListXmlSerializer(new BeanRequestXmlSerializer(beanSerializerFactory));

		// Response List Serializer
		responseListSerializer = new BeanResponseListXmlSerializer(new BeanResponseXmlSerializer(responseSerializerFactory));

	}

	@Override
	public SerializedContentType getContentType() {
		return SerializedContentType.XML;
	}

	@Override
	public List<IExecutableBean<?>> readBeans(byte[] bytes) {
		ByteArrayInputStream response = new ByteArrayInputStream(bytes);
		IXmlReader reader = StaxXmlReader.newInstance(new InputStreamReader(response, UTF_8));
		return beanListSerializer.readObject(reader);
	}

	@Override
	public byte[] writeBeans(List<IExecutableBean<?>> beans) {
		try {
			ByteArrayOutputStream request = new ByteArrayOutputStream();
			OutputStreamWriter byteWriter = new OutputStreamWriter(request, UTF_8);
			IXmlWriter writer = new XmlWriter(byteWriter);
			beanListSerializer.writeObject(writer, beans);
			byteWriter.flush();
			return request.toByteArray();
		} catch (IOException e) {
			throw Java.propagate(e);
		}
	}

	@Override
	public List<IExecutableBeanResponse<?>> readResponses(byte[] bytes) {
		ByteArrayInputStream response = new ByteArrayInputStream(bytes);
		IXmlReader reader = StaxXmlReader.newInstance(new InputStreamReader(response, UTF_8));
		return responseListSerializer.readObject(reader);
	}

	@Override
	public byte[] writeResponses(List<IExecutableBeanResponse<?>> responses) {
		try {
			ByteArrayOutputStream response = new ByteArrayOutputStream();
			OutputStreamWriter output = new OutputStreamWriter(response, UTF_8);
			IXmlWriter writer = new XmlWriter(output);
			responseListSerializer.writeObject(writer, responses);
			output.flush();
			return response.toByteArray();
		} catch (IOException e) {
			throw Java.propagate(e);
		}
	}

}
