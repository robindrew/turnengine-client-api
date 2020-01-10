package com.turnengine.client.api.local.storage.calculator;

import static com.turnengine.client.api.local.storage.StorageType.ANY;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.turnengine.client.api.local.faction.IFaction;
import com.turnengine.client.api.local.group.IGroup;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.test.TurnEngineClientTest;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.SingleParentUnit;
import com.turnengine.client.api.local.unit.list.UnitList;

public class StorageCalculatorTest extends TurnEngineClientTest {

	private IFaction faction = addFaction("Faction");

	private IGroup group1 = addParentGroup("Group1", faction);
	private IGroup group2 = addParentGroup("Group2", faction);

	private IUnit parent0 = addParentUnit("Parent0");
	private IUnit parent1 = addParentUnit("Parent1");

	private IUnit child0 = addChildUnit("Child0");
	private IUnit child1 = addChildUnit("Child1");
	private IUnit child2 = addChildUnit("Child2");

	@Test
	public void storeUnits() {
		IStorageCalculator storage = getStorageCalculator();

		// Setup cache
		addStorageGroup(parent0, group1, 100, ANY);
		addStorageGroup(parent0, group2, 9999, ANY);
		addStorageItem(parent0, group1, child0, 2, 0);
		addStorageItem(parent0, group1, child2, 25, 0);

		assertEquals(2, getStorageSize(parent0, child0));
		assertEquals(0, getStorageSize(parent0, child1));
		assertEquals(25, getStorageSize(parent0, child2));

		IUnitList list = new UnitList(UnitType.PLAYER);
		assertFalse(storage.contains(list, parent0));
		assertFalse(storage.contains(list, parent1));
		list.addParentAmount(parent0, 8);
		assertTrue(storage.contains(list, parent0));
		assertFalse(storage.contains(list, parent1));
		list.addParentAmount(parent0, 5);
		list.addParentAmount(parent1, 3);
		assertTrue(storage.contains(list, parent0));
		assertTrue(storage.contains(list, parent1));

		assertEquals(13, list.getParentAmount(parent0));
		assertEquals(3, list.getParentAmount(parent1));

		assertEquals(650, storage.getAmountCanAdd(list, child0, StorageType.ANY));
		assertEquals(0, storage.getAmountCanAdd(list, child1, StorageType.ANY));
		assertEquals(52, storage.getAmountCanAdd(list, child2, StorageType.ANY));

		assertFalse(storage.contains(list, child0));
		System.out.println(list);

		storage.addAmount(list, child0, 50, StorageType.ANY);

		assertTrue(storage.contains(list, child0));
		assertEquals(600, storage.getAmountCanAdd(list, child0, StorageType.ANY));
		assertEquals(0, storage.getAmountCanAdd(list, child1, StorageType.ANY));
		assertEquals(48, storage.getAmountCanAdd(list, child2, StorageType.ANY));

		assertFalse(storage.contains(list, child2));

		storage.addAmount(list, child2, 1, StorageType.ANY);

		assertTrue(storage.contains(list, child2));
		assertEquals(587, storage.getAmountCanAdd(list, child0, StorageType.ANY));
		assertEquals(0, storage.getAmountCanAdd(list, child1, StorageType.ANY));
		assertEquals(47, storage.getAmountCanAdd(list, child2, StorageType.ANY));

		long before = list.getChildAmount(child2);
		storage.addAmount(list, child2, 33, StorageType.ANY);
		assertEquals(before + 33, list.getChildAmount(child2));
	}

	@Test
	public void removeAndRemoveAll() {
		IStorageCalculator storage = getStorageCalculator();

		// Setup cache
		addStorageGroup(parent0, group1, 100, ANY);
		addStorageGroup(parent0, group2, 9999, ANY);
		addStorageItem(parent0, group1, child0, 2, 0);
		addStorageItem(parent0, group1, child2, 25, 0);

		IUnitList list = new UnitList(UnitType.PLAYER);
		list.addParentAmount(parent0, 8);
		list.addParentAmount(parent0, 5);
		list.addParentAmount(parent1, 3);

		storage.addAmount(list, child0, 76, StorageType.ANY);
		storage.addAmount(list, child2, 7, StorageType.ANY);

		assertEquals(13, list.getParentAmount(parent0));
		assertEquals(3, list.getParentAmount(parent1));
		assertEquals(76, list.getChildAmount(child0));
		assertEquals(7, list.getChildAmount(child2));

		storage.removeAmount(list, child2, 2);
		assertEquals(13, list.getParentAmount(parent0));
		assertEquals(3, list.getParentAmount(parent1));
		assertEquals(76, list.getChildAmount(child0));
		assertEquals(5, list.getChildAmount(child2));

		storage.removeAmount(list, child0, 5);
		assertEquals(13, list.getParentAmount(parent0));
		assertEquals(3, list.getParentAmount(parent1));
		assertEquals(71, list.getChildAmount(child0));
		assertEquals(5, list.getChildAmount(child2));

		storage.removeAmount(list, parent0, 9);
		assertEquals(4, list.getParentAmount(parent0));
		assertEquals(3, list.getParentAmount(parent1));
		assertEquals(71, list.getChildAmount(child0));
		assertEquals(5, list.getChildAmount(child2));

		storage.removeAll(list, child2);
		assertEquals(4, list.getParentAmount(parent0));
		assertEquals(3, list.getParentAmount(parent1));
		assertEquals(71, list.getChildAmount(child0));
		assertEquals(0, list.getChildAmount(child2));

		storage.removeAll(list, parent0);
		assertEquals(0, list.getParentAmount(parent0));
		assertEquals(3, list.getParentAmount(parent1));
		assertEquals(0, list.getChildAmount(child0));
		assertEquals(0, list.getChildAmount(child2));
	}

	@Test
	public void validityCheck() {
		IStorageCalculator storage = getStorageCalculator();

		IUnitList list = new UnitList(UnitType.PLAYER);
		list.addParent(new SingleParentUnit(parent0));
		assertTrue(storage.isValid(list));
		list.addParent(new SingleParentUnit(parent1));
		assertTrue(storage.isValid(list));

		// Add children as parents
		list.addParent(new SingleParentUnit(child1.getId()));
		assertFalse(storage.isValid(list));
		list.removeParentAtIndex(2);
		assertTrue(storage.isValid(list));
		list.addParent(new SingleParentUnit(child2.getId()));
		assertFalse(storage.isValid(list));
		list.removeParentAtIndex(2);
		assertTrue(storage.isValid(list));

		// Add parents as children
		list.getParentAtIndex(0).setChildAmount(parent0.getId(), 1);
		assertFalse(storage.isValid(list));
		list.getParentAtIndex(0).setChildAmount(parent0.getId(), 0);
		assertTrue(storage.isValid(list));

		// Setup storage
		addStorageGroup(parent0, group1, 50, ANY);
		addStorageGroup(parent0, group2, 100, ANY);
		addStorageItem(parent0, group1, child0, 2, 0);
		addStorageItem(parent0, group2, child1, 5, 0);
		addStorageItem(parent0, group2, child2, 25, 0);

		// // Overflow storage for one child
		// list.getParent(parent0, 0).setChildAmount(child0, 25);
		// assertTrue(storage.isValid(list));
		// list.getParent(parent0, 0).setChildAmount(child0, 26);
		// assertFalse(storage.isValid(list));
		//
		// // Overflow storage for multiple children in same group
		// list.getParent(parent0, 0).setChildAmount(child0, 25);
		// list.getParent(parent0, 0).setChildAmount(child1, 5);
		// list.getParent(parent0, 0).setChildAmount(child2, 3);
		// assertTrue(storage.isValid(list));
		// list.getParent(parent0, 0).setChildAmount(child2, 4);
		// assertFalse(storage.isValid(list));
		// list.getParent(parent0, 0).setChildAmount(child2, 3);
		// assertTrue(storage.isValid(list));
		// list.getParent(parent0, 0).setChildAmount(child1, 6);
		// assertFalse(storage.isValid(list));
	}

}
