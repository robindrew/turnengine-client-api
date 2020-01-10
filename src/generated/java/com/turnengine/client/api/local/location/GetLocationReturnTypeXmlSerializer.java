package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetLocationReturnTypeXmlSerializer implements IXmlSerializer<ILocation> {

	private String name;

	public GetLocationReturnTypeXmlSerializer() {
		this("GetLocationReturnType");
	}

	public GetLocationReturnTypeXmlSerializer(String name) {
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
	public ILocation readObject(IXmlReader reader) {
		return new LocationXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, ILocation object) {
		new LocationXmlSerializer(getName()).writeObject(writer, object);
	}
}
