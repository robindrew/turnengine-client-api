package com.turnengine.client.api.local.faction;

import static com.turnengine.client.api.local.faction.FactionUnited.DIVIDED;
import static com.turnengine.client.api.local.faction.FactionUnited.UNITED;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FactionCacheTest {

	@Test
	public void testFactionCache() {

		IFactionCache cache = new FactionCache();
		Assert.assertTrue(cache.isEmpty());

		IFaction faction0 = new Faction(0, "faction0", "", DIVIDED, 0);
		IFaction faction1 = new Faction(1, "faction1", "", DIVIDED, 0);

		cache.add(faction0);
		cache.add(faction1);

		Assert.assertEquals(2, cache.size());
		Assert.assertEquals(faction0, cache.getById(0));
		Assert.assertEquals(faction1, cache.getById(1));
		Assert.assertEquals(faction0, cache.getByName("faction0"));
		Assert.assertEquals(faction1, cache.getByName("faction1"));

		List<IFaction> divided = cache.getByUnited(DIVIDED);
		Assert.assertEquals(2, divided.size());
		Assert.assertTrue(divided.contains(faction0));
		Assert.assertTrue(divided.contains(faction1));

		List<IFaction> united = cache.getByUnited(UNITED);
		Assert.assertEquals(0, united.size());
		Assert.assertFalse(united.contains(faction0));
		Assert.assertFalse(united.contains(faction1));
	}

}
