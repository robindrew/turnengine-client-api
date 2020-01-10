package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetFactionByNameJsonSerializer implements IJsonSerializer<IGetFactionByName> {

	private String name;

	public GetFactionByNameJsonSerializer() {
		this("GetFactionByName");
	}

	public GetFactionByNameJsonSerializer(String name) {
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
	public IGetFactionByName readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetFactionByName object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.closeObject();
	}
}
