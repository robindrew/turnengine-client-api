package com.turnengine.client.api.local.action.calculator;

import com.turnengine.client.api.local.action.IActionStatus;
import com.turnengine.client.api.local.action.data.IActionData;
import com.turnengine.client.api.local.calculator.ICalculator;

public interface IActionCalculator extends ICalculator {

	long countActions(IActionData action);

	IActionStatus startAction(IActionData action);

	void finishAction(IActionData action);

	void cancelAction(IActionData action);

}
