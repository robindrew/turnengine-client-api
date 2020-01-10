package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetStorageItemXmlSerializer implements IXmlSerializer<ISetStorageItem> {

	private String name;

	public SetStorageItemXmlSerializer() {
		this("SetStorageItem");
	}

	public SetStorageItemXmlSerializer(String name) {
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
	public ISetStorageItem readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("parentName"));
		String param4 = reader.readObject(new StringSerializer("groupName"));
		String param5 = reader.readObject(new StringSerializer("childName"));
		long param6 = reader.readLong("size");
		long param7 = reader.readLong("limit");
		reader.endElement(getName());

		// Create the bean
		return new SetStorageItem(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetStorageItem object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getParentName(), new StringSerializer("parentName"));
		writer.writeObject(object.getGroupName(), new StringSerializer("groupName"));
		writer.writeObject(object.getChildName(), new StringSerializer("childName"));
		writer.writeLong("size", object.getSize());
		writer.writeLong("limit", object.getLimit());
		writer.endElement(getName());
	}
}
