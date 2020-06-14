package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class StopServiceReturnTypeDataSerializer extends ObjectSerializer<IStopService> {

	public StopServiceReturnTypeDataSerializer() {
		super(false);
	}

	public StopServiceReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IStopService readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new StopService(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IStopService object) throws IOException {
		writer.writeObject(object.getProject(), new StringSerializer(false));
		writer.writeInt(object.getRelease());
		writer.writeObject(object.getService(), new StringSerializer(false));
	}
}
