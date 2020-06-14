package com.turnengine.client.api.local.group;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetGroupListByFactionNameReturnTypeDataSerializer extends ObjectSerializer<IGetGroupListByFactionName> {

	public GetGroupListByFactionNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetGroupListByFactionNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGroupListByFactionName readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new GetGroupListByFactionName(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGroupListByFactionName object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
