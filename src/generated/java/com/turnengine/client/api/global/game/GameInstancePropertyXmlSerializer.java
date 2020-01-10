package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GameInstancePropertyXmlSerializer implements IXmlSerializer<IGameInstanceProperty> {

	private String name;

	public GameInstancePropertyXmlSerializer() {
		this("GameInstanceProperty");
	}

	public GameInstancePropertyXmlSerializer(String name) {
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
	public IGameInstanceProperty readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("instanceId");
		String param2 = reader.readObject(new StringSerializer("key"));
		String param3 = reader.readObject(new StringSerializer("value"));
		reader.endElement(getName());

		// Create the bean
		return new GameInstanceProperty(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGameInstanceProperty object) {
		writer.startElement(getName());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getKey(), new StringSerializer("key"));
		writer.writeObject(object.getValue(), new StringSerializer("value"));
		writer.endElement(getName());
	}
}
