package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SendEmailJsonSerializer implements IJsonSerializer<ISendEmail> {

	private String name;

	public SendEmailJsonSerializer() {
		this("SendEmail");
	}

	public SendEmailJsonSerializer(String name) {
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
	public ISendEmail readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISendEmail object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getSender(), new StringSerializer());
		writer.writeObject(object.getRecipient(), new StringSerializer());
		writer.writeObject(object.getSubject(), new StringSerializer());
		writer.writeObject(object.getBody(), new StringSerializer());
		writer.closeObject();
	}
}
