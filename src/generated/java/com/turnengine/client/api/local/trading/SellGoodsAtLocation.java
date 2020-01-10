package com.turnengine.client.api.local.trading;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SellGoodsAtLocation implements ISellGoodsAtLocation {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The locationId field. */
	private int locationId = 0;
	/** The goodsId field. */
	private int goodsId = 0;
	/** The goodsAmount field. */
	private long goodsAmount = 0l;
	/** The currencyId field. */
	private int currencyId = 0;

	/**
	 * The empty constructor.
	 */
	public SellGoodsAtLocation() {
	}

	/**
	 * The fields constructor.
	 */
	public SellGoodsAtLocation(long loginId, int instanceId, int locationId, int goodsId, long goodsAmount, int currencyId) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setLocationId(locationId);
		setGoodsId(goodsId);
		setGoodsAmount(goodsAmount);
		setCurrencyId(currencyId);
	}

	/**
	 * The clone constructor.
	 */
	public SellGoodsAtLocation(ISellGoodsAtLocation clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setLocationId(clone.getLocationId());
		setGoodsId(clone.getGoodsId());
		setGoodsAmount(clone.getGoodsAmount());
		setCurrencyId(clone.getCurrencyId());
	}

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	@Override
	public int getSerializationId() {
		return SERIALIZATION_ID;
	}

	/**
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	@Override
	public long getLoginId() {
		return loginId;
	}

	/**
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	@Override
	public int getInstanceId() {
		return instanceId;
	}

	/**
	 * Getter for the locationId field.
	 * @return the value of the locationId field.
	 */
	@Override
	public int getLocationId() {
		return locationId;
	}

	/**
	 * Getter for the goodsId field.
	 * @return the value of the goodsId field.
	 */
	@Override
	public int getGoodsId() {
		return goodsId;
	}

	/**
	 * Getter for the goodsAmount field.
	 * @return the value of the goodsAmount field.
	 */
	@Override
	public long getGoodsAmount() {
		return goodsAmount;
	}

	/**
	 * Getter for the currencyId field.
	 * @return the value of the currencyId field.
	 */
	@Override
	public int getCurrencyId() {
		return currencyId;
	}

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	@Override
	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	@Override
	public void setInstanceId(int instanceId) {
		if (instanceId < -1) {
			throw new IllegalArgumentException("instanceId too small, minimum of -1, value: '" + instanceId + "'");
		}
		this.instanceId = instanceId;
	}

	/**
	 * Setter for the locationId field.
	 * @param locationId the locationId value to set.
	 */
	@Override
	public void setLocationId(int locationId) {
		if (locationId < -1) {
			throw new IllegalArgumentException("locationId too small, minimum of -1, value: '" + locationId + "'");
		}
		this.locationId = locationId;
	}

	/**
	 * Setter for the goodsId field.
	 * @param goodsId the goodsId value to set.
	 */
	@Override
	public void setGoodsId(int goodsId) {
		if (goodsId < -1) {
			throw new IllegalArgumentException("goodsId too small, minimum of -1, value: '" + goodsId + "'");
		}
		this.goodsId = goodsId;
	}

	/**
	 * Setter for the goodsAmount field.
	 * @param goodsAmount the goodsAmount value to set.
	 */
	@Override
	public void setGoodsAmount(long goodsAmount) {
		if (goodsAmount < 0) {
			throw new IllegalArgumentException("goodsAmount too small, minimum of 0, value: '" + goodsAmount + "'");
		}
		this.goodsAmount = goodsAmount;
	}

	/**
	 * Setter for the currencyId field.
	 * @param currencyId the currencyId value to set.
	 */
	@Override
	public void setCurrencyId(int currencyId) {
		if (currencyId < -1) {
			throw new IllegalArgumentException("currencyId too small, minimum of -1, value: '" + currencyId + "'");
		}
		this.currencyId = currencyId;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getLocationId());
		builder.append(getGoodsId());
		builder.append(getGoodsAmount());
		builder.append(getCurrencyId());
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object object) {
		// Identity check
		if (object == this) {
			return true;
		}

		// Null check
		if (object == null) {
			return false;
		}

		// Compare types
		if (!this.getClass().equals(object.getClass())) {
			return false;
		}

		// Compare fields
		ISellGoodsAtLocation that = (ISellGoodsAtLocation) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getLocationId(), that.getLocationId());
		builder.append(this.getGoodsId(), that.getGoodsId());
		builder.append(this.getGoodsAmount(), that.getGoodsAmount());
		builder.append(this.getCurrencyId(), that.getCurrencyId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getLocationId());
		builder.append(getGoodsId());
		builder.append(getGoodsAmount());
		builder.append(getCurrencyId());
		return builder.toString();
	}

	@Override
	public int compareTo(ISellGoodsAtLocation that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getLocationId(), that.getLocationId());
		builder.append(this.getGoodsId(), that.getGoodsId());
		builder.append(this.getGoodsAmount(), that.getGoodsAmount());
		builder.append(this.getCurrencyId(), that.getCurrencyId());
		return builder.toComparison();
	}
}
