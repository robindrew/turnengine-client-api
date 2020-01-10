package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class GetGameStatusReturnTypeJsonSerializer implements IJsonSerializer<GameStatus> {

	private String name;

	public GetGameStatusReturnTypeJsonSerializer() {
		this("GetGameStatusReturnType");
	}

	public GetGameStatusReturnTypeJsonSerializer(String name) {
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
	public GameStatus readObject(IJsonReader reader) {
		return new EnumSerializer<GameStatus>(GameStatus.class).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, GameStatus object) {
		new EnumSerializer<GameStatus>(GameStatus.class).writeObject(writer, object);
	}
}
