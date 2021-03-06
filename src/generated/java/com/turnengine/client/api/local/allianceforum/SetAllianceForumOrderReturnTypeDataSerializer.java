package com.turnengine.client.api.local.allianceforum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetAllianceForumOrderReturnTypeDataSerializer extends ObjectSerializer<ISetAllianceForumOrder> {

	public SetAllianceForumOrderReturnTypeDataSerializer() {
		super(false);
	}

	public SetAllianceForumOrderReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetAllianceForumOrder readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		return new SetAllianceForumOrder(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetAllianceForumOrder object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getOrder());
	}
}
