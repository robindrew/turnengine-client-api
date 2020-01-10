package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.common.plugin.IPluginDetails;
import com.turnengine.client.api.global.image.IImage;
import com.turnengine.client.api.global.user.IUserAdminInfo;
import com.turnengine.client.api.local.score.IGroupScore;
import com.turnengine.client.api.local.score.ITurnScore;
import java.util.List;

public class LocalPlayerExecutorSet implements ILocalPlayerExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalPlayerExecutorSet(IBeanExecutorLocator locator) {
		if (locator == null) {
			throw new NullPointerException("locator");
		}
		this.locator = locator;
	}

	/**
	 * Getter for the locator field.
	 * @return the value of the locator field.
	 */
	public IBeanExecutorLocator getLocator() {
		return locator;
	}

	@Override
	public IPlayer signupPlayer(long loginId, int instanceId, String name, String factionName) {
		SignupPlayer bean = new SignupPlayer(loginId, instanceId, name, factionName);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IPlayer getPlayerById(long loginId, int instanceId, int id) {
		GetPlayerById bean = new GetPlayerById(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IPlayer getPlayerByUserId(long loginId, int instanceId, int id) {
		GetPlayerByUserId bean = new GetPlayerByUserId(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IPlayer getPlayerByName(long loginId, int instanceId, String name) {
		GetPlayerByName bean = new GetPlayerByName(loginId, instanceId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setPlayerSignupsEnabled(long loginId, int instanceId, boolean enabled) {
		SetPlayerSignupsEnabled bean = new SetPlayerSignupsEnabled(loginId, instanceId, enabled);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean getPlayerSignupsEnabled(long loginId, int instanceId) {
		GetPlayerSignupsEnabled bean = new GetPlayerSignupsEnabled(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int setPlayerLimit(long loginId, int instanceId, int limit) {
		SetPlayerLimit bean = new SetPlayerLimit(loginId, instanceId, limit);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int getPlayerLimit(long loginId, int instanceId) {
		GetPlayerLimit bean = new GetPlayerLimit(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int setPlayerActionQueueLimit(long loginId, int instanceId, int limit) {
		SetPlayerActionQueueLimit bean = new SetPlayerActionQueueLimit(loginId, instanceId, limit);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int getPlayerActionQueueLimit(long loginId, int instanceId) {
		GetPlayerActionQueueLimit bean = new GetPlayerActionQueueLimit(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean renamePlayer(long loginId, int instanceId, String from, String to) {
		RenamePlayer bean = new RenamePlayer(loginId, instanceId, from, to);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int getPlayerCount(long loginId, int instanceId) {
		GetPlayerCount bean = new GetPlayerCount(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int getPlayerCountByFactionId(long loginId, int instanceId, int id) {
		GetPlayerCountByFactionId bean = new GetPlayerCountByFactionId(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean isPlayerSignedUp(long loginId, int instanceId) {
		IsPlayerSignedUp bean = new IsPlayerSignedUp(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setPlayerSignupPlugin(long loginId, int instanceId, String name, String plugin) {
		SetPlayerSignupPlugin bean = new SetPlayerSignupPlugin(loginId, instanceId, name, plugin);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IPlayer getPlayer(long loginId, int instanceId) {
		GetPlayer bean = new GetPlayer(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IPlayer> getPlayerList(long loginId, int instanceId) {
		GetPlayerList bean = new GetPlayerList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGroupScore getPlayerScore(long loginId, int instanceId, int groupId) {
		GetPlayerScore bean = new GetPlayerScore(loginId, instanceId, groupId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IGroupScore> getPlayerScoreList(long loginId, int instanceId) {
		GetPlayerScoreList bean = new GetPlayerScoreList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean addUnitsAtPlayer(long loginId, int instanceId, int unitId, long amount) {
		AddUnitsAtPlayer bean = new AddUnitsAtPlayer(loginId, instanceId, unitId, amount);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IPlayerSetupInfo getPlayerSetupInfo(long loginId, int instanceId) {
		GetPlayerSetupInfo bean = new GetPlayerSetupInfo(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IPluginDetails getPlayerSignupPlugin(long loginId, int instanceId) {
		GetPlayerSignupPlugin bean = new GetPlayerSignupPlugin(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setPlayerProperty(long loginId, int instanceId, int playerId, String key, String value) {
		SetPlayerProperty bean = new SetPlayerProperty(loginId, instanceId, playerId, key, value);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IPlayerProperty> getPlayerPropertyList(long loginId, int instanceId, int playerId) {
		GetPlayerPropertyList bean = new GetPlayerPropertyList(loginId, instanceId, playerId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IPlayerInfo getPlayerInfo(long loginId, int instanceId, int playerId) {
		GetPlayerInfo bean = new GetPlayerInfo(loginId, instanceId, playerId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<ITurnScore> getPlayerScores(long loginId, int instanceId, int playerId, int groupId, int maxSize, int minTurn, int maxTurn) {
		GetPlayerScores bean = new GetPlayerScores(loginId, instanceId, playerId, groupId, maxSize, minTurn, maxTurn);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IUserAdminInfo getUserAdminInfoByPlayer(long loginId, int instanceId, int playerId) {
		GetUserAdminInfoByPlayer bean = new GetUserAdminInfoByPlayer(loginId, instanceId, playerId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setPlayerAvatar(long loginId, int instanceId, byte[] image) {
		SetPlayerAvatar bean = new SetPlayerAvatar(loginId, instanceId, image);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IImage getPlayerAvatar(long loginId, int instanceId, int playerId, int width, int height, boolean fill) {
		GetPlayerAvatar bean = new GetPlayerAvatar(loginId, instanceId, playerId, width, height, fill);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
