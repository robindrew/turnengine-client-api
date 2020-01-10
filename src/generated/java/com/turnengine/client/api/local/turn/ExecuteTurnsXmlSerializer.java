package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ExecuteTurnsXmlSerializer implements IXmlSerializer<IExecuteTurns> {

	private String name;

	public ExecuteTurnsXmlSerializer() {
		this("ExecuteTurns");
	}

	public ExecuteTurnsXmlSerializer(String name) {
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
	public IExecuteTurns readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("turns");
		reader.endElement(getName());

		// Create the bean
		return new ExecuteTurns(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IExecuteTurns object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("turns", object.getTurns());
		writer.endElement(getName());
	}
}
