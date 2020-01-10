package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameVersionByIdXmlSerializer implements IXmlSerializer<IGetGameVersionById> {

	private String name;

	public GetGameVersionByIdXmlSerializer() {
		this("GetGameVersionById");
	}

	public GetGameVersionByIdXmlSerializer(String name) {
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
	public IGetGameVersionById readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("versionId");
		reader.endElement(getName());

		// Create the bean
		return new GetGameVersionById(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameVersionById object) {
		writer.startElement(getName());
		writer.writeInt("versionId", object.getVersionId());
		writer.endElement(getName());
	}
}
