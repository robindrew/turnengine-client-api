package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetUserNamesXmlSerializer implements IXmlSerializer<IGetUserNames> {

	private String name;

	public GetUserNamesXmlSerializer() {
		this("GetUserNames");
	}

	public GetUserNamesXmlSerializer(String name) {
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
	public IGetUserNames readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		reader.endElement(getName());

		// Create the bean
		return new GetUserNames(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetUserNames object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.endElement(getName());
	}
}
