package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class UserAdminInfoXmlSerializer implements IXmlSerializer<IUserAdminInfo> {

	private String name;

	public UserAdminInfoXmlSerializer() {
		this("UserAdminInfo");
	}

	public UserAdminInfoXmlSerializer(String name) {
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
	public IUserAdminInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		IUser param1 = reader.readObject(new UserXmlSerializer("user"));
		List<IUserAddressCode> param2 = reader.readObject(new ListSerializer<IUserAddressCode>("addresses", new UserAddressCodeXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new UserAdminInfo(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUserAdminInfo object) {
		writer.startElement(getName());
		writer.writeObject(object.getUser(), new UserXmlSerializer("user"));
		writer.writeObject(object.getAddresses(), new ListSerializer<IUserAddressCode>("addresses", new UserAddressCodeXmlSerializer("element")));
		writer.endElement(getName());
	}
}
