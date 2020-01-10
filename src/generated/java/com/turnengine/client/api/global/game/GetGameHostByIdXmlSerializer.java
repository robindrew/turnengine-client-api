package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameHostByIdXmlSerializer implements IXmlSerializer<IGetGameHostById> {

	private String name;

	public GetGameHostByIdXmlSerializer() {
		this("GetGameHostById");
	}

	public GetGameHostByIdXmlSerializer(String name) {
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
	public IGetGameHostById readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		reader.endElement(getName());

		// Create the bean
		return new GetGameHostById(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameHostById object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.endElement(getName());
	}
}
