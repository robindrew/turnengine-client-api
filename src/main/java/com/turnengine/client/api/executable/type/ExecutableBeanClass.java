package com.turnengine.client.api.executable.type;

import java.lang.reflect.Constructor;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.common.util.Check;
import com.robindrew.common.util.Java;
import com.turnengine.client.api.common.registry.SerializerRegistry;

public class ExecutableBeanClass<R> {

	private final Class<? extends IExecutableBean<R>> type;
	private final List<ExecutableBeanField> fieldList;

	public ExecutableBeanClass(Class<? extends IExecutableBean<R>> type) {
		this.type = Check.notNull("type", type);
		this.fieldList = ImmutableList.copyOf(ExecutableBeanField.getFields(type));
	}

	public String getName() {
		return type.getSimpleName();
	}

	public Class<? extends IExecutableBean<R>> getType() {
		return type;
	}

	public List<ExecutableBeanField> getFieldList() {
		return fieldList;
	}

	public IJsonSerializer<R> getReturnTypeJsonSerializer() {
		return new SerializerRegistry().getReturnTypeJsonSerializer(getType());
	}

	public IExecutableBean<R> newInstance(Object[] parameterValues) {
		Class<?>[] parameterTypes = new Class<?>[fieldList.size()];
		for (int i = 0; i < fieldList.size(); i++) {
			parameterTypes[i] = fieldList.get(i).getType();
		}

		try {
			Constructor<? extends IExecutableBean<R>> constructor = type.getDeclaredConstructor(parameterTypes);
			return constructor.newInstance(parameterValues);
		} catch (Exception e) {
			throw Java.propagate(e);
		}
	}
}
