package com.turnengine.client.api.global.forum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.global.user.UserPermissionType;
import java.io.IOException;
import java.util.List;

public class ForumUserDataSerializer extends ObjectSerializer<IForumUser> {

	public ForumUserDataSerializer() {
		super(false);
	}

	public ForumUserDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IForumUser readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		List<UserPermissionType> param4 = reader.readObject(new ListSerializer<UserPermissionType>(new EnumSerializer<UserPermissionType>(UserPermissionType.class, false), false));
		return new ForumUser(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IForumUser object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getReputation());
		writer.writeObject(object.getPermissionList(), new ListSerializer<UserPermissionType>(new EnumSerializer<UserPermissionType>(UserPermissionType.class, false), false));
	}
}
