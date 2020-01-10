package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class SetPlayerLimitJsonSerializer implements IJsonSerializer<ISetPlayerLimit> {

	private String name;

	public SetPlayerLimitJsonSerializer() {
		this("SetPlayerLimit");
	}

	public SetPlayerLimitJsonSerializer(String name) {
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
	public ISetPlayerLimit readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetPlayerLimit object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLimit());
		writer.closeObject();
	}
}
