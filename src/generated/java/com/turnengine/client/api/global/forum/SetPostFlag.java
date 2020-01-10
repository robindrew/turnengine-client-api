package com.turnengine.client.api.global.forum;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetPostFlag implements ISetPostFlag {

	/** The loginId field. */
	private long loginId = 0l;
	/** The postId field. */
	private int postId = 0;
	/** The flag field. */
	private ForumFlag flag = null;
	/** The set field. */
	private boolean set = false;

	/**
	 * The empty constructor.
	 */
	public SetPostFlag() {
	}

	/**
	 * The fields constructor.
	 */
	public SetPostFlag(long loginId, int postId, ForumFlag flag, boolean set) {
		setLoginId(loginId);
		setPostId(postId);
		setFlag(flag);
		setSet(set);
	}

	/**
	 * The clone constructor.
	 */
	public SetPostFlag(ISetPostFlag clone) {
		setLoginId(clone.getLoginId());
		setPostId(clone.getPostId());
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
	 * Getter for the postId field.
	 * @return the value of the postId field.
	 */
	@Override
	public int getPostId() {
		return postId;
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
	 * Setter for the postId field.
	 * @param postId the postId value to set.
	 */
	@Override
	public void setPostId(int postId) {
		if (postId < -1) {
			throw new IllegalArgumentException("postId too small, minimum of -1, value: '" + postId + "'");
		}
		this.postId = postId;
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
		builder.append(getPostId());
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
		ISetPostFlag that = (ISetPostFlag) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getPostId(), that.getPostId());
		builder.append(this.getFlag(), that.getFlag());
		builder.append(this.getSet(), that.getSet());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getPostId());
		builder.append(getFlag());
		builder.append(getSet());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetPostFlag that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getPostId(), that.getPostId());
		builder.append(this.getFlag(), that.getFlag());
		builder.append(this.getSet(), that.getSet());
		return builder.toComparison();
	}
}
