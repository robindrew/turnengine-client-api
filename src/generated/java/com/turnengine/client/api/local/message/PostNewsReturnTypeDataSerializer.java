package com.turnengine.client.api.local.message;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class PostNewsReturnTypeDataSerializer extends ObjectSerializer<IPostNews> {

	public PostNewsReturnTypeDataSerializer() {
		super(false);
	}

	public PostNewsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IPostNews readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		String param6 = reader.readObject(new StringSerializer(false));
		String param7 = reader.readObject(new StringSerializer(false));
		String param8 = reader.readObject(new StringSerializer(false));
		return new PostNews(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeValue(IDataWriter writer, IPostNews object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getRecipient(), new StringSerializer(false));
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getFormat(), new StringSerializer(false));
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getContent(), new StringSerializer(false));
	}
}
