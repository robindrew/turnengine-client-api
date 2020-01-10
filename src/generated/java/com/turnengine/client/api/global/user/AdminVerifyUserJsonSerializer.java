package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AdminVerifyUserJsonSerializer implements IJsonSerializer<IAdminVerifyUser> {

	private String name;

	public AdminVerifyUserJsonSerializer() {
		this("AdminVerifyUser");
	}

	public AdminVerifyUserJsonSerializer(String name) {
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
	public IAdminVerifyUser readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAdminVerifyUser object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getId());
		writer.closeObject();
	}
}
