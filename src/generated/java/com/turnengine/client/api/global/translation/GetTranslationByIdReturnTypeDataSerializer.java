package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.common.locale.LanguageCountry;
import java.io.IOException;

public class GetTranslationByIdReturnTypeDataSerializer extends ObjectSerializer<IGetTranslationById> {

	public GetTranslationByIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetTranslationByIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetTranslationById readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		LanguageCountry param2 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
		return new GetTranslationById(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetTranslationById object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
	}
}
