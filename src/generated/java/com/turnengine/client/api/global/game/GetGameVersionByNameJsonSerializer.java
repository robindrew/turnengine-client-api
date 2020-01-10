package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetGameVersionByNameJsonSerializer implements IJsonSerializer<IGetGameVersionByName> {

	private String name;

	public GetGameVersionByNameJsonSerializer() {
		this("GetGameVersionByName");
	}

	public GetGameVersionByNameJsonSerializer(String name) {
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
	public IGetGameVersionByName readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameVersionByName object) {
		writer.openObject();
		writer.writeObject(object.getVersionName(), new StringSerializer());
		writer.writeInt(object.getGameId());
		writer.closeObject();
	}
}
