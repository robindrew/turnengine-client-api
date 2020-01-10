package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class RenameUserJsonSerializer implements IJsonSerializer<IRenameUser> {

	private String name;

	public RenameUserJsonSerializer() {
		this("RenameUser");
	}

	public RenameUserJsonSerializer(String name) {
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
	public IRenameUser readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IRenameUser object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getFrom(), new StringSerializer());
		writer.writeObject(object.getTo(), new StringSerializer());
		writer.closeObject();
	}
}
