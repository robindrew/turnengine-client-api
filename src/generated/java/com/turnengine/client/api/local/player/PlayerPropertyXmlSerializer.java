package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class PlayerPropertyXmlSerializer implements IXmlSerializer<IPlayerProperty> {

	private String name;

	public PlayerPropertyXmlSerializer() {
		this("PlayerProperty");
	}

	public PlayerPropertyXmlSerializer(String name) {
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
	public IPlayerProperty readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("playerId");
		String param2 = reader.readObject(new StringSerializer("key"));
		String param3 = reader.readObject(new StringSerializer("value"));
		reader.endElement(getName());

		// Create the bean
		return new PlayerProperty(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPlayerProperty object) {
		writer.startElement(getName());
		writer.writeInt("playerId", object.getPlayerId());
		writer.writeObject(object.getKey(), new StringSerializer("key"));
		writer.writeObject(object.getValue(), new StringSerializer("value"));
		writer.endElement(getName());
	}
}
