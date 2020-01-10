package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class CancelActionAtLocationXmlSerializer implements IXmlSerializer<ICancelActionAtLocation> {

	private String name;

	public CancelActionAtLocationXmlSerializer() {
		this("CancelActionAtLocation");
	}

	public CancelActionAtLocationXmlSerializer(String name) {
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
	public ICancelActionAtLocation readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("locationId");
		int param4 = reader.readInt("actionId");
		long param5 = reader.readLong("amount");
		reader.endElement(getName());

		// Create the bean
		return new CancelActionAtLocation(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ICancelActionAtLocation object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeInt("actionId", object.getActionId());
		writer.writeLong("amount", object.getAmount());
		writer.endElement(getName());
	}
}
