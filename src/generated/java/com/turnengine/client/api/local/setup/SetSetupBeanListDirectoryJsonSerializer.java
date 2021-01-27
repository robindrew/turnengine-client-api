package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetSetupBeanListDirectoryJsonSerializer implements IJsonSerializer<ISetSetupBeanListDirectory> {

	private String name;

	public SetSetupBeanListDirectoryJsonSerializer() {
		this("SetSetupBeanListDirectory");
	}

	public SetSetupBeanListDirectoryJsonSerializer(String name) {
		this.name = name;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	public String getName() {
		return name;
	}

	@Override
	public ISetSetupBeanListDirectory readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetSetupBeanListDirectory object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getDirectory(), new StringSerializer());
		writer.writeObject(object.getFilenames(), new StringSerializer());
		writer.closeObject();
	}
}
