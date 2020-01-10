package com.turnengine.client.api.local.score;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import com.robindrew.common.collect.indexmap.ArrayIndexMap;
import com.robindrew.common.collect.indexmap.IIndexMap;
import com.turnengine.client.api.local.group.IGroup;
import com.turnengine.client.api.local.unit.IUnit;

public class ScoreCache implements IScoreCache {

	/** For efficiency we use the lightling fast (and small) index maps. */
	private final Set<Integer> groupIdSet = new CopyOnWriteArraySet<Integer>();
	private final IIndexMap<IIndexMap<IUnitScore>> groupToUnitToScoreMap = new ArrayIndexMap<IIndexMap<IUnitScore>>();

	public ScoreCache() {
	}

	public ScoreCache(Collection<IUnitScore> scores) {
		addScores(scores);
	}

	@Override
	public void addScore(IUnitScore score) {
		int unitId = score.getUnitId();
		int groupId = score.getGroupId();

		IIndexMap<IUnitScore> unitToScoreMap = groupToUnitToScoreMap.get(groupId);
		if (unitToScoreMap == null) {
			unitToScoreMap = new ArrayIndexMap<IUnitScore>();
			groupToUnitToScoreMap.put(groupId, unitToScoreMap);
		}
		unitToScoreMap.put(unitId, score);
		groupIdSet.add(groupId);
	}

	@Override
	public void addScores(Collection<IUnitScore> scores) {
		for (IUnitScore score : scores) {
			addScore(score);
		}
	}

	@Override
	public List<IUnitScore> getScores() {
		List<IUnitScore> list = new ArrayList<IUnitScore>();
		for (IIndexMap<IUnitScore> unitToScoreMap : groupToUnitToScoreMap.values()) {
			if (unitToScoreMap == null) {
				continue;
			}
			for (IUnitScore score : unitToScoreMap.values()) {
				if (score != null) {
					list.add(score);
				}
			}
		}
		return list;
	}

	@Override
	public long getScore(int groupId, int unitId) {
		IIndexMap<IUnitScore> unitToScoreMap = groupToUnitToScoreMap.get(groupId);
		if (unitToScoreMap != null) {
			IUnitScore score = unitToScoreMap.get(unitId);
			if (score != null) {
				return score.getScore();
			}
		}
		return 0;
	}

	@Override
	public long getScore(IGroup group, IUnit unit) {
		return getScore(group.getId(), unit.getId());
	}

	@Override
	public Set<Integer> getScoreGroups() {
		return new HashSet<Integer>(groupIdSet);
	}

}
