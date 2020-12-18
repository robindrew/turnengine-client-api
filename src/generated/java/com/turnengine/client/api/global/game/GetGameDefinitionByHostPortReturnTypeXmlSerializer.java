package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameDefinitionByHostPortReturnTypeXmlSerializer implements IXmlSerializer<IGameDefinition> {

	private String name;

	public GetGameDefinitionByHostPortReturnTypeXmlSerializer() {
		this("GetGameDefinitionByHostPortReturnType");
	}

	public GetGameDefinitionByHostPortReturnTypeXmlSerializer(String name) {
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
	public IGameDefinition readObject(IXmlReader reader) {
		return new GameDefinitionXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGameDefinition object) {
		new GameDefinitionXmlSerializer(getName()).writeObject(writer, object);
	}
}
