package com.turnengine.client.api.common.registry;

import com.robindrew.codegenerator.api.serializer.data.IDataSerializer;

public interface IDataSerializerRegistry {

	<T> IDataSerializer<T> getDataSerializer(Class<?> type);

	<T> IDataSerializer<T> getReturnTypeDataSerializer(Class<?> type);

}
