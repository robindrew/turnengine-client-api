package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.game.GameStatus;

public class GetGameStatusReturnTypeXmlSerializer implements IXmlSerializer<GameStatus> {

	private String name;

	public GetGameStatusReturnTypeXmlSerializer() {
		this("GetGameStatusReturnType");
	}

	public GetGameStatusReturnTypeXmlSerializer(String name) {
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
	public GameStatus readObject(IXmlReader reader) {
		return new EnumSerializer<GameStatus>(GameStatus.class, getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, GameStatus object) {
		new EnumSerializer<GameStatus>(GameStatus.class, getName()).writeObject(writer, object);
	}
}
