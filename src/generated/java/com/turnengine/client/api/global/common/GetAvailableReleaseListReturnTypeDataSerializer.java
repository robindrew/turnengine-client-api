package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetAvailableReleaseListReturnTypeDataSerializer extends ObjectSerializer<IGetAvailableReleaseList> {

	public GetAvailableReleaseListReturnTypeDataSerializer() {
		super(false);
	}

	public GetAvailableReleaseListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAvailableReleaseList readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		return new GetAvailableReleaseList(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAvailableReleaseList object) throws IOException {
		writer.writeObject(object.getProject(), new StringSerializer(false));
	}
}
