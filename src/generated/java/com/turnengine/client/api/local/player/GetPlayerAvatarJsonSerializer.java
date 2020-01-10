package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetPlayerAvatarJsonSerializer implements IJsonSerializer<IGetPlayerAvatar> {

	private String name;

	public GetPlayerAvatarJsonSerializer() {
		this("GetPlayerAvatar");
	}

	public GetPlayerAvatarJsonSerializer(String name) {
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
	public IGetPlayerAvatar readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetPlayerAvatar object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPlayerId());
		writer.writeInt(object.getWidth());
		writer.writeInt(object.getHeight());
		writer.writeBoolean(object.getFill());
		writer.closeObject();
	}
}
