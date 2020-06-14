package com.turnengine.client.api.local.trading;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class BuyGoodsAtLocationReturnTypeDataSerializer extends ObjectSerializer<IBuyGoodsAtLocation> {

	public BuyGoodsAtLocationReturnTypeDataSerializer() {
		super(false);
	}

	public BuyGoodsAtLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IBuyGoodsAtLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		long param5 = reader.readLong();
		int param6 = reader.readInt();
		return new BuyGoodsAtLocation(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, IBuyGoodsAtLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getGoodsId());
		writer.writeLong(object.getGoodsAmount());
		writer.writeInt(object.getCurrencyId());
	}
}
