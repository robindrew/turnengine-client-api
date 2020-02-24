package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetUserListXmlSerializer implements IXmlSerializer<IGetUserList> {

	private String name;

	public GetUserListXmlSerializer() {
		this("GetUserList");
	}

	public GetUserListXmlSerializer(String name) {
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
	public IGetUserList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		reader.endElement(getName());

		// Create the bean
		return new GetUserList(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetUserList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.endElement(getName());
	}
}
