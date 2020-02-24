package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetUserListReturnTypeXmlSerializer implements IXmlSerializer<List<IUser>> {

	private String name;

	public GetUserListReturnTypeXmlSerializer() {
		this("GetUserListReturnType");
	}

	public GetUserListReturnTypeXmlSerializer(String name) {
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
	public List<IUser> readObject(IXmlReader reader) {
		return new ListSerializer<IUser>(getName(), new UserXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IUser> object) {
		new ListSerializer<IUser>(getName(), new UserXmlSerializer("element")).writeObject(writer, object);
	}
}
