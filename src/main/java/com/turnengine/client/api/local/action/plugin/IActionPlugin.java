package com.turnengine.client.api.local.action.plugin;

import com.turnengine.client.api.common.plugin.IPlugin;
import com.turnengine.client.api.local.action.IActionStatus;
import com.turnengine.client.api.local.action.data.IActionData;

public interface IActionPlugin extends IPlugin {

	IActionStatus startAction(IActionData action);

	void finishAction(IActionData action);

	void cancelAction(IActionData action);

}