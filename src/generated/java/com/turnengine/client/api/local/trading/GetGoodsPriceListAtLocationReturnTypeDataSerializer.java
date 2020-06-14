package com.turnengine.client.api.local.trading;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGoodsPriceListAtLocationReturnTypeDataSerializer extends ObjectSerializer<IGetGoodsPriceListAtLocation> {

	public GetGoodsPriceListAtLocationReturnTypeDataSerializer() {
		super(false);
	}

	public GetGoodsPriceListAtLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGoodsPriceListAtLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetGoodsPriceListAtLocation(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGoodsPriceListAtLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
	}
}
