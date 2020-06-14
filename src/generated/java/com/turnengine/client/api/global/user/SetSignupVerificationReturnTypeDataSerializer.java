package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.BooleanSerializer;
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
