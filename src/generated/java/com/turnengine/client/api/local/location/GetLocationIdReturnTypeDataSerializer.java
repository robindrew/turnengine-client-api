package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.array.IntArraySerializer;
import java.io.IOException;

public class GetLocationIdReturnTypeDataSerializer extends ObjectSerializer<IGetLocationId> {

	public GetLocationIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocationIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocationId readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int[] param3 = reader.readObject(new IntArraySerializer(false));
		return new GetLocationId(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocationId object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getCoordinates(), new IntArraySerializer(false));
	}
}
