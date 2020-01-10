package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class PostNewsXmlSerializer implements IXmlSerializer<IPostNews> {

	private String name;

	public PostNewsXmlSerializer() {
		this("PostNews");
	}

	public PostNewsXmlSerializer(String name) {
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
	public IPostNews readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("recipient"));
		int param4 = reader.readInt("locationId");
		int param5 = reader.readInt("mobileId");
		String param6 = reader.readObject(new StringSerializer("format"));
		String param7 = reader.readObject(new StringSerializer("subject"));
		String param8 = reader.readObject(new StringSerializer("content"));
		reader.endElement(getName());

		// Create the bean
		return new PostNews(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPostNews object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getRecipient(), new StringSerializer("recipient"));
		writer.writeInt("locationId", object.getLocationId());
		writer.writeInt("mobileId", object.getMobileId());
		writer.writeObject(object.getFormat(), new StringSerializer("format"));
		writer.writeObject(object.getSubject(), new StringSerializer("subject"));
		writer.writeObject(object.getContent(), new StringSerializer("content"));
		writer.endElement(getName());
	}
}
