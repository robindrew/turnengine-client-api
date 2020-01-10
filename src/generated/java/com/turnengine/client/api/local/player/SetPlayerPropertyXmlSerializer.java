package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetPlayerPropertyXmlSerializer implements IXmlSerializer<ISetPlayerProperty> {

	private String name;

	public SetPlayerPropertyXmlSerializer() {
		this("SetPlayerProperty");
	}

	public SetPlayerPropertyXmlSerializer(String name) {
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
	public ISetPlayerProperty readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("playerId");
		String param4 = reader.readObject(new StringSerializer("key"));
		String param5 = reader.readObject(new StringSerializer("value"));
		reader.endElement(getName());

		// Create the bean
		return new SetPlayerProperty(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetPlayerProperty object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("playerId", object.getPlayerId());
		writer.writeObject(object.getKey(), new StringSerializer("key"));
		writer.writeObject(object.getValue(), new StringSerializer("value"));
		writer.endElement(getName());
	}
}
