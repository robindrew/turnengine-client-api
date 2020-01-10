package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ClearActionsQueuedAtPlayerXmlSerializer implements IXmlSerializer<IClearActionsQueuedAtPlayer> {

	private String name;

	public ClearActionsQueuedAtPlayerXmlSerializer() {
		this("ClearActionsQueuedAtPlayer");
	}

	public ClearActionsQueuedAtPlayerXmlSerializer(String name) {
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
	public IClearActionsQueuedAtPlayer readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("groupId");
		reader.endElement(getName());

		// Create the bean
		return new ClearActionsQueuedAtPlayer(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IClearActionsQueuedAtPlayer object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("groupId", object.getGroupId());
		writer.endElement(getName());
	}
}
