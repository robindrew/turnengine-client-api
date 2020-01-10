package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetPostListReturnTypeXmlSerializer implements IXmlSerializer<List<IForumPost>> {

	private String name;

	public GetPostListReturnTypeXmlSerializer() {
		this("GetPostListReturnType");
	}

	public GetPostListReturnTypeXmlSerializer(String name) {
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
	public List<IForumPost> readObject(IXmlReader reader) {
		return new ListSerializer<IForumPost>(getName(), new ForumPostXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IForumPost> object) {
		new ListSerializer<IForumPost>(getName(), new ForumPostXmlSerializer("element")).writeObject(writer, object);
	}
}
