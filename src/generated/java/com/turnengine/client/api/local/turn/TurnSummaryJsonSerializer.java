package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class TurnSummaryJsonSerializer implements IJsonSerializer<ITurnSummary> {

	private String name;

	public TurnSummaryJsonSerializer() {
		this("TurnSummary");
	}

	public TurnSummaryJsonSerializer(String name) {
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
	public ITurnSummary readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ITurnSummary object) {
		writer.openObject();
		writer.writeInt(object.getNumber());
		writer.writeObject(object.getEnabled(), new EnumSerializer<TurnsEnabled>(TurnsEnabled.class));
		writer.writeObject(object.getUpdating(), new EnumSerializer<TurnUpdating>(TurnUpdating.class));
		writer.writeLong(object.getInterval());
		writer.writeLong(object.getTimeToNextTurn());
		writer.writeLong(object.getTimeOfNextTurn());
		writer.writeLong(object.getCurrentTime());
		writer.writeLong(object.getTimeOfFirstTurn());
		writer.writeLong(object.getTimeToFirstTurn());
		writer.closeObject();
	}
}
