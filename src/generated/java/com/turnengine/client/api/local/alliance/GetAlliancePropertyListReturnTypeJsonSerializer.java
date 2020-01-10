package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetAlliancePropertyListReturnTypeJsonSerializer implements IJsonSerializer<List<IAllianceProperty>> {

	private String name;

	public GetAlliancePropertyListReturnTypeJsonSerializer() {
		this("GetAlliancePropertyListReturnType");
	}

	public GetAlliancePropertyListReturnTypeJsonSerializer(String name) {
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
	public List<IAllianceProperty> readObject(IJsonReader reader) {
		return new ListSerializer<IAllianceProperty>(new AlliancePropertyJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IAllianceProperty> object) {
		new ListSerializer<IAllianceProperty>(new AlliancePropertyJsonSerializer()).writeObject(writer, object);
	}
}
