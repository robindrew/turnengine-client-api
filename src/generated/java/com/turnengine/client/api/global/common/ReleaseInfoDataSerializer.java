package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ReleaseInfoDataSerializer extends ObjectSerializer<IReleaseInfo> {

	public ReleaseInfoDataSerializer() {
		super(false);
	}

	public ReleaseInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IReleaseInfo readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		IProjectInfo param2 = reader.readObject(new ProjectInfoDataSerializer(false));
		return new ReleaseInfo(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IReleaseInfo object) throws IOException {
		writer.writeInt(object.getNumber());
		writer.writeObject(object.getProject(), new ProjectInfoDataSerializer(false));
	}
}
