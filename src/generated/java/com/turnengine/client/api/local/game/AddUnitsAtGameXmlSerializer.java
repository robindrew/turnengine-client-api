package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class AddUnitsAtGameXmlSerializer implements IXmlSerializer<IAddUnitsAtGame> {

	private String name;

	public AddUnitsAtGameXmlSerializer() {
		this("AddUnitsAtGame");
	}

	public AddUnitsAtGameXmlSerializer(String name) {
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
	public IAddUnitsAtGame readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("name"));
		long param4 = reader.readLong("amount");
		reader.endElement(getName());

		// Create the bean
		return new AddUnitsAtGame(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAddUnitsAtGame object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeLong("amount", object.getAmount());
		writer.endElement(getName());
	}
}
