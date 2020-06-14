package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SendResetPasswordEmailReturnTypeDataSerializer extends ObjectSerializer<ISendResetPasswordEmail> {

	public SendResetPasswordEmailReturnTypeDataSerializer() {
		super(false);
	}

	public SendResetPasswordEmailReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISendResetPasswordEmail readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		return new SendResetPasswordEmail(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, ISendResetPasswordEmail object) throws IOException {
		writer.writeObject(object.getEmail(), new StringSerializer(false));
	}
}
