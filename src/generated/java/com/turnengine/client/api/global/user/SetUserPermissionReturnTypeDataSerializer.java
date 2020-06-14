package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import java.io.IOException;

public class SetUserPermissionReturnTypeDataSerializer extends ObjectSerializer<ISetUserPermission> {

	public SetUserPermissionReturnTypeDataSerializer() {
		super(false);
	}

	public SetUserPermissionReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetUserPermission readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		UserPermissionType param3 = reader.readObject(new EnumSerializer<UserPermissionType>(UserPermissionType.class, false));
		return new SetUserPermission(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetUserPermission object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getId());
		writer.writeObject(object.getType(), new EnumSerializer<UserPermissionType>(UserPermissionType.class, false));
	}
}
