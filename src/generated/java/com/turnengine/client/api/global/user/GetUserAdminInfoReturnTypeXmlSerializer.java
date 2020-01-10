package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetUserAdminInfoReturnTypeXmlSerializer implements IXmlSerializer<IUserAdminInfo> {

	private String name;

	public GetUserAdminInfoReturnTypeXmlSerializer() {
		this("GetUserAdminInfoReturnType");
	}

	public GetUserAdminInfoReturnTypeXmlSerializer(String name) {
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
		return new UserAdminInfoXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUserAdminInfo object) {
		new UserAdminInfoXmlSerializer(getName()).writeObject(writer, object);
	}
}
