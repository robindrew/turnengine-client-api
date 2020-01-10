package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class LocationPropertyXmlSerializer implements IXmlSerializer<ILocationProperty> {

	private String name;

	public LocationPropertyXmlSerializer() {
		this("LocationProperty");
	}

	public LocationPropertyXmlSerializer(String name) {
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
	public ILocationProperty readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("locationId");
		int param2 = reader.readInt("playerId");
		String param3 = reader.readObject(new StringSerializer("key"));
		String param4 = reader.readObject(new StringSerializer("value"));
		reader.endElement(getName());

		// Create the bean
		return new LocationProperty(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ILocationProperty object) {
		writer.startElement(getName());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeInt("playerId", object.getPlayerId());
		writer.writeObject(object.getKey(), new StringSerializer("key"));
		writer.writeObject(object.getValue(), new StringSerializer("value"));
		writer.endElement(getName());
	}
}
