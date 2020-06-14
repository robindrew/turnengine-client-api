package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetAlliancesEnabledReturnTypeDataSerializer extends ObjectSerializer<ISetAlliancesEnabled> {

	public SetAlliancesEnabledReturnTypeDataSerializer() {
		super(false);
	}

	public SetAlliancesEnabledReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetAlliancesEnabled readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		boolean param3 = reader.readBoolean();
		return new SetAlliancesEnabled(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetAlliancesEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeBoolean(object.getEnabled());
	}
}
