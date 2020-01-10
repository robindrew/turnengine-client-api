package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import java.io.IOException;

public class GetUserSimilarityListReturnTypeDataSerializer extends ObjectSerializer<IGetUserSimilarityList> {

	public GetUserSimilarityListReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserSimilarityListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserSimilarityList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		UserSimilarityOrder param2 = reader.readObject(new EnumSerializer<UserSimilarityOrder>(UserSimilarityOrder.class, false));
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		return new GetUserSimilarityList(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserSimilarityList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getOrder(), new EnumSerializer<UserSimilarityOrder>(UserSimilarityOrder.class, false));
		writer.writeInt(object.getThreshold());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
	}
}
