package com.turnengine.client.api.executable.locator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.codegenerator.api.executable.executor.IBeanExecutor;
import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.robindrew.common.util.Check;

public class BeanExecutorLocatorMap implements IBeanExecutorLocator {

	private final Map<Class<? extends IExecutableBean<?>>, IBeanExecutor<?, ?>> lookupMap = new ConcurrentHashMap<>();

	public <R, B extends IExecutableBean<R>> void register(Class<? extends B> type, IBeanExecutor<R, B> executor) {
		Check.notNull("executor", executor);
		lookupMap.put(type, executor);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <R, B extends IExecutableBean<R>> IBeanExecutor<R, B> locateExecutor(IExecutableBean<R> bean) {
		Check.notNull("bean", bean);

		Class<? extends IExecutableBean> beanType = bean.getClass();
		IBeanExecutor<?, ?> executor = lookupMap.get(beanType);
		if (executor == null) {
			throw new IllegalArgumentException("Executor not registered for bean: " + beanType);
		}
		return (IBeanExecutor<R, B>) executor;
	}

}
