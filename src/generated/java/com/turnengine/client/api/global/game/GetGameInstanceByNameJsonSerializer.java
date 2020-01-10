package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetGameInstanceByNameJsonSerializer implements IJsonSerializer<IGetGameInstanceByName> {

	private String name;

	public GetGameInstanceByNameJsonSerializer() {
		this("GetGameInstanceByName");
	}

	public GetGameInstanceByNameJsonSerializer(String name) {
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
	public IGetGameInstanceByName readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameInstanceByName object) {
		writer.openObject();
		writer.writeObject(object.getInstanceName(), new StringSerializer());
		writer.writeInt(object.getVersionId());
		writer.closeObject();
	}
}
