package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetStorageGroupXmlSerializer implements IXmlSerializer<ISetStorageGroup> {

	private String name;

	public SetStorageGroupXmlSerializer() {
		this("SetStorageGroup");
	}

	public SetStorageGroupXmlSerializer(String name) {
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
	public ISetStorageGroup readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("parentName"));
		String param4 = reader.readObject(new StringSerializer("groupName"));
		long param5 = reader.readLong("capacity");
		StorageType param6 = reader.readObject(new EnumSerializer<StorageType>(StorageType.class, "type"));
		reader.endElement(getName());

		// Create the bean
		return new SetStorageGroup(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetStorageGroup object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getParentName(), new StringSerializer("parentName"));
		writer.writeObject(object.getGroupName(), new StringSerializer("groupName"));
		writer.writeLong("capacity", object.getCapacity());
		writer.writeObject(object.getType(), new EnumSerializer<StorageType>(StorageType.class, "type"));
		writer.endElement(getName());
	}
}
