package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameDefinitionsXmlSerializer implements IXmlSerializer<IGetGameDefinitions> {

	private String name;

	public GetGameDefinitionsXmlSerializer() {
		this("GetGameDefinitions");
	}

	public GetGameDefinitionsXmlSerializer(String name) {
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
	public IGetGameDefinitions readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new GetGameDefinitions();
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameDefinitions object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
