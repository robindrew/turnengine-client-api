package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class UserSimilarityDataSerializer extends ObjectSerializer<IUserSimilarity> {

	public UserSimilarityDataSerializer() {
		super(false);
	}

	public UserSimilarityDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUserSimilarity readValue(IDataReader reader) throws IOException {
		IUser param1 = reader.readObject(new UserDataSerializer(false));
		IUser param2 = reader.readObject(new UserDataSerializer(false));
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		int param6 = reader.readInt();
		return new UserSimilarity(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, IUserSimilarity object) throws IOException {
		writer.writeObject(object.getUser1(), new UserDataSerializer(false));
		writer.writeObject(object.getUser2(), new UserDataSerializer(false));
		writer.writeInt(object.getNameScore());
		writer.writeInt(object.getEmailScore());
		writer.writeInt(object.getAddressScore());
		writer.writeInt(object.getPasswordScore());
	}
}
