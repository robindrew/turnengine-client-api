package com.turnengine.client.api.local.allianceforum;

import com.turnengine.client.api.global.forum.ForumFlag;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetAllianceForumFlag implements ISetAllianceForumFlag {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The forumId field. */
	private int forumId = 0;
	/** The flag field. */
	private ForumFlag flag = null;
	/** The set field. */
	private boolean set = false;

	/**
	 * The empty constructor.
	 */
	public SetAllianceForumFlag() {
	}

	/**
	 * The fields constructor.
	 */
	public SetAllianceForumFlag(long loginId, int instanceId, int forumId, ForumFlag flag, boolean set) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setForumId(forumId);
		setFlag(flag);
		setSet(set);
	}

	/**
	 * The clone constructor.
	 */
	public SetAllianceForumFlag(ISetAllianceForumFlag clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setForumId(clone.getForumId());
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
	 * Getter for the forumId field.
	 * @return the value of the forumId field.
	 */
	@Override
	public int getForumId() {
		return forumId;
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
	 * Setter for the forumId field.
	 * @param forumId the forumId value to set.
	 */
	@Override
	public void setForumId(int forumId) {
		if (forumId < -1) {
			throw new IllegalArgumentException("forumId too small, minimum of -1, value: '" + forumId + "'");
		}
		this.forumId = forumId;
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
		builder.append(getForumId());
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
		ISetAllianceForumFlag that = (ISetAllianceForumFlag) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getForumId(), that.getForumId());
		builder.append(this.getFlag(), that.getFlag());
		builder.append(this.getSet(), that.getSet());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getForumId());
		builder.append(getFlag());
		builder.append(getSet());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetAllianceForumFlag that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getForumId(), that.getForumId());
		builder.append(this.getFlag(), that.getFlag());
		builder.append(this.getSet(), that.getSet());
		return builder.toComparison();
	}
}
