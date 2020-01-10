package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class PlayerSetupInfoXmlSerializer implements IXmlSerializer<IPlayerSetupInfo> {

	private String name;

	public PlayerSetupInfoXmlSerializer() {
		this("PlayerSetupInfo");
	}

	public PlayerSetupInfoXmlSerializer(String name) {
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
	public IPlayerSetupInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("count");
		int param2 = reader.readInt("limit");
		boolean param3 = reader.readBoolean("signupsEnabled");
		reader.endElement(getName());

		// Create the bean
		return new PlayerSetupInfo(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPlayerSetupInfo object) {
		writer.startElement(getName());
		writer.writeInt("count", object.getCount());
		writer.writeInt("limit", object.getLimit());
		writer.writeBoolean("signupsEnabled", object.getSignupsEnabled());
		writer.endElement(getName());
	}
}
