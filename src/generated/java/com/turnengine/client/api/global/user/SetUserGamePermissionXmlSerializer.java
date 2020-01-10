package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.game.GameLevel;

public class SetUserGamePermissionXmlSerializer implements IXmlSerializer<ISetUserGamePermission> {

	private String name;

	public SetUserGamePermissionXmlSerializer() {
		this("SetUserGamePermission");
	}

	public SetUserGamePermissionXmlSerializer(String name) {
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
	public ISetUserGamePermission readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("userId");
		int param3 = reader.readInt("id");
		UserPermissionType param4 = reader.readObject(new EnumSerializer<UserPermissionType>(UserPermissionType.class, "type"));
		GameLevel param5 = reader.readObject(new EnumSerializer<GameLevel>(GameLevel.class, "level"));
		reader.endElement(getName());

		// Create the bean
		return new SetUserGamePermission(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetUserGamePermission object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("userId", object.getUserId());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getType(), new EnumSerializer<UserPermissionType>(UserPermissionType.class, "type"));
		writer.writeObject(object.getLevel(), new EnumSerializer<GameLevel>(GameLevel.class, "level"));
		writer.endElement(getName());
	}
}
