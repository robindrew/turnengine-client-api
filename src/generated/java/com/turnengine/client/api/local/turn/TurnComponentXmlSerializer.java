package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class TurnComponentXmlSerializer implements IXmlSerializer<ITurnComponent> {

	private String name;

	public TurnComponentXmlSerializer() {
		this("TurnComponent");
	}

	public TurnComponentXmlSerializer(String name) {
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
	public ITurnComponent readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		long param2 = reader.readLong("duration");
		reader.endElement(getName());

		// Create the bean
		return new TurnComponent(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITurnComponent object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeLong("duration", object.getDuration());
		writer.endElement(getName());
	}
}
