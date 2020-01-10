package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetUserAdminInfoListReturnTypeXmlSerializer implements IXmlSerializer<List<IUserAdminInfo>> {

	private String name;

	public GetUserAdminInfoListReturnTypeXmlSerializer() {
		this("GetUserAdminInfoListReturnType");
	}

	public GetUserAdminInfoListReturnTypeXmlSerializer(String name) {
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
	public List<IUserAdminInfo> readObject(IXmlReader reader) {
		return new ListSerializer<IUserAdminInfo>(getName(), new UserAdminInfoXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IUserAdminInfo> object) {
		new ListSerializer<IUserAdminInfo>(getName(), new UserAdminInfoXmlSerializer("element")).writeObject(writer, object);
	}
}
