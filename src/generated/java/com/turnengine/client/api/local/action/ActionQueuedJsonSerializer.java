package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.unit.UnitType;

public class ActionQueuedJsonSerializer implements IJsonSerializer<IActionQueued> {

	private String name;

	public ActionQueuedJsonSerializer() {
		this("ActionQueued");
	}

	public ActionQueuedJsonSerializer(String name) {
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
	public IActionQueued readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IActionQueued object) {
		writer.openObject();
		writer.writeInt(object.getSourceId());
		writer.writeObject(object.getSourceType(), new EnumSerializer<UnitType>(UnitType.class));
		writer.writeInt(object.getTargetId());
		writer.writeObject(object.getTargetType(), new EnumSerializer<UnitType>(UnitType.class));
		writer.writeInt(object.getActionId());
		writer.writeInt(object.getGroupId());
		writer.writeLong(object.getAmount());
		writer.writeInt(object.getIndex());
		writer.closeObject();
	}
}
