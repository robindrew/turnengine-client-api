package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.unit.UnitMove;
import com.turnengine.client.api.local.unit.UnitNode;
import com.turnengine.client.api.local.unit.UnitType;

public class SetupAddUnitJsonSerializer implements IJsonSerializer<ISetupAddUnit> {

	private String name;

	public SetupAddUnitJsonSerializer() {
		this("SetupAddUnit");
	}

	public SetupAddUnitJsonSerializer(String name) {
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
	public ISetupAddUnit readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetupAddUnit object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getNode(), new EnumSerializer<UnitNode>(UnitNode.class));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class));
		writer.writeObject(object.getMove(), new EnumSerializer<UnitMove>(UnitMove.class));
		writer.writeObject(object.getGroupName(), new StringSerializer());
		writer.writeObject(object.getFactionName(), new StringSerializer());
		writer.closeObject();
	}
}
