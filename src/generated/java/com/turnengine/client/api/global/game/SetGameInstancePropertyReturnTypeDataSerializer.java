package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetGameInstancePropertyReturnTypeDataSerializer extends ObjectSerializer<ISetGameInstanceProperty> {

	public SetGameInstancePropertyReturnTypeDataSerializer() {
		super(false);
	}

	public SetGameInstancePropertyReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetGameInstanceProperty readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new SetGameInstanceProperty(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetGameInstanceProperty object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getKey(), new StringSerializer(false));
		writer.writeObject(object.getValue(), new StringSerializer(false));
	}
}
