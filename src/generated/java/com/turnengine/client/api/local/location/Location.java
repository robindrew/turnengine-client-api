package com.turnengine.client.api.local.location;

import com.turnengine.client.api.local.action.IActionExecuting;
import com.turnengine.client.api.local.mobile.IMobileInfo;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Location implements ILocation {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The coordinates field. */
	private int[] coordinates = null;
	/** The groupId field. */
	private int groupId = 0;
	/** The player field. */
	private IPlayerInfo player = null;
	/** The signup field. */
	private LocationSignup signup = null;
	/** The signupFactionId field. */
	private int signupFactionId = 0;
	/** The locationUnitList field. */
	private List<IUnitCount> locationUnitList = null;
	/** The mobileUnitList field. */
	private List<IUnitCount> mobileUnitList = null;
	/** The actionExecutingList field. */
	private List<IActionExecuting> actionExecutingList = null;
	/** The upkeepList field. */
	private List<IUnitCount> upkeepList = null;
	/** The mobileList field. */
	private List<IMobileInfo> mobileList = null;
	/** The previousId field. */
	private int previousId = 0;
	/** The nextId field. */
	private int nextId = 0;

	/**
	 * The empty constructor.
	 */
	public Location() {
	}

	/**
	 * The fields constructor.
	 */
	public Location(int id, String name, int[] coordinates, int groupId, IPlayerInfo player, LocationSignup signup, int signupFactionId, List<IUnitCount> locationUnitList, List<IUnitCount> mobileUnitList, List<IActionExecuting> actionExecutingList, List<IUnitCount> upkeepList, List<IMobileInfo> mobileList, int previousId, int nextId) {
		setId(id);
		setName(name);
		setCoordinates(coordinates);
		setGroupId(groupId);
		setPlayer(player);
		setSignup(signup);
		setSignupFactionId(signupFactionId);
		setLocationUnitList(locationUnitList);
		setMobileUnitList(mobileUnitList);
		setActionExecutingList(actionExecutingList);
		setUpkeepList(upkeepList);
		setMobileList(mobileList);
		setPreviousId(previousId);
		setNextId(nextId);
	}

	/**
	 * The clone constructor.
	 */
	public Location(ILocation clone) {
		setId(clone.getId());
		setName(clone.getName());
		setCoordinates(clone.getCoordinates());
		setGroupId(clone.getGroupId());
		setPlayer(clone.getPlayer());
		setSignup(clone.getSignup());
		setSignupFactionId(clone.getSignupFactionId());
		setLocationUnitList(clone.getLocationUnitList());
		setMobileUnitList(clone.getMobileUnitList());
		setActionExecutingList(clone.getActionExecutingList());
		setUpkeepList(clone.getUpkeepList());
		setMobileList(clone.getMobileList());
		setPreviousId(clone.getPreviousId());
		setNextId(clone.getNextId());
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
	public int getId() {
		return id;
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
	 * Getter for the coordinates field.
	 * @return the value of the coordinates field.
	 */
	@Override
	public int[] getCoordinates() {
		return coordinates;
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
	 * Getter for the player field.
	 * @return the value of the player field.
	 */
	@Override
	public IPlayerInfo getPlayer() {
		return player;
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
	 * Getter for the locationUnitList field.
	 * @return the value of the locationUnitList field.
	 */
	@Override
	public List<IUnitCount> getLocationUnitList() {
		return locationUnitList;
	}

	/**
	 * Getter for the mobileUnitList field.
	 * @return the value of the mobileUnitList field.
	 */
	@Override
	public List<IUnitCount> getMobileUnitList() {
		return mobileUnitList;
	}

	/**
	 * Getter for the actionExecutingList field.
	 * @return the value of the actionExecutingList field.
	 */
	@Override
	public List<IActionExecuting> getActionExecutingList() {
		return actionExecutingList;
	}

	/**
	 * Getter for the upkeepList field.
	 * @return the value of the upkeepList field.
	 */
	@Override
	public List<IUnitCount> getUpkeepList() {
		return upkeepList;
	}

	/**
	 * Getter for the mobileList field.
	 * @return the value of the mobileList field.
	 */
	@Override
	public List<IMobileInfo> getMobileList() {
		return mobileList;
	}

	/**
	 * Getter for the previousId field.
	 * @return the value of the previousId field.
	 */
	@Override
	public int getPreviousId() {
		return previousId;
	}

	/**
	 * Getter for the nextId field.
	 * @return the value of the nextId field.
	 */
	@Override
	public int getNextId() {
		return nextId;
	}

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(int id) {
		if (id < -1) {
			throw new IllegalArgumentException("id too small, minimum of -1, value: '" + id + "'");
		}
		this.id = id;
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
	 * Setter for the coordinates field.
	 * @param coordinates the coordinates value to set.
	 */
	@Override
	public void setCoordinates(int[] coordinates) {
		if (coordinates == null) {
			throw new NullPointerException("coordinates");
		}
		this.coordinates = coordinates;
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
	 * Setter for the player field.
	 * @param player the player value to set.
	 */
	@Override
	public void setPlayer(IPlayerInfo player) {
		this.player = player;
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
	 * Setter for the locationUnitList field.
	 * @param locationUnitList the locationUnitList value to set.
	 */
	@Override
	public void setLocationUnitList(List<IUnitCount> locationUnitList) {
		this.locationUnitList = locationUnitList;
	}

	/**
	 * Setter for the mobileUnitList field.
	 * @param mobileUnitList the mobileUnitList value to set.
	 */
	@Override
	public void setMobileUnitList(List<IUnitCount> mobileUnitList) {
		this.mobileUnitList = mobileUnitList;
	}

	/**
	 * Setter for the actionExecutingList field.
	 * @param actionExecutingList the actionExecutingList value to set.
	 */
	@Override
	public void setActionExecutingList(List<IActionExecuting> actionExecutingList) {
		this.actionExecutingList = actionExecutingList;
	}

	/**
	 * Setter for the upkeepList field.
	 * @param upkeepList the upkeepList value to set.
	 */
	@Override
	public void setUpkeepList(List<IUnitCount> upkeepList) {
		this.upkeepList = upkeepList;
	}

	/**
	 * Setter for the mobileList field.
	 * @param mobileList the mobileList value to set.
	 */
	@Override
	public void setMobileList(List<IMobileInfo> mobileList) {
		this.mobileList = mobileList;
	}

	/**
	 * Setter for the previousId field.
	 * @param previousId the previousId value to set.
	 */
	@Override
	public void setPreviousId(int previousId) {
		if (previousId < -1) {
			throw new IllegalArgumentException("previousId too small, minimum of -1, value: '" + previousId + "'");
		}
		this.previousId = previousId;
	}

	/**
	 * Setter for the nextId field.
	 * @param nextId the nextId value to set.
	 */
	@Override
	public void setNextId(int nextId) {
		if (nextId < -1) {
			throw new IllegalArgumentException("nextId too small, minimum of -1, value: '" + nextId + "'");
		}
		this.nextId = nextId;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getCoordinates());
		builder.append(getGroupId());
		builder.append(getPlayer());
		builder.append(getSignup());
		builder.append(getSignupFactionId());
		builder.append(getLocationUnitList());
		builder.append(getMobileUnitList());
		builder.append(getActionExecutingList());
		builder.append(getUpkeepList());
		builder.append(getMobileList());
		builder.append(getPreviousId());
		builder.append(getNextId());
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
		ILocation that = (ILocation) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getCoordinates(), that.getCoordinates());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getPlayer(), that.getPlayer());
		builder.append(this.getSignup(), that.getSignup());
		builder.append(this.getSignupFactionId(), that.getSignupFactionId());
		builder.append(this.getLocationUnitList(), that.getLocationUnitList());
		builder.append(this.getMobileUnitList(), that.getMobileUnitList());
		builder.append(this.getActionExecutingList(), that.getActionExecutingList());
		builder.append(this.getUpkeepList(), that.getUpkeepList());
		builder.append(this.getMobileList(), that.getMobileList());
		builder.append(this.getPreviousId(), that.getPreviousId());
		builder.append(this.getNextId(), that.getNextId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getCoordinates());
		builder.append(getGroupId());
		builder.append(getPlayer());
		builder.append(getSignup());
		builder.append(getSignupFactionId());
		builder.append(getLocationUnitList());
		builder.append(getMobileUnitList());
		builder.append(getActionExecutingList());
		builder.append(getUpkeepList());
		builder.append(getMobileList());
		builder.append(getPreviousId());
		builder.append(getNextId());
		return builder.toString();
	}

	@Override
	public int compareTo(ILocation that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getCoordinates(), that.getCoordinates());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getPlayer(), that.getPlayer());
		builder.append(this.getSignup(), that.getSignup());
		builder.append(this.getSignupFactionId(), that.getSignupFactionId());
		builder.append(this.getLocationUnitList(), that.getLocationUnitList());
		builder.append(this.getMobileUnitList(), that.getMobileUnitList());
		builder.append(this.getActionExecutingList(), that.getActionExecutingList());
		builder.append(this.getUpkeepList(), that.getUpkeepList());
		builder.append(this.getMobileList(), that.getMobileList());
		builder.append(this.getPreviousId(), that.getPreviousId());
		builder.append(this.getNextId(), that.getNextId());
		return builder.toComparison();
	}
}
