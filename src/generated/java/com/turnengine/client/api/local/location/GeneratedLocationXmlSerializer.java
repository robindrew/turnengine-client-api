package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountXmlSerializer;
import java.util.List;

public class GeneratedLocationXmlSerializer implements IXmlSerializer<IGeneratedLocation> {

	private String name;

	public GeneratedLocationXmlSerializer() {
		this("GeneratedLocation");
	}

	public GeneratedLocationXmlSerializer(String name) {
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
	public IGeneratedLocation readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		LocationSignup param2 = reader.readObject(new EnumSerializer<LocationSignup>(LocationSignup.class, "signup"));
		int param3 = reader.readInt("signupFactionId");
		List<IUnitCount> param4 = reader.readObject(new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new GeneratedLocation(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGeneratedLocation object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getSignup(), new EnumSerializer<LocationSignup>(LocationSignup.class, "signup"));
		writer.writeInt("signupFactionId", object.getSignupFactionId());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		writer.endElement(getName());
	}
}
