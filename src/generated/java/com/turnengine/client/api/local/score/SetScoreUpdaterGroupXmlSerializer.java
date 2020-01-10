package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetScoreUpdaterGroupXmlSerializer implements IXmlSerializer<ISetScoreUpdaterGroup> {

	private String name;

	public SetScoreUpdaterGroupXmlSerializer() {
		this("SetScoreUpdaterGroup");
	}

	public SetScoreUpdaterGroupXmlSerializer(String name) {
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
	public ISetScoreUpdaterGroup readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("group"));
		reader.endElement(getName());

		// Create the bean
		return new SetScoreUpdaterGroup(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetScoreUpdaterGroup object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getGroup(), new StringSerializer("group"));
		writer.endElement(getName());
	}
}
