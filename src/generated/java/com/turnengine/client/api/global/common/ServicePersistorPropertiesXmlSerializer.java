package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class ServicePersistorPropertiesXmlSerializer implements IXmlSerializer<IServicePersistorProperties> {

	private String name;

	public ServicePersistorPropertiesXmlSerializer() {
		this("ServicePersistorProperties");
	}

	public ServicePersistorPropertiesXmlSerializer(String name) {
		this.name = name;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	public String getName() {
		return name;
	}

	@Override
	public IServicePersistorProperties readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("database"));
		reader.endElement(getName());

		// Create the bean
		return new ServicePersistorProperties(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IServicePersistorProperties object) {
		writer.startElement(getName());
		writer.writeObject(object.getDatabase(), new StringSerializer("database"));
		writer.endElement(getName());
	}
}
