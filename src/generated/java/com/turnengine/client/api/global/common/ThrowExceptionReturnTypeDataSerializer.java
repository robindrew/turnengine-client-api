package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ThrowExceptionReturnTypeDataSerializer extends ObjectSerializer<IThrowException> {

	public ThrowExceptionReturnTypeDataSerializer() {
		super(false);
	}

	public ThrowExceptionReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IThrowException readValue(IDataReader reader) throws IOException {
		return new ThrowException();
	}

	@Override
	public void writeValue(IDataWriter writer, IThrowException object) throws IOException {
	}
}
