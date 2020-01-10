package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ClearActionsQueuedAtLocationXmlSerializer implements IXmlSerializer<IClearActionsQueuedAtLocation> {

	private String name;

	public ClearActionsQueuedAtLocationXmlSerializer() {
		this("ClearActionsQueuedAtLocation");
	}

	public ClearActionsQueuedAtLocationXmlSerializer(String name) {
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
	public IClearActionsQueuedAtLocation readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("locationId");
		int param4 = reader.readInt("groupId");
		reader.endElement(getName());

		// Create the bean
		return new ClearActionsQueuedAtLocation(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IClearActionsQueuedAtLocation object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeInt("groupId", object.getGroupId());
		writer.endElement(getName());
	}
}
