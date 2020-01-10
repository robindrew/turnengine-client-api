package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameByNameReturnTypeXmlSerializer implements IXmlSerializer<IGame> {

	private String name;

	public GetGameByNameReturnTypeXmlSerializer() {
		this("GetGameByNameReturnType");
	}

	public GetGameByNameReturnTypeXmlSerializer(String name) {
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
	public IGame readObject(IXmlReader reader) {
		return new GameXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGame object) {
		new GameXmlSerializer(getName()).writeObject(writer, object);
	}
}
