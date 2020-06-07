package com.turnengine.client.api.executable.executor.executorset;

import java.util.EnumMap;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.robindrew.common.util.Check;
import com.turnengine.client.api.common.command.IGlobalBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import com.turnengine.client.api.common.concept.GlobalConcept;
import com.turnengine.client.api.common.concept.IConcept;
import com.turnengine.client.api.common.concept.LocalConcept;
import com.turnengine.client.api.global.admin.GlobalAdminExecutorSet;
import com.turnengine.client.api.global.announcement.GlobalAnnouncementExecutorSet;
import com.turnengine.client.api.global.error.GlobalErrorExecutorSet;
import com.turnengine.client.api.global.forum.GlobalForumExecutorSet;
import com.turnengine.client.api.global.game.GlobalGameExecutorSet;
import com.turnengine.client.api.global.translation.GlobalTranslationExecutorSet;
import com.turnengine.client.api.global.user.GlobalUserExecutorSet;
import com.turnengine.client.api.local.action.LocalActionExecutorSet;
import com.turnengine.client.api.local.alliance.LocalAllianceExecutorSet;
import com.turnengine.client.api.local.allianceforum.LocalAllianceForumExecutorSet;
import com.turnengine.client.api.local.error.LocalErrorExecutorSet;
import com.turnengine.client.api.local.faction.LocalFactionExecutorSet;
import com.turnengine.client.api.local.game.LocalGameExecutorSet;
import com.turnengine.client.api.local.group.LocalGroupExecutorSet;
import com.turnengine.client.api.local.location.LocalLocationExecutorSet;
import com.turnengine.client.api.local.message.LocalMessageExecutorSet;
import com.turnengine.client.api.local.mobile.LocalMobileExecutorSet;
import com.turnengine.client.api.local.player.LocalPlayerExecutorSet;
import com.turnengine.client.api.local.property.LocalPropertyExecutorSet;
import com.turnengine.client.api.local.score.LocalScoreExecutorSet;
import com.turnengine.client.api.local.setup.LocalSetupExecutorSet;
import com.turnengine.client.api.local.storage.LocalStorageExecutorSet;
import com.turnengine.client.api.local.trading.LocalTradingExecutorSet;
import com.turnengine.client.api.local.turn.LocalTurnExecutorSet;
import com.turnengine.client.api.local.unit.LocalUnitExecutorSet;
import com.turnengine.client.api.local.upkeep.LocalUpkeepExecutorSet;

public class BeanExecutorSetFactory implements IBeanExecutorSetFactory {

	private final EnumMap<GlobalConcept, IGlobalBeanExecutorSet> globalMap = new EnumMap<>(GlobalConcept.class);
	private final EnumMap<LocalConcept, ILocalBeanExecutorSet> localMap = new EnumMap<>(LocalConcept.class);

	public BeanExecutorSetFactory(IBeanExecutorLocator globalLocator, IBeanExecutorLocator localLocator) {

		// Register global concepts
		register(GlobalConcept.ADMIN, new GlobalAdminExecutorSet(globalLocator));
		register(GlobalConcept.ANNOUNCEMENT, new GlobalAnnouncementExecutorSet(globalLocator));
		register(GlobalConcept.ERROR, new GlobalErrorExecutorSet(globalLocator));
		register(GlobalConcept.FORUM, new GlobalForumExecutorSet(globalLocator));
		register(GlobalConcept.GAME, new GlobalGameExecutorSet(globalLocator));
		register(GlobalConcept.TRANSLATION, new GlobalTranslationExecutorSet(globalLocator));
		register(GlobalConcept.USER, new GlobalUserExecutorSet(globalLocator));

		// Register local concepts
		register(LocalConcept.ACTION, new LocalActionExecutorSet(localLocator));
		register(LocalConcept.ALLIANCE, new LocalAllianceExecutorSet(localLocator));
		register(LocalConcept.ALLIANCE_FORUM, new LocalAllianceForumExecutorSet(localLocator));
		register(LocalConcept.ERROR, new LocalErrorExecutorSet(localLocator));
		register(LocalConcept.FACTION, new LocalFactionExecutorSet(localLocator));
		register(LocalConcept.GAME, new LocalGameExecutorSet(localLocator));
		register(LocalConcept.GROUP, new LocalGroupExecutorSet(localLocator));
		register(LocalConcept.LOCATION, new LocalLocationExecutorSet(localLocator));
		register(LocalConcept.MESSAGE, new LocalMessageExecutorSet(localLocator));
		register(LocalConcept.MOBILE, new LocalMobileExecutorSet(localLocator));
		register(LocalConcept.PLAYER, new LocalPlayerExecutorSet(localLocator));
		register(LocalConcept.PROPERTY, new LocalPropertyExecutorSet(localLocator));
		register(LocalConcept.SCORE, new LocalScoreExecutorSet(localLocator));
		register(LocalConcept.SETUP, new LocalSetupExecutorSet(localLocator));
		register(LocalConcept.STORAGE, new LocalStorageExecutorSet(localLocator));
		register(LocalConcept.TRADING, new LocalTradingExecutorSet(localLocator));
		register(LocalConcept.TURN, new LocalTurnExecutorSet(localLocator));
		register(LocalConcept.UNIT, new LocalUnitExecutorSet(localLocator));
		register(LocalConcept.UPKEEP, new LocalUpkeepExecutorSet(localLocator));
	}

	public BeanExecutorSetFactory(IBeanExecutorLocator locator) {
		this(locator, locator);
	}

	protected void register(GlobalConcept concept, IGlobalBeanExecutorSet executorSet) {
		Check.notNull("concept", concept);
		Check.notNull("executorSet", executorSet);
		globalMap.put(concept, executorSet);
	}

	protected void register(LocalConcept concept, ILocalBeanExecutorSet executorSet) {
		Check.notNull("concept", concept);
		Check.notNull("executorSet", executorSet);
		localMap.put(concept, executorSet);
	}

	@Override
	public IBeanExecutorSet getExecutorSet(IConcept concept) {
		if (concept instanceof GlobalConcept) {
			return getGlobalExecutorSet((GlobalConcept) concept);
		}
		if (concept instanceof LocalConcept) {
			return getLocalExecutorSet((LocalConcept) concept);
		}
		throw new IllegalArgumentException("Concept not supported: " + concept.name() + " (" + concept.getClass().getName() + ")");
	}

	private IBeanExecutorSet getGlobalExecutorSet(GlobalConcept concept) {
		IGlobalBeanExecutorSet set = globalMap.get(concept);
		if (set == null) {
			throw new IllegalArgumentException("IGlobalBeanExecutorSet not registered for concept: " + concept);
		}
		return set;
	}

	private IBeanExecutorSet getLocalExecutorSet(LocalConcept concept) {
		ILocalBeanExecutorSet set = localMap.get(concept);
		if (set == null) {
			throw new IllegalArgumentException("ILocalBeanExecutorSet not registered for concept: " + concept);
		}
		return set;
	}

}
