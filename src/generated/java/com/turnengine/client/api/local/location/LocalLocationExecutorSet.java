package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.common.plugin.IPluginDetails;
import java.util.List;

public class LocalLocationExecutorSet implements ILocalLocationExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalLocationExecutorSet(IBeanExecutorLocator locator) {
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
	public Boolean setLocationGenerationPlugin(long loginId, int instanceId, String name, String plugin) {
		SetLocationGenerationPlugin bean = new SetLocationGenerationPlugin(loginId, instanceId, name, plugin);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Integer generateLocations(long loginId, int instanceId) {
		GenerateLocations bean = new GenerateLocations(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setLocationCoordinatePlugin(long loginId, int instanceId, String name, String plugin) {
		SetLocationCoordinatePlugin bean = new SetLocationCoordinatePlugin(loginId, instanceId, name, plugin);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setLocationsEnabled(long loginId, int instanceId, boolean enabled) {
		SetLocationsEnabled bean = new SetLocationsEnabled(loginId, instanceId, enabled);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean getLocationsEnabled(long loginId, int instanceId) {
		GetLocationsEnabled bean = new GetLocationsEnabled(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setLocationSignupsEnabled(long loginId, int instanceId, boolean enabled) {
		SetLocationSignupsEnabled bean = new SetLocationSignupsEnabled(loginId, instanceId, enabled);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean getLocationSignupsEnabled(long loginId, int instanceId) {
		GetLocationSignupsEnabled bean = new GetLocationSignupsEnabled(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<ILocation> getLocationList(long loginId, int instanceId) {
		GetLocationList bean = new GetLocationList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public ILocation getLocation(long loginId, int instanceId, int locationId) {
		GetLocation bean = new GetLocation(loginId, instanceId, locationId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean renameLocation(long loginId, int instanceId, int locationId, String name) {
		RenameLocation bean = new RenameLocation(loginId, instanceId, locationId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean addUnitsAtLocation(long loginId, int instanceId, int locationId, int unitId, long amount) {
		AddUnitsAtLocation bean = new AddUnitsAtLocation(loginId, instanceId, locationId, unitId, amount);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGridInfo getGridInfoList(long loginId, int instanceId, int[] coordinates, int depth) {
		GetGridInfoList bean = new GetGridInfoList(loginId, instanceId, coordinates, depth);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int getLocationId(long loginId, int instanceId, int[] coordinates) {
		GetLocationId bean = new GetLocationId(loginId, instanceId, coordinates);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int[] getCoordinates(long loginId, int instanceId, int locationId) {
		GetCoordinates bean = new GetCoordinates(loginId, instanceId, locationId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int getLocationCount(long loginId, int instanceId) {
		GetLocationCount bean = new GetLocationCount(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public ILocationSetupInfo getLocationSetupInfo(long loginId, int instanceId) {
		GetLocationSetupInfo bean = new GetLocationSetupInfo(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IPluginDetails getLocationCoordinatePlugin(long loginId, int instanceId) {
		GetLocationCoordinatePlugin bean = new GetLocationCoordinatePlugin(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IPluginDetails getLocationGenerationPlugin(long loginId, int instanceId) {
		GetLocationGenerationPlugin bean = new GetLocationGenerationPlugin(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setLocationProperty(long loginId, int instanceId, int locationId, int playerId, String key, String value) {
		SetLocationProperty bean = new SetLocationProperty(loginId, instanceId, locationId, playerId, key, value);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<ILocationProperty> getLocationPropertyList(long loginId, int instanceId, int playerId, int locationId) {
		GetLocationPropertyList bean = new GetLocationPropertyList(loginId, instanceId, playerId, locationId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int[] getLocationIdsForPlayer(long loginId, int instanceId, int playerId) {
		GetLocationIdsForPlayer bean = new GetLocationIdsForPlayer(loginId, instanceId, playerId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean checkRenameLocation(long loginId, int instanceId, int locationId, String name) {
		CheckRenameLocation bean = new CheckRenameLocation(loginId, instanceId, locationId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
