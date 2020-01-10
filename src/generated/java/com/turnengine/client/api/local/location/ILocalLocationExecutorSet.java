package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import com.turnengine.client.api.common.plugin.IPluginDetails;
import java.util.List;

public interface ILocalLocationExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	Boolean setLocationGenerationPlugin(long loginId, int instanceId, String name, String plugin);

	Integer generateLocations(long loginId, int instanceId);

	Boolean setLocationCoordinatePlugin(long loginId, int instanceId, String name, String plugin);

	Boolean setLocationsEnabled(long loginId, int instanceId, boolean enabled);

	Boolean getLocationsEnabled(long loginId, int instanceId);

	Boolean setLocationSignupsEnabled(long loginId, int instanceId, boolean enabled);

	Boolean getLocationSignupsEnabled(long loginId, int instanceId);

	List<ILocation> getLocationList(long loginId, int instanceId);

	ILocation getLocation(long loginId, int instanceId, int locationId);

	Boolean renameLocation(long loginId, int instanceId, int locationId, String name);

	Boolean addUnitsAtLocation(long loginId, int instanceId, int locationId, int unitId, long amount);

	IGridInfo getGridInfoList(long loginId, int instanceId, int[] coordinates, int depth);

	int getLocationId(long loginId, int instanceId, int[] coordinates);

	int[] getCoordinates(long loginId, int instanceId, int locationId);

	int getLocationCount(long loginId, int instanceId);

	ILocationSetupInfo getLocationSetupInfo(long loginId, int instanceId);

	IPluginDetails getLocationCoordinatePlugin(long loginId, int instanceId);

	IPluginDetails getLocationGenerationPlugin(long loginId, int instanceId);

	Boolean setLocationProperty(long loginId, int instanceId, int locationId, int playerId, String key, String value);

	List<ILocationProperty> getLocationPropertyList(long loginId, int instanceId, int playerId, int locationId);

	int[] getLocationIdsForPlayer(long loginId, int instanceId, int playerId);

	Boolean checkRenameLocation(long loginId, int instanceId, int locationId, String name);
}
