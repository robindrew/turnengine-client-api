package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import com.turnengine.client.api.common.plugin.IPluginDetails;
import com.turnengine.client.api.global.image.IImage;
import com.turnengine.client.api.global.user.IUserAdminInfo;
import com.turnengine.client.api.local.score.IGroupScore;
import com.turnengine.client.api.local.score.ITurnScore;
import java.util.List;

public interface ILocalPlayerExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	IPlayer signupPlayer(long loginId, int instanceId, String name, String factionName);

	IPlayer getPlayerById(long loginId, int instanceId, int id);

	IPlayer getPlayerByUserId(long loginId, int instanceId, int id);

	IPlayer getPlayerByName(long loginId, int instanceId, String name);

	Boolean setPlayerSignupsEnabled(long loginId, int instanceId, boolean enabled);

	Boolean getPlayerSignupsEnabled(long loginId, int instanceId);

	int setPlayerLimit(long loginId, int instanceId, int limit);

	int getPlayerLimit(long loginId, int instanceId);

	int setPlayerActionQueueLimit(long loginId, int instanceId, int limit);

	int getPlayerActionQueueLimit(long loginId, int instanceId);

	Boolean renamePlayer(long loginId, int instanceId, String from, String to);

	int getPlayerCount(long loginId, int instanceId);

	int getPlayerCountByFactionId(long loginId, int instanceId, int id);

	Boolean isPlayerSignedUp(long loginId, int instanceId);

	Boolean setPlayerSignupPlugin(long loginId, int instanceId, String name, String plugin);

	IPlayer getPlayer(long loginId, int instanceId);

	List<IPlayer> getPlayerList(long loginId, int instanceId);

	IGroupScore getPlayerScore(long loginId, int instanceId, int groupId);

	List<IGroupScore> getPlayerScoreList(long loginId, int instanceId);

	Boolean addUnitsAtPlayer(long loginId, int instanceId, int unitId, long amount);

	IPlayerSetupInfo getPlayerSetupInfo(long loginId, int instanceId);

	IPluginDetails getPlayerSignupPlugin(long loginId, int instanceId);

	Boolean setPlayerProperty(long loginId, int instanceId, int playerId, String key, String value);

	List<IPlayerProperty> getPlayerPropertyList(long loginId, int instanceId, int playerId);

	IPlayerInfo getPlayerInfo(long loginId, int instanceId, int playerId);

	List<ITurnScore> getPlayerScores(long loginId, int instanceId, int playerId, int groupId, int maxSize, int minTurn, int maxTurn);

	IUserAdminInfo getUserAdminInfoByPlayer(long loginId, int instanceId, int playerId);

	Boolean setPlayerAvatar(long loginId, int instanceId, byte[] image);

	IImage getPlayerAvatar(long loginId, int instanceId, int playerId, int width, int height, boolean fill);
}
