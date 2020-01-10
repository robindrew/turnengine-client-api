package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUpkeepListJsonSerializer implements IJsonSerializer<IGetUpkeepList> {

	private String name;

	public GetUpkeepListJsonSerializer() {
		this("GetUpkeepList");
	}

	public GetUpkeepListJsonSerializer(String name) {
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
	public IGetUpkeepList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUpkeepList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.closeObject();
	}
}
