package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class NewGameXmlSerializer implements IXmlSerializer<INewGame> {

	private String name;

	public NewGameXmlSerializer() {
		this("NewGame");
	}

	public NewGameXmlSerializer(String name) {
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
	public INewGame readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("name"));
		reader.endElement(getName());

		// Create the bean
		return new NewGame(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, INewGame object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.endElement(getName());
	}
}
