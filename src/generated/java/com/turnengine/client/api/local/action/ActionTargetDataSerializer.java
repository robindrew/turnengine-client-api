package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;
import java.io.IOException;

public class ActionTargetDataSerializer extends ObjectSerializer<IActionTarget> {

	public ActionTargetDataSerializer() {
		super(false);
	}

	public ActionTargetDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IActionTarget readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		ActionTargetType param2 = reader.readObject(new EnumSerializer<ActionTargetType>(ActionTargetType.class, false));
		UnitType param3 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, false));
		UnitRelation param4 = reader.readObject(new EnumSerializer<UnitRelation>(UnitRelation.class, false));
		return new ActionTarget(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IActionTarget object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getTargetType(), new EnumSerializer<ActionTargetType>(ActionTargetType.class, false));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, false));
		writer.writeObject(object.getRelation(), new EnumSerializer<UnitRelation>(UnitRelation.class, false));
	}
}
