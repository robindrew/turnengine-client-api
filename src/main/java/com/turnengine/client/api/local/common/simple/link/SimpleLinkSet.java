package com.turnengine.client.api.local.common.simple.link;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.simpleframework.xml.ElementList;

import com.turnengine.client.api.local.common.simple.SimpleAlliance;
import com.turnengine.client.api.local.common.simple.SimpleLocation;
import com.turnengine.client.api.local.common.simple.SimpleMobile;
import com.turnengine.client.api.local.common.simple.SimplePlayer;
import com.turnengine.client.api.local.common.simple.SimpleTyped;

public class SimpleLinkSet implements ISimpleLinkSet {

	@ElementList(entry = "Alliance", inline = true, required = false)
	private ArrayList<SimpleAlliance> allianceList = new ArrayList<SimpleAlliance>();
	@ElementList(entry = "Player", inline = true, required = false)
	private ArrayList<SimplePlayer> playerList = new ArrayList<SimplePlayer>();
	@ElementList(entry = "Location", inline = true, required = false)
	private ArrayList<SimpleLocation> locationList = new ArrayList<SimpleLocation>();
	@ElementList(entry = "Mobile", inline = true, required = false)
	private ArrayList<SimpleMobile> mobileList = new ArrayList<SimpleMobile>();

	@SuppressWarnings("unchecked")
	public <T extends SimpleTyped> List<T> getList(SimpleLinkType type) {
		switch (type) {
			case ALLIANCE:
				return (List<T>) allianceList;
			case PLAYER:
				return (List<T>) playerList;
			case LOCATION:
				return (List<T>) locationList;
			case MOBILE:
				return (List<T>) mobileList;
			default:
				throw new IllegalArgumentException("type not supported: " + type);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <T extends SimpleTyped> Set<T> getSet(SimpleLinkType type) {
		List<T> list = getList(type);
		// Maintain list order
		return new LinkedHashSet(list);
	}

	@Override
	public <T extends SimpleTyped> boolean add(T typed) {
		SimpleLinkType type = typed.getType();
		switch (type) {
			case ALLIANCE:
				return add(allianceList, (SimpleAlliance) typed);
			case PLAYER:
				return add(playerList, (SimplePlayer) typed);
			case LOCATION:
				return add(locationList, (SimpleLocation) typed);
			case MOBILE:
				return add(mobileList, (SimpleMobile) typed);
			default:
				throw new IllegalArgumentException("type not supported: " + type);
		}
	}

	private <T> boolean add(Collection<T> collection, T typed) {
		if (collection.contains(typed)) {
			return false;
		}
		return collection.add(typed);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends SimpleTyped> T get(int id, SimpleLinkType type) {
		switch (type) {
			case ALLIANCE:
				return (T) get(allianceList, id);
			case PLAYER:
				return (T) get(playerList, id);
			case LOCATION:
				return (T) get(locationList, id);
			case MOBILE:
				return (T) get(mobileList, id);
			default:
				throw new IllegalArgumentException("type not supported: " + type);
		}
	}

	private <T extends SimpleTyped> T get(Collection<T> set, int id) {
		for (T typed : set) {
			if (typed.getId() == id) {
				return typed;
			}
		}
		throw new IllegalArgumentException("id " + id + " not found in set: " + set);
	}

	@Override
	public <T extends SimpleTyped> void unlink(SimpleLink<T> link) {
		if (link != null) {
			link.unlink(this);
		}
	}

	@Override
	public <T extends SimpleTyped> void link(SimpleLink<T> link, SimpleLinkType type) {
		if (link != null) {
			link.link(this, type);
		}
	}

	public void link() {
		link(allianceList);
		link(playerList);
		link(locationList);
		link(mobileList);
	}

	public void unlink() {
		unlink(allianceList);
		unlink(playerList);
		unlink(locationList);
		unlink(mobileList);
	}

	private <T extends SimpleTyped> void unlink(Collection<T> set) {
		for (T typed : set) {
			typed.unlink(this);
		}
	}

	private <T extends SimpleTyped> void link(Collection<T> set) {
		for (T typed : set) {
			typed.link(this);
		}
	}

}
