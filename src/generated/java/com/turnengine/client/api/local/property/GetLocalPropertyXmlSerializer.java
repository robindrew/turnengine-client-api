package com.turnengine.client.api.local.property;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetLocalPropertyXmlSerializer implements IXmlSerializer<IGetLocalProperty> {

	private String name;

	public GetLocalPropertyXmlSerializer() {
		this("GetLocalProperty");
	}

	public GetLocalPropertyXmlSerializer(String name) {
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
	public IGetLocalProperty readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("key"));
		reader.endElement(getName());

		// Create the bean
		return new GetLocalProperty(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetLocalProperty object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getKey(), new StringSerializer("key"));
		writer.endElement(getName());
	}
}
