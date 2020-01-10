package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ClearActionQueuedAtLocationXmlSerializer implements IXmlSerializer<IClearActionQueuedAtLocation> {

	private String name;

	public ClearActionQueuedAtLocationXmlSerializer() {
		this("ClearActionQueuedAtLocation");
	}

	public ClearActionQueuedAtLocationXmlSerializer(String name) {
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
	public IClearActionQueuedAtLocation readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("locationId");
		int param4 = reader.readInt("index");
		reader.endElement(getName());

		// Create the bean
		return new ClearActionQueuedAtLocation(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IClearActionQueuedAtLocation object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeInt("index", object.getIndex());
		writer.endElement(getName());
	}
}
