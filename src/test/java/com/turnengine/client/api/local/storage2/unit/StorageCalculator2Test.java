package com.turnengine.client.api.local.storage2.unit;

import static com.turnengine.client.api.local.storage.StorageType.ANY;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.robindrew.common.dependency.DependencyFactory;
import com.turnengine.client.api.local.faction.IFaction;
import com.turnengine.client.api.local.group.IGroup;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.storage2.calculator.IStorageAllocator;
import com.turnengine.client.api.local.storage2.calculator.IStorageCalculator2;
import com.turnengine.client.api.local.storage2.calculator.StorageAllocator;
import com.turnengine.client.api.local.test.TurnEngineClientTest;
import com.turnengine.client.api.local.unit.IUnit;

import junit.framework.Assert;

public class StorageCalculator2Test extends TurnEngineClientTest {

	private IFaction faction = addFaction("Faction");

	private IGroup resourceStorage = addParentGroup("ResourceStorage", faction);
	private IGroup fuelStorage = addParentGroup("FuelStorage", faction);
	private IGroup shipStorage = addParentGroup("ShipStorage", faction);

	private IUnit ships = addParentUnit("Ships");

	private IUnit freighter = addChildUnit("Freighter");
	private IUnit transport = addChildUnit("Transport");

	private IUnit metal = addChildUnit("Metal");
	private IUnit minerals = addChildUnit("Minerals");
	private IUnit fuel = addChildUnit("Fuel");

	@Before
	public void before() {
		setDependencies();
	}

	@After
	public void after() {
		DependencyFactory.clearDependencies();
	}

	@Test
	public void storeUnits() {
		IStorageCalculator2 calculator = getStorageCalculator2();
		IStorageAllocator allocator = new StorageAllocator(calculator);

		// Setup cache

		addStorageGroup(ships, shipStorage, 5, ANY);
		addStorageItem(ships, shipStorage, freighter, 1, 0);
		addStorageItem(ships, shipStorage, transport, 1, 0);

		addStorageGroup(freighter, resourceStorage, 5000, ANY);
		addStorageItem(freighter, resourceStorage, metal, 2, 0);
		addStorageItem(freighter, resourceStorage, minerals, 25, 0);

		addStorageGroup(freighter, fuelStorage, 200, ANY);
		addStorageItem(freighter, fuelStorage, fuel, 1, 0);

		addStorageGroup(transport, fuelStorage, 300, ANY);
		addStorageItem(transport, fuelStorage, fuel, 1, 0);

		// Create an empty unit
		IStorageUnit unit = new StorageUnit(ships, 1);

		Assert.assertEquals(0, calculator.getAmount(unit, freighter));
		Assert.assertEquals(0, calculator.getAmount(unit, metal));
		Assert.assertEquals(0, calculator.getAmount(unit, minerals));
		Assert.assertEquals(0, calculator.getAmount(unit, fuel));

		// Add a freighter
		allocator.addUnit(unit, StorageType.MOBILE, freighter, 1);

		Assert.assertTrue(calculator.contains(unit, freighter));
		Assert.assertEquals(1, calculator.getAmount(unit, freighter));

		// Add another freighter
		allocator.addUnit(unit, StorageType.MOBILE, freighter, 1);

		Assert.assertTrue(calculator.contains(unit, freighter));
		Assert.assertEquals(2, calculator.getAmount(unit, freighter));

		// Add some fuel
		allocator.addUnit(unit, StorageType.MOBILE, fuel, 100);

		Assert.assertTrue(calculator.contains(unit, fuel));
		Assert.assertEquals(100, calculator.getAmount(unit, fuel));

		// Add a transport
		allocator.addUnit(unit, StorageType.MOBILE, transport, 1);

		Assert.assertTrue(calculator.contains(unit, transport));
		Assert.assertEquals(1, calculator.getAmount(unit, transport));

		// Add some more fuel
		allocator.addUnit(unit, StorageType.MOBILE, fuel, 20, 2);
		System.out.println(unit);

		Assert.assertTrue(calculator.contains(unit, fuel));
		Assert.assertEquals(120, calculator.getAmount(unit, fuel));
	}

}
