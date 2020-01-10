package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class SetPostFlagJsonSerializer implements IJsonSerializer<ISetPostFlag> {

	private String name;

	public SetPostFlagJsonSerializer() {
		this("SetPostFlag");
	}

	public SetPostFlagJsonSerializer(String name) {
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
	public ISetPostFlag readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetPostFlag object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getPostId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class));
		writer.writeBoolean(object.getSet());
		writer.closeObject();
	}
}
