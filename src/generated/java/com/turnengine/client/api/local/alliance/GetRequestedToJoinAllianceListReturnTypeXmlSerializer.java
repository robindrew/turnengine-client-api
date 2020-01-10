package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoXmlSerializer;
import java.util.List;

public class GetRequestedToJoinAllianceListReturnTypeXmlSerializer implements IXmlSerializer<List<IPlayerInfo>> {

	private String name;

	public GetRequestedToJoinAllianceListReturnTypeXmlSerializer() {
		this("GetRequestedToJoinAllianceListReturnType");
	}

	public GetRequestedToJoinAllianceListReturnTypeXmlSerializer(String name) {
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
	public List<IPlayerInfo> readObject(IXmlReader reader) {
		return new ListSerializer<IPlayerInfo>(getName(), new PlayerInfoXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IPlayerInfo> object) {
		new ListSerializer<IPlayerInfo>(getName(), new PlayerInfoXmlSerializer("element")).writeObject(writer, object);
	}
}
