package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUserAdminInfoListJsonSerializer implements IJsonSerializer<IGetUserAdminInfoList> {

	private String name;

	public GetUserAdminInfoListJsonSerializer() {
		this("GetUserAdminInfoList");
	}

	public GetUserAdminInfoListJsonSerializer(String name) {
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
	public IGetUserAdminInfoList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUserAdminInfoList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.closeObject();
	}
}
