package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SystemDiskUsageXmlSerializer implements IXmlSerializer<ISystemDiskUsage> {

	private String name;

	public SystemDiskUsageXmlSerializer() {
		this("SystemDiskUsage");
	}

	public SystemDiskUsageXmlSerializer(String name) {
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
	public ISystemDiskUsage readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		long param2 = reader.readLong("used");
		long param3 = reader.readLong("free");
		reader.endElement(getName());

		// Create the bean
		return new SystemDiskUsage(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISystemDiskUsage object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeLong("used", object.getUsed());
		writer.writeLong("free", object.getFree());
		writer.endElement(getName());
	}
}
