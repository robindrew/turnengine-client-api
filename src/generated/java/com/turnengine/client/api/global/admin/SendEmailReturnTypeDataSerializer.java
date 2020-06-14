package com.turnengine.client.api.global.admin;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SendEmailReturnTypeDataSerializer extends ObjectSerializer<ISendEmail> {

	public SendEmailReturnTypeDataSerializer() {
		super(false);
	}

	public SendEmailReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISendEmail readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		String param5 = reader.readObject(new StringSerializer(false));
		return new SendEmail(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ISendEmail object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getSender(), new StringSerializer(false));
		writer.writeObject(object.getRecipient(), new StringSerializer(false));
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getBody(), new StringSerializer(false));
	}
}
