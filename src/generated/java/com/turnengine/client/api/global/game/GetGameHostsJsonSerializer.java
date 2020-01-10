package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameHostsJsonSerializer implements IJsonSerializer<IGetGameHosts> {

	private String name;

	public GetGameHostsJsonSerializer() {
		this("GetGameHosts");
	}

	public GetGameHostsJsonSerializer(String name) {
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
	public IGetGameHosts readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameHosts object) {
		writer.openObject();
		writer.closeObject();
	}
}
