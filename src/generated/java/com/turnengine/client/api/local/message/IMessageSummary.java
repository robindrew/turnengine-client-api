package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IMessageSummary extends IBean, Comparable<IMessageSummary> {

	int SERIALIZATION_ID = 5809;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the newsRead field.
	 * @return the value of the newsRead field.
	 */
	int getNewsRead();

	/**
	 * Getter for the newsUnread field.
	 * @return the value of the newsUnread field.
	 */
	int getNewsUnread();

	/**
	 * Getter for the mailRead field.
	 * @return the value of the mailRead field.
	 */
	int getMailRead();

	/**
	 * Getter for the mailUnread field.
	 * @return the value of the mailUnread field.
	 */
	int getMailUnread();

	/**
	 * Getter for the noteRead field.
	 * @return the value of the noteRead field.
	 */
	int getNoteRead();

	/**
	 * Getter for the noteUnread field.
	 * @return the value of the noteUnread field.
	 */
	int getNoteUnread();

	/**
	 * Setter for the newsRead field.
	 * @param newsRead the newsRead value to set.
	 */
	void setNewsRead(int newsRead);

	/**
	 * Setter for the newsUnread field.
	 * @param newsUnread the newsUnread value to set.
	 */
	void setNewsUnread(int newsUnread);

	/**
	 * Setter for the mailRead field.
	 * @param mailRead the mailRead value to set.
	 */
	void setMailRead(int mailRead);

	/**
	 * Setter for the mailUnread field.
	 * @param mailUnread the mailUnread value to set.
	 */
	void setMailUnread(int mailUnread);

	/**
	 * Setter for the noteRead field.
	 * @param noteRead the noteRead value to set.
	 */
	void setNoteRead(int noteRead);

	/**
	 * Setter for the noteUnread field.
	 * @param noteUnread the noteUnread value to set.
	 */
	void setNoteUnread(int noteUnread);
}
