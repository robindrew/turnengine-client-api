package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAllianceReturnTypeJsonSerializer implements IJsonSerializer<IAlliance> {

	private String name;

	public GetAllianceReturnTypeJsonSerializer() {
		this("GetAllianceReturnType");
	}

	public GetAllianceReturnTypeJsonSerializer(String name) {
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
	public IAlliance readObject(IJsonReader reader) {
		return new AllianceJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IAlliance object) {
		new AllianceJsonSerializer().writeObject(writer, object);
	}
}
