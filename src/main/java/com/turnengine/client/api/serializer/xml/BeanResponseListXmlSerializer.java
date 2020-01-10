package com.turnengine.client.api.serializer.xml;

import java.util.Arrays;
import java.util.List;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBeanResponse;
import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.common.util.Check;

public class BeanResponseListXmlSerializer implements IXmlSerializer<List<IExecutableBeanResponse<?>>> {

	private final IXmlSerializer<IExecutableBeanResponse<?>> serializer;

	public BeanResponseListXmlSerializer(IXmlSerializer<IExecutableBeanResponse<?>> serializer) {
		this.serializer = Check.notNull("serializer", serializer);
	}

	@Override
	public List<IExecutableBeanResponse<?>> readObject(IXmlReader reader) {
		reader.startElement("BeanResponseList");
		int size = reader.readIntAttribute("size");
		IExecutableBeanResponse<?>[] array = new IExecutableBeanResponse<?>[size];
		for (int i = 0; i < size; i++) {
			array[i] = serializer.readObject(reader);
		}
		reader.endElement("BeanResponseList");
		return Arrays.asList(array);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IExecutableBeanResponse<?>> responseList) {
		writer.startElement("BeanResponseList");
		writer.writeAttribute("size", responseList.size());
		for (IExecutableBeanResponse<?> response : responseList) {
			serializer.writeObject(writer, response);
		}
		writer.endElement("BeanResponseList");
	}

}
