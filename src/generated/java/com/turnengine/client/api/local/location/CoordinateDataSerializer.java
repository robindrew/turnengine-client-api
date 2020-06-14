package com.turnengine.client.api.local.location;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.array.IntArraySerializer;
import java.io.IOException;

public class CoordinateDataSerializer extends ObjectSerializer<ICoordinate> {

	public CoordinateDataSerializer() {
		super(false);
	}

	public CoordinateDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICoordinate readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int[] param2 = reader.readObject(new IntArraySerializer(false));
		return new Coordinate(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ICoordinate object) throws IOException {
		writer.writeInt(object.getLocationId());
		writer.writeObject(object.getCoordinates(), new IntArraySerializer(false));
	}
}
