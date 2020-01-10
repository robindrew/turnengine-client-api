package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.array.ByteArraySerializer;

public class SetPlayerAvatarJsonSerializer implements IJsonSerializer<ISetPlayerAvatar> {

	private String name;

	public SetPlayerAvatarJsonSerializer() {
		this("SetPlayerAvatar");
	}

	public SetPlayerAvatarJsonSerializer(String name) {
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
	public ISetPlayerAvatar readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetPlayerAvatar object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getImage(), new ByteArraySerializer());
		writer.closeObject();
	}
}
