package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetMessageCountByFormatXmlSerializer implements IXmlSerializer<IGetMessageCountByFormat> {

	private String name;

	public GetMessageCountByFormatXmlSerializer() {
		this("GetMessageCountByFormat");
	}

	public GetMessageCountByFormatXmlSerializer(String name) {
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
	public IGetMessageCountByFormat readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("format"));
		reader.endElement(getName());

		// Create the bean
		return new GetMessageCountByFormat(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetMessageCountByFormat object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getFormat(), new StringSerializer("format"));
		writer.endElement(getName());
	}
}
