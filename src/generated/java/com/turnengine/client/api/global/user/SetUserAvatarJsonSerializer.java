package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.array.ByteArraySerializer;

public class SetUserAvatarJsonSerializer implements IJsonSerializer<ISetUserAvatar> {

	private String name;

	public SetUserAvatarJsonSerializer() {
		this("SetUserAvatar");
	}

	public SetUserAvatarJsonSerializer(String name) {
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
	public ISetUserAvatar readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetUserAvatar object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getImage(), new ByteArraySerializer());
		writer.closeObject();
	}
}
