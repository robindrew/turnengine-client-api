package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameVersionByIdJsonSerializer implements IJsonSerializer<IGetGameVersionById> {

	private String name;

	public GetGameVersionByIdJsonSerializer() {
		this("GetGameVersionById");
	}

	public GetGameVersionByIdJsonSerializer(String name) {
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
	public IGetGameVersionById readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameVersionById object) {
		writer.openObject();
		writer.writeInt(object.getVersionId());
		writer.closeObject();
	}
}
