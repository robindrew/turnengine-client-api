package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.game.GameLevel;

public class SetUserGamePermissionJsonSerializer implements IJsonSerializer<ISetUserGamePermission> {

	private String name;

	public SetUserGamePermissionJsonSerializer() {
		this("SetUserGamePermission");
	}

	public SetUserGamePermissionJsonSerializer(String name) {
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
	public ISetUserGamePermission readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetUserGamePermission object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getUserId());
		writer.writeInt(object.getId());
		writer.writeObject(object.getType(), new EnumSerializer<UserPermissionType>(UserPermissionType.class));
		writer.writeObject(object.getLevel(), new EnumSerializer<GameLevel>(GameLevel.class));
		writer.closeObject();
	}
}
