package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class CheckRenameLocationXmlSerializer implements IXmlSerializer<ICheckRenameLocation> {

	private String name;

	public CheckRenameLocationXmlSerializer() {
		this("CheckRenameLocation");
	}

	public CheckRenameLocationXmlSerializer(String name) {
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
	public ICheckRenameLocation readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("locationId");
		String param4 = reader.readObject(new StringSerializer("name"));
		reader.endElement(getName());

		// Create the bean
		return new CheckRenameLocation(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ICheckRenameLocation object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.endElement(getName());
	}
}
