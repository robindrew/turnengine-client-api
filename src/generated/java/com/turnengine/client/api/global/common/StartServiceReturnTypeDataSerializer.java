package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class StartServiceReturnTypeDataSerializer extends ObjectSerializer<IStartService> {

	public StartServiceReturnTypeDataSerializer() {
		super(false);
	}

	public StartServiceReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IStartService readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new StartService(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IStartService object) throws IOException {
		writer.writeObject(object.getProject(), new StringSerializer(false));
		writer.writeInt(object.getRelease());
		writer.writeObject(object.getService(), new StringSerializer(false));
	}
}
