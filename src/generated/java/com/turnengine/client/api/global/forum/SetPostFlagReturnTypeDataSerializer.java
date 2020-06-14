package com.turnengine.client.api.global.forum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import java.io.IOException;

public class SetPostFlagReturnTypeDataSerializer extends ObjectSerializer<ISetPostFlag> {

	public SetPostFlagReturnTypeDataSerializer() {
		super(false);
	}

	public SetPostFlagReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetPostFlag readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		ForumFlag param3 = reader.readObject(new EnumSerializer<ForumFlag>(ForumFlag.class, false));
		boolean param4 = reader.readBoolean();
		return new SetPostFlag(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetPostFlag object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getPostId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class, false));
		writer.writeBoolean(object.getSet());
	}
}
