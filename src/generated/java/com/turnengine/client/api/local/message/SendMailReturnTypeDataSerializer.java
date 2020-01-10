package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SendMailReturnTypeDataSerializer extends ObjectSerializer<ISendMail> {

	public SendMailReturnTypeDataSerializer() {
		super(false);
	}

	public SendMailReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISendMail readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		String param5 = reader.readObject(new StringSerializer(false));
		return new SendMail(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ISendMail object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getRecipient(), new StringSerializer(false));
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getContent(), new StringSerializer(false));
	}
}
