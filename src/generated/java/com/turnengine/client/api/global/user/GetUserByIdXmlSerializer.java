package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetUserByIdXmlSerializer implements IXmlSerializer<IGetUserById> {

	private String name;

	public GetUserByIdXmlSerializer() {
		this("GetUserById");
	}

	public GetUserByIdXmlSerializer(String name) {
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
	public IGetUserById readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("id");
		reader.endElement(getName());

		// Create the bean
		return new GetUserById(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetUserById object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("id", object.getId());
		writer.endElement(getName());
	}
}
