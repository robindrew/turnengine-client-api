package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetAllUnitsAtPlayerReturnTypeJsonSerializer implements IJsonSerializer<List<IUnitCount>> {

	private String name;

	public GetAllUnitsAtPlayerReturnTypeJsonSerializer() {
		this("GetAllUnitsAtPlayerReturnType");
	}

	public GetAllUnitsAtPlayerReturnTypeJsonSerializer(String name) {
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
	public List<IUnitCount> readObject(IJsonReader reader) {
		return new ListSerializer<IUnitCount>(new UnitCountJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IUnitCount> object) {
		new ListSerializer<IUnitCount>(new UnitCountJsonSerializer()).writeObject(writer, object);
	}
}
