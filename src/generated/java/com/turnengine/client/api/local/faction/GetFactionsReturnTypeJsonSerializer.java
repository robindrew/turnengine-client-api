package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetFactionsReturnTypeJsonSerializer implements IJsonSerializer<List<IFaction>> {

	private String name;

	public GetFactionsReturnTypeJsonSerializer() {
		this("GetFactionsReturnType");
	}

	public GetFactionsReturnTypeJsonSerializer(String name) {
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
	public List<IFaction> readObject(IJsonReader reader) {
		return new ListSerializer<IFaction>(new FactionJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IFaction> object) {
		new ListSerializer<IFaction>(new FactionJsonSerializer()).writeObject(writer, object);
	}
}
