package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import com.turnengine.client.api.common.plugin.IPluginDetails;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public interface ILocalMobileExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	int createMobileAtLocation(long loginId, int instanceId, int locationId, String name);

	List<IMobile> listMobilesAtLocation(long loginId, int instanceId, int locationId);

	Boolean transferUnitsToMobile(long loginId, int instanceId, int mobileId, List<IUnitCount> unitList, boolean addToQueue, boolean repeat);

	Boolean transferUnitsFromMobile(long loginId, int instanceId, int mobileId, List<IUnitCount> unitList, boolean addToQueue, boolean repeat);

	List<IMobile> getMobileList(long loginId, int instanceId);

	IMobile getMobile(long loginId, int instanceId, int mobileId);

	Boolean moveMobile(long loginId, int instanceId, int mobileId, int locationId, boolean addToQueue, boolean repeat);

	Boolean destroyEmptyMobile(long loginId, int instanceId, int mobileId);

	int createMobileAtMobile(long loginId, int instanceId, int mobileId, String name);

	Boolean moveMobileToCoordinates(long loginId, int instanceId, int mobileId, int[] coordinates, boolean addToQueue, boolean repeat);

	Boolean transferUnitsBetweenMobiles(long loginId, int instanceId, int fromMobileId, int toMobileId, List<IUnitCount> unitList, boolean addToQueue, boolean repeat);

	Boolean renameMobile(long loginId, int instanceId, int mobileId, String name);

	Boolean addUnitsAtMobile(long loginId, int instanceId, int mobileId, int unitId, long amount);

	Boolean setCombatPlugin(long loginId, int instanceId, String name, String plugin);

	IMobileSetupInfo getMobileSetupInfo(long loginId, int instanceId);

	Boolean setMobilesEnabled(long loginId, int instanceId, boolean enabled);

	Boolean getMobilesEnabled(long loginId, int instanceId);

	IPluginDetails getCombatPlugin(long loginId, int instanceId);

	Boolean setMobileProperty(long loginId, int instanceId, int mobileId, String key, String value);

	List<IMobileProperty> getMobilePropertyList(long loginId, int instanceId, int mobileId);

	Boolean setMobileMovementPlugin(long loginId, int instanceId, String name, String plugin);

	Boolean clearMobileQueue(long loginId, int instanceId, int mobileId);

	Boolean waitMobile(long loginId, int instanceId, int mobileId, int waitTurns, boolean addToQueue, boolean repeat);

	List<IMobileQueueItem> getMobileQueueList(long loginId, int instanceId, int mobileId);

	Boolean setMobileWait(long loginId, int instanceId, int mobileId, int turns);

	Boolean setMobileMove(long loginId, int instanceId, int mobileId, int originId, int destinationId, int turns);

	int[] getMobileIdsForPlayer(long loginId, int instanceId, int playerId);
}
