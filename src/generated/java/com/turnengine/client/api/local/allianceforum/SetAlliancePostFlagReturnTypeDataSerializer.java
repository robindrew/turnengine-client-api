package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.forum.ForumFlag;
import java.io.IOException;

public class SetAlliancePostFlagReturnTypeDataSerializer extends ObjectSerializer<ISetAlliancePostFlag> {

	public SetAlliancePostFlagReturnTypeDataSerializer() {
		super(false);
	}

	public SetAlliancePostFlagReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetAlliancePostFlag readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		ForumFlag param4 = reader.readObject(new EnumSerializer<ForumFlag>(ForumFlag.class, false));
		boolean param5 = reader.readBoolean();
		return new SetAlliancePostFlag(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetAlliancePostFlag object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPostId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class, false));
		writer.writeBoolean(object.getSet());
	}
}
