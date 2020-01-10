package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetAvailableReleaseListReturnTypeJsonSerializer implements IJsonSerializer<List<IReleaseInfo>> {

	private String name;

	public GetAvailableReleaseListReturnTypeJsonSerializer() {
		this("GetAvailableReleaseListReturnType");
	}

	public GetAvailableReleaseListReturnTypeJsonSerializer(String name) {
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
	public List<IReleaseInfo> readObject(IJsonReader reader) {
		return new ListSerializer<IReleaseInfo>(new ReleaseInfoJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IReleaseInfo> object) {
		new ListSerializer<IReleaseInfo>(new ReleaseInfoJsonSerializer()).writeObject(writer, object);
	}
}
