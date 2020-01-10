package com.turnengine.client.api.local.location;

import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Grid implements IGrid {

	/** The width field. */
	private int width = 0;
	/** The height field. */
	private int height = 0;
	/** The startLocationId field. */
	private int startLocationId = 0;
	/** The finishLocationId field. */
	private int finishLocationId = 0;
	/** The gridList field. */
	private List<IGrid> gridList = null;

	/**
	 * The empty constructor.
	 */
	public Grid() {
	}

	/**
	 * The fields constructor.
	 */
	public Grid(int width, int height, int startLocationId, int finishLocationId, List<IGrid> gridList) {
		setWidth(width);
		setHeight(height);
		setStartLocationId(startLocationId);
		setFinishLocationId(finishLocationId);
		setGridList(gridList);
	}

	/**
	 * The clone constructor.
	 */
	public Grid(IGrid clone) {
		setWidth(clone.getWidth());
		setHeight(clone.getHeight());
		setStartLocationId(clone.getStartLocationId());
		setFinishLocationId(clone.getFinishLocationId());
		setGridList(clone.getGridList());
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
	 * Getter for the width field.
	 * @return the value of the width field.
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * Getter for the height field.
	 * @return the value of the height field.
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * Getter for the startLocationId field.
	 * @return the value of the startLocationId field.
	 */
	@Override
	public int getStartLocationId() {
		return startLocationId;
	}

	/**
	 * Getter for the finishLocationId field.
	 * @return the value of the finishLocationId field.
	 */
	@Override
	public int getFinishLocationId() {
		return finishLocationId;
	}

	/**
	 * Getter for the gridList field.
	 * @return the value of the gridList field.
	 */
	@Override
	public List<IGrid> getGridList() {
		return gridList;
	}

	/**
	 * Setter for the width field.
	 * @param width the width value to set.
	 */
	@Override
	public void setWidth(int width) {
		if (width < 0) {
			throw new IllegalArgumentException("width too small, minimum of 0, value: '" + width + "'");
		}
		this.width = width;
	}

	/**
	 * Setter for the height field.
	 * @param height the height value to set.
	 */
	@Override
	public void setHeight(int height) {
		if (height < 0) {
			throw new IllegalArgumentException("height too small, minimum of 0, value: '" + height + "'");
		}
		this.height = height;
	}

	/**
	 * Setter for the startLocationId field.
	 * @param startLocationId the startLocationId value to set.
	 */
	@Override
	public void setStartLocationId(int startLocationId) {
		if (startLocationId < -1) {
			throw new IllegalArgumentException("startLocationId too small, minimum of -1, value: '" + startLocationId + "'");
		}
		this.startLocationId = startLocationId;
	}

	/**
	 * Setter for the finishLocationId field.
	 * @param finishLocationId the finishLocationId value to set.
	 */
	@Override
	public void setFinishLocationId(int finishLocationId) {
		if (finishLocationId < -1) {
			throw new IllegalArgumentException("finishLocationId too small, minimum of -1, value: '" + finishLocationId + "'");
		}
		this.finishLocationId = finishLocationId;
	}

	/**
	 * Setter for the gridList field.
	 * @param gridList the gridList value to set.
	 */
	@Override
	public void setGridList(List<IGrid> gridList) {
		this.gridList = gridList;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getWidth());
		builder.append(getHeight());
		builder.append(getStartLocationId());
		builder.append(getFinishLocationId());
		builder.append(getGridList());
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
		IGrid that = (IGrid) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getWidth(), that.getWidth());
		builder.append(this.getHeight(), that.getHeight());
		builder.append(this.getStartLocationId(), that.getStartLocationId());
		builder.append(this.getFinishLocationId(), that.getFinishLocationId());
		builder.append(this.getGridList(), that.getGridList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getWidth());
		builder.append(getHeight());
		builder.append(getStartLocationId());
		builder.append(getFinishLocationId());
		builder.append(getGridList());
		return builder.toString();
	}

	@Override
	public int compareTo(IGrid that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getWidth(), that.getWidth());
		builder.append(this.getHeight(), that.getHeight());
		builder.append(this.getStartLocationId(), that.getStartLocationId());
		builder.append(this.getFinishLocationId(), that.getFinishLocationId());
		builder.append(this.getGridList(), that.getGridList());
		return builder.toComparison();
	}
}
