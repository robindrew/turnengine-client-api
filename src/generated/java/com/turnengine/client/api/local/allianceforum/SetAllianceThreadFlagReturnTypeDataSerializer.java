package com.turnengine.client.api.local.allianceforum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.forum.ForumFlag;
import java.io.IOException;

public class SetAllianceThreadFlagReturnTypeDataSerializer extends ObjectSerializer<ISetAllianceThreadFlag> {

	public SetAllianceThreadFlagReturnTypeDataSerializer() {
		super(false);
	}

	public SetAllianceThreadFlagReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetAllianceThreadFlag readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		ForumFlag param4 = reader.readObject(new EnumSerializer<ForumFlag>(ForumFlag.class, false));
		boolean param5 = reader.readBoolean();
		return new SetAllianceThreadFlag(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetAllianceThreadFlag object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getThreadId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class, false));
		writer.writeBoolean(object.getSet());
	}
}
