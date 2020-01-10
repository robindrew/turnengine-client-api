package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetPlayerPropertyListJsonSerializer implements IJsonSerializer<IGetPlayerPropertyList> {

	private String name;

	public GetPlayerPropertyListJsonSerializer() {
		this("GetPlayerPropertyList");
	}

	public GetPlayerPropertyListJsonSerializer(String name) {
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
	public IGetPlayerPropertyList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetPlayerPropertyList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPlayerId());
		writer.closeObject();
	}
}
