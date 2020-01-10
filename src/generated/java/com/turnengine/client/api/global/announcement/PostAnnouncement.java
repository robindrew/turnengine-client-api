package com.turnengine.client.api.global.announcement;

import com.turnengine.client.api.global.game.GameLevel;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PostAnnouncement implements IPostAnnouncement {

	/** The loginId field. */
	private long loginId = 0l;
	/** The gameLevelId field. */
	private int gameLevelId = 0;
	/** The gameLevel field. */
	private GameLevel gameLevel = null;
	/** The subject field. */
	private String subject = null;
	/** The body field. */
	private String body = null;

	/**
	 * The empty constructor.
	 */
	public PostAnnouncement() {
	}

	/**
	 * The fields constructor.
	 */
	public PostAnnouncement(long loginId, int gameLevelId, GameLevel gameLevel, String subject, String body) {
		setLoginId(loginId);
		setGameLevelId(gameLevelId);
		setGameLevel(gameLevel);
		setSubject(subject);
		setBody(body);
	}

	/**
	 * The clone constructor.
	 */
	public PostAnnouncement(IPostAnnouncement clone) {
		setLoginId(clone.getLoginId());
		setGameLevelId(clone.getGameLevelId());
		setGameLevel(clone.getGameLevel());
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
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	@Override
	public long getLoginId() {
		return loginId;
	}

	/**
	 * Getter for the gameLevelId field.
	 * @return the value of the gameLevelId field.
	 */
	@Override
	public int getGameLevelId() {
		return gameLevelId;
	}

	/**
	 * Getter for the gameLevel field.
	 * @return the value of the gameLevel field.
	 */
	@Override
	public GameLevel getGameLevel() {
		return gameLevel;
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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	@Override
	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	/**
	 * Setter for the gameLevelId field.
	 * @param gameLevelId the gameLevelId value to set.
	 */
	@Override
	public void setGameLevelId(int gameLevelId) {
		if (gameLevelId < 0) {
			throw new IllegalArgumentException("gameLevelId too small, minimum of 0, value: '" + gameLevelId + "'");
		}
		this.gameLevelId = gameLevelId;
	}

	/**
	 * Setter for the gameLevel field.
	 * @param gameLevel the gameLevel value to set.
	 */
	@Override
	public void setGameLevel(GameLevel gameLevel) {
		this.gameLevel = gameLevel;
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
		builder.append(getLoginId());
		builder.append(getGameLevelId());
		builder.append(getGameLevel());
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
		IPostAnnouncement that = (IPostAnnouncement) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getGameLevelId(), that.getGameLevelId());
		builder.append(this.getGameLevel(), that.getGameLevel());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getBody(), that.getBody());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getGameLevelId());
		builder.append(getGameLevel());
		builder.append(getSubject());
		builder.append(getBody());
		return builder.toString();
	}

	@Override
	public int compareTo(IPostAnnouncement that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getGameLevelId(), that.getGameLevelId());
		builder.append(this.getGameLevel(), that.getGameLevel());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getBody(), that.getBody());
		return builder.toComparison();
	}
}
