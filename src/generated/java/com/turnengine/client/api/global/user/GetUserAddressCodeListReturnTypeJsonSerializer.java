package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetUserAddressCodeListReturnTypeJsonSerializer implements IJsonSerializer<List<IUserAddressCode>> {

	private String name;

	public GetUserAddressCodeListReturnTypeJsonSerializer() {
		this("GetUserAddressCodeListReturnType");
	}

	public GetUserAddressCodeListReturnTypeJsonSerializer(String name) {
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
	public List<IUserAddressCode> readObject(IJsonReader reader) {
		return new ListSerializer<IUserAddressCode>(new UserAddressCodeJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IUserAddressCode> object) {
		new ListSerializer<IUserAddressCode>(new UserAddressCodeJsonSerializer()).writeObject(writer, object);
	}
}
