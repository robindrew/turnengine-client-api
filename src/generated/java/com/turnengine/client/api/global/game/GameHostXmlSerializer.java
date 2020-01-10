package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GameHostXmlSerializer implements IXmlSerializer<IGameHost> {

	private String name;

	public GameHostXmlSerializer() {
		this("GameHost");
	}

	public GameHostXmlSerializer(String name) {
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
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("port");
		reader.endElement(getName());

		// Create the bean
		return new GameHost(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGameHost object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("port", object.getPort());
		writer.endElement(getName());
	}
}
