package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ClearActionQueuedAtPlayerXmlSerializer implements IXmlSerializer<IClearActionQueuedAtPlayer> {

	private String name;

	public ClearActionQueuedAtPlayerXmlSerializer() {
		this("ClearActionQueuedAtPlayer");
	}

	public ClearActionQueuedAtPlayerXmlSerializer(String name) {
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
	public IClearActionQueuedAtPlayer readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("index");
		reader.endElement(getName());

		// Create the bean
		return new ClearActionQueuedAtPlayer(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IClearActionQueuedAtPlayer object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("index", object.getIndex());
		writer.endElement(getName());
	}
}
