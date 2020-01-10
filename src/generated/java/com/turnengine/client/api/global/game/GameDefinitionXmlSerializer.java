package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GameDefinitionXmlSerializer implements IXmlSerializer<IGameDefinition> {

	private String name;

	public GameDefinitionXmlSerializer() {
		this("GameDefinition");
	}

	public GameDefinitionXmlSerializer(String name) {
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
		reader.startElement(getName());
		IGame param1 = reader.readObject(new GameXmlSerializer("game"));
		IGameVersion param2 = reader.readObject(new GameVersionXmlSerializer("version"));
		IGameInstance param3 = reader.readObject(new GameInstanceXmlSerializer("instance"));
		IGameHost param4 = reader.readObject(new GameHostXmlSerializer("host"));
		reader.endElement(getName());

		// Create the bean
		return new GameDefinition(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGameDefinition object) {
		writer.startElement(getName());
		writer.writeObject(object.getGame(), new GameXmlSerializer("game"));
		writer.writeObject(object.getVersion(), new GameVersionXmlSerializer("version"));
		writer.writeObject(object.getInstance(), new GameInstanceXmlSerializer("instance"));
		writer.writeObject(object.getHost(), new GameHostXmlSerializer("host"));
		writer.endElement(getName());
	}
}
