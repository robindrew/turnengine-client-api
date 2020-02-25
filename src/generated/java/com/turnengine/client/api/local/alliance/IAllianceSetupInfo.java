package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IAllianceSetupInfo extends IBean, Comparable<IAllianceSetupInfo> {

	int SERIALIZATION_ID = 2132;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the count field.
	 * @return the value of the count field.
	 */
	int getCount();

	/**
	 * Getter for the enabled field.
	 * @return the value of the enabled field.
	 */
	boolean getEnabled();

	/**
	 * Getter for the memberLimit field.
	 * @return the value of the memberLimit field.
	 */
	int getMemberLimit();

	/**
	 * Getter for the inviteLimit field.
	 * @return the value of the inviteLimit field.
	 */
	int getInviteLimit();

	/**
	 * Getter for the leaveTurns field.
	 * @return the value of the leaveTurns field.
	 */
	int getLeaveTurns();

	/**
	 * Setter for the count field.
	 * @param count the count value to set.
	 */
	void setCount(int count);

	/**
	 * Setter for the enabled field.
	 * @param enabled the enabled value to set.
	 */
	void setEnabled(boolean enabled);

	/**
	 * Setter for the memberLimit field.
	 * @param memberLimit the memberLimit value to set.
	 */
	void setMemberLimit(int memberLimit);

	/**
	 * Setter for the inviteLimit field.
	 * @param inviteLimit the inviteLimit value to set.
	 */
	void setInviteLimit(int inviteLimit);

	/**
	 * Setter for the leaveTurns field.
	 * @param leaveTurns the leaveTurns value to set.
	 */
	void setLeaveTurns(int leaveTurns);
}
