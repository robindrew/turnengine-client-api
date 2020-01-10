package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetAdminHostAddressXmlSerializer implements IXmlSerializer<IGetAdminHostAddress> {

	private String name;

	public GetAdminHostAddressXmlSerializer() {
		this("GetAdminHostAddress");
	}

	public GetAdminHostAddressXmlSerializer(String name) {
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
	public IGetAdminHostAddress readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("code"));
		reader.endElement(getName());

		// Create the bean
		return new GetAdminHostAddress(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetAdminHostAddress object) {
		writer.startElement(getName());
		writer.writeObject(object.getCode(), new StringSerializer("code"));
		writer.endElement(getName());
	}
}
