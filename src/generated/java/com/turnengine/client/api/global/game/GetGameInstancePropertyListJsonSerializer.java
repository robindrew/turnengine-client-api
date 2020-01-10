package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameInstancePropertyListJsonSerializer implements IJsonSerializer<IGetGameInstancePropertyList> {

	private String name;

	public GetGameInstancePropertyListJsonSerializer() {
		this("GetGameInstancePropertyList");
	}

	public GetGameInstancePropertyListJsonSerializer(String name) {
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
	public IGetGameInstancePropertyList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameInstancePropertyList object) {
		writer.openObject();
		writer.writeInt(object.getInstanceId());
		writer.closeObject();
	}
}
