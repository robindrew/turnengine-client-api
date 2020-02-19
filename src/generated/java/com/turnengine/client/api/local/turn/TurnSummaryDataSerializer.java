package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import java.io.IOException;

public class TurnSummaryDataSerializer extends ObjectSerializer<ITurnSummary> {

	public TurnSummaryDataSerializer() {
		super(false);
	}

	public TurnSummaryDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ITurnSummary readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		boolean param2 = reader.readBoolean();
		TurnUpdating param3 = reader.readObject(new EnumSerializer<TurnUpdating>(TurnUpdating.class, false));
		long param4 = reader.readLong();
		long param5 = reader.readLong();
		long param6 = reader.readLong();
		long param7 = reader.readLong();
		long param8 = reader.readLong();
		long param9 = reader.readLong();
		return new TurnSummary(param1, param2, param3, param4, param5, param6, param7, param8, param9);
	}

	@Override
	public void writeValue(IDataWriter writer, ITurnSummary object) throws IOException {
		writer.writeInt(object.getNumber());
		writer.writeBoolean(object.getEnabled());
		writer.writeObject(object.getUpdating(), new EnumSerializer<TurnUpdating>(TurnUpdating.class, false));
		writer.writeLong(object.getInterval());
		writer.writeLong(object.getTimeToNextTurn());
		writer.writeLong(object.getTimeOfNextTurn());
		writer.writeLong(object.getCurrentTime());
		writer.writeLong(object.getTimeOfFirstTurn());
		writer.writeLong(object.getTimeToFirstTurn());
	}
}
