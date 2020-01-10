package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class CancelActionAtPlayerXmlSerializer implements IXmlSerializer<ICancelActionAtPlayer> {

	private String name;

	public CancelActionAtPlayerXmlSerializer() {
		this("CancelActionAtPlayer");
	}

	public CancelActionAtPlayerXmlSerializer(String name) {
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
	public ICancelActionAtPlayer readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("actionId");
		long param4 = reader.readLong("amount");
		reader.endElement(getName());

		// Create the bean
		return new CancelActionAtPlayer(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ICancelActionAtPlayer object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("actionId", object.getActionId());
		writer.writeLong("amount", object.getAmount());
		writer.endElement(getName());
	}
}
