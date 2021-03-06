package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.IntegerSerializer;

public class GetAnnouncementCountReturnTypeJsonSerializer implements IJsonSerializer<Integer> {

	private String name;

	public GetAnnouncementCountReturnTypeJsonSerializer() {
		this("GetAnnouncementCountReturnType");
	}

	public GetAnnouncementCountReturnTypeJsonSerializer(String name) {
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
	public Integer readObject(IJsonReader reader) {
		return new IntegerSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, Integer object) {
		new IntegerSerializer().writeObject(writer, object);
	}
}
