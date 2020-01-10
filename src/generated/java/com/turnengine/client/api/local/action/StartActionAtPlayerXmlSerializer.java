package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class StartActionAtPlayerXmlSerializer implements IXmlSerializer<IStartActionAtPlayer> {

	private String name;

	public StartActionAtPlayerXmlSerializer() {
		this("StartActionAtPlayer");
	}

	public StartActionAtPlayerXmlSerializer(String name) {
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
	public IStartActionAtPlayer readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("actionId");
		long param4 = reader.readLong("amount");
		boolean param5 = reader.readBoolean("addToQueue");
		reader.endElement(getName());

		// Create the bean
		return new StartActionAtPlayer(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IStartActionAtPlayer object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("actionId", object.getActionId());
		writer.writeLong("amount", object.getAmount());
		writer.writeBoolean("addToQueue", object.getAddToQueue());
		writer.endElement(getName());
	}
}
