package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAllianceInfoReturnTypeJsonSerializer implements IJsonSerializer<IAllianceInfo> {

	private String name;

	public GetAllianceInfoReturnTypeJsonSerializer() {
		this("GetAllianceInfoReturnType");
	}

	public GetAllianceInfoReturnTypeJsonSerializer(String name) {
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
	public IAllianceInfo readObject(IJsonReader reader) {
		return new AllianceInfoJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IAllianceInfo object) {
		new AllianceInfoJsonSerializer().writeObject(writer, object);
	}
}
