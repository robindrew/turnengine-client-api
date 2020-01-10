package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class SetForumOrderJsonSerializer implements IJsonSerializer<ISetForumOrder> {

	private String name;

	public SetForumOrderJsonSerializer() {
		this("SetForumOrder");
	}

	public SetForumOrderJsonSerializer(String name) {
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
	public ISetForumOrder readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetForumOrder object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getOrder());
		writer.closeObject();
	}
}
