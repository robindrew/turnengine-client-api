package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AllianceSetupInfoJsonSerializer implements IJsonSerializer<IAllianceSetupInfo> {

	private String name;

	public AllianceSetupInfoJsonSerializer() {
		this("AllianceSetupInfo");
	}

	public AllianceSetupInfoJsonSerializer(String name) {
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
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAllianceSetupInfo object) {
		writer.openObject();
		writer.writeInt(object.getCount());
		writer.writeBoolean(object.getEnabled());
		writer.writeInt(object.getMemberLimit());
		writer.writeInt(object.getInviteLimit());
		writer.writeInt(object.getLeaveTurns());
		writer.closeObject();
	}
}
