package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetServiceProcessListReturnTypeJsonSerializer implements IJsonSerializer<List<IProcessInfo>> {

	private String name;

	public GetServiceProcessListReturnTypeJsonSerializer() {
		this("GetServiceProcessListReturnType");
	}

	public GetServiceProcessListReturnTypeJsonSerializer(String name) {
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
	public List<IProcessInfo> readObject(IJsonReader reader) {
		return new ListSerializer<IProcessInfo>(new ProcessInfoJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IProcessInfo> object) {
		new ListSerializer<IProcessInfo>(new ProcessInfoJsonSerializer()).writeObject(writer, object);
	}
}
