package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetupSetStorageItemXmlSerializer implements IXmlSerializer<ISetupSetStorageItem> {

	private String name;

	public SetupSetStorageItemXmlSerializer() {
		this("SetupSetStorageItem");
	}

	public SetupSetStorageItemXmlSerializer(String name) {
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
	public ISetupSetStorageItem readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("parentName"));
		String param2 = reader.readObject(new StringSerializer("groupName"));
		String param3 = reader.readObject(new StringSerializer("childName"));
		long param4 = reader.readLong("size");
		reader.endElement(getName());

		// Create the bean
		return new SetupSetStorageItem(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupSetStorageItem object) {
		writer.startElement(getName());
		writer.writeObject(object.getParentName(), new StringSerializer("parentName"));
		writer.writeObject(object.getGroupName(), new StringSerializer("groupName"));
		writer.writeObject(object.getChildName(), new StringSerializer("childName"));
		writer.writeLong("size", object.getSize());
		writer.endElement(getName());
	}
}
