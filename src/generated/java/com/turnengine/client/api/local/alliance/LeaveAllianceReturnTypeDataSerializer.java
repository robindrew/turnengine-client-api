package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class LeaveAllianceReturnTypeDataSerializer extends ObjectSerializer<ILeaveAlliance> {

	public LeaveAllianceReturnTypeDataSerializer() {
		super(false);
	}

	public LeaveAllianceReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ILeaveAlliance readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new LeaveAlliance(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ILeaveAlliance object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
