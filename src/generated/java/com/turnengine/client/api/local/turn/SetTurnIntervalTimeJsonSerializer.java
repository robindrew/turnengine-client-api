package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import java.util.concurrent.TimeUnit;

public class SetTurnIntervalTimeJsonSerializer implements IJsonSerializer<ISetTurnIntervalTime> {

	private String name;

	public SetTurnIntervalTimeJsonSerializer() {
		this("SetTurnIntervalTime");
	}

	public SetTurnIntervalTimeJsonSerializer(String name) {
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
	public ISetTurnIntervalTime readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetTurnIntervalTime object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeLong(object.getInterval());
		writer.writeObject(object.getUnit(), new EnumSerializer<TimeUnit>(TimeUnit.class));
		writer.closeObject();
	}
}
