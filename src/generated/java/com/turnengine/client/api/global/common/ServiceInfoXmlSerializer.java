package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class ServiceInfoXmlSerializer implements IXmlSerializer<IServiceInfo> {

	private String name;

	public ServiceInfoXmlSerializer() {
		this("ServiceInfo");
	}

	public ServiceInfoXmlSerializer(String name) {
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
	public IServiceInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		IProjectInfo param2 = reader.readObject(new ProjectInfoXmlSerializer("project"));
		reader.endElement(getName());

		// Create the bean
		return new ServiceInfo(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IServiceInfo object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getProject(), new ProjectInfoXmlSerializer("project"));
		writer.endElement(getName());
	}
}
