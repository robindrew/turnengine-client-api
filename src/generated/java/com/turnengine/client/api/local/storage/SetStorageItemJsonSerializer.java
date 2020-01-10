package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetStorageItemJsonSerializer implements IJsonSerializer<ISetStorageItem> {

	private String name;

	public SetStorageItemJsonSerializer() {
		this("SetStorageItem");
	}

	public SetStorageItemJsonSerializer(String name) {
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
	public ISetStorageItem readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetStorageItem object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getParentName(), new StringSerializer());
		writer.writeObject(object.getGroupName(), new StringSerializer());
		writer.writeObject(object.getChildName(), new StringSerializer());
		writer.writeLong(object.getSize());
		writer.writeLong(object.getLimit());
		writer.closeObject();
	}
}
