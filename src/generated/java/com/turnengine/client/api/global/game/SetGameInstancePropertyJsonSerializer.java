package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetGameInstancePropertyJsonSerializer implements IJsonSerializer<ISetGameInstanceProperty> {

	private String name;

	public SetGameInstancePropertyJsonSerializer() {
		this("SetGameInstanceProperty");
	}

	public SetGameInstancePropertyJsonSerializer(String name) {
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
	public ISetGameInstanceProperty readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetGameInstanceProperty object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getKey(), new StringSerializer());
		writer.writeObject(object.getValue(), new StringSerializer());
		writer.closeObject();
	}
}
