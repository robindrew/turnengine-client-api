package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class ProcessInfoDataSerializer extends ObjectSerializer<IProcessInfo> {

	public ProcessInfoDataSerializer() {
		super(false);
	}

	public ProcessInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IProcessInfo readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		IProjectInfo param3 = reader.readObject(new ProjectInfoDataSerializer(false));
		IServiceInfo param4 = reader.readObject(new ServiceInfoDataSerializer(false));
		IReleaseInfo param5 = reader.readObject(new ReleaseInfoDataSerializer(false));
		int param6 = reader.readInt();
		return new ProcessInfo(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, IProcessInfo object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getProject(), new ProjectInfoDataSerializer(false));
		writer.writeObject(object.getService(), new ServiceInfoDataSerializer(false));
		writer.writeObject(object.getRelease(), new ReleaseInfoDataSerializer(false));
		writer.writeInt(object.getPort());
	}
}
