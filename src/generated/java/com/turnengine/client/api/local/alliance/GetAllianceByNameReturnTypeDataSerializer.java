package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetAllianceByNameReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceByName> {

	public GetAllianceByNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceByNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceByName readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new GetAllianceByName(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceByName object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
