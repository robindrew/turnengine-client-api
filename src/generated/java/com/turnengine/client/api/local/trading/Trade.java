package com.turnengine.client.api.local.trading;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Trade implements ITrade {

	/** The type field. */
	private TradingType type = null;
	/** The goodsId field. */
	private int goodsId = 0;
	/** The goodsAmount field. */
	private long goodsAmount = 0l;
	/** The currencyId field. */
	private int currencyId = 0;
	/** The currencyAmount field. */
	private long currencyAmount = 0l;

	/**
	 * The empty constructor.
	 */
	public Trade() {
	}

	/**
	 * The fields constructor.
	 */
	public Trade(TradingType type, int goodsId, long goodsAmount, int currencyId, long currencyAmount) {
		setType(type);
		setGoodsId(goodsId);
		setGoodsAmount(goodsAmount);
		setCurrencyId(currencyId);
		setCurrencyAmount(currencyAmount);
	}

	/**
	 * The clone constructor.
	 */
	public Trade(ITrade clone) {
		setType(clone.getType());
		setGoodsId(clone.getGoodsId());
		setGoodsAmount(clone.getGoodsAmount());
		setCurrencyId(clone.getCurrencyId());
		setCurrencyAmount(clone.getCurrencyAmount());
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
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	@Override
	public TradingType getType() {
		return type;
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
	 * Getter for the currencyAmount field.
	 * @return the value of the currencyAmount field.
	 */
	@Override
	public long getCurrencyAmount() {
		return currencyAmount;
	}

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	@Override
	public void setType(TradingType type) {
		this.type = type;
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

	/**
	 * Setter for the currencyAmount field.
	 * @param currencyAmount the currencyAmount value to set.
	 */
	@Override
	public void setCurrencyAmount(long currencyAmount) {
		if (currencyAmount < 0) {
			throw new IllegalArgumentException("currencyAmount too small, minimum of 0, value: '" + currencyAmount + "'");
		}
		this.currencyAmount = currencyAmount;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getType());
		builder.append(getGoodsId());
		builder.append(getGoodsAmount());
		builder.append(getCurrencyId());
		builder.append(getCurrencyAmount());
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
		ITrade that = (ITrade) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getType(), that.getType());
		builder.append(this.getGoodsId(), that.getGoodsId());
		builder.append(this.getGoodsAmount(), that.getGoodsAmount());
		builder.append(this.getCurrencyId(), that.getCurrencyId());
		builder.append(this.getCurrencyAmount(), that.getCurrencyAmount());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getType());
		builder.append(getGoodsId());
		builder.append(getGoodsAmount());
		builder.append(getCurrencyId());
		builder.append(getCurrencyAmount());
		return builder.toString();
	}

	@Override
	public int compareTo(ITrade that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getType(), that.getType());
		builder.append(this.getGoodsId(), that.getGoodsId());
		builder.append(this.getGoodsAmount(), that.getGoodsAmount());
		builder.append(this.getCurrencyId(), that.getCurrencyId());
		builder.append(this.getCurrencyAmount(), that.getCurrencyAmount());
		return builder.toComparison();
	}
}
