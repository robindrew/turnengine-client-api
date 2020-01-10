package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetStorageItemsReturnTypeJsonSerializer implements IJsonSerializer<List<IStorageItem>> {

	private String name;

	public GetStorageItemsReturnTypeJsonSerializer() {
		this("GetStorageItemsReturnType");
	}

	public GetStorageItemsReturnTypeJsonSerializer(String name) {
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
	public List<IStorageItem> readObject(IJsonReader reader) {
		return new ListSerializer<IStorageItem>(new StorageItemJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IStorageItem> object) {
		new ListSerializer<IStorageItem>(new StorageItemJsonSerializer()).writeObject(writer, object);
	}
}
