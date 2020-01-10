package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocalTurnExecutorSet implements ILocalTurnExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalTurnExecutorSet(IBeanExecutorLocator locator) {
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
	public int getTurnNumber(long loginId, int instanceId) {
		GetTurnNumber bean = new GetTurnNumber(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int executeTurns(long loginId, int instanceId, int turns) {
		ExecuteTurns bean = new ExecuteTurns(loginId, instanceId, turns);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public long setTurnInterval(long loginId, int instanceId, long interval) {
		SetTurnInterval bean = new SetTurnInterval(loginId, instanceId, interval);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public long getTurnInterval(long loginId, int instanceId) {
		GetTurnInterval bean = new GetTurnInterval(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public TurnsEnabled setTurnsEnabled(long loginId, int instanceId, TurnsEnabled updating) {
		SetTurnsEnabled bean = new SetTurnsEnabled(loginId, instanceId, updating);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public TurnUpdating getTurnUpdating(long loginId, int instanceId) {
		GetTurnUpdating bean = new GetTurnUpdating(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public long getNextTurnUpdateTime(long loginId, int instanceId) {
		GetNextTurnUpdateTime bean = new GetNextTurnUpdateTime(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public ITurnSummary getTurnSummary(long loginId, int instanceId) {
		GetTurnSummary bean = new GetTurnSummary(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<ITurn> getTurns(long loginId, int instanceId) {
		GetTurns bean = new GetTurns(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<ITurnDetails> getTurnDetails(long loginId, int instanceId) {
		GetTurnDetails bean = new GetTurnDetails(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setTurnStartTime(long loginId, int instanceId, long timestamp) {
		SetTurnStartTime bean = new SetTurnStartTime(loginId, instanceId, timestamp);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Long getTurnStartTime(long loginId, int instanceId) {
		GetTurnStartTime bean = new GetTurnStartTime(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public long setTurnIntervalTime(long loginId, int instanceId, long interval, TimeUnit unit) {
		SetTurnIntervalTime bean = new SetTurnIntervalTime(loginId, instanceId, interval, unit);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
