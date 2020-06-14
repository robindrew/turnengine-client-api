package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import java.io.IOException;
import java.util.List;

public class TurnDetailsDataSerializer extends ObjectSerializer<ITurnDetails> {

	public TurnDetailsDataSerializer() {
		super(false);
	}

	public TurnDetailsDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ITurnDetails readValue(IDataReader reader) throws IOException {
		ITurn param1 = reader.readObject(new TurnDataSerializer(false));
		List<ITurnComponent> param2 = reader.readObject(new ListSerializer<ITurnComponent>(new TurnComponentDataSerializer(false), false));
		return new TurnDetails(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ITurnDetails object) throws IOException {
		writer.writeObject(object.getTurn(), new TurnDataSerializer(false));
		writer.writeObject(object.getComponents(), new ListSerializer<ITurnComponent>(new TurnComponentDataSerializer(false), false));
	}
}
