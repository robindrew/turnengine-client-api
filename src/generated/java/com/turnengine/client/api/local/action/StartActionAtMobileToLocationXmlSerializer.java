package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class StartActionAtMobileToLocationXmlSerializer implements IXmlSerializer<IStartActionAtMobileToLocation> {

	private String name;

	public StartActionAtMobileToLocationXmlSerializer() {
		this("StartActionAtMobileToLocation");
	}

	public StartActionAtMobileToLocationXmlSerializer(String name) {
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
	public IStartActionAtMobileToLocation readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("mobileId");
		int param4 = reader.readInt("locationId");
		int param5 = reader.readInt("actionId");
		long param6 = reader.readLong("amount");
		boolean param7 = reader.readBoolean("addToQueue");
		reader.endElement(getName());

		// Create the bean
		return new StartActionAtMobileToLocation(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeObject(IXmlWriter writer, IStartActionAtMobileToLocation object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("mobileId", object.getMobileId());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeInt("actionId", object.getActionId());
		writer.writeLong("amount", object.getAmount());
		writer.writeBoolean("addToQueue", object.getAddToQueue());
		writer.endElement(getName());
	}
}
