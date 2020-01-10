package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAllianceSetupInfoReturnTypeJsonSerializer implements IJsonSerializer<IAllianceSetupInfo> {

	private String name;

	public GetAllianceSetupInfoReturnTypeJsonSerializer() {
		this("GetAllianceSetupInfoReturnType");
	}

	public GetAllianceSetupInfoReturnTypeJsonSerializer(String name) {
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
	public IAllianceSetupInfo readObject(IJsonReader reader) {
		return new AllianceSetupInfoJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IAllianceSetupInfo object) {
		new AllianceSetupInfoJsonSerializer().writeObject(writer, object);
	}
}
