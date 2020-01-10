package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetUserByEmailXmlSerializer implements IXmlSerializer<IGetUserByEmail> {

	private String name;

	public GetUserByEmailXmlSerializer() {
		this("GetUserByEmail");
	}

	public GetUserByEmailXmlSerializer(String name) {
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
	public IGetUserByEmail readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("email"));
		reader.endElement(getName());

		// Create the bean
		return new GetUserByEmail(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetUserByEmail object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getEmail(), new StringSerializer("email"));
		writer.endElement(getName());
	}
}
