package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class UpdateUserAddressCodeXmlSerializer implements IXmlSerializer<IUpdateUserAddressCode> {

	private String name;

	public UpdateUserAddressCodeXmlSerializer() {
		this("UpdateUserAddressCode");
	}

	public UpdateUserAddressCodeXmlSerializer(String name) {
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
	public IUpdateUserAddressCode readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("code"));
		reader.endElement(getName());

		// Create the bean
		return new UpdateUserAddressCode(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUpdateUserAddressCode object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getCode(), new StringSerializer("code"));
		writer.endElement(getName());
	}
}
