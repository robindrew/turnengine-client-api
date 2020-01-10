package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGoogleOpenIdFormReturnTypeXmlSerializer implements IXmlSerializer<IOpenIdForm> {

	private String name;

	public GetGoogleOpenIdFormReturnTypeXmlSerializer() {
		this("GetGoogleOpenIdFormReturnType");
	}

	public GetGoogleOpenIdFormReturnTypeXmlSerializer(String name) {
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
	public IOpenIdForm readObject(IXmlReader reader) {
		return new OpenIdFormXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IOpenIdForm object) {
		new OpenIdFormXmlSerializer(getName()).writeObject(writer, object);
	}
}
