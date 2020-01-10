package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameInstanceByIdJsonSerializer implements IJsonSerializer<IGetGameInstanceById> {

	private String name;

	public GetGameInstanceByIdJsonSerializer() {
		this("GetGameInstanceById");
	}

	public GetGameInstanceByIdJsonSerializer(String name) {
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
	public IGetGameInstanceById readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameInstanceById object) {
		writer.openObject();
		writer.writeInt(object.getInstanceId());
		writer.closeObject();
	}
}
