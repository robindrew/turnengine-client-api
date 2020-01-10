package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class SetMobilesEnabledXmlSerializer implements IXmlSerializer<ISetMobilesEnabled> {

	private String name;

	public SetMobilesEnabledXmlSerializer() {
		this("SetMobilesEnabled");
	}

	public SetMobilesEnabledXmlSerializer(String name) {
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
	public ISetMobilesEnabled readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		boolean param3 = reader.readBoolean("enabled");
		reader.endElement(getName());

		// Create the bean
		return new SetMobilesEnabled(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetMobilesEnabled object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeBoolean("enabled", object.getEnabled());
		writer.endElement(getName());
	}
}
