package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class SetPlayerActionQueueLimitXmlSerializer implements IXmlSerializer<ISetPlayerActionQueueLimit> {

	private String name;

	public SetPlayerActionQueueLimitXmlSerializer() {
		this("SetPlayerActionQueueLimit");
	}

	public SetPlayerActionQueueLimitXmlSerializer(String name) {
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
	public ISetPlayerActionQueueLimit readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("limit");
		reader.endElement(getName());

		// Create the bean
		return new SetPlayerActionQueueLimit(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetPlayerActionQueueLimit object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("limit", object.getLimit());
		writer.endElement(getName());
	}
}
