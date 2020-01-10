package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GameVersionXmlSerializer implements IXmlSerializer<IGameVersion> {

	private String name;

	public GameVersionXmlSerializer() {
		this("GameVersion");
	}

	public GameVersionXmlSerializer(String name) {
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
	public IGameVersion readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("gameId");
		reader.endElement(getName());

		// Create the bean
		return new GameVersion(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGameVersion object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("gameId", object.getGameId());
		writer.endElement(getName());
	}
}
