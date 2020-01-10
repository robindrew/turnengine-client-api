package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class SetTurnStartTimeXmlSerializer implements IXmlSerializer<ISetTurnStartTime> {

	private String name;

	public SetTurnStartTimeXmlSerializer() {
		this("SetTurnStartTime");
	}

	public SetTurnStartTimeXmlSerializer(String name) {
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
	public ISetTurnStartTime readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		long param3 = reader.readLong("timestamp");
		reader.endElement(getName());

		// Create the bean
		return new SetTurnStartTime(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetTurnStartTime object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeLong("timestamp", object.getTimestamp());
		writer.endElement(getName());
	}
}
