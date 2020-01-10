package com.turnengine.client.api.global.translation;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class NewTranslation implements INewTranslation {

	/** The loginId field. */
	private long loginId = 0l;
	/** The english field. */
	private String english = null;

	/**
	 * The empty constructor.
	 */
	public NewTranslation() {
	}

	/**
	 * The fields constructor.
	 */
	public NewTranslation(long loginId, String english) {
		setLoginId(loginId);
		setEnglish(english);
	}

	/**
	 * The clone constructor.
	 */
	public NewTranslation(INewTranslation clone) {
		setLoginId(clone.getLoginId());
		setEnglish(clone.getEnglish());
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
	 * Getter for the english field.
	 * @return the value of the english field.
	 */
	@Override
	public String getEnglish() {
		return english;
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
	 * Setter for the english field.
	 * @param english the english value to set.
	 */
	@Override
	public void setEnglish(String english) {
		if (english == null) {
			throw new NullPointerException("english");
		}
		if (english.length() < 1) {
			throw new IllegalArgumentException("english too short, minimum of 1 characters, value: '" + english + "'");
		}
		this.english = english;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getEnglish());
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
		INewTranslation that = (INewTranslation) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getEnglish(), that.getEnglish());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getEnglish());
		return builder.toString();
	}

	@Override
	public int compareTo(INewTranslation that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getEnglish(), that.getEnglish());
		return builder.toComparison();
	}
}
