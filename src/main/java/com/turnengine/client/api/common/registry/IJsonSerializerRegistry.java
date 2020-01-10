package com.turnengine.client.api.common.registry;

import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;

public interface IJsonSerializerRegistry {

	<T> IJsonSerializer<T> getJsonSerializer(Class<?> type);

	<T> IJsonSerializer<T> getReturnTypeJsonSerializer(Class<?> type);

}
