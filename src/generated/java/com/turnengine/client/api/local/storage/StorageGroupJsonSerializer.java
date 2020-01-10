package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class StorageGroupJsonSerializer implements IJsonSerializer<IStorageGroup> {

	private String name;

	public StorageGroupJsonSerializer() {
		this("StorageGroup");
	}

	public StorageGroupJsonSerializer(String name) {
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
	public IStorageGroup readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IStorageGroup object) {
		writer.openObject();
		writer.writeInt(object.getParent());
		writer.writeInt(object.getGroup());
		writer.writeLong(object.getCapacity());
		writer.writeObject(object.getType(), new EnumSerializer<StorageType>(StorageType.class));
		writer.closeObject();
	}
}
