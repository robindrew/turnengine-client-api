package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class UserSimilarityJsonSerializer implements IJsonSerializer<IUserSimilarity> {

	private String name;

	public UserSimilarityJsonSerializer() {
		this("UserSimilarity");
	}

	public UserSimilarityJsonSerializer(String name) {
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
	public IUserSimilarity readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IUserSimilarity object) {
		writer.openObject();
		writer.writeObject(object.getUser1(), new UserJsonSerializer());
		writer.writeObject(object.getUser2(), new UserJsonSerializer());
		writer.writeInt(object.getNameScore());
		writer.writeInt(object.getEmailScore());
		writer.writeInt(object.getAddressScore());
		writer.writeInt(object.getPasswordScore());
		writer.closeObject();
	}
}
