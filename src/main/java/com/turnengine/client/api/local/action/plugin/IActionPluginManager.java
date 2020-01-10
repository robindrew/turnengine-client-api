package com.turnengine.client.api.local.action.plugin;

import com.turnengine.client.api.local.action.IAction;

public interface IActionPluginManager {

	void register(IAction action, IActionPlugin plugin);

	IActionPlugin getPlugin(IAction action);

}
