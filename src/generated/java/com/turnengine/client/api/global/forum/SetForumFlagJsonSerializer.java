package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class SetForumFlagJsonSerializer implements IJsonSerializer<ISetForumFlag> {

	private String name;

	public SetForumFlagJsonSerializer() {
		this("SetForumFlag");
	}

	public SetForumFlagJsonSerializer(String name) {
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
	public ISetForumFlag readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetForumFlag object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getForumId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class));
		writer.writeBoolean(object.getSet());
		writer.closeObject();
	}
}
