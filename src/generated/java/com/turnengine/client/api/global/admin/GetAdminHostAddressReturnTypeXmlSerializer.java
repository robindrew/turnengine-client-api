package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAdminHostAddressReturnTypeXmlSerializer implements IXmlSerializer<IAdminHostAddress> {

	private String name;

	public GetAdminHostAddressReturnTypeXmlSerializer() {
		this("GetAdminHostAddressReturnType");
	}

	public GetAdminHostAddressReturnTypeXmlSerializer(String name) {
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
	public IAdminHostAddress readObject(IXmlReader reader) {
		return new AdminHostAddressXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAdminHostAddress object) {
		new AdminHostAddressXmlSerializer(getName()).writeObject(writer, object);
	}
}
