package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import com.turnengine.client.api.global.game.GameStatus;

public interface ILocalGameExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	Boolean setGameInstance(long loginId, int instanceId);

	Boolean startupGame(long loginId, int instanceId);

	Boolean resetGame(long loginId, int instanceId);

	Boolean shutdownGame(long loginId, int instanceId);

	GameStatus getGameStatus(long loginId, int instanceId);

	Boolean addGameUnits(long loginId, int instanceId, int unitId, long amount);

	IGameUnits getGameUnits(long loginId, int instanceId);
}
