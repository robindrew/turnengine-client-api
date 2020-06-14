package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SystemDiskUsageDataSerializer extends ObjectSerializer<ISystemDiskUsage> {

	public SystemDiskUsageDataSerializer() {
		super(false);
	}

	public SystemDiskUsageDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISystemDiskUsage readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		long param2 = reader.readLong();
		long param3 = reader.readLong();
		return new SystemDiskUsage(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISystemDiskUsage object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeLong(object.getUsed());
		writer.writeLong(object.getFree());
	}
}
