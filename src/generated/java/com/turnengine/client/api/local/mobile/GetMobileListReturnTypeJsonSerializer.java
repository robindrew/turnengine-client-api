package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetMobileListReturnTypeJsonSerializer implements IJsonSerializer<List<IMobile>> {

	private String name;

	public GetMobileListReturnTypeJsonSerializer() {
		this("GetMobileListReturnType");
	}

	public GetMobileListReturnTypeJsonSerializer(String name) {
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
	public List<IMobile> readObject(IJsonReader reader) {
		return new ListSerializer<IMobile>(new MobileJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IMobile> object) {
		new ListSerializer<IMobile>(new MobileJsonSerializer()).writeObject(writer, object);
	}
}
