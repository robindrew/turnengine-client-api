package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SendMailJsonSerializer implements IJsonSerializer<ISendMail> {

	private String name;

	public SendMailJsonSerializer() {
		this("SendMail");
	}

	public SendMailJsonSerializer(String name) {
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
	public ISendMail readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISendMail object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getRecipient(), new StringSerializer());
		writer.writeObject(object.getSubject(), new StringSerializer());
		writer.writeObject(object.getContent(), new StringSerializer());
		writer.closeObject();
	}
}
