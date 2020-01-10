package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class UnitNameCountJsonSerializer implements IJsonSerializer<IUnitNameCount> {

	private String name;

	public UnitNameCountJsonSerializer() {
		this("UnitNameCount");
	}

	public UnitNameCountJsonSerializer(String name) {
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
	public IUnitNameCount readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IUnitNameCount object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeLong(object.getAmount());
		writer.closeObject();
	}
}
