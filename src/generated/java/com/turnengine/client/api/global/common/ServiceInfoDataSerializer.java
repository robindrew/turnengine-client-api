package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class ServiceInfoDataSerializer extends ObjectSerializer<IServiceInfo> {

	public ServiceInfoDataSerializer() {
		super(false);
	}

	public ServiceInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IServiceInfo readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		IProjectInfo param2 = reader.readObject(new ProjectInfoDataSerializer(false));
		return new ServiceInfo(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IServiceInfo object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getProject(), new ProjectInfoDataSerializer(false));
	}
}
