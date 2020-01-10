package com.turnengine.client.api.local.mobile;

import com.turnengine.client.api.local.location.ILocationInfo;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class MobileQueueItem implements IMobileQueueItem {

	/** The id field. */
	private int id = 0;
	/** The type field. */
	private MobileQueueType type = null;
	/** The index field. */
	private int index = 0;
	/** The repeat field. */
	private boolean repeat = false;
	/** The location field. */
	private ILocationInfo location = null;
	/** The mobile field. */
	private IMobileInfo mobile = null;
	/** The turns field. */
	private int turns = 0;
	/** The unitList field. */
	private List<IUnitCount> unitList = null;

	/**
	 * The empty constructor.
	 */
	public MobileQueueItem() {
	}

	/**
	 * The fields constructor.
	 */
	public MobileQueueItem(int id, MobileQueueType type, int index, boolean repeat, ILocationInfo location, IMobileInfo mobile, int turns, List<IUnitCount> unitList) {
		setId(id);
		setType(type);
		setIndex(index);
		setRepeat(repeat);
		setLocation(location);
		setMobile(mobile);
		setTurns(turns);
		setUnitList(unitList);
	}

	/**
	 * The clone constructor.
	 */
	public MobileQueueItem(IMobileQueueItem clone) {
		setId(clone.getId());
		setType(clone.getType());
		setIndex(clone.getIndex());
		setRepeat(clone.getRepeat());
		setLocation(clone.getLocation());
		setMobile(clone.getMobile());
		setTurns(clone.getTurns());
		setUnitList(clone.getUnitList());
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
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	@Override
	public MobileQueueType getType() {
		return type;
	}

	/**
	 * Getter for the index field.
	 * @return the value of the index field.
	 */
	@Override
	public int getIndex() {
		return index;
	}

	/**
	 * Getter for the repeat field.
	 * @return the value of the repeat field.
	 */
	@Override
	public boolean getRepeat() {
		return repeat;
	}

	/**
	 * Getter for the location field.
	 * @return the value of the location field.
	 */
	@Override
	public ILocationInfo getLocation() {
		return location;
	}

	/**
	 * Getter for the mobile field.
	 * @return the value of the mobile field.
	 */
	@Override
	public IMobileInfo getMobile() {
		return mobile;
	}

	/**
	 * Getter for the turns field.
	 * @return the value of the turns field.
	 */
	@Override
	public int getTurns() {
		return turns;
	}

	/**
	 * Getter for the unitList field.
	 * @return the value of the unitList field.
	 */
	@Override
	public List<IUnitCount> getUnitList() {
		return unitList;
	}

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(int id) {
		if (id < -1) {
			throw new IllegalArgumentException("id too small, minimum of -1, value: '" + id + "'");
		}
		this.id = id;
	}

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	@Override
	public void setType(MobileQueueType type) {
		this.type = type;
	}

	/**
	 * Setter for the index field.
	 * @param index the index value to set.
	 */
	@Override
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Setter for the repeat field.
	 * @param repeat the repeat value to set.
	 */
	@Override
	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}

	/**
	 * Setter for the location field.
	 * @param location the location value to set.
	 */
	@Override
	public void setLocation(ILocationInfo location) {
		this.location = location;
	}

	/**
	 * Setter for the mobile field.
	 * @param mobile the mobile value to set.
	 */
	@Override
	public void setMobile(IMobileInfo mobile) {
		this.mobile = mobile;
	}

	/**
	 * Setter for the turns field.
	 * @param turns the turns value to set.
	 */
	@Override
	public void setTurns(int turns) {
		if (turns < -1) {
			throw new IllegalArgumentException("turns too small, minimum of -1, value: '" + turns + "'");
		}
		this.turns = turns;
	}

	/**
	 * Setter for the unitList field.
	 * @param unitList the unitList value to set.
	 */
	@Override
	public void setUnitList(List<IUnitCount> unitList) {
		this.unitList = unitList;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getType());
		builder.append(getIndex());
		builder.append(getRepeat());
		builder.append(getLocation());
		builder.append(getMobile());
		builder.append(getTurns());
		builder.append(getUnitList());
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
		IMobileQueueItem that = (IMobileQueueItem) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getType(), that.getType());
		builder.append(this.getIndex(), that.getIndex());
		builder.append(this.getRepeat(), that.getRepeat());
		builder.append(this.getLocation(), that.getLocation());
		builder.append(this.getMobile(), that.getMobile());
		builder.append(this.getTurns(), that.getTurns());
		builder.append(this.getUnitList(), that.getUnitList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getType());
		builder.append(getIndex());
		builder.append(getRepeat());
		builder.append(getLocation());
		builder.append(getMobile());
		builder.append(getTurns());
		builder.append(getUnitList());
		return builder.toString();
	}

	@Override
	public int compareTo(IMobileQueueItem that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getType(), that.getType());
		builder.append(this.getIndex(), that.getIndex());
		builder.append(this.getRepeat(), that.getRepeat());
		builder.append(this.getLocation(), that.getLocation());
		builder.append(this.getMobile(), that.getMobile());
		builder.append(this.getTurns(), that.getTurns());
		builder.append(this.getUnitList(), that.getUnitList());
		return builder.toComparison();
	}
}
