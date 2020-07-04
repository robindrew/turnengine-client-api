package com.turnengine.client.api.local.score;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.turnengine.client.api.local.group.IGroup;
import com.turnengine.client.api.local.unit.IUnit;

public interface IScoreCache {

	boolean isEmpty();
	
	void addScore(IUnitScore score);

	void addScores(Collection<IUnitScore> scores);

	List<IUnitScore> getScores();

	long getScore(int groupId, int unitId);

	long getScore(IGroup group, IUnit unit);

	Set<Integer> getScoreGroups();

}
