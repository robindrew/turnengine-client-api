package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetSetupBeanListReturnTypeDataSerializer extends ObjectSerializer<IGetSetupBeanList> {

	public GetSetupBeanListReturnTypeDataSerializer() {
		super(false);
	}

	public GetSetupBeanListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetSetupBeanList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetSetupBeanList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetSetupBeanList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
