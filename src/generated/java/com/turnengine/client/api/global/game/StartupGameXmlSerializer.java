package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class StartupGameXmlSerializer implements IXmlSerializer<IStartupGame> {

	private String name;

	public StartupGameXmlSerializer() {
		this("StartupGame");
	}

	public StartupGameXmlSerializer(String name) {
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
	public IStartupGame readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		reader.endElement(getName());

		// Create the bean
		return new StartupGame(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IStartupGame object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.endElement(getName());
	}
}
