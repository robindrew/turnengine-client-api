package com.turnengine.client.api.local.location;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.array.IntArraySerializer;
import java.io.IOException;

public class GetGridInfoListReturnTypeDataSerializer extends ObjectSerializer<IGetGridInfoList> {

	public GetGridInfoListReturnTypeDataSerializer() {
		super(false);
	}

	public GetGridInfoListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGridInfoList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int[] param3 = reader.readObject(new IntArraySerializer(false));
		int param4 = reader.readInt();
		return new GetGridInfoList(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGridInfoList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getCoordinates(), new IntArraySerializer(false));
		writer.writeInt(object.getDepth());
	}
}
