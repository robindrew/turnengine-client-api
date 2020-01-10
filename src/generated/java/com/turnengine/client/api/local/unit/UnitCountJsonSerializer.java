package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class UnitCountJsonSerializer implements IJsonSerializer<IUnitCount> {

	private String name;

	public UnitCountJsonSerializer() {
		this("UnitCount");
	}

	public UnitCountJsonSerializer(String name) {
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
	public IUnitCount readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IUnitCount object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeLong(object.getAmount());
		writer.closeObject();
	}
}
