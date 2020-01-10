package com.turnengine.client.api.common.command;

public interface ILocalLoggedInBean<R> extends ILocalExecutableBean<R> {

	long getLoginId();

	int getInstanceId();
}
