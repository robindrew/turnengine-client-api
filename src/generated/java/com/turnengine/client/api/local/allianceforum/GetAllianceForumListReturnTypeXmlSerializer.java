package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetAllianceForumListReturnTypeXmlSerializer implements IXmlSerializer<List<IAllianceForum>> {

	private String name;

	public GetAllianceForumListReturnTypeXmlSerializer() {
		this("GetAllianceForumListReturnType");
	}

	public GetAllianceForumListReturnTypeXmlSerializer(String name) {
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
	public List<IAllianceForum> readObject(IXmlReader reader) {
		return new ListSerializer<IAllianceForum>(getName(), new AllianceForumXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IAllianceForum> object) {
		new ListSerializer<IAllianceForum>(getName(), new AllianceForumXmlSerializer("element")).writeObject(writer, object);
	}
}
