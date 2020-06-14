package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import java.io.IOException;

public class SystemLoadAverageDataSerializer extends ObjectSerializer<ISystemLoadAverage> {

	public SystemLoadAverageDataSerializer() {
		super(false);
	}

	public SystemLoadAverageDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISystemLoadAverage readValue(IDataReader reader) throws IOException {
		LoadAveragePeriod param1 = reader.readObject(new EnumSerializer<LoadAveragePeriod>(LoadAveragePeriod.class, false));
		double param2 = reader.readDouble();
		return new SystemLoadAverage(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ISystemLoadAverage object) throws IOException {
		writer.writeObject(object.getPeriod(), new EnumSerializer<LoadAveragePeriod>(LoadAveragePeriod.class, false));
		writer.writeDouble(object.getAverage());
	}
}
