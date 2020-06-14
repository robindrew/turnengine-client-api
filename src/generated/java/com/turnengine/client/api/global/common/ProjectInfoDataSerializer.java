package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class ProjectInfoDataSerializer extends ObjectSerializer<IProjectInfo> {

	public ProjectInfoDataSerializer() {
		super(false);
	}

	public ProjectInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IProjectInfo readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		return new ProjectInfo(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IProjectInfo object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
