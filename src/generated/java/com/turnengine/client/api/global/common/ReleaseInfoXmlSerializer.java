package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ReleaseInfoXmlSerializer implements IXmlSerializer<IReleaseInfo> {

	private String name;

	public ReleaseInfoXmlSerializer() {
		this("ReleaseInfo");
	}

	public ReleaseInfoXmlSerializer(String name) {
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
	public IReleaseInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("number");
		IProjectInfo param2 = reader.readObject(new ProjectInfoXmlSerializer("project"));
		reader.endElement(getName());

		// Create the bean
		return new ReleaseInfo(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IReleaseInfo object) {
		writer.startElement(getName());
		writer.writeInt("number", object.getNumber());
		writer.writeObject(object.getProject(), new ProjectInfoXmlSerializer("project"));
		writer.endElement(getName());
	}
}
