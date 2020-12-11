package com.turnengine.client.api.common.command;

public interface IGlobalLoggedInBean<R> extends IGlobalExecutableBean<R> {

	long getLoginId();

	void setLoginId(long loginId);
}
