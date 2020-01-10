package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class NewTranslationJsonSerializer implements IJsonSerializer<INewTranslation> {

	private String name;

	public NewTranslationJsonSerializer() {
		this("NewTranslation");
	}

	public NewTranslationJsonSerializer(String name) {
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
	public INewTranslation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, INewTranslation object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getEnglish(), new StringSerializer());
		writer.closeObject();
	}
}
