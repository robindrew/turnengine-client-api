package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.turnengine.client.api.common.plugin.IPluginDetails;
import com.turnengine.client.api.common.plugin.PluginDetailsXmlSerializer;

public class GetLocationGenerationPluginReturnTypeXmlSerializer implements IXmlSerializer<IPluginDetails> {

	private String name;

	public GetLocationGenerationPluginReturnTypeXmlSerializer() {
		this("GetLocationGenerationPluginReturnType");
	}

	public GetLocationGenerationPluginReturnTypeXmlSerializer(String name) {
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
		return new PluginDetailsXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPluginDetails object) {
		new PluginDetailsXmlSerializer(getName()).writeObject(writer, object);
	}
}
