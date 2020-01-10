package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class VerifyUserJsonSerializer implements IJsonSerializer<IVerifyUser> {

	private String name;

	public VerifyUserJsonSerializer() {
		this("VerifyUser");
	}

	public VerifyUserJsonSerializer(String name) {
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
	public IVerifyUser readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IVerifyUser object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeLong(object.getCode());
		writer.writeObject(object.getAddress(), new StringSerializer());
		writer.closeObject();
	}
}
