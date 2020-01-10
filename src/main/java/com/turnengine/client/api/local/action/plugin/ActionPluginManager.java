package com.turnengine.client.api.local.action.plugin;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.turnengine.client.api.local.action.IAction;

public class ActionPluginManager implements IActionPluginManager {

	private final Map<Integer, IActionPlugin> idToPluginMap = new ConcurrentHashMap<Integer, IActionPlugin>();

	@Override
	public void register(IAction action, IActionPlugin plugin) {
		if (action == null) {
			throw new NullPointerException("action");
		}
		if (plugin == null) {
			throw new NullPointerException("plugin");
		}
		idToPluginMap.put(action.getId(), plugin);
	}

	@Override
	public IActionPlugin getPlugin(IAction action) {
		// Can return null ...
		return idToPluginMap.get(action.getId());
	}

}
