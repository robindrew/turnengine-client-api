package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetUserByLoginIdReturnTypeXmlSerializer implements IXmlSerializer<IUser> {

	private String name;

	public GetUserByLoginIdReturnTypeXmlSerializer() {
		this("GetUserByLoginIdReturnType");
	}

	public GetUserByLoginIdReturnTypeXmlSerializer(String name) {
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
	public IUser readObject(IXmlReader reader) {
		return new UserXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUser object) {
		new UserXmlSerializer(getName()).writeObject(writer, object);
	}
}
