package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class StorageItemJsonSerializer implements IJsonSerializer<IStorageItem> {

	private String name;

	public StorageItemJsonSerializer() {
		this("StorageItem");
	}

	public StorageItemJsonSerializer(String name) {
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
	public IStorageItem readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IStorageItem object) {
		writer.openObject();
		writer.writeInt(object.getParent());
		writer.writeInt(object.getGroup());
		writer.writeInt(object.getChild());
		writer.writeLong(object.getSize());
		writer.writeLong(object.getLimit());
		writer.closeObject();
	}
}
