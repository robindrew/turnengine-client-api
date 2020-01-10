package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetUserAddressXmlSerializer implements IXmlSerializer<ISetUserAddress> {

	private String name;

	public SetUserAddressXmlSerializer() {
		this("SetUserAddress");
	}

	public SetUserAddressXmlSerializer(String name) {
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
	public ISetUserAddress readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("address"));
		reader.endElement(getName());

		// Create the bean
		return new SetUserAddress(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetUserAddress object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getAddress(), new StringSerializer("address"));
		writer.endElement(getName());
	}
}
