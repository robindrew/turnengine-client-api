package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetPlayerSignupPluginJsonSerializer implements IJsonSerializer<ISetPlayerSignupPlugin> {

	private String name;

	public SetPlayerSignupPluginJsonSerializer() {
		this("SetPlayerSignupPlugin");
	}

	public SetPlayerSignupPluginJsonSerializer(String name) {
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
	public ISetPlayerSignupPlugin readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetPlayerSignupPlugin object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getPlugin(), new StringSerializer());
		writer.closeObject();
	}
}
