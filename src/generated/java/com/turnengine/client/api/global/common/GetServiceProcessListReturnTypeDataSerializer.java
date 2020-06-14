package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetServiceProcessListReturnTypeDataSerializer extends ObjectSerializer<IGetServiceProcessList> {

	public GetServiceProcessListReturnTypeDataSerializer() {
		super(false);
	}

	public GetServiceProcessListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetServiceProcessList readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		return new GetServiceProcessList(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetServiceProcessList object) throws IOException {
		writer.writeObject(object.getProject(), new StringSerializer(false));
	}
}
