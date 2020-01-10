package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class SetThreadFlagJsonSerializer implements IJsonSerializer<ISetThreadFlag> {

	private String name;

	public SetThreadFlagJsonSerializer() {
		this("SetThreadFlag");
	}

	public SetThreadFlagJsonSerializer(String name) {
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
	public ISetThreadFlag readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetThreadFlag object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getThreadId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class));
		writer.writeBoolean(object.getSet());
		writer.closeObject();
	}
}
