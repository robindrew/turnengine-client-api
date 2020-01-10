package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class UnitCountRangeJsonSerializer implements IJsonSerializer<IUnitCountRange> {

	private String name;

	public UnitCountRangeJsonSerializer() {
		this("UnitCountRange");
	}

	public UnitCountRangeJsonSerializer(String name) {
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
	public IUnitCountRange readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IUnitCountRange object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeLong(object.getMinAmount());
		writer.writeLong(object.getMaxAmount());
		writer.closeObject();
	}
}
