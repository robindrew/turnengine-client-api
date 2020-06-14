package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class ServiceStatusDataSerializer extends ObjectSerializer<IServiceStatus> {

	public ServiceStatusDataSerializer() {
		super(false);
	}

	public ServiceStatusDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IServiceStatus readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		long param3 = reader.readLong();
		double param4 = reader.readDouble();
		double param5 = reader.readDouble();
		double param6 = reader.readDouble();
		int param7 = reader.readInt();
		int param8 = reader.readInt();
		int param9 = reader.readInt();
		long param10 = reader.readLong();
		long param11 = reader.readLong();
		long param12 = reader.readLong();
		String param13 = reader.readObject(new StringSerializer(false));
		String param14 = reader.readObject(new StringSerializer(false));
		String param15 = reader.readObject(new StringSerializer(false));
		long param16 = reader.readLong();
		return new ServiceStatus(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16);
	}

	@Override
	public void writeValue(IDataWriter writer, IServiceStatus object) throws IOException {
		writer.writeObject(object.getService(), new StringSerializer(false));
		writer.writeObject(object.getRelease(), new StringSerializer(false));
		writer.writeLong(object.getMemory());
		writer.writeDouble(object.getHeap());
		writer.writeDouble(object.getPerm());
		writer.writeDouble(object.getCpu());
		writer.writeInt(object.getCpuCount());
		writer.writeInt(object.getThreads());
		writer.writeInt(object.getClasses());
		writer.writeLong(object.getExceptions());
		writer.writeLong(object.getStarted());
		writer.writeLong(object.getUptime());
		writer.writeObject(object.getUser(), new StringSerializer(false));
		writer.writeObject(object.getHost(), new StringSerializer(false));
		writer.writeObject(object.getAddress(), new StringSerializer(false));
		writer.writeLong(object.getProcess());
	}
}
