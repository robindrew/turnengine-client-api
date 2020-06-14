package com.turnengine.client.api.global.translation;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;
import java.io.IOException;

public class GetTranslationByTextReturnTypeDataSerializer extends ObjectSerializer<IGetTranslationByText> {

	public GetTranslationByTextReturnTypeDataSerializer() {
		super(false);
	}

	public GetTranslationByTextReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetTranslationByText readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		LanguageCountry param2 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
		return new GetTranslationByText(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetTranslationByText object) throws IOException {
		writer.writeObject(object.getEnglish(), new StringSerializer(false));
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
	}
}
