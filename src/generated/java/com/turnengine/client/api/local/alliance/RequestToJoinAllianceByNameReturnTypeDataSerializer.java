package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class RequestToJoinAllianceByNameReturnTypeDataSerializer extends ObjectSerializer<IRequestToJoinAllianceByName> {

	public RequestToJoinAllianceByNameReturnTypeDataSerializer() {
		super(false);
	}

	public RequestToJoinAllianceByNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IRequestToJoinAllianceByName readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new RequestToJoinAllianceByName(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IRequestToJoinAllianceByName object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getAllianceName(), new StringSerializer(false));
	}
}
