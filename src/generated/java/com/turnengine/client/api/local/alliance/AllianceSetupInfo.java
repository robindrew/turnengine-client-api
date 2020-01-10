package com.turnengine.client.api.local.alliance;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AllianceSetupInfo implements IAllianceSetupInfo {

	/** The count field. */
	private int count = 0;
	/** The enabled field. */
	private boolean enabled = false;
	/** The memberLimit field. */
	private int memberLimit = 0;
	/** The inviteLimit field. */
	private int inviteLimit = 0;
	/** The leaveTurns field. */
	private int leaveTurns = 0;

	/**
	 * The empty constructor.
	 */
	public AllianceSetupInfo() {
	}

	/**
	 * The fields constructor.
	 */
	public AllianceSetupInfo(int count, boolean enabled, int memberLimit, int inviteLimit, int leaveTurns) {
		setCount(count);
		setEnabled(enabled);
		setMemberLimit(memberLimit);
		setInviteLimit(inviteLimit);
		setLeaveTurns(leaveTurns);
	}

	/**
	 * The clone constructor.
	 */
	public AllianceSetupInfo(IAllianceSetupInfo clone) {
		setCount(clone.getCount());
		setEnabled(clone.getEnabled());
		setMemberLimit(clone.getMemberLimit());
		setInviteLimit(clone.getInviteLimit());
		setLeaveTurns(clone.getLeaveTurns());
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
	 * Getter for the count field.
	 * @return the value of the count field.
	 */
	@Override
	public int getCount() {
		return count;
	}

	/**
	 * Getter for the enabled field.
	 * @return the value of the enabled field.
	 */
	@Override
	public boolean getEnabled() {
		return enabled;
	}

	/**
	 * Getter for the memberLimit field.
	 * @return the value of the memberLimit field.
	 */
	@Override
	public int getMemberLimit() {
		return memberLimit;
	}

	/**
	 * Getter for the inviteLimit field.
	 * @return the value of the inviteLimit field.
	 */
	@Override
	public int getInviteLimit() {
		return inviteLimit;
	}

	/**
	 * Getter for the leaveTurns field.
	 * @return the value of the leaveTurns field.
	 */
	@Override
	public int getLeaveTurns() {
		return leaveTurns;
	}

	/**
	 * Setter for the count field.
	 * @param count the count value to set.
	 */
	@Override
	public void setCount(int count) {
		if (count < 0) {
			throw new IllegalArgumentException("count too small, minimum of 0, value: '" + count + "'");
		}
		this.count = count;
	}

	/**
	 * Setter for the enabled field.
	 * @param enabled the enabled value to set.
	 */
	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Setter for the memberLimit field.
	 * @param memberLimit the memberLimit value to set.
	 */
	@Override
	public void setMemberLimit(int memberLimit) {
		if (memberLimit < 0) {
			throw new IllegalArgumentException("memberLimit too small, minimum of 0, value: '" + memberLimit + "'");
		}
		this.memberLimit = memberLimit;
	}

	/**
	 * Setter for the inviteLimit field.
	 * @param inviteLimit the inviteLimit value to set.
	 */
	@Override
	public void setInviteLimit(int inviteLimit) {
		if (inviteLimit < 0) {
			throw new IllegalArgumentException("inviteLimit too small, minimum of 0, value: '" + inviteLimit + "'");
		}
		this.inviteLimit = inviteLimit;
	}

	/**
	 * Setter for the leaveTurns field.
	 * @param leaveTurns the leaveTurns value to set.
	 */
	@Override
	public void setLeaveTurns(int leaveTurns) {
		if (leaveTurns < -1) {
			throw new IllegalArgumentException("leaveTurns too small, minimum of -1, value: '" + leaveTurns + "'");
		}
		this.leaveTurns = leaveTurns;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getCount());
		builder.append(getEnabled());
		builder.append(getMemberLimit());
		builder.append(getInviteLimit());
		builder.append(getLeaveTurns());
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
		IAllianceSetupInfo that = (IAllianceSetupInfo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getCount(), that.getCount());
		builder.append(this.getEnabled(), that.getEnabled());
		builder.append(this.getMemberLimit(), that.getMemberLimit());
		builder.append(this.getInviteLimit(), that.getInviteLimit());
		builder.append(this.getLeaveTurns(), that.getLeaveTurns());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getCount());
		builder.append(getEnabled());
		builder.append(getMemberLimit());
		builder.append(getInviteLimit());
		builder.append(getLeaveTurns());
		return builder.toString();
	}

	@Override
	public int compareTo(IAllianceSetupInfo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getCount(), that.getCount());
		builder.append(this.getEnabled(), that.getEnabled());
		builder.append(this.getMemberLimit(), that.getMemberLimit());
		builder.append(this.getInviteLimit(), that.getInviteLimit());
		builder.append(this.getLeaveTurns(), that.getLeaveTurns());
		return builder.toComparison();
	}
}
