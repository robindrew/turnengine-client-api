package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.locale.LanguageCountry;
import java.io.IOException;

public class SetUserLanguageReturnTypeDataSerializer extends ObjectSerializer<ISetUserLanguage> {

	public SetUserLanguageReturnTypeDataSerializer() {
		super(false);
	}

	public SetUserLanguageReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetUserLanguage readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		LanguageCountry param2 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
		return new SetUserLanguage(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetUserLanguage object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, false));
	}
}
