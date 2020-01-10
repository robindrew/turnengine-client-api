package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetMobilePropertyListReturnTypeJsonSerializer implements IJsonSerializer<List<IMobileProperty>> {

	private String name;

	public GetMobilePropertyListReturnTypeJsonSerializer() {
		this("GetMobilePropertyListReturnType");
	}

	public GetMobilePropertyListReturnTypeJsonSerializer(String name) {
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
	public List<IMobileProperty> readObject(IJsonReader reader) {
		return new ListSerializer<IMobileProperty>(new MobilePropertyJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IMobileProperty> object) {
		new ListSerializer<IMobileProperty>(new MobilePropertyJsonSerializer()).writeObject(writer, object);
	}
}
