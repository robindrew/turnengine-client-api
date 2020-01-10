package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetTradeAtLocationPluginXmlSerializer implements IXmlSerializer<ISetTradeAtLocationPlugin> {

	private String name;

	public SetTradeAtLocationPluginXmlSerializer() {
		this("SetTradeAtLocationPlugin");
	}

	public SetTradeAtLocationPluginXmlSerializer(String name) {
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
	public ISetTradeAtLocationPlugin readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("name"));
		String param4 = reader.readObject(new StringSerializer("plugin"));
		reader.endElement(getName());

		// Create the bean
		return new SetTradeAtLocationPlugin(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetTradeAtLocationPlugin object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getPlugin(), new StringSerializer("plugin"));
		writer.endElement(getName());
	}
}
