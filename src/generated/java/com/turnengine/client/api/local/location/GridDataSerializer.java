package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import java.io.IOException;
import java.util.List;

public class GridDataSerializer extends ObjectSerializer<IGrid> {

	public GridDataSerializer() {
		super(false);
	}

	public GridDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGrid readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		List<IGrid> param5 = reader.readObject(new ListSerializer<IGrid>(new GridDataSerializer(false), false));
		return new Grid(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IGrid object) throws IOException {
		writer.writeInt(object.getWidth());
		writer.writeInt(object.getHeight());
		writer.writeInt(object.getStartLocationId());
		writer.writeInt(object.getFinishLocationId());
		writer.writeObject(object.getGridList(), new ListSerializer<IGrid>(new GridDataSerializer(false), false));
	}
}
