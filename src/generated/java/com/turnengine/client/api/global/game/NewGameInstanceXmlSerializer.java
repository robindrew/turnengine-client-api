package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class NewGameInstanceXmlSerializer implements IXmlSerializer<INewGameInstance> {

	private String name;

	public NewGameInstanceXmlSerializer() {
		this("NewGameInstance");
	}

	public NewGameInstanceXmlSerializer(String name) {
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
	public INewGameInstance readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("gameName"));
		String param3 = reader.readObject(new StringSerializer("versionName"));
		String param4 = reader.readObject(new StringSerializer("instanceName"));
		int param5 = reader.readInt("hostId");
		reader.endElement(getName());

		// Create the bean
		return new NewGameInstance(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, INewGameInstance object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getGameName(), new StringSerializer("gameName"));
		writer.writeObject(object.getVersionName(), new StringSerializer("versionName"));
		writer.writeObject(object.getInstanceName(), new StringSerializer("instanceName"));
		writer.writeInt("hostId", object.getHostId());
		writer.endElement(getName());
	}
}
