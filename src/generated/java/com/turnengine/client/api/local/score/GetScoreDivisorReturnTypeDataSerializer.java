package com.turnengine.client.api.local.score;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetScoreDivisorReturnTypeDataSerializer extends ObjectSerializer<IGetScoreDivisor> {

	public GetScoreDivisorReturnTypeDataSerializer() {
		super(false);
	}

	public GetScoreDivisorReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetScoreDivisor readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetScoreDivisor(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetScoreDivisor object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getGroupId());
	}
}
