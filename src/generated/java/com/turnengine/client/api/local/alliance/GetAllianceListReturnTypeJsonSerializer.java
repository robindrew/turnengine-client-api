package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetAllianceListReturnTypeJsonSerializer implements IJsonSerializer<List<IAlliance>> {

	private String name;

	public GetAllianceListReturnTypeJsonSerializer() {
		this("GetAllianceListReturnType");
	}

	public GetAllianceListReturnTypeJsonSerializer(String name) {
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
	public List<IAlliance> readObject(IJsonReader reader) {
		return new ListSerializer<IAlliance>(new AllianceJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IAlliance> object) {
		new ListSerializer<IAlliance>(new AllianceJsonSerializer()).writeObject(writer, object);
	}
}
