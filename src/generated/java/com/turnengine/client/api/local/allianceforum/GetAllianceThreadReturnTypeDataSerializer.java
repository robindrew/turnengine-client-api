package com.turnengine.client.api.local.allianceforum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceThreadReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceThread> {

	public GetAllianceThreadReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceThreadReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceThread readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetAllianceThread(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceThread object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getThreadId());
	}
}
