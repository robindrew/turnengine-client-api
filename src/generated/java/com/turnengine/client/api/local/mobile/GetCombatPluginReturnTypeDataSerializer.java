package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetCombatPluginReturnTypeDataSerializer extends ObjectSerializer<IGetCombatPlugin> {

	public GetCombatPluginReturnTypeDataSerializer() {
		super(false);
	}

	public GetCombatPluginReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetCombatPlugin readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetCombatPlugin(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetCombatPlugin object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
