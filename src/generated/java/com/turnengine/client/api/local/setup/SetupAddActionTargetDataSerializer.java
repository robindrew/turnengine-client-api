package com.turnengine.client.api.local.setup;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;
import java.io.IOException;

public class SetupAddActionTargetDataSerializer extends ObjectSerializer<ISetupAddActionTarget> {

	public SetupAddActionTargetDataSerializer() {
		super(false);
	}

	public SetupAddActionTargetDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupAddActionTarget readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		ActionTargetType param2 = reader.readObject(new EnumSerializer<ActionTargetType>(ActionTargetType.class, false));
		UnitType param3 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, false));
		UnitRelation param4 = reader.readObject(new EnumSerializer<UnitRelation>(UnitRelation.class, false));
		return new SetupAddActionTarget(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupAddActionTarget object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getTarget(), new EnumSerializer<ActionTargetType>(ActionTargetType.class, false));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, false));
		writer.writeObject(object.getRelation(), new EnumSerializer<UnitRelation>(UnitRelation.class, false));
	}
}
