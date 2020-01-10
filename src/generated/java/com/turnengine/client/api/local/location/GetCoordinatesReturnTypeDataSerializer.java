package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetCoordinatesReturnTypeDataSerializer extends ObjectSerializer<IGetCoordinates> {

	public GetCoordinatesReturnTypeDataSerializer() {
		super(false);
	}

	public GetCoordinatesReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetCoordinates readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetCoordinates(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetCoordinates object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
	}
}
