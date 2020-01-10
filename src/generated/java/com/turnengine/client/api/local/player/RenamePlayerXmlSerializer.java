package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class RenamePlayerXmlSerializer implements IXmlSerializer<IRenamePlayer> {

	private String name;

	public RenamePlayerXmlSerializer() {
		this("RenamePlayer");
	}

	public RenamePlayerXmlSerializer(String name) {
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
	public IRenamePlayer readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("from"));
		String param4 = reader.readObject(new StringSerializer("to"));
		reader.endElement(getName());

		// Create the bean
		return new RenamePlayer(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IRenamePlayer object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getFrom(), new StringSerializer("from"));
		writer.writeObject(object.getTo(), new StringSerializer("to"));
		writer.endElement(getName());
	}
}
