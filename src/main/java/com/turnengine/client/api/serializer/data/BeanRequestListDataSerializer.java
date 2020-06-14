package com.turnengine.client.api.serializer.data;

import java.util.Arrays;
import java.util.List;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataSerializer;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.util.Check;
import com.robindrew.common.util.Java;

public class BeanRequestListDataSerializer implements IDataSerializer<List<IExecutableBean<?>>> {

	private final IDataSerializer<IExecutableBean<?>> serializer;

	public BeanRequestListDataSerializer(IDataSerializer<IExecutableBean<?>> serializer) {
		this.serializer = Check.notNull("serializer", serializer);
	}

	@Override
	public List<IExecutableBean<?>> readObject(IDataReader reader) {
		try {
			int size = reader.readInt();
			IExecutableBean<?>[] array = new IExecutableBean<?>[size];
			for (int i = 0; i < size; i++) {
				array[i] = serializer.readObject(reader);
			}
			return Arrays.asList(array);
		} catch (Exception e) {
			throw Java.propagate(e);
		}
	}

	@Override
	public void writeObject(IDataWriter writer, List<IExecutableBean<?>> beanList) {
		try {
			writer.writeInt(beanList.size());
			for (IExecutableBean<?> bean : beanList) {
				serializer.writeObject(writer, bean);
			}
		} catch (Exception e) {
			throw Java.propagate(e);
		}
	}

}
