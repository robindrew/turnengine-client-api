package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;

public class GlobalAdminExecutorSet implements IGlobalAdminExecutorSet {

	private final IBeanExecutorLocator locator;

	public GlobalAdminExecutorSet(IBeanExecutorLocator locator) {
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
	public Boolean sendEmail(long loginId, String sender, String recipient, String subject, String body) {
		SendEmail bean = new SendEmail(loginId, sender, recipient, subject, body);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IAdminHostAddress getAdminHostAddress(String code) {
		GetAdminHostAddress bean = new GetAdminHostAddress(code);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
