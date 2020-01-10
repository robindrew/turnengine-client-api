package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class StorageGroupXmlSerializer implements IXmlSerializer<IStorageGroup> {

	private String name;

	public StorageGroupXmlSerializer() {
		this("StorageGroup");
	}

	public StorageGroupXmlSerializer(String name) {
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
	public IStorageGroup readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("parent");
		int param2 = reader.readInt("group");
		long param3 = reader.readLong("capacity");
		StorageType param4 = reader.readObject(new EnumSerializer<StorageType>(StorageType.class, "type"));
		reader.endElement(getName());

		// Create the bean
		return new StorageGroup(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IStorageGroup object) {
		writer.startElement(getName());
		writer.writeInt("parent", object.getParent());
		writer.writeInt("group", object.getGroup());
		writer.writeLong("capacity", object.getCapacity());
		writer.writeObject(object.getType(), new EnumSerializer<StorageType>(StorageType.class, "type"));
		writer.endElement(getName());
	}
}
