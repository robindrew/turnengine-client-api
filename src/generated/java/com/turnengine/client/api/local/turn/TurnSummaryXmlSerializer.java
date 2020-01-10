package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class TurnSummaryXmlSerializer implements IXmlSerializer<ITurnSummary> {

	private String name;

	public TurnSummaryXmlSerializer() {
		this("TurnSummary");
	}

	public TurnSummaryXmlSerializer(String name) {
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
	public ITurnSummary readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("number");
		TurnsEnabled param2 = reader.readObject(new EnumSerializer<TurnsEnabled>(TurnsEnabled.class, "enabled"));
		TurnUpdating param3 = reader.readObject(new EnumSerializer<TurnUpdating>(TurnUpdating.class, "updating"));
		long param4 = reader.readLong("interval");
		long param5 = reader.readLong("timeToNextTurn");
		long param6 = reader.readLong("timeOfNextTurn");
		long param7 = reader.readLong("currentTime");
		long param8 = reader.readLong("timeOfFirstTurn");
		long param9 = reader.readLong("timeToFirstTurn");
		reader.endElement(getName());

		// Create the bean
		return new TurnSummary(param1, param2, param3, param4, param5, param6, param7, param8, param9);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITurnSummary object) {
		writer.startElement(getName());
		writer.writeInt("number", object.getNumber());
		writer.writeObject(object.getEnabled(), new EnumSerializer<TurnsEnabled>(TurnsEnabled.class, "enabled"));
		writer.writeObject(object.getUpdating(), new EnumSerializer<TurnUpdating>(TurnUpdating.class, "updating"));
		writer.writeLong("interval", object.getInterval());
		writer.writeLong("timeToNextTurn", object.getTimeToNextTurn());
		writer.writeLong("timeOfNextTurn", object.getTimeOfNextTurn());
		writer.writeLong("currentTime", object.getCurrentTime());
		writer.writeLong("timeOfFirstTurn", object.getTimeOfFirstTurn());
		writer.writeLong("timeToFirstTurn", object.getTimeToFirstTurn());
		writer.endElement(getName());
	}
}
