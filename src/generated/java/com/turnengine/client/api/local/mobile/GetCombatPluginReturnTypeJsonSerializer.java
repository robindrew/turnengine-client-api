package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.turnengine.client.api.common.plugin.IPluginDetails;
import com.turnengine.client.api.common.plugin.PluginDetailsJsonSerializer;

public class GetCombatPluginReturnTypeJsonSerializer implements IJsonSerializer<IPluginDetails> {

	private String name;

	public GetCombatPluginReturnTypeJsonSerializer() {
		this("GetCombatPluginReturnType");
	}

	public GetCombatPluginReturnTypeJsonSerializer(String name) {
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
	public IPluginDetails readObject(IJsonReader reader) {
		return new PluginDetailsJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IPluginDetails object) {
		new PluginDetailsJsonSerializer().writeObject(writer, object);
	}
}
