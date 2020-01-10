package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class OpenIdParameterXmlSerializer implements IXmlSerializer<IOpenIdParameter> {

	private String name;

	public OpenIdParameterXmlSerializer() {
		this("OpenIdParameter");
	}

	public OpenIdParameterXmlSerializer(String name) {
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
	public IOpenIdParameter readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("key"));
		String param2 = reader.readObject(new StringSerializer("value"));
		reader.endElement(getName());

		// Create the bean
		return new OpenIdParameter(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IOpenIdParameter object) {
		writer.startElement(getName());
		writer.writeObject(object.getKey(), new StringSerializer("key"));
		writer.writeObject(object.getValue(), new StringSerializer("value"));
		writer.endElement(getName());
	}
}
