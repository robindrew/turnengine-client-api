package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetAlliancePostListReturnTypeXmlSerializer implements IXmlSerializer<List<IAllianceForumPost>> {

	private String name;

	public GetAlliancePostListReturnTypeXmlSerializer() {
		this("GetAlliancePostListReturnType");
	}

	public GetAlliancePostListReturnTypeXmlSerializer(String name) {
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
	public List<IAllianceForumPost> readObject(IXmlReader reader) {
		return new ListSerializer<IAllianceForumPost>(getName(), new AllianceForumPostXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IAllianceForumPost> object) {
		new ListSerializer<IAllianceForumPost>(getName(), new AllianceForumPostXmlSerializer("element")).writeObject(writer, object);
	}
}
