package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class CreateAllianceForumPostReturnTypeXmlSerializer implements IXmlSerializer<IAllianceForumPost> {

	private String name;

	public CreateAllianceForumPostReturnTypeXmlSerializer() {
		this("CreateAllianceForumPostReturnType");
	}

	public CreateAllianceForumPostReturnTypeXmlSerializer(String name) {
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
	public IAllianceForumPost readObject(IXmlReader reader) {
		return new AllianceForumPostXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAllianceForumPost object) {
		new AllianceForumPostXmlSerializer(getName()).writeObject(writer, object);
	}
}
