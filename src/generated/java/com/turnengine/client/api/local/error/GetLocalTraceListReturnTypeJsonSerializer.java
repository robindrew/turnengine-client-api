package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetLocalTraceListReturnTypeJsonSerializer implements IJsonSerializer<List<ILocalTrace>> {

	private String name;

	public GetLocalTraceListReturnTypeJsonSerializer() {
		this("GetLocalTraceListReturnType");
	}

	public GetLocalTraceListReturnTypeJsonSerializer(String name) {
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
	public List<ILocalTrace> readObject(IJsonReader reader) {
		return new ListSerializer<ILocalTrace>(new LocalTraceJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<ILocalTrace> object) {
		new ListSerializer<ILocalTrace>(new LocalTraceJsonSerializer()).writeObject(writer, object);
	}
}
