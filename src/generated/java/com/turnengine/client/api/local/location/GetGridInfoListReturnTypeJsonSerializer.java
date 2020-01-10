package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGridInfoListReturnTypeJsonSerializer implements IJsonSerializer<IGridInfo> {

	private String name;

	public GetGridInfoListReturnTypeJsonSerializer() {
		this("GetGridInfoListReturnType");
	}

	public GetGridInfoListReturnTypeJsonSerializer(String name) {
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
	public IGridInfo readObject(IJsonReader reader) {
		return new GridInfoJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IGridInfo object) {
		new GridInfoJsonSerializer().writeObject(writer, object);
	}
}
