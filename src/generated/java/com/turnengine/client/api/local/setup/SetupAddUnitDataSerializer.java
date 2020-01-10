package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.unit.UnitMove;
import com.turnengine.client.api.local.unit.UnitNode;
import com.turnengine.client.api.local.unit.UnitType;
import java.io.IOException;

public class SetupAddUnitDataSerializer extends ObjectSerializer<ISetupAddUnit> {

	public SetupAddUnitDataSerializer() {
		super(false);
	}

	public SetupAddUnitDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupAddUnit readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		UnitNode param2 = reader.readObject(new EnumSerializer<UnitNode>(UnitNode.class, false));
		UnitType param3 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, false));
		UnitMove param4 = reader.readObject(new EnumSerializer<UnitMove>(UnitMove.class, false));
		String param5 = reader.readObject(new StringSerializer(false));
		String param6 = reader.readObject(new StringSerializer(false));
		return new SetupAddUnit(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupAddUnit object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getNode(), new EnumSerializer<UnitNode>(UnitNode.class, false));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, false));
		writer.writeObject(object.getMove(), new EnumSerializer<UnitMove>(UnitMove.class, false));
		writer.writeObject(object.getGroupName(), new StringSerializer(false));
		writer.writeObject(object.getFactionName(), new StringSerializer(false));
	}
}
