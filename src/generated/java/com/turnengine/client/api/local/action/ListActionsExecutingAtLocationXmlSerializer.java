package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ListActionsExecutingAtLocationXmlSerializer implements IXmlSerializer<IListActionsExecutingAtLocation> {

	private String name;

	public ListActionsExecutingAtLocationXmlSerializer() {
		this("ListActionsExecutingAtLocation");
	}

	public ListActionsExecutingAtLocationXmlSerializer(String name) {
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
	public IListActionsExecutingAtLocation readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("locationId");
		reader.endElement(getName());

		// Create the bean
		return new ListActionsExecutingAtLocation(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IListActionsExecutingAtLocation object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("locationId", object.getLocationId());
		writer.endElement(getName());
	}
}
