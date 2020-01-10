package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetForumListJsonSerializer implements IJsonSerializer<IGetForumList> {

	private String name;

	public GetForumListJsonSerializer() {
		this("GetForumList");
	}

	public GetForumListJsonSerializer(String name) {
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
	public IGetForumList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetForumList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.closeObject();
	}
}
