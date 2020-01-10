package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.global.admin.AdminHostAddressXmlSerializer;
import com.turnengine.client.api.global.admin.IAdminHostAddress;

public class UserAddressCodeXmlSerializer implements IXmlSerializer<IUserAddressCode> {

	private String name;

	public UserAddressCodeXmlSerializer() {
		this("UserAddressCode");
	}

	public UserAddressCodeXmlSerializer(String name) {
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
	public IUserAddressCode readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("userId");
		String param2 = reader.readObject(new StringSerializer("code"));
		long param3 = reader.readLong("timestamp");
		IAdminHostAddress param4 = reader.readObject(new AdminHostAddressXmlSerializer("detail"));
		reader.endElement(getName());

		// Create the bean
		return new UserAddressCode(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUserAddressCode object) {
		writer.startElement(getName());
		writer.writeInt("userId", object.getUserId());
		writer.writeObject(object.getCode(), new StringSerializer("code"));
		writer.writeLong("timestamp", object.getTimestamp());
		writer.writeObject(object.getDetail(), new AdminHostAddressXmlSerializer("detail"));
		writer.endElement(getName());
	}
}
