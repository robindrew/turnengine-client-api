package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetActionPluginReturnTypeDataSerializer extends ObjectSerializer<IGetActionPlugin> {

	public GetActionPluginReturnTypeDataSerializer() {
		super(false);
	}

	public GetActionPluginReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetActionPlugin readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetActionPlugin(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetActionPlugin object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getId());
	}
}
