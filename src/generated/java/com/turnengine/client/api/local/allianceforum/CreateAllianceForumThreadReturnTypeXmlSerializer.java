package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class CreateAllianceForumThreadReturnTypeXmlSerializer implements IXmlSerializer<IAllianceForumThread> {

	private String name;

	public CreateAllianceForumThreadReturnTypeXmlSerializer() {
		this("CreateAllianceForumThreadReturnType");
	}

	public CreateAllianceForumThreadReturnTypeXmlSerializer(String name) {
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
	public IAllianceForumThread readObject(IXmlReader reader) {
		return new AllianceForumThreadXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAllianceForumThread object) {
		new AllianceForumThreadXmlSerializer(getName()).writeObject(writer, object);
	}
}
