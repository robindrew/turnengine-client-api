package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetAllianceLeaveTurnsReturnTypeDataSerializer extends ObjectSerializer<ISetAllianceLeaveTurns> {

	public SetAllianceLeaveTurnsReturnTypeDataSerializer() {
		super(false);
	}

	public SetAllianceLeaveTurnsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetAllianceLeaveTurns readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new SetAllianceLeaveTurns(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetAllianceLeaveTurns object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getTurns());
	}
}
