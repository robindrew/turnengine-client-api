package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class ChangeUserPasswordJsonSerializer implements IJsonSerializer<IChangeUserPassword> {

	private String name;

	public ChangeUserPasswordJsonSerializer() {
		this("ChangeUserPassword");
	}

	public ChangeUserPasswordJsonSerializer(String name) {
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
	public IChangeUserPassword readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IChangeUserPassword object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getOldPassword(), new StringSerializer());
		writer.writeObject(object.getNewPassword(), new StringSerializer());
		writer.closeObject();
	}
}
