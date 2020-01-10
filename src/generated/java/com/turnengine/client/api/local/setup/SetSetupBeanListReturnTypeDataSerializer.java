package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetSetupBeanListReturnTypeDataSerializer extends ObjectSerializer<ISetSetupBeanList> {

	public SetSetupBeanListReturnTypeDataSerializer() {
		super(false);
	}

	public SetSetupBeanListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetSetupBeanList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new SetSetupBeanList(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetSetupBeanList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getXml(), new StringSerializer(false));
	}
}
