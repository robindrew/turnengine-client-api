package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class LoginUserJsonSerializer implements IJsonSerializer<ILoginUser> {

	private String name;

	public LoginUserJsonSerializer() {
		this("LoginUser");
	}

	public LoginUserJsonSerializer(String name) {
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
	public ILoginUser readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ILoginUser object) {
		writer.openObject();
		writer.writeObject(object.getNameOrEmail(), new StringSerializer());
		writer.writeObject(object.getPassword(), new StringSerializer());
		writer.writeObject(object.getAddress(), new StringSerializer());
		writer.closeObject();
	}
}
