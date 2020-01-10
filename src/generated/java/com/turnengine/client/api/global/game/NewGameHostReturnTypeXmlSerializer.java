package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class NewGameHostReturnTypeXmlSerializer implements IXmlSerializer<IGameHost> {

	private String name;

	public NewGameHostReturnTypeXmlSerializer() {
		this("NewGameHostReturnType");
	}

	public NewGameHostReturnTypeXmlSerializer(String name) {
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
	public IGameHost readObject(IXmlReader reader) {
		return new GameHostXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGameHost object) {
		new GameHostXmlSerializer(getName()).writeObject(writer, object);
	}
}
