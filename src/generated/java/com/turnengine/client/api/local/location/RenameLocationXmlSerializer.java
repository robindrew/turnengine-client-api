package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class RenameLocationXmlSerializer implements IXmlSerializer<IRenameLocation> {

	private String name;

	public RenameLocationXmlSerializer() {
		this("RenameLocation");
	}

	public RenameLocationXmlSerializer(String name) {
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
	public IRenameLocation readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("locationId");
		String param4 = reader.readObject(new StringSerializer("name"));
		reader.endElement(getName());

		// Create the bean
		return new RenameLocation(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IRenameLocation object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.endElement(getName());
	}
}
