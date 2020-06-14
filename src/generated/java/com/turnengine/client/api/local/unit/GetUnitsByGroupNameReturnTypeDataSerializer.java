package com.turnengine.client.api.local.unit;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetUnitsByGroupNameReturnTypeDataSerializer extends ObjectSerializer<IGetUnitsByGroupName> {

	public GetUnitsByGroupNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitsByGroupNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitsByGroupName readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new GetUnitsByGroupName(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitsByGroupName object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
