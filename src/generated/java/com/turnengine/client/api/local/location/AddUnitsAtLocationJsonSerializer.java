package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AddUnitsAtLocationJsonSerializer implements IJsonSerializer<IAddUnitsAtLocation> {

	private String name;

	public AddUnitsAtLocationJsonSerializer() {
		this("AddUnitsAtLocation");
	}

	public AddUnitsAtLocationJsonSerializer(String name) {
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
	public IAddUnitsAtLocation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAddUnitsAtLocation object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getUnitId());
		writer.writeLong(object.getAmount());
		writer.closeObject();
	}
}
