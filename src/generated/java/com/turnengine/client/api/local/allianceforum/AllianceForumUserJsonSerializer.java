package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.global.user.UserPermissionType;
import java.util.List;

public class AllianceForumUserJsonSerializer implements IJsonSerializer<IAllianceForumUser> {

	private String name;

	public AllianceForumUserJsonSerializer() {
		this("AllianceForumUser");
	}

	public AllianceForumUserJsonSerializer(String name) {
		this.name = name;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	public String getName() {
		return name;
	}

	@Override
	public IAllianceForumUser readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAllianceForumUser object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getReputation());
		writer.writeObject(object.getPermissionList(), new ListSerializer<UserPermissionType>(new EnumSerializer<UserPermissionType>(UserPermissionType.class)));
		writer.closeObject();
	}
}
