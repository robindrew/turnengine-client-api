package com.turnengine.client.api.global.game;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GameComparator implements Comparator<IGame> {

	/** The reverse field. */
	private boolean reverse = false;
	/** The swap field. */
	private boolean swap = false;

	/**
	 * Getter for the reverse field.
	 * @return the value of the reverse field.
	 */
	public boolean getReverse() {
		return reverse;
	}

	/**
	 * Getter for the swap field.
	 * @return the value of the swap field.
	 */
	public boolean getSwap() {
		return swap;
	}

	/**
	 * Setter for the reverse field.
	 * @param reverse the reverse value to set.
	 */
	public void setReverse(boolean reverse) {
		this.reverse = reverse;
	}

	/**
	 * Setter for the swap field.
	 * @param swap the swap value to set.
	 */
	public void setSwap(boolean swap) {
		this.swap = swap;
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getReverse());
		builder.append(getSwap());
		return builder.toString();
	}

	@Override
	public int compare(IGame compare1, IGame compare2) {
		CompareToBuilder builder = new CompareToBuilder();
		if (reverse) {
			if (swap) {
				builder.append(compare2.getName(), compare1.getName());
				builder.append(compare2.getId(), compare1.getId());
			} else {
				builder.append(compare1.getName(), compare2.getName());
				builder.append(compare1.getId(), compare2.getId());
			}
		} else {
			if (swap) {
				builder.append(compare2.getId(), compare1.getId());
				builder.append(compare2.getName(), compare1.getName());
			} else {
				builder.append(compare1.getId(), compare2.getId());
				builder.append(compare1.getName(), compare2.getName());
			}
		}
		return builder.toComparison();
	}
}
