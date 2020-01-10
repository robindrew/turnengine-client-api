package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import java.util.List;

public class LocalScoreExecutorSet implements ILocalScoreExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalScoreExecutorSet(IBeanExecutorLocator locator) {
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
	public Boolean setUnitScore(long loginId, int instanceId, String group, String unit, long score) {
		SetUnitScore bean = new SetUnitScore(loginId, instanceId, group, unit, score);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public long getUnitScore(long loginId, int instanceId, int groupId, int unitId) {
		GetUnitScore bean = new GetUnitScore(loginId, instanceId, groupId, unitId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUnitScore> getUnitScores(long loginId, int instanceId) {
		GetUnitScores bean = new GetUnitScores(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setScoreUpdaterGroup(long loginId, int instanceId, String group) {
		SetScoreUpdaterGroup bean = new SetScoreUpdaterGroup(loginId, instanceId, group);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IRanking> getRankingList(long loginId, int instanceId, RankingType type, int groupId) {
		GetRankingList bean = new GetRankingList(loginId, instanceId, type, groupId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<Integer> getRankingGroupList(long loginId, int instanceId) {
		GetRankingGroupList bean = new GetRankingGroupList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IPlayerRanking> getPlayerRankingList(long loginId, int instanceId, int groupId, int pageNumber, int pageSize) {
		GetPlayerRankingList bean = new GetPlayerRankingList(loginId, instanceId, groupId, pageNumber, pageSize);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IAllianceRanking> getAllianceRankingList(long loginId, int instanceId, int groupId, int pageNumber, int pageSize) {
		GetAllianceRankingList bean = new GetAllianceRankingList(loginId, instanceId, groupId, pageNumber, pageSize);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setScoreDivisor(long loginId, int instanceId, String group, long divisor) {
		SetScoreDivisor bean = new SetScoreDivisor(loginId, instanceId, group, divisor);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public long getScoreDivisor(long loginId, int instanceId, int groupId) {
		GetScoreDivisor bean = new GetScoreDivisor(loginId, instanceId, groupId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
