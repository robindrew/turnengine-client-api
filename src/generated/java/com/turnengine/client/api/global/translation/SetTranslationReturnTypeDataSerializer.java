package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;
import java.io.IOException;

public class SetTranslationReturnTypeDataSerializer extends ObjectSerializer<ISetTranslation> {

	public SetTranslationReturnTypeDataSerializer() {
		super(false);
	}

	public SetTranslationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetTranslation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		LanguageCountry param3 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new SetTranslation(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetTranslation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getId());
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
		writer.writeObject(object.getTranslation(), new StringSerializer(false));
	}
}
