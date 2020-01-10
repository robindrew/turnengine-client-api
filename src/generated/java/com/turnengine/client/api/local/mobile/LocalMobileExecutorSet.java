package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.common.plugin.IPluginDetails;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public class LocalMobileExecutorSet implements ILocalMobileExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalMobileExecutorSet(IBeanExecutorLocator locator) {
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
	public int createMobileAtLocation(long loginId, int instanceId, int locationId, String name) {
		CreateMobileAtLocation bean = new CreateMobileAtLocation(loginId, instanceId, locationId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IMobile> listMobilesAtLocation(long loginId, int instanceId, int locationId) {
		ListMobilesAtLocation bean = new ListMobilesAtLocation(loginId, instanceId, locationId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean transferUnitsToMobile(long loginId, int instanceId, int mobileId, List<IUnitCount> unitList, boolean addToQueue, boolean repeat) {
		TransferUnitsToMobile bean = new TransferUnitsToMobile(loginId, instanceId, mobileId, unitList, addToQueue, repeat);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean transferUnitsFromMobile(long loginId, int instanceId, int mobileId, List<IUnitCount> unitList, boolean addToQueue, boolean repeat) {
		TransferUnitsFromMobile bean = new TransferUnitsFromMobile(loginId, instanceId, mobileId, unitList, addToQueue, repeat);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IMobile> getMobileList(long loginId, int instanceId) {
		GetMobileList bean = new GetMobileList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IMobile getMobile(long loginId, int instanceId, int mobileId) {
		GetMobile bean = new GetMobile(loginId, instanceId, mobileId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean moveMobile(long loginId, int instanceId, int mobileId, int locationId, boolean addToQueue, boolean repeat) {
		MoveMobile bean = new MoveMobile(loginId, instanceId, mobileId, locationId, addToQueue, repeat);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean destroyEmptyMobile(long loginId, int instanceId, int mobileId) {
		DestroyEmptyMobile bean = new DestroyEmptyMobile(loginId, instanceId, mobileId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int createMobileAtMobile(long loginId, int instanceId, int mobileId, String name) {
		CreateMobileAtMobile bean = new CreateMobileAtMobile(loginId, instanceId, mobileId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean moveMobileToCoordinates(long loginId, int instanceId, int mobileId, int[] coordinates, boolean addToQueue, boolean repeat) {
		MoveMobileToCoordinates bean = new MoveMobileToCoordinates(loginId, instanceId, mobileId, coordinates, addToQueue, repeat);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean transferUnitsBetweenMobiles(long loginId, int instanceId, int fromMobileId, int toMobileId, List<IUnitCount> unitList, boolean addToQueue, boolean repeat) {
		TransferUnitsBetweenMobiles bean = new TransferUnitsBetweenMobiles(loginId, instanceId, fromMobileId, toMobileId, unitList, addToQueue, repeat);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean renameMobile(long loginId, int instanceId, int mobileId, String name) {
		RenameMobile bean = new RenameMobile(loginId, instanceId, mobileId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean addUnitsAtMobile(long loginId, int instanceId, int mobileId, int unitId, long amount) {
		AddUnitsAtMobile bean = new AddUnitsAtMobile(loginId, instanceId, mobileId, unitId, amount);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setCombatPlugin(long loginId, int instanceId, String name, String plugin) {
		SetCombatPlugin bean = new SetCombatPlugin(loginId, instanceId, name, plugin);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IMobileSetupInfo getMobileSetupInfo(long loginId, int instanceId) {
		GetMobileSetupInfo bean = new GetMobileSetupInfo(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setMobilesEnabled(long loginId, int instanceId, boolean enabled) {
		SetMobilesEnabled bean = new SetMobilesEnabled(loginId, instanceId, enabled);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean getMobilesEnabled(long loginId, int instanceId) {
		GetMobilesEnabled bean = new GetMobilesEnabled(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IPluginDetails getCombatPlugin(long loginId, int instanceId) {
		GetCombatPlugin bean = new GetCombatPlugin(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setMobileProperty(long loginId, int instanceId, int mobileId, String key, String value) {
		SetMobileProperty bean = new SetMobileProperty(loginId, instanceId, mobileId, key, value);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IMobileProperty> getMobilePropertyList(long loginId, int instanceId, int mobileId) {
		GetMobilePropertyList bean = new GetMobilePropertyList(loginId, instanceId, mobileId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setMobileMovementPlugin(long loginId, int instanceId, String name, String plugin) {
		SetMobileMovementPlugin bean = new SetMobileMovementPlugin(loginId, instanceId, name, plugin);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean clearMobileQueue(long loginId, int instanceId, int mobileId) {
		ClearMobileQueue bean = new ClearMobileQueue(loginId, instanceId, mobileId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean waitMobile(long loginId, int instanceId, int mobileId, int waitTurns, boolean addToQueue, boolean repeat) {
		WaitMobile bean = new WaitMobile(loginId, instanceId, mobileId, waitTurns, addToQueue, repeat);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IMobileQueueItem> getMobileQueueList(long loginId, int instanceId, int mobileId) {
		GetMobileQueueList bean = new GetMobileQueueList(loginId, instanceId, mobileId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setMobileWait(long loginId, int instanceId, int mobileId, int turns) {
		SetMobileWait bean = new SetMobileWait(loginId, instanceId, mobileId, turns);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setMobileMove(long loginId, int instanceId, int mobileId, int originId, int destinationId, int turns) {
		SetMobileMove bean = new SetMobileMove(loginId, instanceId, mobileId, originId, destinationId, turns);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public int[] getMobileIdsForPlayer(long loginId, int instanceId, int playerId) {
		GetMobileIdsForPlayer bean = new GetMobileIdsForPlayer(loginId, instanceId, playerId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
