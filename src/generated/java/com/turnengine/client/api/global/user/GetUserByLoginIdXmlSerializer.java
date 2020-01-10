package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetUserByLoginIdXmlSerializer implements IXmlSerializer<IGetUserByLoginId> {

	private String name;

	public GetUserByLoginIdXmlSerializer() {
		this("GetUserByLoginId");
	}

	public GetUserByLoginIdXmlSerializer(String name) {
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
	public IGetUserByLoginId readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		long param2 = reader.readLong("id");
		reader.endElement(getName());

		// Create the bean
		return new GetUserByLoginId(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetUserByLoginId object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeLong("id", object.getId());
		writer.endElement(getName());
	}
}
