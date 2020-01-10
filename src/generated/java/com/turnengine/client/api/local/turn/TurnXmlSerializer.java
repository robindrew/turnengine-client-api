package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class TurnXmlSerializer implements IXmlSerializer<ITurn> {

	private String name;

	public TurnXmlSerializer() {
		this("Turn");
	}

	public TurnXmlSerializer(String name) {
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
	public ITurn readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("number");
		long param2 = reader.readLong("timestamp");
		long param3 = reader.readLong("duration");
		reader.endElement(getName());

		// Create the bean
		return new Turn(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITurn object) {
		writer.startElement(getName());
		writer.writeInt("number", object.getNumber());
		writer.writeLong("timestamp", object.getTimestamp());
		writer.writeLong("duration", object.getDuration());
		writer.endElement(getName());
	}
}
