package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class AddUnitJsonSerializer implements IJsonSerializer<IAddUnit> {

	private String name;

	public AddUnitJsonSerializer() {
		this("AddUnit");
	}

	public AddUnitJsonSerializer(String name) {
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
	public IAddUnit readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAddUnit object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getNode(), new EnumSerializer<UnitNode>(UnitNode.class));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class));
		writer.writeObject(object.getMove(), new EnumSerializer<UnitMove>(UnitMove.class));
		writer.writeObject(object.getGroupName(), new StringSerializer());
		writer.writeObject(object.getFactionName(), new StringSerializer());
		writer.closeObject();
	}
}
