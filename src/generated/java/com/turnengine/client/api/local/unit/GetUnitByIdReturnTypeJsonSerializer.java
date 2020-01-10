package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUnitByIdReturnTypeJsonSerializer implements IJsonSerializer<IUnit> {

	private String name;

	public GetUnitByIdReturnTypeJsonSerializer() {
		this("GetUnitByIdReturnType");
	}

	public GetUnitByIdReturnTypeJsonSerializer(String name) {
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
	public IUnit readObject(IJsonReader reader) {
		return new UnitJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IUnit object) {
		new UnitJsonSerializer().writeObject(writer, object);
	}
}
