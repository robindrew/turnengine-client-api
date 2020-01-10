package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetResetPasswordEmailReturnTypeDataSerializer extends ObjectSerializer<ISetResetPasswordEmail> {

	public SetResetPasswordEmailReturnTypeDataSerializer() {
		super(false);
	}

	public SetResetPasswordEmailReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetResetPasswordEmail readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new SetResetPasswordEmail(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetResetPasswordEmail object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getContent(), new StringSerializer(false));
	}
}
