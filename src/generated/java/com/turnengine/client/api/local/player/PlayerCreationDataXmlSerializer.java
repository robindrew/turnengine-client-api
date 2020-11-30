package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class PlayerCreationDataXmlSerializer implements IXmlSerializer<IPlayerCreationData> {

	private String name;

	public PlayerCreationDataXmlSerializer() {
		this("PlayerCreationData");
	}

	public PlayerCreationDataXmlSerializer(String name) {
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
	public IPlayerCreationData readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("userId");
		int param4 = reader.readInt("factionId");
		int param5 = reader.readInt("allianceId");
		reader.endElement(getName());

		// Create the bean
		return new PlayerCreationData(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPlayerCreationData object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("userId", object.getUserId());
		writer.writeInt("factionId", object.getFactionId());
		writer.writeInt("allianceId", object.getAllianceId());
		writer.endElement(getName());
	}
}
