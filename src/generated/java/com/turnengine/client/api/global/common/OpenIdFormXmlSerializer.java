package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import java.util.List;

public class OpenIdFormXmlSerializer implements IXmlSerializer<IOpenIdForm> {

	private String name;

	public OpenIdFormXmlSerializer() {
		this("OpenIdForm");
	}

	public OpenIdFormXmlSerializer(String name) {
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
	public IOpenIdForm readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("uri"));
		List<IOpenIdParameter> param2 = reader.readObject(new ListSerializer<IOpenIdParameter>("parameterList", new OpenIdParameterXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new OpenIdForm(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IOpenIdForm object) {
		writer.startElement(getName());
		writer.writeObject(object.getUri(), new StringSerializer("uri"));
		writer.writeObject(object.getParameterList(), new ListSerializer<IOpenIdParameter>("parameterList", new OpenIdParameterXmlSerializer("element")));
		writer.endElement(getName());
	}
}
