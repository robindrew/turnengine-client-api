package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class GetTranslationByTextJsonSerializer implements IJsonSerializer<IGetTranslationByText> {

	private String name;

	public GetTranslationByTextJsonSerializer() {
		this("GetTranslationByText");
	}

	public GetTranslationByTextJsonSerializer(String name) {
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
	public IGetTranslationByText readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetTranslationByText object) {
		writer.openObject();
		writer.writeObject(object.getEnglish(), new StringSerializer());
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class));
		writer.closeObject();
	}
}
