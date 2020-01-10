package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.IGlobalBeanExecutorSet;
import java.util.List;

public interface IGlobalGameExecutorSet extends IBeanExecutorSet, IGlobalBeanExecutorSet {

	IGame newGame(long loginId, String name);

	IGameVersion newGameVersion(long loginId, String gameName, String versionName);

	IGameInstance newGameInstance(long loginId, String gameName, String versionName, String instanceName, int hostId);

	IGame getGameById(int gameId);

	IGame getGameByName(String gameName);

	IGameVersion getGameVersionById(int versionId);

	IGameVersion getGameVersionByName(String versionName, int gameId);

	IGameInstance getGameInstanceById(int instanceId);

	IGameInstance getGameInstanceByName(String instanceName, int versionId);

	List<IGame> getGames();

	List<IGameVersion> getGameVersions();

	List<IGameInstance> getGameInstances();

	List<IGameDefinition> getGameDefinitions();

	IGameDefinition getGameDefinition(int instanceId);

	Boolean startupGame(long loginId, int instanceId);

	Boolean resetGame(long loginId, int instanceId);

	Boolean shutdownGame(long loginId, int instanceId);

	IGameHost newGameHost(long loginId, String name, int port);

	IGameInstance getGameInstanceByNames(String gameName, String versionName, String instanceName);

	IGameHost getGameHostByName(String name, int port);

	IGameHost getGameHostById(int id);

	List<IGameHost> getGameHosts();

	List<IGameInstance> getGameInstancesByGameName(String gameName);

	List<IGameDefinition> getGameDefinitionsByGameName(String gameName);

	GameStatus getGameStatus(long loginId, int instanceId);

	Boolean setGameInstanceProperty(long loginId, int instanceId, String key, String value);

	List<IGameInstanceProperty> getGameInstancePropertyList(int instanceId);
}
