package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.turnengine.client.api.global.user.IUserAdminInfo;
import com.turnengine.client.api.global.user.UserAdminInfoXmlSerializer;

public class GetUserAdminInfoByPlayerReturnTypeXmlSerializer implements IXmlSerializer<IUserAdminInfo> {

	private String name;

	public GetUserAdminInfoByPlayerReturnTypeXmlSerializer() {
		this("GetUserAdminInfoByPlayerReturnType");
	}

	public GetUserAdminInfoByPlayerReturnTypeXmlSerializer(String name) {
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
