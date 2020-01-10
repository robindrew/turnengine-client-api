package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetupSetScoreUpdaterGroupXmlSerializer implements IXmlSerializer<ISetupSetScoreUpdaterGroup> {

	private String name;

	public SetupSetScoreUpdaterGroupXmlSerializer() {
		this("SetupSetScoreUpdaterGroup");
	}

	public SetupSetScoreUpdaterGroupXmlSerializer(String name) {
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
	public ISetupSetScoreUpdaterGroup readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("group"));
		reader.endElement(getName());

		// Create the bean
		return new SetupSetScoreUpdaterGroup(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupSetScoreUpdaterGroup object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getGroup(), new StringSerializer("group"));
		writer.endElement(getName());
	}
}
