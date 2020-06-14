package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.game.GameLevel;
import java.io.IOException;

public class SetUserGamePermissionReturnTypeDataSerializer extends ObjectSerializer<ISetUserGamePermission> {

	public SetUserGamePermissionReturnTypeDataSerializer() {
		super(false);
	}

	public SetUserGamePermissionReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetUserGamePermission readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		UserPermissionType param4 = reader.readObject(new EnumSerializer<UserPermissionType>(UserPermissionType.class, false));
		GameLevel param5 = reader.readObject(new EnumSerializer<GameLevel>(GameLevel.class, false));
		return new SetUserGamePermission(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetUserGamePermission object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getUserId());
		writer.writeInt(object.getId());
		writer.writeObject(object.getType(), new EnumSerializer<UserPermissionType>(UserPermissionType.class, false));
		writer.writeObject(object.getLevel(), new EnumSerializer<GameLevel>(GameLevel.class, false));
	}
}
