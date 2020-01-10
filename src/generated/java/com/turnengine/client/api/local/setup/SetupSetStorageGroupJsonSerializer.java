package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.storage.StorageType;

public class SetupSetStorageGroupJsonSerializer implements IJsonSerializer<ISetupSetStorageGroup> {

	private String name;

	public SetupSetStorageGroupJsonSerializer() {
		this("SetupSetStorageGroup");
	}

	public SetupSetStorageGroupJsonSerializer(String name) {
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
	public ISetupSetStorageGroup readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetupSetStorageGroup object) {
		writer.openObject();
		writer.writeObject(object.getParentName(), new StringSerializer());
		writer.writeObject(object.getGroupName(), new StringSerializer());
		writer.writeLong(object.getCapacity());
		writer.writeObject(object.getType(), new EnumSerializer<StorageType>(StorageType.class));
		writer.closeObject();
	}
}
