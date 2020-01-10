package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetUnitsByFactionNameReturnTypeJsonSerializer implements IJsonSerializer<List<IUnit>> {

	private String name;

	public GetUnitsByFactionNameReturnTypeJsonSerializer() {
		this("GetUnitsByFactionNameReturnType");
	}

	public GetUnitsByFactionNameReturnTypeJsonSerializer(String name) {
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
	public List<IUnit> readObject(IJsonReader reader) {
		return new ListSerializer<IUnit>(new UnitJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IUnit> object) {
		new ListSerializer<IUnit>(new UnitJsonSerializer()).writeObject(writer, object);
	}
}
