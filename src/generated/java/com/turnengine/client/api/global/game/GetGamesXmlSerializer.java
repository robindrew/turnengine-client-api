package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGamesXmlSerializer implements IXmlSerializer<IGetGames> {

	private String name;

	public GetGamesXmlSerializer() {
		this("GetGames");
	}

	public GetGamesXmlSerializer(String name) {
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
	public IGetGames readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new GetGames();
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGames object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
