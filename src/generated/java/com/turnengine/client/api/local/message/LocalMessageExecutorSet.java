package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;

public class LocalMessageExecutorSet implements ILocalMessageExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalMessageExecutorSet(IBeanExecutorLocator locator) {
		if (locator == null) {
			throw new NullPointerException("locator");
		}
		this.locator = locator;
	}

	/**
	 * Getter for the locator field.
	 * @return the value of the locator field.
	 */
	public IBeanExecutorLocator getLocator() {
		return locator;
	}

	@Override
	public Integer sendMail(long loginId, int instanceId, String recipient, String subject, String content) {
		SendMail bean = new SendMail(loginId, instanceId, recipient, subject, content);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Integer makeNote(long loginId, int instanceId, String subject, String content) {
		MakeNote bean = new MakeNote(loginId, instanceId, subject, content);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Integer postNews(long loginId, int instanceId, String recipient, int locationId, int mobileId, String format, String subject, String content) {
		PostNews bean = new PostNews(loginId, instanceId, recipient, locationId, mobileId, format, subject, content);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IMessageList listMessages(long loginId, int instanceId, MessageType type, boolean includeContent, int pageNumber, int pageSize, int mobileId, int locationId, String format) {
		ListMessages bean = new ListMessages(loginId, instanceId, type, includeContent, pageNumber, pageSize, mobileId, locationId, format);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IMessageSummary getMessageSummary(long loginId, int instanceId) {
		GetMessageSummary bean = new GetMessageSummary(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IMessage getMessage(long loginId, int instanceId, int messageId) {
		GetMessage bean = new GetMessage(loginId, instanceId, messageId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Integer getMessageCountByFormat(long loginId, int instanceId, String format) {
		GetMessageCountByFormat bean = new GetMessageCountByFormat(loginId, instanceId, format);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
