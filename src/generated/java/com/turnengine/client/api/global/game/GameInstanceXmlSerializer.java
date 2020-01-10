package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GameInstanceXmlSerializer implements IXmlSerializer<IGameInstance> {

	private String name;

	public GameInstanceXmlSerializer() {
		this("GameInstance");
	}

	public GameInstanceXmlSerializer(String name) {
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
	public IGameInstance readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("gameId");
		int param4 = reader.readInt("versionId");
		int param5 = reader.readInt("hostId");
		reader.endElement(getName());

		// Create the bean
		return new GameInstance(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGameInstance object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("gameId", object.getGameId());
		writer.writeInt("versionId", object.getVersionId());
		writer.writeInt("hostId", object.getHostId());
		writer.endElement(getName());
	}
}
