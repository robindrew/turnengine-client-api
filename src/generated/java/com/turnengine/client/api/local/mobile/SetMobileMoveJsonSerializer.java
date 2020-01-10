package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class SetMobileMoveJsonSerializer implements IJsonSerializer<ISetMobileMove> {

	private String name;

	public SetMobileMoveJsonSerializer() {
		this("SetMobileMove");
	}

	public SetMobileMoveJsonSerializer(String name) {
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
	public ISetMobileMove readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetMobileMove object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getOriginId());
		writer.writeInt(object.getDestinationId());
		writer.writeInt(object.getTurns());
		writer.closeObject();
	}
}
