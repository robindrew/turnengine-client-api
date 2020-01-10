package com.turnengine.client.api.local.location;

import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GeneratedLocation implements IGeneratedLocation {

	/** The name field. */
	private String name = null;
	/** The signup field. */
	private LocationSignup signup = null;
	/** The signupFactionId field. */
	private int signupFactionId = 0;
	/** The unitList field. */
	private List<IUnitCount> unitList = null;

	/**
	 * The empty constructor.
	 */
	public GeneratedLocation() {
	}

	/**
	 * The fields constructor.
	 */
	public GeneratedLocation(String name, LocationSignup signup, int signupFactionId, List<IUnitCount> unitList) {
		setName(name);
		setSignup(signup);
		setSignupFactionId(signupFactionId);
		setUnitList(unitList);
	}

	/**
	 * The clone constructor.
	 */
	public GeneratedLocation(IGeneratedLocation clone) {
		setName(clone.getName());
		setSignup(clone.getSignup());
		setSignupFactionId(clone.getSignupFactionId());
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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Getter for the signup field.
	 * @return the value of the signup field.
	 */
	@Override
	public LocationSignup getSignup() {
		return signup;
	}

	/**
	 * Getter for the signupFactionId field.
	 * @return the value of the signupFactionId field.
	 */
	@Override
	public int getSignupFactionId() {
		return signupFactionId;
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
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	@Override
	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException("name");
		}
		if (name.length() < 1) {
			throw new IllegalArgumentException("name too short, minimum of 1 characters, value: '" + name + "'");
		}
		if (name.length() > 25) {
			throw new IllegalArgumentException("name too long, maximum of 25 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the signup field.
	 * @param signup the signup value to set.
	 */
	@Override
	public void setSignup(LocationSignup signup) {
		this.signup = signup;
	}

	/**
	 * Setter for the signupFactionId field.
	 * @param signupFactionId the signupFactionId value to set.
	 */
	@Override
	public void setSignupFactionId(int signupFactionId) {
		if (signupFactionId < -1) {
			throw new IllegalArgumentException("signupFactionId too small, minimum of -1, value: '" + signupFactionId + "'");
		}
		this.signupFactionId = signupFactionId;
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
		builder.append(getName());
		builder.append(getSignup());
		builder.append(getSignupFactionId());
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
		IGeneratedLocation that = (IGeneratedLocation) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getSignup(), that.getSignup());
		builder.append(this.getSignupFactionId(), that.getSignupFactionId());
		builder.append(this.getUnitList(), that.getUnitList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getSignup());
		builder.append(getSignupFactionId());
		builder.append(getUnitList());
		return builder.toString();
	}

	@Override
	public int compareTo(IGeneratedLocation that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getSignup(), that.getSignup());
		builder.append(this.getSignupFactionId(), that.getSignupFactionId());
		builder.append(this.getUnitList(), that.getUnitList());
		return builder.toComparison();
	}
}
