package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetGameInstanceByNamesXmlSerializer implements IXmlSerializer<IGetGameInstanceByNames> {

	private String name;

	public GetGameInstanceByNamesXmlSerializer() {
		this("GetGameInstanceByNames");
	}

	public GetGameInstanceByNamesXmlSerializer(String name) {
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
	public IGetGameInstanceByNames readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("gameName"));
		String param2 = reader.readObject(new StringSerializer("versionName"));
		String param3 = reader.readObject(new StringSerializer("instanceName"));
		reader.endElement(getName());

		// Create the bean
		return new GetGameInstanceByNames(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameInstanceByNames object) {
		writer.startElement(getName());
		writer.writeObject(object.getGameName(), new StringSerializer("gameName"));
		writer.writeObject(object.getVersionName(), new StringSerializer("versionName"));
		writer.writeObject(object.getInstanceName(), new StringSerializer("instanceName"));
		writer.endElement(getName());
	}
}
