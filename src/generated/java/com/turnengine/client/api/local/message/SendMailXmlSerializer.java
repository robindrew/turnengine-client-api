package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SendMailXmlSerializer implements IXmlSerializer<ISendMail> {

	private String name;

	public SendMailXmlSerializer() {
		this("SendMail");
	}

	public SendMailXmlSerializer(String name) {
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
	public ISendMail readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("recipient"));
		String param4 = reader.readObject(new StringSerializer("subject"));
		String param5 = reader.readObject(new StringSerializer("content"));
		reader.endElement(getName());

		// Create the bean
		return new SendMail(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISendMail object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getRecipient(), new StringSerializer("recipient"));
		writer.writeObject(object.getSubject(), new StringSerializer("subject"));
		writer.writeObject(object.getContent(), new StringSerializer("content"));
		writer.endElement(getName());
	}
}
