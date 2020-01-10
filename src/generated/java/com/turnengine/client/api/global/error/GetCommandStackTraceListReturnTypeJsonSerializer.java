package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.error.ILocalTrace;
import com.turnengine.client.api.local.error.LocalTraceJsonSerializer;
import java.util.List;

public class GetCommandStackTraceListReturnTypeJsonSerializer implements IJsonSerializer<List<ILocalTrace>> {

	private String name;

	public GetCommandStackTraceListReturnTypeJsonSerializer() {
		this("GetCommandStackTraceListReturnType");
	}

	public GetCommandStackTraceListReturnTypeJsonSerializer(String name) {
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
