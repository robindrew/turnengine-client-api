package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class GetTranslationByIdJsonSerializer implements IJsonSerializer<IGetTranslationById> {

	private String name;

	public GetTranslationByIdJsonSerializer() {
		this("GetTranslationById");
	}

	public GetTranslationByIdJsonSerializer(String name) {
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
	public IGetTranslationById readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetTranslationById object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class));
		writer.closeObject();
	}
}
