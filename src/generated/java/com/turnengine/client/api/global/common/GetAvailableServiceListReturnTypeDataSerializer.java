package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
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
