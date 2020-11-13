package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.global.game.GameStatus;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public class LocalGameExecutorSet implements ILocalGameExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalGameExecutorSet(IBeanExecutorLocator locator) {
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
	public Boolean setGameInstance(long loginId, int instanceId) {
		SetGameInstance bean = new SetGameInstance(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean startupGame(long loginId, int instanceId) {
		StartupGame bean = new StartupGame(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean resetGame(long loginId, int instanceId) {
		ResetGame bean = new ResetGame(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean shutdownGame(long loginId, int instanceId) {
		ShutdownGame bean = new ShutdownGame(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public GameStatus getGameStatus(long loginId, int instanceId) {
		GetGameStatus bean = new GetGameStatus(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean addUnitsAtGame(long loginId, int instanceId, int unitId, long amount) {
		AddUnitsAtGame bean = new AddUnitsAtGame(loginId, instanceId, unitId, amount);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUnitCount> getUnitsAtGame(long loginId, int instanceId) {
		GetUnitsAtGame bean = new GetUnitsAtGame(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
