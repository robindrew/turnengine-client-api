package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class ResetPasswordJsonSerializer implements IJsonSerializer<IResetPassword> {

	private String name;

	public ResetPasswordJsonSerializer() {
		this("ResetPassword");
	}

	public ResetPasswordJsonSerializer(String name) {
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
	public IResetPassword readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IResetPassword object) {
		writer.openObject();
		writer.writeObject(object.getEmail(), new StringSerializer());
		writer.writeObject(object.getPassword(), new StringSerializer());
		writer.writeLong(object.getCode());
		writer.closeObject();
	}
}
