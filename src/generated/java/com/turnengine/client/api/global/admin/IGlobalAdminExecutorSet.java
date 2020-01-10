package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.IGlobalBeanExecutorSet;

public interface IGlobalAdminExecutorSet extends IBeanExecutorSet, IGlobalBeanExecutorSet {

	Boolean sendEmail(long loginId, String sender, String recipient, String subject, String body);

	IAdminHostAddress getAdminHostAddress(String code);
}
