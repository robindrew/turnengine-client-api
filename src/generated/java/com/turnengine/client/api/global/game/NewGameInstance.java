package com.turnengine.client.api.global.game;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class NewGameInstance implements INewGameInstance {

	/** The loginId field. */
	private long loginId = 0l;
	/** The gameName field. */
	private String gameName = null;
	/** The versionName field. */
	private String versionName = null;
	/** The instanceName field. */
	private String instanceName = null;
	/** The hostId field. */
	private int hostId = 0;

	/**
	 * The empty constructor.
	 */
	public NewGameInstance() {
	}

	/**
	 * The fields constructor.
	 */
	public NewGameInstance(long loginId, String gameName, String versionName, String instanceName, int hostId) {
		setLoginId(loginId);
		setGameName(gameName);
		setVersionName(versionName);
		setInstanceName(instanceName);
		setHostId(hostId);
	}

	/**
	 * The clone constructor.
	 */
	public NewGameInstance(INewGameInstance clone) {
		setLoginId(clone.getLoginId());
		setGameName(clone.getGameName());
		setVersionName(clone.getVersionName());
		setInstanceName(clone.getInstanceName());
		setHostId(clone.getHostId());
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
	 * Getter for the gameName field.
	 * @return the value of the gameName field.
	 */
	@Override
	public String getGameName() {
		return gameName;
	}

	/**
	 * Getter for the versionName field.
	 * @return the value of the versionName field.
	 */
	@Override
	public String getVersionName() {
		return versionName;
	}

	/**
	 * Getter for the instanceName field.
	 * @return the value of the instanceName field.
	 */
	@Override
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * Getter for the hostId field.
	 * @return the value of the hostId field.
	 */
	@Override
	public int getHostId() {
		return hostId;
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
	 * Setter for the gameName field.
	 * @param gameName the gameName value to set.
	 */
	@Override
	public void setGameName(String gameName) {
		if (gameName == null) {
			throw new NullPointerException("gameName");
		}
		if (gameName.length() < 4) {
			throw new IllegalArgumentException("gameName too short, minimum of 4 characters, value: '" + gameName + "'");
		}
		if (gameName.length() > 40) {
			throw new IllegalArgumentException("gameName too long, maximum of 40 characters, value: '" + gameName + "'");
		}
		this.gameName = gameName;
	}

	/**
	 * Setter for the versionName field.
	 * @param versionName the versionName value to set.
	 */
	@Override
	public void setVersionName(String versionName) {
		if (versionName == null) {
			throw new NullPointerException("versionName");
		}
		if (versionName.length() < 4) {
			throw new IllegalArgumentException("versionName too short, minimum of 4 characters, value: '" + versionName + "'");
		}
		if (versionName.length() > 40) {
			throw new IllegalArgumentException("versionName too long, maximum of 40 characters, value: '" + versionName + "'");
		}
		this.versionName = versionName;
	}

	/**
	 * Setter for the instanceName field.
	 * @param instanceName the instanceName value to set.
	 */
	@Override
	public void setInstanceName(String instanceName) {
		if (instanceName == null) {
			throw new NullPointerException("instanceName");
		}
		if (instanceName.length() < 4) {
			throw new IllegalArgumentException("instanceName too short, minimum of 4 characters, value: '" + instanceName + "'");
		}
		if (instanceName.length() > 40) {
			throw new IllegalArgumentException("instanceName too long, maximum of 40 characters, value: '" + instanceName + "'");
		}
		this.instanceName = instanceName;
	}

	/**
	 * Setter for the hostId field.
	 * @param hostId the hostId value to set.
	 */
	@Override
	public void setHostId(int hostId) {
		if (hostId < -1) {
			throw new IllegalArgumentException("hostId too small, minimum of -1, value: '" + hostId + "'");
		}
		this.hostId = hostId;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getGameName());
		builder.append(getVersionName());
		builder.append(getInstanceName());
		builder.append(getHostId());
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
		INewGameInstance that = (INewGameInstance) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getGameName(), that.getGameName());
		builder.append(this.getVersionName(), that.getVersionName());
		builder.append(this.getInstanceName(), that.getInstanceName());
		builder.append(this.getHostId(), that.getHostId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getGameName());
		builder.append(getVersionName());
		builder.append(getInstanceName());
		builder.append(getHostId());
		return builder.toString();
	}

	@Override
	public int compareTo(INewGameInstance that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getGameName(), that.getGameName());
		builder.append(this.getVersionName(), that.getVersionName());
		builder.append(this.getInstanceName(), that.getInstanceName());
		builder.append(this.getHostId(), that.getHostId());
		return builder.toComparison();
	}
}
