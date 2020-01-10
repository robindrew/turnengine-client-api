package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.array.IntArraySerializer;

public class CoordinateXmlSerializer implements IXmlSerializer<ICoordinate> {

	private String name;

	public CoordinateXmlSerializer() {
		this("Coordinate");
	}

	public CoordinateXmlSerializer(String name) {
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
	public ICoordinate readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("locationId");
		int[] param2 = reader.readObject(new IntArraySerializer("coordinates"));
		reader.endElement(getName());

		// Create the bean
		return new Coordinate(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ICoordinate object) {
		writer.startElement(getName());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeObject(object.getCoordinates(), new IntArraySerializer("coordinates"));
		writer.endElement(getName());
	}
}
