package com.turnengine.client.api.local.allianceforum;

import com.turnengine.client.api.global.forum.ForumFlag;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetAllianceThreadFlag implements ISetAllianceThreadFlag {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The threadId field. */
	private int threadId = 0;
	/** The flag field. */
	private ForumFlag flag = null;
	/** The set field. */
	private boolean set = false;

	/**
	 * The empty constructor.
	 */
	public SetAllianceThreadFlag() {
	}

	/**
	 * The fields constructor.
	 */
	public SetAllianceThreadFlag(long loginId, int instanceId, int threadId, ForumFlag flag, boolean set) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setThreadId(threadId);
		setFlag(flag);
		setSet(set);
	}

	/**
	 * The clone constructor.
	 */
	public SetAllianceThreadFlag(ISetAllianceThreadFlag clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setThreadId(clone.getThreadId());
		setFlag(clone.getFlag());
		setSet(clone.getSet());
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
	 * Getter for the threadId field.
	 * @return the value of the threadId field.
	 */
	@Override
	public int getThreadId() {
		return threadId;
	}

	/**
	 * Getter for the flag field.
	 * @return the value of the flag field.
	 */
	@Override
	public ForumFlag getFlag() {
		return flag;
	}

	/**
	 * Getter for the set field.
	 * @return the value of the set field.
	 */
	@Override
	public boolean getSet() {
		return set;
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
	 * Setter for the threadId field.
	 * @param threadId the threadId value to set.
	 */
	@Override
	public void setThreadId(int threadId) {
		if (threadId < -1) {
			throw new IllegalArgumentException("threadId too small, minimum of -1, value: '" + threadId + "'");
		}
		this.threadId = threadId;
	}

	/**
	 * Setter for the flag field.
	 * @param flag the flag value to set.
	 */
	@Override
	public void setFlag(ForumFlag flag) {
		this.flag = flag;
	}

	/**
	 * Setter for the set field.
	 * @param set the set value to set.
	 */
	@Override
	public void setSet(boolean set) {
		this.set = set;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getThreadId());
		builder.append(getFlag());
		builder.append(getSet());
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
		ISetAllianceThreadFlag that = (ISetAllianceThreadFlag) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getThreadId(), that.getThreadId());
		builder.append(this.getFlag(), that.getFlag());
		builder.append(this.getSet(), that.getSet());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getThreadId());
		builder.append(getFlag());
		builder.append(getSet());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetAllianceThreadFlag that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getThreadId(), that.getThreadId());
		builder.append(this.getFlag(), that.getFlag());
		builder.append(this.getSet(), that.getSet());
		return builder.toComparison();
	}
}
