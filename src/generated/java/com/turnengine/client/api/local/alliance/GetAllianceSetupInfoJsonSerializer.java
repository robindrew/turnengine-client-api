package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAllianceSetupInfoJsonSerializer implements IJsonSerializer<IGetAllianceSetupInfo> {

	private String name;

	public GetAllianceSetupInfoJsonSerializer() {
		this("GetAllianceSetupInfo");
	}

	public GetAllianceSetupInfoJsonSerializer(String name) {
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
	public IGetAllianceSetupInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetAllianceSetupInfo object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.closeObject();
	}
}
