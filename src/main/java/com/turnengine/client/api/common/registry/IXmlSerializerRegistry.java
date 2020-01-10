package com.turnengine.client.api.common.registry;

import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;

public interface IXmlSerializerRegistry {

	<T> IXmlSerializer<T> getXmlSerializer(Class<?> type);

	<T> IXmlSerializer<T> getReturnTypeXmlSerializer(Class<?> type);

}
