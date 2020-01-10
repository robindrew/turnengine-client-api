package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class MoveMobileXmlSerializer implements IXmlSerializer<IMoveMobile> {

	private String name;

	public MoveMobileXmlSerializer() {
		this("MoveMobile");
	}

	public MoveMobileXmlSerializer(String name) {
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
	public IMoveMobile readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("mobileId");
		int param4 = reader.readInt("locationId");
		boolean param5 = reader.readBoolean("addToQueue");
		boolean param6 = reader.readBoolean("repeat");
		reader.endElement(getName());

		// Create the bean
		return new MoveMobile(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMoveMobile object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("mobileId", object.getMobileId());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeBoolean("addToQueue", object.getAddToQueue());
		writer.writeBoolean("repeat", object.getRepeat());
		writer.endElement(getName());
	}
}
