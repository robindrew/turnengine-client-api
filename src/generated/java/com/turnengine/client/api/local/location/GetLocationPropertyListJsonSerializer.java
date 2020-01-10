package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetLocationPropertyListJsonSerializer implements IJsonSerializer<IGetLocationPropertyList> {

	private String name;

	public GetLocationPropertyListJsonSerializer() {
		this("GetLocationPropertyList");
	}

	public GetLocationPropertyListJsonSerializer(String name) {
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
	public IGetLocationPropertyList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetLocationPropertyList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPlayerId());
		writer.writeInt(object.getLocationId());
		writer.closeObject();
	}
}
