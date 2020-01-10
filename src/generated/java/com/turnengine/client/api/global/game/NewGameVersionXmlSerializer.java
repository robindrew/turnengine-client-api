package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class NewGameVersionXmlSerializer implements IXmlSerializer<INewGameVersion> {

	private String name;

	public NewGameVersionXmlSerializer() {
		this("NewGameVersion");
	}

	public NewGameVersionXmlSerializer(String name) {
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
	public INewGameVersion readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("gameName"));
		String param3 = reader.readObject(new StringSerializer("versionName"));
		reader.endElement(getName());

		// Create the bean
		return new NewGameVersion(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, INewGameVersion object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getGameName(), new StringSerializer("gameName"));
		writer.writeObject(object.getVersionName(), new StringSerializer("versionName"));
		writer.endElement(getName());
	}
}
