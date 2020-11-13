package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUnitsAtPlayerByGroupIdJsonSerializer implements IJsonSerializer<IGetUnitsAtPlayerByGroupId> {

	private String name;

	public GetUnitsAtPlayerByGroupIdJsonSerializer() {
		this("GetUnitsAtPlayerByGroupId");
	}

	public GetUnitsAtPlayerByGroupIdJsonSerializer(String name) {
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
	public IGetUnitsAtPlayerByGroupId readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUnitsAtPlayerByGroupId object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getGroupId());
		writer.closeObject();
	}
}
