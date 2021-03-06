package com.turnengine.client.api.local.score;

import com.turnengine.client.api.local.alliance.IAllianceInfo;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AllianceRanking implements IAllianceRanking {

	/** The alliance field. */
	private IAllianceInfo alliance = null;
	/** The rank field. */
	private int rank = 0;
	/** The score field. */
	private long score = 0l;

	/**
	 * The empty constructor.
	 */
	public AllianceRanking() {
	}

	/**
	 * The fields constructor.
	 */
	public AllianceRanking(IAllianceInfo alliance, int rank, long score) {
		setAlliance(alliance);
		setRank(rank);
		setScore(score);
	}

	/**
	 * The clone constructor.
	 */
	public AllianceRanking(IAllianceRanking clone) {
		setAlliance(clone.getAlliance());
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
	 * Getter for the alliance field.
	 * @return the value of the alliance field.
	 */
	@Override
	public IAllianceInfo getAlliance() {
		return alliance;
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
	 * Setter for the alliance field.
	 * @param alliance the alliance value to set.
	 */
	@Override
	public void setAlliance(IAllianceInfo alliance) {
		this.alliance = alliance;
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
		builder.append(getAlliance());
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
		IAllianceRanking that = (IAllianceRanking) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getAlliance(), that.getAlliance());
		builder.append(this.getRank(), that.getRank());
		builder.append(this.getScore(), that.getScore());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getAlliance());
		builder.append(getRank());
		builder.append(getScore());
		return builder.toString();
	}

	@Override
	public int compareTo(IAllianceRanking that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getAlliance(), that.getAlliance());
		builder.append(this.getRank(), that.getRank());
		builder.append(this.getScore(), that.getScore());
		return builder.toComparison();
	}
}
