package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import com.turnengine.client.api.global.game.GameStatus;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public interface ILocalGameExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	Boolean setGameInstance(long loginId, int instanceId);

	Boolean startupGame(long loginId, int instanceId);

	Boolean resetGame(long loginId, int instanceId);

	Boolean shutdownGame(long loginId, int instanceId);

	GameStatus getGameStatus(long loginId, int instanceId);

	Boolean addUnitsAtGame(long loginId, int instanceId, int unitId, long amount);

	List<IUnitCount> getUnitsAtGame(long loginId, int instanceId);
}
