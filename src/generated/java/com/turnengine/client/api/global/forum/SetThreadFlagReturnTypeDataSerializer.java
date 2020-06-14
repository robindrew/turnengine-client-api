package com.turnengine.client.api.global.forum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import java.io.IOException;

public class SetThreadFlagReturnTypeDataSerializer extends ObjectSerializer<ISetThreadFlag> {

	public SetThreadFlagReturnTypeDataSerializer() {
		super(false);
	}

	public SetThreadFlagReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetThreadFlag readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		ForumFlag param3 = reader.readObject(new EnumSerializer<ForumFlag>(ForumFlag.class, false));
		boolean param4 = reader.readBoolean();
		return new SetThreadFlag(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetThreadFlag object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getThreadId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class, false));
		writer.writeBoolean(object.getSet());
	}
}
