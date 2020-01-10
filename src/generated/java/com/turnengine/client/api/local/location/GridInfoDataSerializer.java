package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import java.io.IOException;
import java.util.List;

public class GridInfoDataSerializer extends ObjectSerializer<IGridInfo> {

	public GridInfoDataSerializer() {
		super(false);
	}

	public GridInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGridInfo readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		int param6 = reader.readInt();
		int param7 = reader.readInt();
		List<IGridInfo> param8 = reader.readObject(new ListSerializer<IGridInfo>(new GridInfoDataSerializer(false), false));
		return new GridInfo(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeValue(IDataWriter writer, IGridInfo object) throws IOException {
		writer.writeInt(object.getWidth());
		writer.writeInt(object.getHeight());
		writer.writeInt(object.getStartLocationId());
		writer.writeInt(object.getFinishLocationId());
		writer.writeInt(object.getOwned());
		writer.writeInt(object.getAllied());
		writer.writeInt(object.getHostile());
		writer.writeObject(object.getGridList(), new ListSerializer<IGridInfo>(new GridInfoDataSerializer(false), false));
	}
}
