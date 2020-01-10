package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetUserAddressCodeListXmlSerializer implements IXmlSerializer<IGetUserAddressCodeList> {

	private String name;

	public GetUserAddressCodeListXmlSerializer() {
		this("GetUserAddressCodeList");
	}

	public GetUserAddressCodeListXmlSerializer(String name) {
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
	public IGetUserAddressCodeList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("userId");
		String param3 = reader.readObject(new StringSerializer("code"));
		reader.endElement(getName());

		// Create the bean
		return new GetUserAddressCodeList(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetUserAddressCodeList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("userId", object.getUserId());
		writer.writeObject(object.getCode(), new StringSerializer("code"));
		writer.endElement(getName());
	}
}
