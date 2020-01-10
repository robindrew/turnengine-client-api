package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class SetPlayerActionQueueLimitJsonSerializer implements IJsonSerializer<ISetPlayerActionQueueLimit> {

	private String name;

	public SetPlayerActionQueueLimitJsonSerializer() {
		this("SetPlayerActionQueueLimit");
	}

	public SetPlayerActionQueueLimitJsonSerializer(String name) {
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
	public ISetPlayerActionQueueLimit readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetPlayerActionQueueLimit object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLimit());
		writer.closeObject();
	}
}
