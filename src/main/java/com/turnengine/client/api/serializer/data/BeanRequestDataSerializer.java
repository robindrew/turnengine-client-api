package com.turnengine.client.api.serializer.data;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.codegenerator.api.factory.IObjectFactory;
import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataSerializer;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.util.Check;
import com.robindrew.common.util.Java;

public class BeanRequestDataSerializer implements IDataSerializer<IExecutableBean<?>> {

	private final IObjectFactory<IDataSerializer<?>> serializerFactory;

	public BeanRequestDataSerializer(IObjectFactory<IDataSerializer<?>> serializerFactory) {
		this.serializerFactory = Check.notNull("serializerFactory", serializerFactory);
	}

	@Override
	public IExecutableBean<?> readObject(IDataReader reader) {
		try {
			int id = reader.readInt();
			IDataSerializer<?> serializer = serializerFactory.newInstance(id);
			return (IExecutableBean<?>) reader.readObject(serializer);
		} catch (Exception e) {
			throw Java.propagate(e);
		}
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void writeObject(IDataWriter writer, IExecutableBean<?> bean) {
		try {
			int id = bean.getSerializationId();
			writer.writeInt(id);
			IDataSerializer serializer = serializerFactory.newInstance(id);
			writer.writeObject(bean, serializer);
		} catch (Exception e) {
			throw Java.propagate(e);
		}
	}

}
