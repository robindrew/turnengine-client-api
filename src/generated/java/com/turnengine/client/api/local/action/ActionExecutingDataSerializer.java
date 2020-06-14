package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.unit.UnitType;
import java.io.IOException;

public class ActionExecutingDataSerializer extends ObjectSerializer<IActionExecuting> {

	public ActionExecutingDataSerializer() {
		super(false);
	}

	public ActionExecutingDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IActionExecuting readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		UnitType param2 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, false));
		int param3 = reader.readInt();
		UnitType param4 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, false));
		int param5 = reader.readInt();
		int param6 = reader.readInt();
		long param7 = reader.readLong();
		int param8 = reader.readInt();
		return new ActionExecuting(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeValue(IDataWriter writer, IActionExecuting object) throws IOException {
		writer.writeInt(object.getSourceId());
		writer.writeObject(object.getSourceType(), new EnumSerializer<UnitType>(UnitType.class, false));
		writer.writeInt(object.getTargetId());
		writer.writeObject(object.getTargetType(), new EnumSerializer<UnitType>(UnitType.class, false));
		writer.writeInt(object.getActionId());
		writer.writeInt(object.getGroupId());
		writer.writeLong(object.getAmount());
		writer.writeInt(object.getTurns());
	}
}
