package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class AdminVerifyUserXmlSerializer implements IXmlSerializer<IAdminVerifyUser> {

	private String name;

	public AdminVerifyUserXmlSerializer() {
		this("AdminVerifyUser");
	}

	public AdminVerifyUserXmlSerializer(String name) {
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
	public IAdminVerifyUser readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("id");
		reader.endElement(getName());

		// Create the bean
		return new AdminVerifyUser(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAdminVerifyUser object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("id", object.getId());
		writer.endElement(getName());
	}
}
