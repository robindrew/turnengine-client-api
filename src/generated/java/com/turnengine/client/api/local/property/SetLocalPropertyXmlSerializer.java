package com.turnengine.client.api.local.property;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetLocalPropertyXmlSerializer implements IXmlSerializer<ISetLocalProperty> {

	private String name;

	public SetLocalPropertyXmlSerializer() {
		this("SetLocalProperty");
	}

	public SetLocalPropertyXmlSerializer(String name) {
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
	public ISetLocalProperty readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("key"));
		String param4 = reader.readObject(new StringSerializer("value"));
		reader.endElement(getName());

		// Create the bean
		return new SetLocalProperty(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetLocalProperty object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getKey(), new StringSerializer("key"));
		writer.writeObject(object.getValue(), new StringSerializer("value"));
		writer.endElement(getName());
	}
}
