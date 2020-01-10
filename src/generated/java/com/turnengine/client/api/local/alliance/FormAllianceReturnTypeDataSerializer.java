package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class FormAllianceReturnTypeDataSerializer extends ObjectSerializer<IFormAlliance> {

	public FormAllianceReturnTypeDataSerializer() {
		super(false);
	}

	public FormAllianceReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IFormAlliance readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new FormAlliance(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IFormAlliance object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getTag(), new StringSerializer(false));
	}
}
