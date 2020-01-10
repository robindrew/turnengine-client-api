package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AddUnitsAtMobileJsonSerializer implements IJsonSerializer<IAddUnitsAtMobile> {

	private String name;

	public AddUnitsAtMobileJsonSerializer() {
		this("AddUnitsAtMobile");
	}

	public AddUnitsAtMobileJsonSerializer(String name) {
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
	public IAddUnitsAtMobile readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAddUnitsAtMobile object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getUnitId());
		writer.writeLong(object.getAmount());
		writer.closeObject();
	}
}
