package com.turnengine.client.api.local.error;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class LocalTrace implements ILocalTrace {

	/** The id field. */
	private String id = null;
	/** The datetime field. */
	private long datetime = 0l;
	/** The trace field. */
	private String trace = null;

	/**
	 * The empty constructor.
	 */
	public LocalTrace() {
	}

	/**
	 * The fields constructor.
	 */
	public LocalTrace(String id, long datetime, String trace) {
		setId(id);
		setDatetime(datetime);
		setTrace(trace);
	}

	/**
	 * The clone constructor.
	 */
	public LocalTrace(ILocalTrace clone) {
		setId(clone.getId());
		setDatetime(clone.getDatetime());
		setTrace(clone.getTrace());
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
	public String getId() {
		return id;
	}

	/**
	 * Getter for the datetime field.
	 * @return the value of the datetime field.
	 */
	@Override
	public long getDatetime() {
		return datetime;
	}

	/**
	 * Getter for the trace field.
	 * @return the value of the trace field.
	 */
	@Override
	public String getTrace() {
		return trace;
	}

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(String id) {
		if (id == null) {
			throw new NullPointerException("id");
		}
		if (id.length() < 32) {
			throw new IllegalArgumentException("id too short, minimum of 32 characters, value: '" + id + "'");
		}
		if (id.length() > 32) {
			throw new IllegalArgumentException("id too long, maximum of 32 characters, value: '" + id + "'");
		}
		this.id = id;
	}

	/**
	 * Setter for the datetime field.
	 * @param datetime the datetime value to set.
	 */
	@Override
	public void setDatetime(long datetime) {
		if (datetime < 0) {
			throw new IllegalArgumentException("datetime too small, minimum of 0, value: '" + datetime + "'");
		}
		this.datetime = datetime;
	}

	/**
	 * Setter for the trace field.
	 * @param trace the trace value to set.
	 */
	@Override
	public void setTrace(String trace) {
		if (trace == null) {
			throw new NullPointerException("trace");
		}
		if (trace.length() < 1) {
			throw new IllegalArgumentException("trace too short, minimum of 1 characters, value: '" + trace + "'");
		}
		if (trace.length() > 80000) {
			throw new IllegalArgumentException("trace too long, maximum of 80000 characters, value: '" + trace + "'");
		}
		this.trace = trace;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getDatetime());
		builder.append(getTrace());
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
		ILocalTrace that = (ILocalTrace) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getDatetime(), that.getDatetime());
		builder.append(this.getTrace(), that.getTrace());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getDatetime());
		builder.append(getTrace());
		return builder.toString();
	}

	@Override
	public int compareTo(ILocalTrace that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getDatetime(), that.getDatetime());
		builder.append(this.getTrace(), that.getTrace());
		return builder.toComparison();
	}
}
