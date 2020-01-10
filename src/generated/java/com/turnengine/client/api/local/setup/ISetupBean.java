package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface ISetupBean<R> extends IExecutableBean<R> {

	long getLoginId();

	int getInstanceId();

	void setLoginId(long loginId);

	void setInstanceId(int instanceId);
}
