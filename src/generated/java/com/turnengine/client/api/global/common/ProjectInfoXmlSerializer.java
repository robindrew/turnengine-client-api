package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class ProjectInfoXmlSerializer implements IXmlSerializer<IProjectInfo> {

	private String name;

	public ProjectInfoXmlSerializer() {
		this("ProjectInfo");
	}

	public ProjectInfoXmlSerializer(String name) {
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
	public IProjectInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		reader.endElement(getName());

		// Create the bean
		return new ProjectInfo(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IProjectInfo object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.endElement(getName());
	}
}
