package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class SignupUserJsonSerializer implements IJsonSerializer<ISignupUser> {

	private String name;

	public SignupUserJsonSerializer() {
		this("SignupUser");
	}

	public SignupUserJsonSerializer(String name) {
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
	public ISignupUser readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISignupUser object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getPassword(), new StringSerializer());
		writer.writeObject(object.getEmail(), new StringSerializer());
		writer.writeObject(object.getAddress(), new StringSerializer());
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class));
		writer.closeObject();
	}
}
