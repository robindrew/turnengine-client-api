package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import com.turnengine.client.api.global.game.GameDefinitionDataSerializer;
import com.turnengine.client.api.global.game.IGameDefinition;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountDataSerializer;
import java.io.IOException;
import java.util.List;

public class GameUnitsDataSerializer extends ObjectSerializer<IGameUnits> {

	public GameUnitsDataSerializer() {
		super(false);
	}

	public GameUnitsDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGameUnits readValue(IDataReader reader) throws IOException {
		IGameDefinition param1 = reader.readObject(new GameDefinitionDataSerializer(false));
		List<IUnitCount> param2 = reader.readObject(new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		return new GameUnits(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGameUnits object) throws IOException {
		writer.writeObject(object.getDefinition(), new GameDefinitionDataSerializer(false));
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
	}
}
