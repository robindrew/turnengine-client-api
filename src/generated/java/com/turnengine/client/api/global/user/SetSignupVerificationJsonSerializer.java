package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.BooleanSerializer;

public class SetSignupVerificationJsonSerializer implements IJsonSerializer<ISetSignupVerification> {

	private String name;

	public SetSignupVerificationJsonSerializer() {
		this("SetSignupVerification");
	}

	public SetSignupVerificationJsonSerializer(String name) {
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
	public ISetSignupVerification readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetSignupVerification object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getEnabled(), new BooleanSerializer());
		writer.closeObject();
	}
}
