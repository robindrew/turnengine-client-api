package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAlliancePropertyListReturnTypeDataSerializer extends ObjectSerializer<IGetAlliancePropertyList> {

	public GetAlliancePropertyListReturnTypeDataSerializer() {
		super(false);
	}

	public GetAlliancePropertyListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAlliancePropertyList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetAlliancePropertyList(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAlliancePropertyList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getAllianceId());
	}
}
