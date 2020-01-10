package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetAllianceMemberLimitReturnTypeDataSerializer extends ObjectSerializer<ISetAllianceMemberLimit> {

	public SetAllianceMemberLimitReturnTypeDataSerializer() {
		super(false);
	}

	public SetAllianceMemberLimitReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetAllianceMemberLimit readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new SetAllianceMemberLimit(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetAllianceMemberLimit object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLimit());
	}
}
