package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import java.util.List;

public class GlobalGameExecutorSet implements IGlobalGameExecutorSet {

	private final IBeanExecutorLocator locator;

	public GlobalGameExecutorSet(IBeanExecutorLocator locator) {
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
	public IGame newGame(long loginId, String name) {
		NewGame bean = new NewGame(loginId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameVersion newGameVersion(long loginId, String gameName, String versionName) {
		NewGameVersion bean = new NewGameVersion(loginId, gameName, versionName);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameInstance newGameInstance(long loginId, String gameName, String versionName, String instanceName, int hostId) {
		NewGameInstance bean = new NewGameInstance(loginId, gameName, versionName, instanceName, hostId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGame getGameById(int gameId) {
		GetGameById bean = new GetGameById(gameId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGame getGameByName(String gameName) {
		GetGameByName bean = new GetGameByName(gameName);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameVersion getGameVersionById(int versionId) {
		GetGameVersionById bean = new GetGameVersionById(versionId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameVersion getGameVersionByName(String versionName, int gameId) {
		GetGameVersionByName bean = new GetGameVersionByName(versionName, gameId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameInstance getGameInstanceById(int instanceId) {
		GetGameInstanceById bean = new GetGameInstanceById(instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameInstance getGameInstanceByName(String instanceName, int versionId) {
		GetGameInstanceByName bean = new GetGameInstanceByName(instanceName, versionId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IGame> getGames() {
		GetGames bean = new GetGames();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IGameVersion> getGameVersions() {
		GetGameVersions bean = new GetGameVersions();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IGameInstance> getGameInstances() {
		GetGameInstances bean = new GetGameInstances();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IGameDefinition> getGameDefinitions() {
		GetGameDefinitions bean = new GetGameDefinitions();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameDefinition getGameDefinition(int instanceId) {
		GetGameDefinition bean = new GetGameDefinition(instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameHost newGameHost(long loginId, String name, int port) {
		NewGameHost bean = new NewGameHost(loginId, name, port);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameInstance getGameInstanceByNames(String gameName, String versionName, String instanceName) {
		GetGameInstanceByNames bean = new GetGameInstanceByNames(gameName, versionName, instanceName);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameHost getGameHostByName(String name, int port) {
		GetGameHostByName bean = new GetGameHostByName(name, port);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameHost getGameHostById(int id) {
		GetGameHostById bean = new GetGameHostById(id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IGameHost> getGameHosts() {
		GetGameHosts bean = new GetGameHosts();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IGameInstance> getGameInstancesByGameName(String gameName) {
		GetGameInstancesByGameName bean = new GetGameInstancesByGameName(gameName);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IGameDefinition> getGameDefinitionsByGameName(String gameName) {
		GetGameDefinitionsByGameName bean = new GetGameDefinitionsByGameName(gameName);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setGameInstanceProperty(long loginId, int instanceId, String key, String value) {
		SetGameInstanceProperty bean = new SetGameInstanceProperty(loginId, instanceId, key, value);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IGameInstanceProperty> getGameInstancePropertyList(int instanceId) {
		GetGameInstancePropertyList bean = new GetGameInstancePropertyList(instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGameDefinition getGameDefinitionByHostPort(String name, int port) {
		GetGameDefinitionByHostPort bean = new GetGameDefinitionByHostPort(name, port);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
