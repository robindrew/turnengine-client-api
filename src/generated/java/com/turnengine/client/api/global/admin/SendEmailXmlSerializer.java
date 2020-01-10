package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SendEmailXmlSerializer implements IXmlSerializer<ISendEmail> {

	private String name;

	public SendEmailXmlSerializer() {
		this("SendEmail");
	}

	public SendEmailXmlSerializer(String name) {
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
	public ISendEmail readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("sender"));
		String param3 = reader.readObject(new StringSerializer("recipient"));
		String param4 = reader.readObject(new StringSerializer("subject"));
		String param5 = reader.readObject(new StringSerializer("body"));
		reader.endElement(getName());

		// Create the bean
		return new SendEmail(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISendEmail object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getSender(), new StringSerializer("sender"));
		writer.writeObject(object.getRecipient(), new StringSerializer("recipient"));
		writer.writeObject(object.getSubject(), new StringSerializer("subject"));
		writer.writeObject(object.getBody(), new StringSerializer("body"));
		writer.endElement(getName());
	}
}
