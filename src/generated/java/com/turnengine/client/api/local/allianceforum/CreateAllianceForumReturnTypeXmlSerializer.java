package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class CreateAllianceForumReturnTypeXmlSerializer implements IXmlSerializer<IAllianceForum> {

	private String name;

	public CreateAllianceForumReturnTypeXmlSerializer() {
		this("CreateAllianceForumReturnType");
	}

	public CreateAllianceForumReturnTypeXmlSerializer(String name) {
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
	public IAllianceForum readObject(IXmlReader reader) {
		return new AllianceForumXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAllianceForum object) {
		new AllianceForumXmlSerializer(getName()).writeObject(writer, object);
	}
}
