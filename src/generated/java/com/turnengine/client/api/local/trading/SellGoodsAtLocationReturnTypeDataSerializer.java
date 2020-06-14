package com.turnengine.client.api.local.trading;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SellGoodsAtLocationReturnTypeDataSerializer extends ObjectSerializer<ISellGoodsAtLocation> {

	public SellGoodsAtLocationReturnTypeDataSerializer() {
		super(false);
	}

	public SellGoodsAtLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISellGoodsAtLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		long param5 = reader.readLong();
		int param6 = reader.readInt();
		return new SellGoodsAtLocation(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, ISellGoodsAtLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getGoodsId());
		writer.writeLong(object.getGoodsAmount());
		writer.writeInt(object.getCurrencyId());
	}
}
