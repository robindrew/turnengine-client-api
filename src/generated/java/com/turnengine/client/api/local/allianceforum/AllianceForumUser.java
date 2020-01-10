package com.turnengine.client.api.local.allianceforum;

import com.turnengine.client.api.global.user.UserPermissionType;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AllianceForumUser implements IAllianceForumUser {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The reputation field. */
	private int reputation = 0;
	/** The permissionList field. */
	private List<UserPermissionType> permissionList = null;

	/**
	 * The empty constructor.
	 */
	public AllianceForumUser() {
	}

	/**
	 * The fields constructor.
	 */
	public AllianceForumUser(int id, String name, int reputation, List<UserPermissionType> permissionList) {
		setId(id);
		setName(name);
		setReputation(reputation);
		setPermissionList(permissionList);
	}

	/**
	 * The clone constructor.
	 */
	public AllianceForumUser(IAllianceForumUser clone) {
		setId(clone.getId());
		setName(clone.getName());
		setReputation(clone.getReputation());
		setPermissionList(clone.getPermissionList());
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
	 * Getter for the reputation field.
	 * @return the value of the reputation field.
	 */
	@Override
	public int getReputation() {
		return reputation;
	}

	/**
	 * Getter for the permissionList field.
	 * @return the value of the permissionList field.
	 */
	@Override
	public List<UserPermissionType> getPermissionList() {
		return permissionList;
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
		if (name.length() > 40) {
			throw new IllegalArgumentException("name too long, maximum of 40 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the reputation field.
	 * @param reputation the reputation value to set.
	 */
	@Override
	public void setReputation(int reputation) {
		if (reputation < 0) {
			throw new IllegalArgumentException("reputation too small, minimum of 0, value: '" + reputation + "'");
		}
		this.reputation = reputation;
	}

	/**
	 * Setter for the permissionList field.
	 * @param permissionList the permissionList value to set.
	 */
	@Override
	public void setPermissionList(List<UserPermissionType> permissionList) {
		this.permissionList = permissionList;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getReputation());
		builder.append(getPermissionList());
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
		IAllianceForumUser that = (IAllianceForumUser) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getReputation(), that.getReputation());
		builder.append(this.getPermissionList(), that.getPermissionList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getReputation());
		builder.append(getPermissionList());
		return builder.toString();
	}

	@Override
	public int compareTo(IAllianceForumUser that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getReputation(), that.getReputation());
		builder.append(this.getPermissionList(), that.getPermissionList());
		return builder.toComparison();
	}
}
