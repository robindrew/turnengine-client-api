package com.turnengine.client.api.global.translation;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;
import java.io.IOException;

public class TranslationDataSerializer extends ObjectSerializer<ITranslation> {

	public TranslationDataSerializer() {
		super(false);
	}

	public TranslationDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ITranslation readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		LanguageCountry param3 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
		return new Translation(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ITranslation object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getText(), new StringSerializer(false));
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
	}
}
