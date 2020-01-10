package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class SetUserLanguageJsonSerializer implements IJsonSerializer<ISetUserLanguage> {

	private String name;

	public SetUserLanguageJsonSerializer() {
		this("SetUserLanguage");
	}

	public SetUserLanguageJsonSerializer(String name) {
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
	public ISetUserLanguage readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetUserLanguage object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class));
		writer.closeObject();
	}
}
