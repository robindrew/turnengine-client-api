package com.turnengine.client.api.serializer.xml;

import java.util.Arrays;
import java.util.List;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.common.util.Check;

public class BeanRequestListXmlSerializer implements IXmlSerializer<List<IExecutableBean<?>>> {

	private final IXmlSerializer<IExecutableBean<?>> serializer;

	public BeanRequestListXmlSerializer(IXmlSerializer<IExecutableBean<?>> serializer) {
		this.serializer = Check.notNull("serializer", serializer);
	}

	@Override
	public List<IExecutableBean<?>> readObject(IXmlReader reader) {
		reader.startElement("BeanList");
		int size = reader.readIntAttribute("size");
		IExecutableBean<?>[] array = new IExecutableBean<?>[size];
		for (int i = 0; i < size; i++) {
			array[i] = serializer.readObject(reader);
		}
		reader.endElement("BeanList");
		return Arrays.asList(array);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IExecutableBean<?>> beanList) {
		writer.startElement("BeanList");
		writer.writeAttribute("size", beanList.size());
		for (IExecutableBean<?> bean : beanList) {
			serializer.writeObject(writer, bean);
		}
		writer.endElement("BeanList");
	}

}
