package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.alliance.AllianceMemberType;
import com.turnengine.client.api.local.score.GroupScoreXmlSerializer;
import com.turnengine.client.api.local.score.IGroupScore;
import java.util.List;

public class PlayerInfoXmlSerializer implements IXmlSerializer<IPlayerInfo> {

	private String name;

	public PlayerInfoXmlSerializer() {
		this("PlayerInfo");
	}

	public PlayerInfoXmlSerializer(String name) {
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
	public IPlayerInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("allianceId");
		String param4 = reader.readObject(new StringSerializer("allianceName"));
		String param5 = reader.readObject(new StringSerializer("allianceTag"));
		int param6 = reader.readInt("factionId");
		String param7 = reader.readObject(new StringSerializer("factionName"));
		int param8 = reader.readInt("leaveTurns");
		AllianceMemberType param9 = reader.readObject(new EnumSerializer<AllianceMemberType>(AllianceMemberType.class, "memberType"));
		List<IGroupScore> param10 = reader.readObject(new ListSerializer<IGroupScore>("scoreList", new GroupScoreXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new PlayerInfo(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPlayerInfo object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("allianceId", object.getAllianceId());
		writer.writeObject(object.getAllianceName(), new StringSerializer("allianceName"));
		writer.writeObject(object.getAllianceTag(), new StringSerializer("allianceTag"));
		writer.writeInt("factionId", object.getFactionId());
		writer.writeObject(object.getFactionName(), new StringSerializer("factionName"));
		writer.writeInt("leaveTurns", object.getLeaveTurns());
		writer.writeObject(object.getMemberType(), new EnumSerializer<AllianceMemberType>(AllianceMemberType.class, "memberType"));
		writer.writeObject(object.getScoreList(), new ListSerializer<IGroupScore>("scoreList", new GroupScoreXmlSerializer("element")));
		writer.endElement(getName());
	}
}
