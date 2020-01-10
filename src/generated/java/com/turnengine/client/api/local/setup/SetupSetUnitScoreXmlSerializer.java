package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetupSetUnitScoreXmlSerializer implements IXmlSerializer<ISetupSetUnitScore> {

	private String name;

	public SetupSetUnitScoreXmlSerializer() {
		this("SetupSetUnitScore");
	}

	public SetupSetUnitScoreXmlSerializer(String name) {
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
	public ISetupSetUnitScore readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("group"));
		String param4 = reader.readObject(new StringSerializer("unit"));
		long param5 = reader.readLong("score");
		reader.endElement(getName());

		// Create the bean
		return new SetupSetUnitScore(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupSetUnitScore object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getGroup(), new StringSerializer("group"));
		writer.writeObject(object.getUnit(), new StringSerializer("unit"));
		writer.writeLong("score", object.getScore());
		writer.endElement(getName());
	}
}
