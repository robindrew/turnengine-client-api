package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetLocationSetupInfoReturnTypeXmlSerializer implements IXmlSerializer<ILocationSetupInfo> {

	private String name;

	public GetLocationSetupInfoReturnTypeXmlSerializer() {
		this("GetLocationSetupInfoReturnType");
	}

	public GetLocationSetupInfoReturnTypeXmlSerializer(String name) {
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
	public ILocationSetupInfo readObject(IXmlReader reader) {
		return new LocationSetupInfoXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, ILocationSetupInfo object) {
		new LocationSetupInfoXmlSerializer(getName()).writeObject(writer, object);
	}
}
