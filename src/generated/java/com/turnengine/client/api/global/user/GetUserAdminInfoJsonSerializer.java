package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUserAdminInfoJsonSerializer implements IJsonSerializer<IGetUserAdminInfo> {

	private String name;

	public GetUserAdminInfoJsonSerializer() {
		this("GetUserAdminInfo");
	}

	public GetUserAdminInfoJsonSerializer(String name) {
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
	public IGetUserAdminInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUserAdminInfo object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getUserId());
		writer.closeObject();
	}
}
