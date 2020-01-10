package com.turnengine.client.api.local.common.simple;

import org.simpleframework.xml.Attribute;

import com.robindrew.common.xml.simple.SimpleObject;

public class SimpleUnitCount extends SimpleObject {

	@Attribute
	private int id = -1;
	@Attribute
	private String name = null;
	@Attribute
	private long amount = 0;
	@Attribute(required = false)
	private Long amountAfter = null;

	public SimpleUnitCount() {
	}

	public SimpleUnitCount(int id, String name, long amount) {
		setId(id);
		setName(name);
		setAmount(amount);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public void setAmountAfter(long amount) {
		this.amountAfter = amount;
	}

	public long getAmountAfter() {
		return amountAfter;
	}

	public boolean hasAmountAfter() {
		return amountAfter != null;
	}

}
