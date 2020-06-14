package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.array.IntArraySerializer;
import java.io.IOException;

public class MoveMobileToCoordinatesReturnTypeDataSerializer extends ObjectSerializer<IMoveMobileToCoordinates> {

	public MoveMobileToCoordinatesReturnTypeDataSerializer() {
		super(false);
	}

	public MoveMobileToCoordinatesReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IMoveMobileToCoordinates readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int[] param4 = reader.readObject(new IntArraySerializer(false));
		boolean param5 = reader.readBoolean();
		boolean param6 = reader.readBoolean();
		return new MoveMobileToCoordinates(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, IMoveMobileToCoordinates object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getCoordinates(), new IntArraySerializer(false));
		writer.writeBoolean(object.getAddToQueue());
		writer.writeBoolean(object.getRepeat());
	}
}
