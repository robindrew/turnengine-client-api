package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class StorageItemXmlSerializer implements IXmlSerializer<IStorageItem> {

	private String name;

	public StorageItemXmlSerializer() {
		this("StorageItem");
	}

	public StorageItemXmlSerializer(String name) {
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
	public IStorageItem readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("parent");
		int param2 = reader.readInt("group");
		int param3 = reader.readInt("child");
		long param4 = reader.readLong("size");
		long param5 = reader.readLong("limit");
		reader.endElement(getName());

		// Create the bean
		return new StorageItem(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IStorageItem object) {
		writer.startElement(getName());
		writer.writeInt("parent", object.getParent());
		writer.writeInt("group", object.getGroup());
		writer.writeInt("child", object.getChild());
		writer.writeLong("size", object.getSize());
		writer.writeLong("limit", object.getLimit());
		writer.endElement(getName());
	}
}
