package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAllianceLogoXmlSerializer implements IXmlSerializer<IGetAllianceLogo> {

	private String name;

	public GetAllianceLogoXmlSerializer() {
		this("GetAllianceLogo");
	}

	public GetAllianceLogoXmlSerializer(String name) {
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
	public IGetAllianceLogo readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("allianceId");
		int param4 = reader.readInt("width");
		int param5 = reader.readInt("height");
		boolean param6 = reader.readBoolean("fill");
		reader.endElement(getName());

		// Create the bean
		return new GetAllianceLogo(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetAllianceLogo object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("allianceId", object.getAllianceId());
		writer.writeInt("width", object.getWidth());
		writer.writeInt("height", object.getHeight());
		writer.writeBoolean("fill", object.getFill());
		writer.endElement(getName());
	}
}
