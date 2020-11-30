package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class LocationCreationDataXmlSerializer implements IXmlSerializer<ILocationCreationData> {

	private String name;

	public LocationCreationDataXmlSerializer() {
		this("LocationCreationData");
	}

	public LocationCreationDataXmlSerializer(String name) {
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
	public ILocationCreationData readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("playerId");
		reader.endElement(getName());

		// Create the bean
		return new LocationCreationData(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ILocationCreationData object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("playerId", object.getPlayerId());
		writer.endElement(getName());
	}
}
