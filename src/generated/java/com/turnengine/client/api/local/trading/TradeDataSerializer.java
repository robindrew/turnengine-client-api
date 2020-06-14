package com.turnengine.client.api.local.trading;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import java.io.IOException;

public class TradeDataSerializer extends ObjectSerializer<ITrade> {

	public TradeDataSerializer() {
		super(false);
	}

	public TradeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ITrade readValue(IDataReader reader) throws IOException {
		TradingType param1 = reader.readObject(new EnumSerializer<TradingType>(TradingType.class, false));
		int param2 = reader.readInt();
		long param3 = reader.readLong();
		int param4 = reader.readInt();
		long param5 = reader.readLong();
		return new Trade(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ITrade object) throws IOException {
		writer.writeObject(object.getType(), new EnumSerializer<TradingType>(TradingType.class, false));
		writer.writeInt(object.getGoodsId());
		writer.writeLong(object.getGoodsAmount());
		writer.writeInt(object.getCurrencyId());
		writer.writeLong(object.getCurrencyAmount());
	}
}
