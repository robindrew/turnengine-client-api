package com.turnengine.client.api.global.forum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetForumOrderReturnTypeDataSerializer extends ObjectSerializer<ISetForumOrder> {

	public SetForumOrderReturnTypeDataSerializer() {
		super(false);
	}

	public SetForumOrderReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetForumOrder readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new SetForumOrder(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetForumOrder object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getOrder());
	}
}
