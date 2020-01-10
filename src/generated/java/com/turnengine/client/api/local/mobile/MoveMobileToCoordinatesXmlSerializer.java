package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.array.IntArraySerializer;

public class MoveMobileToCoordinatesXmlSerializer implements IXmlSerializer<IMoveMobileToCoordinates> {

	private String name;

	public MoveMobileToCoordinatesXmlSerializer() {
		this("MoveMobileToCoordinates");
	}

	public MoveMobileToCoordinatesXmlSerializer(String name) {
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
	public IMoveMobileToCoordinates readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("mobileId");
		int[] param4 = reader.readObject(new IntArraySerializer("coordinates"));
		boolean param5 = reader.readBoolean("addToQueue");
		boolean param6 = reader.readBoolean("repeat");
		reader.endElement(getName());

		// Create the bean
		return new MoveMobileToCoordinates(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMoveMobileToCoordinates object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("mobileId", object.getMobileId());
		writer.writeObject(object.getCoordinates(), new IntArraySerializer("coordinates"));
		writer.writeBoolean("addToQueue", object.getAddToQueue());
		writer.writeBoolean("repeat", object.getRepeat());
		writer.endElement(getName());
	}
}
