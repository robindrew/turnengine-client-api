package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class AddActionPluginXmlSerializer implements IXmlSerializer<IAddActionPlugin> {

	private String name;

	public AddActionPluginXmlSerializer() {
		this("AddActionPlugin");
	}

	public AddActionPluginXmlSerializer(String name) {
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
	public IAddActionPlugin readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("name"));
		String param4 = reader.readObject(new StringSerializer("pluginName"));
		String param5 = reader.readObject(new StringSerializer("plugin"));
		reader.endElement(getName());

		// Create the bean
		return new AddActionPlugin(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAddActionPlugin object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getPluginName(), new StringSerializer("pluginName"));
		writer.writeObject(object.getPlugin(), new StringSerializer("plugin"));
		writer.endElement(getName());
	}
}
