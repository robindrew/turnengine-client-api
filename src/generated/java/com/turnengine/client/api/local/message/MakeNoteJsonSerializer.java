package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class MakeNoteJsonSerializer implements IJsonSerializer<IMakeNote> {

	private String name;

	public MakeNoteJsonSerializer() {
		this("MakeNote");
	}

	public MakeNoteJsonSerializer(String name) {
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
	public IMakeNote readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IMakeNote object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getSubject(), new StringSerializer());
		writer.writeObject(object.getContent(), new StringSerializer());
		writer.closeObject();
	}
}
