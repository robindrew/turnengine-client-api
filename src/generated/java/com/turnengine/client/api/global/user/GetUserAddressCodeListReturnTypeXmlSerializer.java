package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetUserAddressCodeListReturnTypeXmlSerializer implements IXmlSerializer<List<IUserAddressCode>> {

	private String name;

	public GetUserAddressCodeListReturnTypeXmlSerializer() {
		this("GetUserAddressCodeListReturnType");
	}

	public GetUserAddressCodeListReturnTypeXmlSerializer(String name) {
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
	public List<IUserAddressCode> readObject(IXmlReader reader) {
		return new ListSerializer<IUserAddressCode>(getName(), new UserAddressCodeXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IUserAddressCode> object) {
		new ListSerializer<IUserAddressCode>(getName(), new UserAddressCodeXmlSerializer("element")).writeObject(writer, object);
	}
}
