package com.turnengine.client.api.local.message;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetMessageCountByFormatReturnTypeDataSerializer extends ObjectSerializer<IGetMessageCountByFormat> {

	public GetMessageCountByFormatReturnTypeDataSerializer() {
		super(false);
	}

	public GetMessageCountByFormatReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetMessageCountByFormat readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new GetMessageCountByFormat(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetMessageCountByFormat object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getFormat(), new StringSerializer(false));
	}
}
