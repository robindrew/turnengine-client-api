package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class StartActionMovementXmlSerializer implements IXmlSerializer<IStartActionMovement> {

	private String name;

	public StartActionMovementXmlSerializer() {
		this("StartActionMovement");
	}

	public StartActionMovementXmlSerializer(String name) {
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
	public IStartActionMovement readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("mobileId");
		int param4 = reader.readInt("locationId");
		boolean param5 = reader.readBoolean("addToQueue");
		reader.endElement(getName());

		// Create the bean
		return new StartActionMovement(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IStartActionMovement object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("mobileId", object.getMobileId());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeBoolean("addToQueue", object.getAddToQueue());
		writer.endElement(getName());
	}
}
