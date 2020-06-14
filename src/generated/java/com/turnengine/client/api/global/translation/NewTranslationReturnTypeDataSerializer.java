package com.turnengine.client.api.global.translation;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class NewTranslationReturnTypeDataSerializer extends ObjectSerializer<INewTranslation> {

	public NewTranslationReturnTypeDataSerializer() {
		super(false);
	}

	public NewTranslationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public INewTranslation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		return new NewTranslation(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, INewTranslation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getEnglish(), new StringSerializer(false));
	}
}
