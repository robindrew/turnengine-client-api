package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class SetPlayerLimitXmlSerializer implements IXmlSerializer<ISetPlayerLimit> {

	private String name;

	public SetPlayerLimitXmlSerializer() {
		this("SetPlayerLimit");
	}

	public SetPlayerLimitXmlSerializer(String name) {
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
	public ISetPlayerLimit readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("limit");
		reader.endElement(getName());

		// Create the bean
		return new SetPlayerLimit(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetPlayerLimit object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("limit", object.getLimit());
		writer.endElement(getName());
	}
}
