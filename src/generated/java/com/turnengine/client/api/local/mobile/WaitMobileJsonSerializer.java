package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class WaitMobileJsonSerializer implements IJsonSerializer<IWaitMobile> {

	private String name;

	public WaitMobileJsonSerializer() {
		this("WaitMobile");
	}

	public WaitMobileJsonSerializer(String name) {
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
	public IWaitMobile readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IWaitMobile object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getWaitTurns());
		writer.writeBoolean(object.getAddToQueue());
		writer.writeBoolean(object.getRepeat());
		writer.closeObject();
	}
}
