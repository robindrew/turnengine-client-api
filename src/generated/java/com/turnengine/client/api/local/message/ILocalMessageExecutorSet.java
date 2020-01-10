package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;

public interface ILocalMessageExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	Integer sendMail(long loginId, int instanceId, String recipient, String subject, String content);

	Integer makeNote(long loginId, int instanceId, String subject, String content);

	Integer postNews(long loginId, int instanceId, String recipient, int locationId, int mobileId, String format, String subject, String content);

	IMessageList listMessages(long loginId, int instanceId, MessageType type, boolean includeContent, int pageNumber, int pageSize, int mobileId, int locationId, String format);

	IMessageSummary getMessageSummary(long loginId, int instanceId);

	IMessage getMessage(long loginId, int instanceId, int messageId);

	Integer getMessageCountByFormat(long loginId, int instanceId, String format);
}
