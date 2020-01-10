package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetUnitsByFactionNameJsonSerializer implements IJsonSerializer<IGetUnitsByFactionName> {

	private String name;

	public GetUnitsByFactionNameJsonSerializer() {
		this("GetUnitsByFactionName");
	}

	public GetUnitsByFactionNameJsonSerializer(String name) {
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
	public IGetUnitsByFactionName readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUnitsByFactionName object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.closeObject();
	}
}
