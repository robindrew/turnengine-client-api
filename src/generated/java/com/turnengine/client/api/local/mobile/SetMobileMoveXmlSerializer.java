package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class SetMobileMoveXmlSerializer implements IXmlSerializer<ISetMobileMove> {

	private String name;

	public SetMobileMoveXmlSerializer() {
		this("SetMobileMove");
	}

	public SetMobileMoveXmlSerializer(String name) {
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
	public ISetMobileMove readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("mobileId");
		int param4 = reader.readInt("originId");
		int param5 = reader.readInt("destinationId");
		int param6 = reader.readInt("turns");
		reader.endElement(getName());

		// Create the bean
		return new SetMobileMove(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetMobileMove object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("mobileId", object.getMobileId());
		writer.writeInt("originId", object.getOriginId());
		writer.writeInt("destinationId", object.getDestinationId());
		writer.writeInt("turns", object.getTurns());
		writer.endElement(getName());
	}
}
