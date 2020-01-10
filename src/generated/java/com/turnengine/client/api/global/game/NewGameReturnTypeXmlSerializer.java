package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class NewGameReturnTypeXmlSerializer implements IXmlSerializer<IGame> {

	private String name;

	public NewGameReturnTypeXmlSerializer() {
		this("NewGameReturnType");
	}

	public NewGameReturnTypeXmlSerializer(String name) {
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
