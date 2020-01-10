package com.turnengine.client.api.local;

import com.turnengine.client.api.local.action.ILocalActionExecutorSet;
import com.turnengine.client.api.local.faction.ILocalFactionExecutorSet;
import com.turnengine.client.api.local.group.ILocalGroupExecutorSet;
import com.turnengine.client.api.local.location.ILocalLocationExecutorSet;
import com.turnengine.client.api.local.message.ILocalMessageExecutorSet;
import com.turnengine.client.api.local.mobile.ILocalMobileExecutorSet;
import com.turnengine.client.api.local.property.ILocalPropertyExecutorSet;
import com.turnengine.client.api.local.score.ILocalScoreExecutorSet;
import com.turnengine.client.api.local.setup.ILocalSetupExecutorSet;
import com.turnengine.client.api.local.storage.ILocalStorageExecutorSet;
import com.turnengine.client.api.local.trading.ILocalTradingExecutorSet;
import com.turnengine.client.api.local.unit.ILocalUnitExecutorSet;
import com.turnengine.client.api.local.upkeep.ILocalUpkeepExecutorSet;

public interface ILocalBeanExecutorSetLookup {

	ILocalFactionExecutorSet getFactionSet();

	ILocalLocationExecutorSet getLocationSet();

	ILocalMobileExecutorSet getMobileSet();

	ILocalActionExecutorSet getActionSet();

	ILocalMessageExecutorSet getMessageSet();

	ILocalGroupExecutorSet getGroupSet();

	ILocalUnitExecutorSet getUnitSet();

	ILocalScoreExecutorSet getScoreSet();

	ILocalStorageExecutorSet getStorageSet();

	ILocalUpkeepExecutorSet getUpkeepSet();

	ILocalPropertyExecutorSet getPropertySet();

	ILocalSetupExecutorSet getSetupSet();

	ILocalTradingExecutorSet getTradingSet();

}
