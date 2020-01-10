package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import java.util.List;

public interface ILocalScoreExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	Boolean setUnitScore(long loginId, int instanceId, String group, String unit, long score);

	long getUnitScore(long loginId, int instanceId, int groupId, int unitId);

	List<IUnitScore> getUnitScores(long loginId, int instanceId);

	Boolean setScoreUpdaterGroup(long loginId, int instanceId, String group);

	List<IRanking> getRankingList(long loginId, int instanceId, RankingType type, int groupId);

	List<Integer> getRankingGroupList(long loginId, int instanceId);

	List<IPlayerRanking> getPlayerRankingList(long loginId, int instanceId, int groupId, int pageNumber, int pageSize);

	List<IAllianceRanking> getAllianceRankingList(long loginId, int instanceId, int groupId, int pageNumber, int pageSize);

	Boolean setScoreDivisor(long loginId, int instanceId, String group, long divisor);

	long getScoreDivisor(long loginId, int instanceId, int groupId);
}
