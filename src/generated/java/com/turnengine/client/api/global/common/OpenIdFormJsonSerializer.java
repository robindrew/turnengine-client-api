package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import java.util.List;

public class OpenIdFormJsonSerializer implements IJsonSerializer<IOpenIdForm> {

	private String name;

	public OpenIdFormJsonSerializer() {
		this("OpenIdForm");
	}

	public OpenIdFormJsonSerializer(String name) {
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
	public IOpenIdForm readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IOpenIdForm object) {
		writer.openObject();
		writer.writeObject(object.getUri(), new StringSerializer());
		writer.writeObject(object.getParameterList(), new ListSerializer<IOpenIdParameter>(new OpenIdParameterJsonSerializer()));
		writer.closeObject();
	}
}
