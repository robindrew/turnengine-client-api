package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class SetUserPermissionJsonSerializer implements IJsonSerializer<ISetUserPermission> {

	private String name;

	public SetUserPermissionJsonSerializer() {
		this("SetUserPermission");
	}

	public SetUserPermissionJsonSerializer(String name) {
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
	public ISetUserPermission readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetUserPermission object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getId());
		writer.writeObject(object.getType(), new EnumSerializer<UserPermissionType>(UserPermissionType.class));
		writer.closeObject();
	}
}
