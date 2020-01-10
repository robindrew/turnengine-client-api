package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.storage.StorageType;

public class SetupSetStorageGroupXmlSerializer implements IXmlSerializer<ISetupSetStorageGroup> {

	private String name;

	public SetupSetStorageGroupXmlSerializer() {
		this("SetupSetStorageGroup");
	}

	public SetupSetStorageGroupXmlSerializer(String name) {
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
	public ISetupSetStorageGroup readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("parentName"));
		String param2 = reader.readObject(new StringSerializer("groupName"));
		long param3 = reader.readLong("capacity");
		StorageType param4 = reader.readObject(new EnumSerializer<StorageType>(StorageType.class, "type"));
		reader.endElement(getName());

		// Create the bean
		return new SetupSetStorageGroup(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupSetStorageGroup object) {
		writer.startElement(getName());
		writer.writeObject(object.getParentName(), new StringSerializer("parentName"));
		writer.writeObject(object.getGroupName(), new StringSerializer("groupName"));
		writer.writeLong("capacity", object.getCapacity());
		writer.writeObject(object.getType(), new EnumSerializer<StorageType>(StorageType.class, "type"));
		writer.endElement(getName());
	}
}
