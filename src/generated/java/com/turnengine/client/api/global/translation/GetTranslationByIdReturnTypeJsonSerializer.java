package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetTranslationByIdReturnTypeJsonSerializer implements IJsonSerializer<ITranslation> {

	private String name;

	public GetTranslationByIdReturnTypeJsonSerializer() {
		this("GetTranslationByIdReturnType");
	}

	public GetTranslationByIdReturnTypeJsonSerializer(String name) {
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
	public ITranslation readObject(IJsonReader reader) {
		return new TranslationJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, ITranslation object) {
		new TranslationJsonSerializer().writeObject(writer, object);
	}
}
