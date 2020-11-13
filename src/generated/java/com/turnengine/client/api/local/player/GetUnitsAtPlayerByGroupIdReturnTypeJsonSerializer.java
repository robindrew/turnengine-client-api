package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountJsonSerializer;
import java.util.List;

public class GetUnitsAtPlayerByGroupIdReturnTypeJsonSerializer implements IJsonSerializer<List<IUnitCount>> {

	private String name;

	public GetUnitsAtPlayerByGroupIdReturnTypeJsonSerializer() {
		this("GetUnitsAtPlayerByGroupIdReturnType");
	}

	public GetUnitsAtPlayerByGroupIdReturnTypeJsonSerializer(String name) {
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
