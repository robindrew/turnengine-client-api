package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class SetTurnIntervalJsonSerializer implements IJsonSerializer<ISetTurnInterval> {

	private String name;

	public SetTurnIntervalJsonSerializer() {
		this("SetTurnInterval");
	}

	public SetTurnIntervalJsonSerializer(String name) {
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
	public ISetTurnInterval readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetTurnInterval object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeLong(object.getInterval());
		writer.closeObject();
	}
}
