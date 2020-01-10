package com.turnengine.client.api.common;

import static com.robindrew.common.dependency.DependencyFactory.setDependency;

import com.turnengine.client.api.global.IGlobalBeanExecutorSetLookup;
import com.turnengine.client.api.global.admin.IGlobalAdminExecutorSet;
import com.turnengine.client.api.global.announcement.IGlobalAnnouncementExecutorSet;
import com.turnengine.client.api.global.common.IGlobalCommonExecutorSet;
import com.turnengine.client.api.global.error.IGlobalErrorExecutorSet;
import com.turnengine.client.api.global.forum.IGlobalForumExecutorSet;
import com.turnengine.client.api.global.game.IGlobalGameExecutorSet;
import com.turnengine.client.api.global.translation.IGlobalTranslationExecutorSet;
import com.turnengine.client.api.global.user.IGlobalUserExecutorSet;
import com.turnengine.client.api.local.ILocalBeanExecutorSetLookup;
import com.turnengine.client.api.local.action.IActionCache;
import com.turnengine.client.api.local.action.ILocalActionExecutorSet;
import com.turnengine.client.api.local.faction.IFactionCache;
import com.turnengine.client.api.local.faction.ILocalFactionExecutorSet;
import com.turnengine.client.api.local.group.IGroupCache;
import com.turnengine.client.api.local.group.ILocalGroupExecutorSet;
import com.turnengine.client.api.local.location.ILocalLocationExecutorSet;
import com.turnengine.client.api.local.message.ILocalMessageExecutorSet;
import com.turnengine.client.api.local.mobile.ILocalMobileExecutorSet;
import com.turnengine.client.api.local.property.ILocalPropertyExecutorSet;
import com.turnengine.client.api.local.score.ILocalScoreExecutorSet;
import com.turnengine.client.api.local.score.IScoreCache;
import com.turnengine.client.api.local.setup.ILocalSetupExecutorSet;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.storage.ILocalStorageExecutorSet;
import com.turnengine.client.api.local.storage.IStorageCache;
import com.turnengine.client.api.local.trading.ILocalTradingExecutorSet;
import com.turnengine.client.api.local.unit.ILocalUnitExecutorSet;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.upkeep.ILocalUpkeepExecutorSet;
import com.turnengine.client.api.local.upkeep.IUpkeepCache;

public class Dependencies {

	public static void setDependencies(IStaticCacheSet cacheSet) {
		setDependency(IActionCache.class, cacheSet.getActionCache());
		setDependency(IFactionCache.class, cacheSet.getFactionCache());
		setDependency(IGroupCache.class, cacheSet.getGroupCache());
		setDependency(IScoreCache.class, cacheSet.getScoreCache());
		setDependency(IStorageCache.class, cacheSet.getStorageCache());
		setDependency(IUnitCache.class, cacheSet.getUnitCache());
		setDependency(IUpkeepCache.class, cacheSet.getUpkeepCache());
		setDependency(IStaticCacheSet.class, cacheSet);
	}

	public static void setDependencies(ILocalBeanExecutorSetLookup lookup) {
		setDependency(ILocalFactionExecutorSet.class, lookup.getFactionSet());
		setDependency(ILocalLocationExecutorSet.class, lookup.getLocationSet());
		setDependency(ILocalMobileExecutorSet.class, lookup.getMobileSet());
		setDependency(ILocalActionExecutorSet.class, lookup.getActionSet());
		setDependency(ILocalMessageExecutorSet.class, lookup.getMessageSet());
		setDependency(ILocalGroupExecutorSet.class, lookup.getGroupSet());
		setDependency(ILocalUnitExecutorSet.class, lookup.getUnitSet());
		setDependency(ILocalScoreExecutorSet.class, lookup.getScoreSet());
		setDependency(ILocalStorageExecutorSet.class, lookup.getStorageSet());
		setDependency(ILocalUpkeepExecutorSet.class, lookup.getUpkeepSet());
		setDependency(ILocalPropertyExecutorSet.class, lookup.getPropertySet());
		setDependency(ILocalSetupExecutorSet.class, lookup.getSetupSet());
		setDependency(ILocalTradingExecutorSet.class, lookup.getTradingSet());
		setDependency(ILocalBeanExecutorSetLookup.class, lookup);
	}

	public static void setDependencies(IGlobalBeanExecutorSetLookup lookup) {
		setDependency(IGlobalAdminExecutorSet.class, lookup.getAdminSet());
		setDependency(IGlobalAnnouncementExecutorSet.class, lookup.getAnnouncementSet());
		setDependency(IGlobalCommonExecutorSet.class, lookup.getCommonSet());
		setDependency(IGlobalErrorExecutorSet.class, lookup.getErrorSet());
		setDependency(IGlobalForumExecutorSet.class, lookup.getForumSet());
		setDependency(IGlobalGameExecutorSet.class, lookup.getGameSet());
		setDependency(IGlobalTranslationExecutorSet.class, lookup.getTranslationSet());
		setDependency(IGlobalUserExecutorSet.class, lookup.getUserSet());
		setDependency(IGlobalBeanExecutorSetLookup.class, lookup);
	}

}
