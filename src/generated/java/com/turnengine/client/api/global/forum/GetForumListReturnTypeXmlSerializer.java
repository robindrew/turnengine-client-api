package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetForumListReturnTypeXmlSerializer implements IXmlSerializer<List<IForum>> {

	private String name;

	public GetForumListReturnTypeXmlSerializer() {
		this("GetForumListReturnType");
	}

	public GetForumListReturnTypeXmlSerializer(String name) {
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
	public List<IForum> readObject(IXmlReader reader) {
		return new ListSerializer<IForum>(getName(), new ForumXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IForum> object) {
		new ListSerializer<IForum>(getName(), new ForumXmlSerializer("element")).writeObject(writer, object);
	}
}
