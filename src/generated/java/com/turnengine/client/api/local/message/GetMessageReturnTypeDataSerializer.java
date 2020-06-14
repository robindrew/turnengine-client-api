package com.turnengine.client.api.local.message;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetMessageReturnTypeDataSerializer extends ObjectSerializer<IGetMessage> {

	public GetMessageReturnTypeDataSerializer() {
		super(false);
	}

	public GetMessageReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetMessage readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetMessage(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetMessage object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMessageId());
	}
}
