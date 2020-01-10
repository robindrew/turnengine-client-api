package com.turnengine.client.api.common.plugin;

public interface IPluginDetailsRegistry {

	void setDetails(Object key, IPluginDetails details);

	IPluginDetails getDetails(Object key);

}
