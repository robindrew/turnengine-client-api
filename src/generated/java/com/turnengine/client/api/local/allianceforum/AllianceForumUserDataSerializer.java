package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.global.user.UserPermissionType;
import java.io.IOException;
import java.util.List;

public class AllianceForumUserDataSerializer extends ObjectSerializer<IAllianceForumUser> {

	public AllianceForumUserDataSerializer() {
		super(false);
	}

	public AllianceForumUserDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAllianceForumUser readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		List<UserPermissionType> param4 = reader.readObject(new ListSerializer<UserPermissionType>(new EnumSerializer<UserPermissionType>(UserPermissionType.class, false), false));
		return new AllianceForumUser(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IAllianceForumUser object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getReputation());
		writer.writeObject(object.getPermissionList(), new ListSerializer<UserPermissionType>(new EnumSerializer<UserPermissionType>(UserPermissionType.class, false), false));
	}
}
