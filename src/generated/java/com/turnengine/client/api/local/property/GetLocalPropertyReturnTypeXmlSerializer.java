package com.turnengine.client.api.local.property;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetLocalPropertyReturnTypeXmlSerializer implements IXmlSerializer<String> {

	private String name;

	public GetLocalPropertyReturnTypeXmlSerializer() {
		this("GetLocalPropertyReturnType");
	}

	public GetLocalPropertyReturnTypeXmlSerializer(String name) {
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
	public String readObject(IXmlReader reader) {
		return new StringSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, String object) {
		new StringSerializer(getName()).writeObject(writer, object);
	}
}
