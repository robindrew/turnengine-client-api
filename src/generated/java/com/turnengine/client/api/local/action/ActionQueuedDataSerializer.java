package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.unit.UnitType;
import java.io.IOException;

public class ActionQueuedDataSerializer extends ObjectSerializer<IActionQueued> {

	public ActionQueuedDataSerializer() {
		super(false);
	}

	public ActionQueuedDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IActionQueued readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		UnitType param2 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, false));
		int param3 = reader.readInt();
		UnitType param4 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, false));
		int param5 = reader.readInt();
		int param6 = reader.readInt();
		long param7 = reader.readLong();
		int param8 = reader.readInt();
		return new ActionQueued(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeValue(IDataWriter writer, IActionQueued object) throws IOException {
		writer.writeInt(object.getSourceId());
		writer.writeObject(object.getSourceType(), new EnumSerializer<UnitType>(UnitType.class, false));
		writer.writeInt(object.getTargetId());
		writer.writeObject(object.getTargetType(), new EnumSerializer<UnitType>(UnitType.class, false));
		writer.writeInt(object.getActionId());
		writer.writeInt(object.getGroupId());
		writer.writeLong(object.getAmount());
		writer.writeInt(object.getIndex());
	}
}
