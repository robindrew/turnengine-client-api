package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetUserAdminInfoXmlSerializer implements IXmlSerializer<IGetUserAdminInfo> {

	private String name;

	public GetUserAdminInfoXmlSerializer() {
		this("GetUserAdminInfo");
	}

	public GetUserAdminInfoXmlSerializer(String name) {
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
	public IGetUserAdminInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("userId");
		reader.endElement(getName());

		// Create the bean
		return new GetUserAdminInfo(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetUserAdminInfo object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("userId", object.getUserId());
		writer.endElement(getName());
	}
}
