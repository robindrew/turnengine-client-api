package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.turnengine.client.api.common.plugin.IPluginDetails;
import com.turnengine.client.api.common.plugin.PluginDetailsXmlSerializer;

public class GetCombatPluginReturnTypeXmlSerializer implements IXmlSerializer<IPluginDetails> {

	private String name;

	public GetCombatPluginReturnTypeXmlSerializer() {
		this("GetCombatPluginReturnType");
	}

	public GetCombatPluginReturnTypeXmlSerializer(String name) {
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
