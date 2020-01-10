package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetStorageGroupsReturnTypeJsonSerializer implements IJsonSerializer<List<IStorageGroup>> {

	private String name;

	public GetStorageGroupsReturnTypeJsonSerializer() {
		this("GetStorageGroupsReturnType");
	}

	public GetStorageGroupsReturnTypeJsonSerializer(String name) {
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
	public List<IStorageGroup> readObject(IJsonReader reader) {
		return new ListSerializer<IStorageGroup>(new StorageGroupJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IStorageGroup> object) {
		new ListSerializer<IStorageGroup>(new StorageGroupJsonSerializer()).writeObject(writer, object);
	}
}
