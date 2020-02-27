package com.turnengine.client.api.common.debug;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import com.robindrew.common.dependency.instance.IInstanceFactory;

public class DebugInstanceFactory implements IInstanceFactory<IDebug> {

	private final AtomicBoolean globalEnabled;
	private final Map<Object, IDebug> instanceMap = new HashMap<>();

	public DebugInstanceFactory(boolean enabled) {
		this.globalEnabled = new AtomicBoolean(enabled);
	}

	@Override
	public IDebug newInstance(Object... args) {
		if (args.length != 1) {
			throw new IllegalArgumentException("Unexpected arguments: " + Arrays.toString(args));
		}
		Object key = args[0];
		return newInstance(key);
	}

	public IDebug newInstance(Object key) {
		if (key == null) {
			throw new NullPointerException("key");
		}
		synchronized (instanceMap) {
			IDebug instance = instanceMap.get(key);
			if (instance == null) {
				instance = new Debug(globalEnabled);
				instanceMap.put(key, instance);
			}
			return instance;
		}
	}

}
