package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.BooleanSerializer;

public class SetSetupBeanListReturnTypeJsonSerializer implements IJsonSerializer<Boolean> {

	private String name;

	public SetSetupBeanListReturnTypeJsonSerializer() {
		this("SetSetupBeanListReturnType");
	}

	public SetSetupBeanListReturnTypeJsonSerializer(String name) {
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
	public Boolean readObject(IJsonReader reader) {
		return new BooleanSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, Boolean object) {
		new BooleanSerializer().writeObject(writer, object);
	}
}
