package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class MobileCreationDataXmlSerializer implements IXmlSerializer<IMobileCreationData> {

	private String name;

	public MobileCreationDataXmlSerializer() {
		this("MobileCreationData");
	}

	public MobileCreationDataXmlSerializer(String name) {
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
	public IMobileCreationData readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("playerId");
		int param4 = reader.readInt("originId");
		int param5 = reader.readInt("destinationId");
		int param6 = reader.readInt("moveTurns");
		int param7 = reader.readInt("waitTurns");
		reader.endElement(getName());

		// Create the bean
		return new MobileCreationData(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMobileCreationData object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("playerId", object.getPlayerId());
		writer.writeInt("originId", object.getOriginId());
		writer.writeInt("destinationId", object.getDestinationId());
		writer.writeInt("moveTurns", object.getMoveTurns());
		writer.writeInt("waitTurns", object.getWaitTurns());
		writer.endElement(getName());
	}
}
