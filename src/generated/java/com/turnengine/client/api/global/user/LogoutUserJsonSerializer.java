package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class LogoutUserJsonSerializer implements IJsonSerializer<ILogoutUser> {

	private String name;

	public LogoutUserJsonSerializer() {
		this("LogoutUser");
	}

	public LogoutUserJsonSerializer(String name) {
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
	public ILogoutUser readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ILogoutUser object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.closeObject();
	}
}
