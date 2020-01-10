package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class LocationPropertyDataSerializer extends ObjectSerializer<ILocationProperty> {

	public LocationPropertyDataSerializer() {
		super(false);
	}

	public LocationPropertyDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ILocationProperty readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new LocationProperty(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ILocationProperty object) throws IOException {
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getPlayerId());
		writer.writeObject(object.getKey(), new StringSerializer(false));
		writer.writeObject(object.getValue(), new StringSerializer(false));
	}
}
