package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAllianceLogoJsonSerializer implements IJsonSerializer<IGetAllianceLogo> {

	private String name;

	public GetAllianceLogoJsonSerializer() {
		this("GetAllianceLogo");
	}

	public GetAllianceLogoJsonSerializer(String name) {
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
	public IGetAllianceLogo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetAllianceLogo object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getAllianceId());
		writer.writeInt(object.getWidth());
		writer.writeInt(object.getHeight());
		writer.writeBoolean(object.getFill());
		writer.closeObject();
	}
}
