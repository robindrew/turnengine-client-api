package com.turnengine.client.api.local.score;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Ranking implements IRanking {

	/** The id field. */
	private int id = 0;
	/** The rank field. */
	private int rank = 0;
	/** The score field. */
	private long score = 0l;

	/**
	 * The empty constructor.
	 */
	public Ranking() {
	}

	/**
	 * The fields constructor.
	 */
	public Ranking(int id, int rank, long score) {
		setId(id);
		setRank(rank);
		setScore(score);
	}

	/**
	 * The clone constructor.
	 */
	public Ranking(IRanking clone) {
		setId(clone.getId());
		setRank(clone.getRank());
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
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * Getter for the rank field.
	 * @return the value of the rank field.
	 */
	@Override
	public int getRank() {
		return rank;
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
	 * Setter for the rank field.
	 * @param rank the rank value to set.
	 */
	@Override
	public void setRank(int rank) {
		if (rank < -1) {
			throw new IllegalArgumentException("rank too small, minimum of -1, value: '" + rank + "'");
		}
		this.rank = rank;
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
		builder.append(getId());
		builder.append(getRank());
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
		IRanking that = (IRanking) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getRank(), that.getRank());
		builder.append(this.getScore(), that.getScore());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getRank());
		builder.append(getScore());
		return builder.toString();
	}

	@Override
	public int compareTo(IRanking that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getRank(), that.getRank());
		builder.append(this.getScore(), that.getScore());
		return builder.toComparison();
	}
}
