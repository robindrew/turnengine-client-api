package com.turnengine.client.api.local.score;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetAllianceRankingList implements IGetAllianceRankingList {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The groupId field. */
	private int groupId = 0;
	/** The pageNumber field. */
	private int pageNumber = 0;
	/** The pageSize field. */
	private int pageSize = 0;

	/**
	 * The empty constructor.
	 */
	public GetAllianceRankingList() {
	}

	/**
	 * The fields constructor.
	 */
	public GetAllianceRankingList(long loginId, int instanceId, int groupId, int pageNumber, int pageSize) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setGroupId(groupId);
		setPageNumber(pageNumber);
		setPageSize(pageSize);
	}

	/**
	 * The clone constructor.
	 */
	public GetAllianceRankingList(IGetAllianceRankingList clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setGroupId(clone.getGroupId());
		setPageNumber(clone.getPageNumber());
		setPageSize(clone.getPageSize());
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
	 * Getter for the groupId field.
	 * @return the value of the groupId field.
	 */
	@Override
	public int getGroupId() {
		return groupId;
	}

	/**
	 * Getter for the pageNumber field.
	 * @return the value of the pageNumber field.
	 */
	@Override
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * Getter for the pageSize field.
	 * @return the value of the pageSize field.
	 */
	@Override
	public int getPageSize() {
		return pageSize;
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
	 * Setter for the groupId field.
	 * @param groupId the groupId value to set.
	 */
	@Override
	public void setGroupId(int groupId) {
		if (groupId < -1) {
			throw new IllegalArgumentException("groupId too small, minimum of -1, value: '" + groupId + "'");
		}
		this.groupId = groupId;
	}

	/**
	 * Setter for the pageNumber field.
	 * @param pageNumber the pageNumber value to set.
	 */
	@Override
	public void setPageNumber(int pageNumber) {
		if (pageNumber < 1) {
			throw new IllegalArgumentException("pageNumber too small, minimum of 1, value: '" + pageNumber + "'");
		}
		this.pageNumber = pageNumber;
	}

	/**
	 * Setter for the pageSize field.
	 * @param pageSize the pageSize value to set.
	 */
	@Override
	public void setPageSize(int pageSize) {
		if (pageSize < 1) {
			throw new IllegalArgumentException("pageSize too small, minimum of 1, value: '" + pageSize + "'");
		}
		this.pageSize = pageSize;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getGroupId());
		builder.append(getPageNumber());
		builder.append(getPageSize());
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
		IGetAllianceRankingList that = (IGetAllianceRankingList) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getPageNumber(), that.getPageNumber());
		builder.append(this.getPageSize(), that.getPageSize());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getGroupId());
		builder.append(getPageNumber());
		builder.append(getPageSize());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetAllianceRankingList that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getPageNumber(), that.getPageNumber());
		builder.append(this.getPageSize(), that.getPageSize());
		return builder.toComparison();
	}
}
