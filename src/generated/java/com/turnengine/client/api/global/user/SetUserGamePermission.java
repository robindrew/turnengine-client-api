package com.turnengine.client.api.global.user;

import com.turnengine.client.api.global.game.GameLevel;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetUserGamePermission implements ISetUserGamePermission {

	/** The loginId field. */
	private long loginId = 0l;
	/** The userId field. */
	private int userId = 0;
	/** The id field. */
	private int id = 0;
	/** The type field. */
	private UserPermissionType type = null;
	/** The level field. */
	private GameLevel level = null;

	/**
	 * The empty constructor.
	 */
	public SetUserGamePermission() {
	}

	/**
	 * The fields constructor.
	 */
	public SetUserGamePermission(long loginId, int userId, int id, UserPermissionType type, GameLevel level) {
		setLoginId(loginId);
		setUserId(userId);
		setId(id);
		setType(type);
		setLevel(level);
	}

	/**
	 * The clone constructor.
	 */
	public SetUserGamePermission(ISetUserGamePermission clone) {
		setLoginId(clone.getLoginId());
		setUserId(clone.getUserId());
		setId(clone.getId());
		setType(clone.getType());
		setLevel(clone.getLevel());
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
	 * Getter for the userId field.
	 * @return the value of the userId field.
	 */
	@Override
	public int getUserId() {
		return userId;
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
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	@Override
	public UserPermissionType getType() {
		return type;
	}

	/**
	 * Getter for the level field.
	 * @return the value of the level field.
	 */
	@Override
	public GameLevel getLevel() {
		return level;
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
	 * Setter for the userId field.
	 * @param userId the userId value to set.
	 */
	@Override
	public void setUserId(int userId) {
		if (userId < -1) {
			throw new IllegalArgumentException("userId too small, minimum of -1, value: '" + userId + "'");
		}
		this.userId = userId;
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
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	@Override
	public void setType(UserPermissionType type) {
		this.type = type;
	}

	/**
	 * Setter for the level field.
	 * @param level the level value to set.
	 */
	@Override
	public void setLevel(GameLevel level) {
		this.level = level;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getUserId());
		builder.append(getId());
		builder.append(getType());
		builder.append(getLevel());
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
		ISetUserGamePermission that = (ISetUserGamePermission) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getUserId(), that.getUserId());
		builder.append(this.getId(), that.getId());
		builder.append(this.getType(), that.getType());
		builder.append(this.getLevel(), that.getLevel());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getUserId());
		builder.append(getId());
		builder.append(getType());
		builder.append(getLevel());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetUserGamePermission that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getUserId(), that.getUserId());
		builder.append(this.getId(), that.getId());
		builder.append(this.getType(), that.getType());
		builder.append(this.getLevel(), that.getLevel());
		return builder.toComparison();
	}
}
