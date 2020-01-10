package com.turnengine.client.api.serializer.xml;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.codegenerator.api.factory.IObjectFactory;
import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.common.util.Check;

public class BeanRequestXmlSerializer implements IXmlSerializer<IExecutableBean<?>> {

	private final IObjectFactory<IXmlSerializer<?>> serializerFactory;

	public BeanRequestXmlSerializer(IObjectFactory<IXmlSerializer<?>> serializerFactory) {
		this.serializerFactory = Check.notNull("serializerFactory", serializerFactory);
	}

	@Override
	public IExecutableBean<?> readObject(IXmlReader reader) {
		reader.startElement("Bean");
		int id = reader.readIntAttribute("id");
		IXmlSerializer<?> serializer = serializerFactory.newInstance(id);
		IExecutableBean<?> bean = (IExecutableBean<?>) reader.readObject(serializer);
		reader.endElement("Bean");
		return bean;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void writeObject(IXmlWriter writer, IExecutableBean<?> bean) {
		int id = bean.getSerializationId();
		writer.startElement("Bean");
		writer.writeAttribute("id", id);
		IXmlSerializer serializer = serializerFactory.newInstance(id);
		writer.writeObject(bean, serializer);
		writer.endElement("Bean");
	}

}
