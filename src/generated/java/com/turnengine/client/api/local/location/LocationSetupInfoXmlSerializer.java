package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class LocationSetupInfoXmlSerializer implements IXmlSerializer<ILocationSetupInfo> {

	private String name;

	public LocationSetupInfoXmlSerializer() {
		this("LocationSetupInfo");
	}

	public LocationSetupInfoXmlSerializer(String name) {
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
		reader.startElement(getName());
		int param1 = reader.readInt("count");
		boolean param2 = reader.readBoolean("enabled");
		boolean param3 = reader.readBoolean("signupsEnabled");
		reader.endElement(getName());

		// Create the bean
		return new LocationSetupInfo(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ILocationSetupInfo object) {
		writer.startElement(getName());
		writer.writeInt("count", object.getCount());
		writer.writeBoolean("enabled", object.getEnabled());
		writer.writeBoolean("signupsEnabled", object.getSignupsEnabled());
		writer.endElement(getName());
	}
}
