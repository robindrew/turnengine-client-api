package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetUserAddressCodeListReturnTypeDataSerializer extends ObjectSerializer<IGetUserAddressCodeList> {

	public GetUserAddressCodeListReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserAddressCodeListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserAddressCodeList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new GetUserAddressCodeList(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserAddressCodeList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getUserId());
		writer.writeObject(object.getCode(), new StringSerializer(false));
	}
}
