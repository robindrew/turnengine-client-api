package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetMobileReturnTypeXmlSerializer implements IXmlSerializer<IMobile> {

	private String name;

	public GetMobileReturnTypeXmlSerializer() {
		this("GetMobileReturnType");
	}

	public GetMobileReturnTypeXmlSerializer(String name) {
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
	public IMobile readObject(IXmlReader reader) {
		return new MobileXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMobile object) {
		new MobileXmlSerializer(getName()).writeObject(writer, object);
	}
}
