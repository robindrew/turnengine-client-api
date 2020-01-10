package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetMobileSetupInfoReturnTypeXmlSerializer implements IXmlSerializer<IMobileSetupInfo> {

	private String name;

	public GetMobileSetupInfoReturnTypeXmlSerializer() {
		this("GetMobileSetupInfoReturnType");
	}

	public GetMobileSetupInfoReturnTypeXmlSerializer(String name) {
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
		return new MobileSetupInfoXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMobileSetupInfo object) {
		new MobileSetupInfoXmlSerializer(getName()).writeObject(writer, object);
	}
}
