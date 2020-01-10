package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class MobilePropertyDataSerializer extends ObjectSerializer<IMobileProperty> {

	public MobilePropertyDataSerializer() {
		super(false);
	}

	public MobilePropertyDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IMobileProperty readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new MobileProperty(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IMobileProperty object) throws IOException {
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getKey(), new StringSerializer(false));
		writer.writeObject(object.getValue(), new StringSerializer(false));
	}
}
