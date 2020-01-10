package com.turnengine.client.api.common.plugin;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class PluginDetailsXmlSerializer implements IXmlSerializer<IPluginDetails> {

	private String name;

	public PluginDetailsXmlSerializer() {
		this("PluginDetails");
	}

	public PluginDetailsXmlSerializer(String name) {
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
	public IPluginDetails readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		String param2 = reader.readObject(new StringSerializer("xml"));
		reader.endElement(getName());

		// Create the bean
		return new PluginDetails(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPluginDetails object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getXml(), new StringSerializer("xml"));
		writer.endElement(getName());
	}
}
