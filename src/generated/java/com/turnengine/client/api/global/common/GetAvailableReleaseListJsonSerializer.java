package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetAvailableReleaseListJsonSerializer implements IJsonSerializer<IGetAvailableReleaseList> {

	private String name;

	public GetAvailableReleaseListJsonSerializer() {
		this("GetAvailableReleaseList");
	}

	public GetAvailableReleaseListJsonSerializer(String name) {
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
	public IGetAvailableReleaseList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetAvailableReleaseList object) {
		writer.openObject();
		writer.writeObject(object.getProject(), new StringSerializer());
		writer.closeObject();
	}
}
