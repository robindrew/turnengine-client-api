package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetUserByNameXmlSerializer implements IXmlSerializer<IGetUserByName> {

	private String name;

	public GetUserByNameXmlSerializer() {
		this("GetUserByName");
	}

	public GetUserByNameXmlSerializer(String name) {
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
	public IGetUserByName readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("name"));
		reader.endElement(getName());

		// Create the bean
		return new GetUserByName(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetUserByName object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.endElement(getName());
	}
}
