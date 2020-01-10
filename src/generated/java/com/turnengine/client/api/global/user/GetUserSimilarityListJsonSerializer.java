package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class GetUserSimilarityListJsonSerializer implements IJsonSerializer<IGetUserSimilarityList> {

	private String name;

	public GetUserSimilarityListJsonSerializer() {
		this("GetUserSimilarityList");
	}

	public GetUserSimilarityListJsonSerializer(String name) {
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
	public IGetUserSimilarityList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUserSimilarityList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getOrder(), new EnumSerializer<UserSimilarityOrder>(UserSimilarityOrder.class));
		writer.writeInt(object.getThreshold());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
		writer.closeObject();
	}
}
