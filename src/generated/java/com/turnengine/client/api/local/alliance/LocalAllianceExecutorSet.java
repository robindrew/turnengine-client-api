package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.global.image.IImage;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.score.ITurnScore;
import java.util.List;

public class LocalAllianceExecutorSet implements ILocalAllianceExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalAllianceExecutorSet(IBeanExecutorLocator locator) {
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
	public int getAllianceCount(long loginId, int instanceId) {
		GetAllianceCount bean = new GetAllianceCount(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int getAllianceMemberCount(long loginId, int instanceId, int id) {
		GetAllianceMemberCount bean = new GetAllianceMemberCount(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IAlliance getAllianceById(long loginId, int instanceId, int id) {
		GetAllianceById bean = new GetAllianceById(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IAlliance getAllianceByName(long loginId, int instanceId, String name) {
		GetAllianceByName bean = new GetAllianceByName(loginId, instanceId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IAlliance formAlliance(long loginId, int instanceId, String name, String tag) {
		FormAlliance bean = new FormAlliance(loginId, instanceId, name, tag);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean disbandAlliance(long loginId, int instanceId) {
		DisbandAlliance bean = new DisbandAlliance(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean leaveAlliance(long loginId, int instanceId) {
		LeaveAlliance bean = new LeaveAlliance(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean inviteToJoinAlliance(long loginId, int instanceId, int playerId) {
		InviteToJoinAlliance bean = new InviteToJoinAlliance(loginId, instanceId, playerId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean requestToJoinAlliance(long loginId, int instanceId, int allianceId) {
		RequestToJoinAlliance bean = new RequestToJoinAlliance(loginId, instanceId, allianceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean kickAllianceMember(long loginId, int instanceId, int playerId) {
		KickAllianceMember bean = new KickAllianceMember(loginId, instanceId, playerId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IPlayerInfo> getInvitedToJoinAllianceList(long loginId, int instanceId) {
		GetInvitedToJoinAllianceList bean = new GetInvitedToJoinAllianceList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int getAllianceInviteLimit(long loginId, int instanceId) {
		GetAllianceInviteLimit bean = new GetAllianceInviteLimit(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int setAllianceInviteLimit(long loginId, int instanceId, int limit) {
		SetAllianceInviteLimit bean = new SetAllianceInviteLimit(loginId, instanceId, limit);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int getAllianceMemberLimit(long loginId, int instanceId) {
		GetAllianceMemberLimit bean = new GetAllianceMemberLimit(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int setAllianceMemberLimit(long loginId, int instanceId, int limit) {
		SetAllianceMemberLimit bean = new SetAllianceMemberLimit(loginId, instanceId, limit);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setAlliancesEnabled(long loginId, int instanceId, boolean enabled) {
		SetAlliancesEnabled bean = new SetAlliancesEnabled(loginId, instanceId, enabled);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IAlliance> getAllianceList(long loginId, int instanceId) {
		GetAllianceList bean = new GetAllianceList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IAlliance getAlliance(long loginId, int instanceId) {
		GetAlliance bean = new GetAlliance(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IPlayerInfo> getRequestedToJoinAllianceList(long loginId, int instanceId) {
		GetRequestedToJoinAllianceList bean = new GetRequestedToJoinAllianceList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean inviteToJoinAllianceByName(long loginId, int instanceId, String playerName) {
		InviteToJoinAllianceByName bean = new InviteToJoinAllianceByName(loginId, instanceId, playerName);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean requestToJoinAllianceByName(long loginId, int instanceId, String allianceName) {
		RequestToJoinAllianceByName bean = new RequestToJoinAllianceByName(loginId, instanceId, allianceName);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int setAllianceLeaveTurns(long loginId, int instanceId, int turns) {
		SetAllianceLeaveTurns bean = new SetAllianceLeaveTurns(loginId, instanceId, turns);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IAllianceSetupInfo getAllianceSetupInfo(long loginId, int instanceId) {
		GetAllianceSetupInfo bean = new GetAllianceSetupInfo(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setAllianceProperty(long loginId, int instanceId, int allianceId, String key, String value) {
		SetAllianceProperty bean = new SetAllianceProperty(loginId, instanceId, allianceId, key, value);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IAllianceProperty> getAlliancePropertyList(long loginId, int instanceId, int allianceId) {
		GetAlliancePropertyList bean = new GetAlliancePropertyList(loginId, instanceId, allianceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<ITurnScore> getAllianceScores(long loginId, int instanceId, int allianceId, int groupId, int maxSize, int minTurn, int maxTurn) {
		GetAllianceScores bean = new GetAllianceScores(loginId, instanceId, allianceId, groupId, maxSize, minTurn, maxTurn);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setAllianceLogo(long loginId, int instanceId, byte[] image) {
		SetAllianceLogo bean = new SetAllianceLogo(loginId, instanceId, image);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IImage getAllianceLogo(long loginId, int instanceId, int allianceId, int width, int height, boolean fill) {
		GetAllianceLogo bean = new GetAllianceLogo(loginId, instanceId, allianceId, width, height, fill);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IAllianceInfo getAllianceInfo(long loginId, int instanceId, int allianceId) {
		GetAllianceInfo bean = new GetAllianceInfo(loginId, instanceId, allianceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
