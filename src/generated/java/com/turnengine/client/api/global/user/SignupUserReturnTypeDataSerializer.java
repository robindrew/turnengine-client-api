package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;
import java.io.IOException;

public class SignupUserReturnTypeDataSerializer extends ObjectSerializer<ISignupUser> {

	public SignupUserReturnTypeDataSerializer() {
		super(false);
	}

	public SignupUserReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISignupUser readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		LanguageCountry param5 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
		return new SignupUser(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ISignupUser object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getPassword(), new StringSerializer(false));
		writer.writeObject(object.getEmail(), new StringSerializer(false));
		writer.writeObject(object.getAddress(), new StringSerializer(false));
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
	}
}
