package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import java.util.List;

public class GetUserNamesReturnTypeJsonSerializer implements IJsonSerializer<List<String>> {

	private String name;

	public GetUserNamesReturnTypeJsonSerializer() {
		this("GetUserNamesReturnType");
	}

	public GetUserNamesReturnTypeJsonSerializer(String name) {
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
	public List<String> readObject(IJsonReader reader) {
		return new ListSerializer<String>(new StringSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<String> object) {
		new ListSerializer<String>(new StringSerializer()).writeObject(writer, object);
	}
}
