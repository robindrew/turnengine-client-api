package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;
import java.io.IOException;

public class UserDataSerializer extends ObjectSerializer<IUser> {

	public UserDataSerializer() {
		super(false);
	}

	public UserDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUser readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		LanguageCountry param4 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
		return new User(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IUser object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getEmail(), new StringSerializer(false));
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
	}
}
