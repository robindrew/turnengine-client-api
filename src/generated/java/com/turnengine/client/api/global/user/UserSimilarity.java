package com.turnengine.client.api.global.user;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserSimilarity implements IUserSimilarity {

	/** The user1 field. */
	private IUser user1 = null;
	/** The user2 field. */
	private IUser user2 = null;
	/** The nameScore field. */
	private int nameScore = 0;
	/** The emailScore field. */
	private int emailScore = 0;
	/** The addressScore field. */
	private int addressScore = 0;
	/** The passwordScore field. */
	private int passwordScore = 0;

	/**
	 * The empty constructor.
	 */
	public UserSimilarity() {
	}

	/**
	 * The fields constructor.
	 */
	public UserSimilarity(IUser user1, IUser user2, int nameScore, int emailScore, int addressScore, int passwordScore) {
		setUser1(user1);
		setUser2(user2);
		setNameScore(nameScore);
		setEmailScore(emailScore);
		setAddressScore(addressScore);
		setPasswordScore(passwordScore);
	}

	/**
	 * The clone constructor.
	 */
	public UserSimilarity(IUserSimilarity clone) {
		setUser1(clone.getUser1());
		setUser2(clone.getUser2());
		setNameScore(clone.getNameScore());
		setEmailScore(clone.getEmailScore());
		setAddressScore(clone.getAddressScore());
		setPasswordScore(clone.getPasswordScore());
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
	 * Getter for the user1 field.
	 * @return the value of the user1 field.
	 */
	@Override
	public IUser getUser1() {
		return user1;
	}

	/**
	 * Getter for the user2 field.
	 * @return the value of the user2 field.
	 */
	@Override
	public IUser getUser2() {
		return user2;
	}

	/**
	 * Getter for the nameScore field.
	 * @return the value of the nameScore field.
	 */
	@Override
	public int getNameScore() {
		return nameScore;
	}

	/**
	 * Getter for the emailScore field.
	 * @return the value of the emailScore field.
	 */
	@Override
	public int getEmailScore() {
		return emailScore;
	}

	/**
	 * Getter for the addressScore field.
	 * @return the value of the addressScore field.
	 */
	@Override
	public int getAddressScore() {
		return addressScore;
	}

	/**
	 * Getter for the passwordScore field.
	 * @return the value of the passwordScore field.
	 */
	@Override
	public int getPasswordScore() {
		return passwordScore;
	}

	/**
	 * Setter for the user1 field.
	 * @param user1 the user1 value to set.
	 */
	@Override
	public void setUser1(IUser user1) {
		this.user1 = user1;
	}

	/**
	 * Setter for the user2 field.
	 * @param user2 the user2 value to set.
	 */
	@Override
	public void setUser2(IUser user2) {
		this.user2 = user2;
	}

	/**
	 * Setter for the nameScore field.
	 * @param nameScore the nameScore value to set.
	 */
	@Override
	public void setNameScore(int nameScore) {
		this.nameScore = nameScore;
	}

	/**
	 * Setter for the emailScore field.
	 * @param emailScore the emailScore value to set.
	 */
	@Override
	public void setEmailScore(int emailScore) {
		this.emailScore = emailScore;
	}

	/**
	 * Setter for the addressScore field.
	 * @param addressScore the addressScore value to set.
	 */
	@Override
	public void setAddressScore(int addressScore) {
		this.addressScore = addressScore;
	}

	/**
	 * Setter for the passwordScore field.
	 * @param passwordScore the passwordScore value to set.
	 */
	@Override
	public void setPasswordScore(int passwordScore) {
		this.passwordScore = passwordScore;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getUser1());
		builder.append(getUser2());
		builder.append(getNameScore());
		builder.append(getEmailScore());
		builder.append(getAddressScore());
		builder.append(getPasswordScore());
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
		IUserSimilarity that = (IUserSimilarity) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getUser1(), that.getUser1());
		builder.append(this.getUser2(), that.getUser2());
		builder.append(this.getNameScore(), that.getNameScore());
		builder.append(this.getEmailScore(), that.getEmailScore());
		builder.append(this.getAddressScore(), that.getAddressScore());
		builder.append(this.getPasswordScore(), that.getPasswordScore());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getUser1());
		builder.append(getUser2());
		builder.append(getNameScore());
		builder.append(getEmailScore());
		builder.append(getAddressScore());
		builder.append(getPasswordScore());
		return builder.toString();
	}

	@Override
	public int compareTo(IUserSimilarity that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getUser1(), that.getUser1());
		builder.append(this.getUser2(), that.getUser2());
		builder.append(this.getNameScore(), that.getNameScore());
		builder.append(this.getEmailScore(), that.getEmailScore());
		builder.append(this.getAddressScore(), that.getAddressScore());
		builder.append(this.getPasswordScore(), that.getPasswordScore());
		return builder.toComparison();
	}
}
