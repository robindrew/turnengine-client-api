package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.BooleanSerializer;
import java.io.IOException;

public class SetSignupVerificationReturnTypeDataSerializer extends ObjectSerializer<ISetSignupVerification> {

	public SetSignupVerificationReturnTypeDataSerializer() {
		super(false);
	}

	public SetSignupVerificationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetSignupVerification readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		Boolean param2 = reader.readObject(new BooleanSerializer(false));
		return new SetSignupVerification(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetSignupVerification object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getEnabled(), new BooleanSerializer(false));
	}
}
