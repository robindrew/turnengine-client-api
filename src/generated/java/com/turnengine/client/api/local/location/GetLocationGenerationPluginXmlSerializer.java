package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetLocationGenerationPluginXmlSerializer implements IXmlSerializer<IGetLocationGenerationPlugin> {

	private String name;

	public GetLocationGenerationPluginXmlSerializer() {
		this("GetLocationGenerationPlugin");
	}

	public GetLocationGenerationPluginXmlSerializer(String name) {
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
	public IGetLocationGenerationPlugin readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		reader.endElement(getName());

		// Create the bean
		return new GetLocationGenerationPlugin(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetLocationGenerationPlugin object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.endElement(getName());
	}
}
