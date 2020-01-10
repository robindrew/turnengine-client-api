package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetGameInstanceByNameXmlSerializer implements IXmlSerializer<IGetGameInstanceByName> {

	private String name;

	public GetGameInstanceByNameXmlSerializer() {
		this("GetGameInstanceByName");
	}

	public GetGameInstanceByNameXmlSerializer(String name) {
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
	public IGetGameInstanceByName readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("instanceName"));
		int param2 = reader.readInt("versionId");
		reader.endElement(getName());

		// Create the bean
		return new GetGameInstanceByName(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameInstanceByName object) {
		writer.startElement(getName());
		writer.writeObject(object.getInstanceName(), new StringSerializer("instanceName"));
		writer.writeInt("versionId", object.getVersionId());
		writer.endElement(getName());
	}
}
