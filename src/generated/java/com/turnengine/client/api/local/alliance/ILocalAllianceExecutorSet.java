package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import com.turnengine.client.api.global.image.IImage;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.score.ITurnScore;
import java.util.List;

public interface ILocalAllianceExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	int getAllianceCount(long loginId, int instanceId);

	int getAllianceMemberCount(long loginId, int instanceId, int id);

	IAlliance getAllianceById(long loginId, int instanceId, int id);

	IAlliance getAllianceByName(long loginId, int instanceId, String name);

	IAlliance formAlliance(long loginId, int instanceId, String name, String tag);

	Boolean disbandAlliance(long loginId, int instanceId);

	Boolean leaveAlliance(long loginId, int instanceId);

	Boolean inviteToJoinAlliance(long loginId, int instanceId, int playerId);

	Boolean requestToJoinAlliance(long loginId, int instanceId, int allianceId);

	Boolean kickAllianceMember(long loginId, int instanceId, int playerId);

	List<IPlayerInfo> getInvitedToJoinAllianceList(long loginId, int instanceId);

	int getAllianceInviteLimit(long loginId, int instanceId);

	int setAllianceInviteLimit(long loginId, int instanceId, int limit);

	int getAllianceMemberLimit(long loginId, int instanceId);

	int setAllianceMemberLimit(long loginId, int instanceId, int limit);

	Boolean setAlliancesEnabled(long loginId, int instanceId, boolean enabled);

	List<IAlliance> getAllianceList(long loginId, int instanceId);

	IAlliance getAlliance(long loginId, int instanceId);

	List<IPlayerInfo> getRequestedToJoinAllianceList(long loginId, int instanceId);

	Boolean inviteToJoinAllianceByName(long loginId, int instanceId, String playerName);

	Boolean requestToJoinAllianceByName(long loginId, int instanceId, String allianceName);

	int setAllianceLeaveTurns(long loginId, int instanceId, int turns);

	IAllianceSetupInfo getAllianceSetupInfo(long loginId, int instanceId);

	Boolean setAllianceProperty(long loginId, int instanceId, int allianceId, String key, String value);

	List<IAllianceProperty> getAlliancePropertyList(long loginId, int instanceId, int allianceId);

	List<ITurnScore> getAllianceScores(long loginId, int instanceId, int allianceId, int groupId, int maxSize, int minTurn, int maxTurn);

	Boolean setAllianceLogo(long loginId, int instanceId, byte[] image);

	IImage getAllianceLogo(long loginId, int instanceId, int allianceId, int width, int height, boolean fill);

	IAllianceInfo getAllianceInfo(long loginId, int instanceId, int allianceId);
}
