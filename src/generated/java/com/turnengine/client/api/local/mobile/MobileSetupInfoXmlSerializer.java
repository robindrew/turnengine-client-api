package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class MobileSetupInfoXmlSerializer implements IXmlSerializer<IMobileSetupInfo> {

	private String name;

	public MobileSetupInfoXmlSerializer() {
		this("MobileSetupInfo");
	}

	public MobileSetupInfoXmlSerializer(String name) {
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
	public IMobileSetupInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("count");
		boolean param2 = reader.readBoolean("enabled");
		reader.endElement(getName());

		// Create the bean
		return new MobileSetupInfo(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMobileSetupInfo object) {
		writer.startElement(getName());
		writer.writeInt("count", object.getCount());
		writer.writeBoolean("enabled", object.getEnabled());
		writer.endElement(getName());
	}
}
