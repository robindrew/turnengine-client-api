package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class AddUnitsAtPlayerXmlSerializer implements IXmlSerializer<IAddUnitsAtPlayer> {

	private String name;

	public AddUnitsAtPlayerXmlSerializer() {
		this("AddUnitsAtPlayer");
	}

	public AddUnitsAtPlayerXmlSerializer(String name) {
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
	public IAddUnitsAtPlayer readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("unitId");
		long param4 = reader.readLong("amount");
		reader.endElement(getName());

		// Create the bean
		return new AddUnitsAtPlayer(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAddUnitsAtPlayer object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("unitId", object.getUnitId());
		writer.writeLong("amount", object.getAmount());
		writer.endElement(getName());
	}
}
