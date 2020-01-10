package com.turnengine.client.api.local.score;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TurnScore implements ITurnScore {

	/** The turn field. */
	private int turn = 0;
	/** The score field. */
	private long score = 0l;

	/**
	 * The empty constructor.
	 */
	public TurnScore() {
	}

	/**
	 * The fields constructor.
	 */
	public TurnScore(int turn, long score) {
		setTurn(turn);
		setScore(score);
	}

	/**
	 * The clone constructor.
	 */
	public TurnScore(ITurnScore clone) {
		setTurn(clone.getTurn());
		setScore(clone.getScore());
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
	 * Getter for the turn field.
	 * @return the value of the turn field.
	 */
	@Override
	public int getTurn() {
		return turn;
	}

	/**
	 * Getter for the score field.
	 * @return the value of the score field.
	 */
	@Override
	public long getScore() {
		return score;
	}

	/**
	 * Setter for the turn field.
	 * @param turn the turn value to set.
	 */
	@Override
	public void setTurn(int turn) {
		if (turn < -1) {
			throw new IllegalArgumentException("turn too small, minimum of -1, value: '" + turn + "'");
		}
		this.turn = turn;
	}

	/**
	 * Setter for the score field.
	 * @param score the score value to set.
	 */
	@Override
	public void setScore(long score) {
		if (score < -1) {
			throw new IllegalArgumentException("score too small, minimum of -1, value: '" + score + "'");
		}
		this.score = score;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getTurn());
		builder.append(getScore());
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
		ITurnScore that = (ITurnScore) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getTurn(), that.getTurn());
		builder.append(this.getScore(), that.getScore());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getTurn());
		builder.append(getScore());
		return builder.toString();
	}

	@Override
	public int compareTo(ITurnScore that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getTurn(), that.getTurn());
		builder.append(this.getScore(), that.getScore());
		return builder.toComparison();
	}
}
