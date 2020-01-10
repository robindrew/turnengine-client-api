package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class SetUserPermissionXmlSerializer implements IXmlSerializer<ISetUserPermission> {

	private String name;

	public SetUserPermissionXmlSerializer() {
		this("SetUserPermission");
	}

	public SetUserPermissionXmlSerializer(String name) {
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
	public ISetUserPermission readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("id");
		UserPermissionType param3 = reader.readObject(new EnumSerializer<UserPermissionType>(UserPermissionType.class, "type"));
		reader.endElement(getName());

		// Create the bean
		return new SetUserPermission(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetUserPermission object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getType(), new EnumSerializer<UserPermissionType>(UserPermissionType.class, "type"));
		writer.endElement(getName());
	}
}
