package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetAvailableServiceListReturnTypeJsonSerializer implements IJsonSerializer<List<IServiceInfo>> {

	private String name;

	public GetAvailableServiceListReturnTypeJsonSerializer() {
		this("GetAvailableServiceListReturnType");
	}

	public GetAvailableServiceListReturnTypeJsonSerializer(String name) {
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
	public List<IServiceInfo> readObject(IJsonReader reader) {
		return new ListSerializer<IServiceInfo>(new ServiceInfoJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IServiceInfo> object) {
		new ListSerializer<IServiceInfo>(new ServiceInfoJsonSerializer()).writeObject(writer, object);
	}
}
