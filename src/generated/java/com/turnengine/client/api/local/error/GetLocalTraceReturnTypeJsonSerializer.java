package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetLocalTraceReturnTypeJsonSerializer implements IJsonSerializer<ILocalTrace> {

	private String name;

	public GetLocalTraceReturnTypeJsonSerializer() {
		this("GetLocalTraceReturnType");
	}

	public GetLocalTraceReturnTypeJsonSerializer(String name) {
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
	public ILocalTrace readObject(IJsonReader reader) {
		return new LocalTraceJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, ILocalTrace object) {
		new LocalTraceJsonSerializer().writeObject(writer, object);
	}
}
