package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetAvailableServiceListReturnTypeDataSerializer extends ObjectSerializer<IGetAvailableServiceList> {

	public GetAvailableServiceListReturnTypeDataSerializer() {
		super(false);
	}

	public GetAvailableServiceListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAvailableServiceList readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		return new GetAvailableServiceList(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAvailableServiceList object) throws IOException {
		writer.writeObject(object.getProject(), new StringSerializer(false));
	}
}
