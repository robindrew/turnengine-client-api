package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class SetAllianceLeaveTurnsXmlSerializer implements IXmlSerializer<ISetAllianceLeaveTurns> {

	private String name;

	public SetAllianceLeaveTurnsXmlSerializer() {
		this("SetAllianceLeaveTurns");
	}

	public SetAllianceLeaveTurnsXmlSerializer(String name) {
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
	public ISetAllianceLeaveTurns readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("turns");
		reader.endElement(getName());

		// Create the bean
		return new SetAllianceLeaveTurns(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetAllianceLeaveTurns object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("turns", object.getTurns());
		writer.endElement(getName());
	}
}
