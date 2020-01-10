package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

public interface ILocalTurnExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	int getTurnNumber(long loginId, int instanceId);

	int executeTurns(long loginId, int instanceId, int turns);

	long setTurnInterval(long loginId, int instanceId, long interval);

	long getTurnInterval(long loginId, int instanceId);

	TurnsEnabled setTurnsEnabled(long loginId, int instanceId, TurnsEnabled updating);

	TurnUpdating getTurnUpdating(long loginId, int instanceId);

	long getNextTurnUpdateTime(long loginId, int instanceId);

	ITurnSummary getTurnSummary(long loginId, int instanceId);

	List<ITurn> getTurns(long loginId, int instanceId);

	List<ITurnDetails> getTurnDetails(long loginId, int instanceId);

	Boolean setTurnStartTime(long loginId, int instanceId, long timestamp);

	Long getTurnStartTime(long loginId, int instanceId);

	long setTurnIntervalTime(long loginId, int instanceId, long interval, TimeUnit unit);
}
