package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetThreadListReturnTypeXmlSerializer implements IXmlSerializer<List<IForumThread>> {

	private String name;

	public GetThreadListReturnTypeXmlSerializer() {
		this("GetThreadListReturnType");
	}

	public GetThreadListReturnTypeXmlSerializer(String name) {
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
	public List<IForumThread> readObject(IXmlReader reader) {
		return new ListSerializer<IForumThread>(getName(), new ForumThreadXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IForumThread> object) {
		new ListSerializer<IForumThread>(getName(), new ForumThreadXmlSerializer("element")).writeObject(writer, object);
	}
}
