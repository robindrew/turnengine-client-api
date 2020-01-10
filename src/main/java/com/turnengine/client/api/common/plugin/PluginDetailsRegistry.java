package com.turnengine.client.api.common.plugin;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PluginDetailsRegistry implements IPluginDetailsRegistry {

	private final Map<Object, IPluginDetails> keyToDetailsMap = new ConcurrentHashMap<Object, IPluginDetails>();

	@Override
	public void setDetails(Object key, IPluginDetails details) {
		if (key == null) {
			throw new NullPointerException("key");
		}
		if (details == null) {
			throw new NullPointerException("details");
		}
		keyToDetailsMap.put(key, details);
	}

	@Override
	public IPluginDetails getDetails(Object key) {
		if (key == null) {
			throw new NullPointerException("key");
		}
		// Can return null ...
		return keyToDetailsMap.get(key);
	}

}
