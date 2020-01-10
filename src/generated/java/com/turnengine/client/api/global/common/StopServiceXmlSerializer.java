package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class StopServiceXmlSerializer implements IXmlSerializer<IStopService> {

	private String name;

	public StopServiceXmlSerializer() {
		this("StopService");
	}

	public StopServiceXmlSerializer(String name) {
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
	public IStopService readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("project"));
		int param2 = reader.readInt("release");
		String param3 = reader.readObject(new StringSerializer("service"));
		reader.endElement(getName());

		// Create the bean
		return new StopService(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IStopService object) {
		writer.startElement(getName());
		writer.writeObject(object.getProject(), new StringSerializer("project"));
		writer.writeInt("release", object.getRelease());
		writer.writeObject(object.getService(), new StringSerializer("service"));
		writer.endElement(getName());
	}
}
