package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetAllianceThreadListReturnTypeXmlSerializer implements IXmlSerializer<List<IAllianceForumThread>> {

	private String name;

	public GetAllianceThreadListReturnTypeXmlSerializer() {
		this("GetAllianceThreadListReturnType");
	}

	public GetAllianceThreadListReturnTypeXmlSerializer(String name) {
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
	public List<IAllianceForumThread> readObject(IXmlReader reader) {
		return new ListSerializer<IAllianceForumThread>(getName(), new AllianceForumThreadXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IAllianceForumThread> object) {
		new ListSerializer<IAllianceForumThread>(getName(), new AllianceForumThreadXmlSerializer("element")).writeObject(writer, object);
	}
}
