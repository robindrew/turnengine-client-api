package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetupSetStorageItemJsonSerializer implements IJsonSerializer<ISetupSetStorageItem> {

	private String name;

	public SetupSetStorageItemJsonSerializer() {
		this("SetupSetStorageItem");
	}

	public SetupSetStorageItemJsonSerializer(String name) {
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
	public ISetupSetStorageItem readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetupSetStorageItem object) {
		writer.openObject();
		writer.writeObject(object.getParentName(), new StringSerializer());
		writer.writeObject(object.getGroupName(), new StringSerializer());
		writer.writeObject(object.getChildName(), new StringSerializer());
		writer.writeLong(object.getSize());
		writer.closeObject();
	}
}
