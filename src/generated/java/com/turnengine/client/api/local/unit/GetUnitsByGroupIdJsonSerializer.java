package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUnitsByGroupIdJsonSerializer implements IJsonSerializer<IGetUnitsByGroupId> {

	private String name;

	public GetUnitsByGroupIdJsonSerializer() {
		this("GetUnitsByGroupId");
	}

	public GetUnitsByGroupIdJsonSerializer(String name) {
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
	public IGetUnitsByGroupId readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUnitsByGroupId object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getId());
		writer.closeObject();
	}
}
