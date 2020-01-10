package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import java.io.IOException;
import java.util.List;

public class SystemStatusDataSerializer extends ObjectSerializer<ISystemStatus> {

	public SystemStatusDataSerializer() {
		super(false);
	}

	public SystemStatusDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISystemStatus readValue(IDataReader reader) throws IOException {
		List<ISystemLoadAverage> param1 = reader.readObject(new ListSerializer<ISystemLoadAverage>(new SystemLoadAverageDataSerializer(false), false));
		List<ISystemDiskUsage> param2 = reader.readObject(new ListSerializer<ISystemDiskUsage>(new SystemDiskUsageDataSerializer(false), false));
		return new SystemStatus(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ISystemStatus object) throws IOException {
		writer.writeObject(object.getLoad(), new ListSerializer<ISystemLoadAverage>(new SystemLoadAverageDataSerializer(false), false));
		writer.writeObject(object.getDisk(), new ListSerializer<ISystemDiskUsage>(new SystemDiskUsageDataSerializer(false), false));
	}
}
