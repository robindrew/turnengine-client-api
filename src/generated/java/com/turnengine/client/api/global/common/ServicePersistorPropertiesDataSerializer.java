package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class ServicePersistorPropertiesDataSerializer extends ObjectSerializer<IServicePersistorProperties> {

	public ServicePersistorPropertiesDataSerializer() {
		super(false);
	}

	public ServicePersistorPropertiesDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IServicePersistorProperties readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		return new ServicePersistorProperties(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IServicePersistorProperties object) throws IOException {
		writer.writeObject(object.getDatabase(), new StringSerializer(false));
	}
}
