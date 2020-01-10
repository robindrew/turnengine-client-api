package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameInstancePropertyListXmlSerializer implements IXmlSerializer<IGetGameInstancePropertyList> {

	private String name;

	public GetGameInstancePropertyListXmlSerializer() {
		this("GetGameInstancePropertyList");
	}

	public GetGameInstancePropertyListXmlSerializer(String name) {
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
	public IGetGameInstancePropertyList readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("instanceId");
		reader.endElement(getName());

		// Create the bean
		return new GetGameInstancePropertyList(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameInstancePropertyList object) {
		writer.startElement(getName());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.endElement(getName());
	}
}
