package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetThreadListJsonSerializer implements IJsonSerializer<IGetThreadList> {

	private String name;

	public GetThreadListJsonSerializer() {
		this("GetThreadList");
	}

	public GetThreadListJsonSerializer(String name) {
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
	public IGetThreadList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetThreadList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
		writer.closeObject();
	}
}
