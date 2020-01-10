package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameByIdJsonSerializer implements IJsonSerializer<IGetGameById> {

	private String name;

	public GetGameByIdJsonSerializer() {
		this("GetGameById");
	}

	public GetGameByIdJsonSerializer(String name) {
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
	public IGetGameById readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameById object) {
		writer.openObject();
		writer.writeInt(object.getGameId());
		writer.closeObject();
	}
}
