package com.turnengine.client.api.executable.executor.locator;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.robindrew.codegenerator.api.executable.executor.adapter.LocatorToServiceAdapter;
import com.turnengine.client.api.global.admin.AdminErrorCode;

public class AdminBeanExecutorLocatorService extends LocatorToServiceAdapter {

	public AdminBeanExecutorLocatorService(IBeanExecutorLocator locator) {
		super(locator, AdminErrorCode.INTERNAL_SERVER_ERROR);
	}

}
