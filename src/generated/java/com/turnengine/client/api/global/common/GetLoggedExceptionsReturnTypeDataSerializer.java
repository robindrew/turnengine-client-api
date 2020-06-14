package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetLoggedExceptionsReturnTypeDataSerializer extends ObjectSerializer<IGetLoggedExceptions> {

	public GetLoggedExceptionsReturnTypeDataSerializer() {
		super(false);
	}

	public GetLoggedExceptionsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLoggedExceptions readValue(IDataReader reader) throws IOException {
		return new GetLoggedExceptions();
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLoggedExceptions object) throws IOException {
	}
}
