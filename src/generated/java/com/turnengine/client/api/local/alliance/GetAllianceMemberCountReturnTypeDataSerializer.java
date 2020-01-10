package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceMemberCountReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceMemberCount> {

	public GetAllianceMemberCountReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceMemberCountReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceMemberCount readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetAllianceMemberCount(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceMemberCount object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getId());
	}
}
