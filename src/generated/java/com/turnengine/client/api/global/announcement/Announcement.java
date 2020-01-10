package com.turnengine.client.api.global.announcement;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Announcement implements IAnnouncement {

	/** The id field. */
	private int id = 0;
	/** The gameId field. */
	private int gameId = 0;
	/** The gameName field. */
	private String gameName = null;
	/** The versionId field. */
	private int versionId = 0;
	/** The versionName field. */
	private String versionName = null;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The instanceName field. */
	private String instanceName = null;
	/** The userId field. */
	private int userId = 0;
	/** The userName field. */
	private String userName = null;
	/** The timestamp field. */
	private long timestamp = 0l;
	/** The subject field. */
	private String subject = null;
	/** The body field. */
	private String body = null;

	/**
	 * The empty constructor.
	 */
	public Announcement() {
	}

	/**
	 * The fields constructor.
	 */
	public Announcement(int id, int gameId, String gameName, int versionId, String versionName, int instanceId, String instanceName, int userId, String userName, long timestamp, String subject, String body) {
		setId(id);
		setGameId(gameId);
		setGameName(gameName);
		setVersionId(versionId);
		setVersionName(versionName);
		setInstanceId(instanceId);
		setInstanceName(instanceName);
		setUserId(userId);
		setUserName(userName);
		setTimestamp(timestamp);
		setSubject(subject);
		setBody(body);
	}

	/**
	 * The clone constructor.
	 */
	public Announcement(IAnnouncement clone) {
		setId(clone.getId());
		setGameId(clone.getGameId());
		setGameName(clone.getGameName());
		setVersionId(clone.getVersionId());
		setVersionName(clone.getVersionName());
		setInstanceId(clone.getInstanceId());
		setInstanceName(clone.getInstanceName());
		setUserId(clone.getUserId());
		setUserName(clone.getUserName());
		setTimestamp(clone.getTimestamp());
		setSubject(clone.getSubject());
		setBody(clone.getBody());
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
	 * Getter for the gameId field.
	 * @return the value of the gameId field.
	 */
	@Override
	public int getGameId() {
		return gameId;
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
	 * Getter for the versionId field.
	 * @return the value of the versionId field.
	 */
	@Override
	public int getVersionId() {
		return versionId;
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
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	@Override
	public int getInstanceId() {
		return instanceId;
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
	 * Getter for the userId field.
	 * @return the value of the userId field.
	 */
	@Override
	public int getUserId() {
		return userId;
	}

	/**
	 * Getter for the userName field.
	 * @return the value of the userName field.
	 */
	@Override
	public String getUserName() {
		return userName;
	}

	/**
	 * Getter for the timestamp field.
	 * @return the value of the timestamp field.
	 */
	@Override
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * Getter for the subject field.
	 * @return the value of the subject field.
	 */
	@Override
	public String getSubject() {
		return subject;
	}

	/**
	 * Getter for the body field.
	 * @return the value of the body field.
	 */
	@Override
	public String getBody() {
		return body;
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
	 * Setter for the gameId field.
	 * @param gameId the gameId value to set.
	 */
	@Override
	public void setGameId(int gameId) {
		if (gameId < -1) {
			throw new IllegalArgumentException("gameId too small, minimum of -1, value: '" + gameId + "'");
		}
		this.gameId = gameId;
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
	 * Setter for the versionId field.
	 * @param versionId the versionId value to set.
	 */
	@Override
	public void setVersionId(int versionId) {
		if (versionId < -1) {
			throw new IllegalArgumentException("versionId too small, minimum of -1, value: '" + versionId + "'");
		}
		this.versionId = versionId;
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
	 * Setter for the userName field.
	 * @param userName the userName value to set.
	 */
	@Override
	public void setUserName(String userName) {
		if (userName == null) {
			throw new NullPointerException("userName");
		}
		if (userName.length() < 1) {
			throw new IllegalArgumentException("userName too short, minimum of 1 characters, value: '" + userName + "'");
		}
		if (userName.length() > 40) {
			throw new IllegalArgumentException("userName too long, maximum of 40 characters, value: '" + userName + "'");
		}
		this.userName = userName;
	}

	/**
	 * Setter for the timestamp field.
	 * @param timestamp the timestamp value to set.
	 */
	@Override
	public void setTimestamp(long timestamp) {
		if (timestamp < 0) {
			throw new IllegalArgumentException("timestamp too small, minimum of 0, value: '" + timestamp + "'");
		}
		this.timestamp = timestamp;
	}

	/**
	 * Setter for the subject field.
	 * @param subject the subject value to set.
	 */
	@Override
	public void setSubject(String subject) {
		if (subject == null) {
			throw new NullPointerException("subject");
		}
		if (subject.length() < 4) {
			throw new IllegalArgumentException("subject too short, minimum of 4 characters, value: '" + subject + "'");
		}
		if (subject.length() > 120) {
			throw new IllegalArgumentException("subject too long, maximum of 120 characters, value: '" + subject + "'");
		}
		this.subject = subject;
	}

	/**
	 * Setter for the body field.
	 * @param body the body value to set.
	 */
	@Override
	public void setBody(String body) {
		if (body == null) {
			throw new NullPointerException("body");
		}
		if (body.length() < 4) {
			throw new IllegalArgumentException("body too short, minimum of 4 characters, value: '" + body + "'");
		}
		if (body.length() > 60000) {
			throw new IllegalArgumentException("body too long, maximum of 60000 characters, value: '" + body + "'");
		}
		this.body = body;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getGameId());
		builder.append(getGameName());
		builder.append(getVersionId());
		builder.append(getVersionName());
		builder.append(getInstanceId());
		builder.append(getInstanceName());
		builder.append(getUserId());
		builder.append(getUserName());
		builder.append(getTimestamp());
		builder.append(getSubject());
		builder.append(getBody());
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
		IAnnouncement that = (IAnnouncement) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getGameId(), that.getGameId());
		builder.append(this.getGameName(), that.getGameName());
		builder.append(this.getVersionId(), that.getVersionId());
		builder.append(this.getVersionName(), that.getVersionName());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getInstanceName(), that.getInstanceName());
		builder.append(this.getUserId(), that.getUserId());
		builder.append(this.getUserName(), that.getUserName());
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getBody(), that.getBody());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getGameId());
		builder.append(getGameName());
		builder.append(getVersionId());
		builder.append(getVersionName());
		builder.append(getInstanceId());
		builder.append(getInstanceName());
		builder.append(getUserId());
		builder.append(getUserName());
		builder.append(getTimestamp());
		builder.append(getSubject());
		builder.append(getBody());
		return builder.toString();
	}

	@Override
	public int compareTo(IAnnouncement that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getGameId(), that.getGameId());
		builder.append(this.getGameName(), that.getGameName());
		builder.append(this.getVersionId(), that.getVersionId());
		builder.append(this.getVersionName(), that.getVersionName());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getInstanceName(), that.getInstanceName());
		builder.append(this.getUserId(), that.getUserId());
		builder.append(this.getUserName(), that.getUserName());
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getBody(), that.getBody());
		return builder.toComparison();
	}
}
