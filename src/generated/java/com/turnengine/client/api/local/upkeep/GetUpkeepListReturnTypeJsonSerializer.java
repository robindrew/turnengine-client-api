package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetUpkeepListReturnTypeJsonSerializer implements IJsonSerializer<List<IUpkeep>> {

	private String name;

	public GetUpkeepListReturnTypeJsonSerializer() {
		this("GetUpkeepListReturnType");
	}

	public GetUpkeepListReturnTypeJsonSerializer(String name) {
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
	public List<IUpkeep> readObject(IJsonReader reader) {
		return new ListSerializer<IUpkeep>(new UpkeepJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IUpkeep> object) {
		new ListSerializer<IUpkeep>(new UpkeepJsonSerializer()).writeObject(writer, object);
	}
}
