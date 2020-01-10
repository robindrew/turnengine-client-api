package com.turnengine.client.api.local.message;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class MessageSummary implements IMessageSummary {

	/** The newsRead field. */
	private int newsRead = 0;
	/** The newsUnread field. */
	private int newsUnread = 0;
	/** The mailRead field. */
	private int mailRead = 0;
	/** The mailUnread field. */
	private int mailUnread = 0;
	/** The noteRead field. */
	private int noteRead = 0;
	/** The noteUnread field. */
	private int noteUnread = 0;

	/**
	 * The empty constructor.
	 */
	public MessageSummary() {
	}

	/**
	 * The fields constructor.
	 */
	public MessageSummary(int newsRead, int newsUnread, int mailRead, int mailUnread, int noteRead, int noteUnread) {
		setNewsRead(newsRead);
		setNewsUnread(newsUnread);
		setMailRead(mailRead);
		setMailUnread(mailUnread);
		setNoteRead(noteRead);
		setNoteUnread(noteUnread);
	}

	/**
	 * The clone constructor.
	 */
	public MessageSummary(IMessageSummary clone) {
		setNewsRead(clone.getNewsRead());
		setNewsUnread(clone.getNewsUnread());
		setMailRead(clone.getMailRead());
		setMailUnread(clone.getMailUnread());
		setNoteRead(clone.getNoteRead());
		setNoteUnread(clone.getNoteUnread());
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
	 * Getter for the newsRead field.
	 * @return the value of the newsRead field.
	 */
	@Override
	public int getNewsRead() {
		return newsRead;
	}

	/**
	 * Getter for the newsUnread field.
	 * @return the value of the newsUnread field.
	 */
	@Override
	public int getNewsUnread() {
		return newsUnread;
	}

	/**
	 * Getter for the mailRead field.
	 * @return the value of the mailRead field.
	 */
	@Override
	public int getMailRead() {
		return mailRead;
	}

	/**
	 * Getter for the mailUnread field.
	 * @return the value of the mailUnread field.
	 */
	@Override
	public int getMailUnread() {
		return mailUnread;
	}

	/**
	 * Getter for the noteRead field.
	 * @return the value of the noteRead field.
	 */
	@Override
	public int getNoteRead() {
		return noteRead;
	}

	/**
	 * Getter for the noteUnread field.
	 * @return the value of the noteUnread field.
	 */
	@Override
	public int getNoteUnread() {
		return noteUnread;
	}

	/**
	 * Setter for the newsRead field.
	 * @param newsRead the newsRead value to set.
	 */
	@Override
	public void setNewsRead(int newsRead) {
		if (newsRead < 0) {
			throw new IllegalArgumentException("newsRead too small, minimum of 0, value: '" + newsRead + "'");
		}
		this.newsRead = newsRead;
	}

	/**
	 * Setter for the newsUnread field.
	 * @param newsUnread the newsUnread value to set.
	 */
	@Override
	public void setNewsUnread(int newsUnread) {
		if (newsUnread < 0) {
			throw new IllegalArgumentException("newsUnread too small, minimum of 0, value: '" + newsUnread + "'");
		}
		this.newsUnread = newsUnread;
	}

	/**
	 * Setter for the mailRead field.
	 * @param mailRead the mailRead value to set.
	 */
	@Override
	public void setMailRead(int mailRead) {
		if (mailRead < 0) {
			throw new IllegalArgumentException("mailRead too small, minimum of 0, value: '" + mailRead + "'");
		}
		this.mailRead = mailRead;
	}

	/**
	 * Setter for the mailUnread field.
	 * @param mailUnread the mailUnread value to set.
	 */
	@Override
	public void setMailUnread(int mailUnread) {
		if (mailUnread < 0) {
			throw new IllegalArgumentException("mailUnread too small, minimum of 0, value: '" + mailUnread + "'");
		}
		this.mailUnread = mailUnread;
	}

	/**
	 * Setter for the noteRead field.
	 * @param noteRead the noteRead value to set.
	 */
	@Override
	public void setNoteRead(int noteRead) {
		if (noteRead < 0) {
			throw new IllegalArgumentException("noteRead too small, minimum of 0, value: '" + noteRead + "'");
		}
		this.noteRead = noteRead;
	}

	/**
	 * Setter for the noteUnread field.
	 * @param noteUnread the noteUnread value to set.
	 */
	@Override
	public void setNoteUnread(int noteUnread) {
		if (noteUnread < 0) {
			throw new IllegalArgumentException("noteUnread too small, minimum of 0, value: '" + noteUnread + "'");
		}
		this.noteUnread = noteUnread;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getNewsRead());
		builder.append(getNewsUnread());
		builder.append(getMailRead());
		builder.append(getMailUnread());
		builder.append(getNoteRead());
		builder.append(getNoteUnread());
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
		IMessageSummary that = (IMessageSummary) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getNewsRead(), that.getNewsRead());
		builder.append(this.getNewsUnread(), that.getNewsUnread());
		builder.append(this.getMailRead(), that.getMailRead());
		builder.append(this.getMailUnread(), that.getMailUnread());
		builder.append(this.getNoteRead(), that.getNoteRead());
		builder.append(this.getNoteUnread(), that.getNoteUnread());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getNewsRead());
		builder.append(getNewsUnread());
		builder.append(getMailRead());
		builder.append(getMailUnread());
		builder.append(getNoteRead());
		builder.append(getNoteUnread());
		return builder.toString();
	}

	@Override
	public int compareTo(IMessageSummary that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getNewsRead(), that.getNewsRead());
		builder.append(this.getNewsUnread(), that.getNewsUnread());
		builder.append(this.getMailRead(), that.getMailRead());
		builder.append(this.getMailUnread(), that.getMailUnread());
		builder.append(this.getNoteRead(), that.getNoteRead());
		builder.append(this.getNoteUnread(), that.getNoteUnread());
		return builder.toComparison();
	}
}
