package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class SetTranslationJsonSerializer implements IJsonSerializer<ISetTranslation> {

	private String name;

	public SetTranslationJsonSerializer() {
		this("SetTranslation");
	}

	public SetTranslationJsonSerializer(String name) {
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
	public ISetTranslation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetTranslation object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getId());
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class));
		writer.writeObject(object.getTranslation(), new StringSerializer());
		writer.closeObject();
	}
}
