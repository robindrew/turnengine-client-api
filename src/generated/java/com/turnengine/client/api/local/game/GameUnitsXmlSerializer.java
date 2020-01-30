package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.turnengine.client.api.global.game.GameDefinitionXmlSerializer;
import com.turnengine.client.api.global.game.IGameDefinition;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountXmlSerializer;
import java.util.List;

public class GameUnitsXmlSerializer implements IXmlSerializer<IGameUnits> {

	private String name;

	public GameUnitsXmlSerializer() {
		this("GameUnits");
	}

	public GameUnitsXmlSerializer(String name) {
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
	public IGameUnits readObject(IXmlReader reader) {
		reader.startElement(getName());
		IGameDefinition param1 = reader.readObject(new GameDefinitionXmlSerializer("definition"));
		List<IUnitCount> param2 = reader.readObject(new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new GameUnits(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGameUnits object) {
		writer.startElement(getName());
		writer.writeObject(object.getDefinition(), new GameDefinitionXmlSerializer("definition"));
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		writer.endElement(getName());
	}
}
