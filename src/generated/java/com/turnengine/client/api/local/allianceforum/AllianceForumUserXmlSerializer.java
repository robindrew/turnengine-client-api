package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.global.user.UserPermissionType;
import java.util.List;

public class AllianceForumUserXmlSerializer implements IXmlSerializer<IAllianceForumUser> {

	private String name;

	public AllianceForumUserXmlSerializer() {
		this("AllianceForumUser");
	}

	public AllianceForumUserXmlSerializer(String name) {
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
	public IAllianceForumUser readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("reputation");
		List<UserPermissionType> param4 = reader.readObject(new ListSerializer<UserPermissionType>("permissionList", new EnumSerializer<UserPermissionType>(UserPermissionType.class, "element")));
		reader.endElement(getName());

		// Create the bean
		return new AllianceForumUser(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAllianceForumUser object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("reputation", object.getReputation());
		writer.writeObject(object.getPermissionList(), new ListSerializer<UserPermissionType>("permissionList", new EnumSerializer<UserPermissionType>(UserPermissionType.class, "element")));
		writer.endElement(getName());
	}
}
