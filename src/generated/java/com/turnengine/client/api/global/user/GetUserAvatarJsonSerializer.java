package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUserAvatarJsonSerializer implements IJsonSerializer<IGetUserAvatar> {

	private String name;

	public GetUserAvatarJsonSerializer() {
		this("GetUserAvatar");
	}

	public GetUserAvatarJsonSerializer(String name) {
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
	public IGetUserAvatar readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUserAvatar object) {
		writer.openObject();
		writer.writeInt(object.getUserId());
		writer.writeInt(object.getWidth());
		writer.writeInt(object.getHeight());
		writer.writeBoolean(object.getFill());
		writer.closeObject();
	}
}
