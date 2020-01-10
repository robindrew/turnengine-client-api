package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class RenameMobileReturnTypeDataSerializer extends ObjectSerializer<IRenameMobile> {

	public RenameMobileReturnTypeDataSerializer() {
		super(false);
	}

	public RenameMobileReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IRenameMobile readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		String param4 = reader.readObject(new StringSerializer(false));
		return new RenameMobile(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IRenameMobile object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
