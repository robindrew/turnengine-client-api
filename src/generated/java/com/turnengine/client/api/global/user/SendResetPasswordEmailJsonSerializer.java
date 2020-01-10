package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SendResetPasswordEmailJsonSerializer implements IJsonSerializer<ISendResetPasswordEmail> {

	private String name;

	public SendResetPasswordEmailJsonSerializer() {
		this("SendResetPasswordEmail");
	}

	public SendResetPasswordEmailJsonSerializer(String name) {
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
	public ISendResetPasswordEmail readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISendResetPasswordEmail object) {
		writer.openObject();
		writer.writeObject(object.getEmail(), new StringSerializer());
		writer.closeObject();
	}
}
