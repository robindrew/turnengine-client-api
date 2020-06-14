package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetCommandAvailableReturnTypeDataSerializer extends ObjectSerializer<IGetCommandAvailable> {

	public GetCommandAvailableReturnTypeDataSerializer() {
		super(false);
	}

	public GetCommandAvailableReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetCommandAvailable readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		return new GetCommandAvailable(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetCommandAvailable object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
