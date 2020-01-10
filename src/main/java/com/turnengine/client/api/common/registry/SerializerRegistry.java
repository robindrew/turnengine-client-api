package com.turnengine.client.api.common.registry;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.robindrew.codegenerator.api.serializer.data.IDataSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.common.lang.clazz.Classes;

@SuppressWarnings("unchecked")
public class SerializerRegistry implements IJsonSerializerRegistry, IXmlSerializerRegistry, IDataSerializerRegistry {

	private final ConcurrentMap<Class<?>, IJsonSerializer<?>> jsonSerializerMap = new ConcurrentHashMap<>();
	private final ConcurrentMap<Class<?>, IXmlSerializer<?>> xmlSerializerMap = new ConcurrentHashMap<>();
	private final ConcurrentMap<Class<?>, IDataSerializer<?>> dataSerializerMap = new ConcurrentHashMap<>();

	@SuppressWarnings("rawtypes")
	private <S> S getSerializer(Class<?> type, ConcurrentMap serializerMap, String suffix) {
		S serializer = (S) serializerMap.get(type);
		if (serializer == null) {
			serializer = newInstance(type, suffix);
			serializerMap.putIfAbsent(type, serializer);
		}
		return serializer;
	}

	@Override
	public <T> IDataSerializer<T> getDataSerializer(Class<?> type) {
		return (IDataSerializer<T>) getSerializer(type, dataSerializerMap, "DataSerializer");
	}

	@Override
	public <T> IXmlSerializer<T> getXmlSerializer(Class<?> type) {
		return (IXmlSerializer<T>) getSerializer(type, xmlSerializerMap, "XmlSerializer");
	}

	@Override
	public <T> IJsonSerializer<T> getJsonSerializer(Class<?> type) {
		return (IJsonSerializer<T>) getSerializer(type, jsonSerializerMap, "JsonSerializer");
	}

	@Override
	public <T> IDataSerializer<T> getReturnTypeDataSerializer(Class<?> type) {
		return (IDataSerializer<T>) getSerializer(type, dataSerializerMap, "ReturnTypeDataSerializer");
	}

	@Override
	public <T> IXmlSerializer<T> getReturnTypeXmlSerializer(Class<?> type) {
		return (IXmlSerializer<T>) getSerializer(type, xmlSerializerMap, "ReturnTypeXmlSerializer");
	}

	@Override
	public <T> IJsonSerializer<T> getReturnTypeJsonSerializer(Class<?> type) {
		return (IJsonSerializer<T>) getSerializer(type, jsonSerializerMap, "ReturnTypeJsonSerializer");
	}

	private <R> R newInstance(Class<?> type, String suffix) {
		String name = type.getSimpleName();
		if (type.isInterface() && name.startsWith("I")) {
			name = name.substring(1);
		}
		String className = type.getPackage().getName() + "." + name + suffix;
		return (R) Classes.newInstance(className);
	}

}
