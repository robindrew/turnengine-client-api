package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import java.io.IOException;

public class SetForumFlagReturnTypeDataSerializer extends ObjectSerializer<ISetForumFlag> {

	public SetForumFlagReturnTypeDataSerializer() {
		super(false);
	}

	public SetForumFlagReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetForumFlag readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		ForumFlag param3 = reader.readObject(new EnumSerializer<ForumFlag>(ForumFlag.class, false));
		boolean param4 = reader.readBoolean();
		return new SetForumFlag(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetForumFlag object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getForumId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class, false));
		writer.writeBoolean(object.getSet());
	}
}
