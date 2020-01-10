package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetSetupBeanListFileReturnTypeDataSerializer extends ObjectSerializer<ISetSetupBeanListFile> {

	public SetSetupBeanListFileReturnTypeDataSerializer() {
		super(false);
	}

	public SetSetupBeanListFileReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetSetupBeanListFile readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new SetSetupBeanListFile(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetSetupBeanListFile object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getFilename(), new StringSerializer(false));
	}
}
