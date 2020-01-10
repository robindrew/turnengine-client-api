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
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountXmlSerializer;
import java.util.List;

public class PlayerXmlSerializer implements IXmlSerializer<IPlayer> {

	private String name;

	public PlayerXmlSerializer() {
		this("Player");
	}

	public PlayerXmlSerializer(String name) {
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
	public IPlayer readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("userId");
		int param4 = reader.readInt("factionId");
		String param5 = reader.readObject(new StringSerializer("factionName"));
		int param6 = reader.readInt("requestId");
		int param7 = reader.readInt("allianceId");
		String param8 = reader.readObject(new StringSerializer("allianceName"));
		String param9 = reader.readObject(new StringSerializer("allianceTag"));
		int param10 = reader.readInt("leaveTurns");
		AllianceMemberType param11 = reader.readObject(new EnumSerializer<AllianceMemberType>(AllianceMemberType.class, "memberType"));
		PlayerEmailAlerts param12 = reader.readObject(new EnumSerializer<PlayerEmailAlerts>(PlayerEmailAlerts.class, "emailAlerts"));
		List<IUnitCount> param13 = reader.readObject(new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		int param14 = reader.readInt("locations");
		int param15 = reader.readInt("mobiles");
		List<IGroupScore> param16 = reader.readObject(new ListSerializer<IGroupScore>("scoreList", new GroupScoreXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new Player(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPlayer object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("userId", object.getUserId());
		writer.writeInt("factionId", object.getFactionId());
		writer.writeObject(object.getFactionName(), new StringSerializer("factionName"));
		writer.writeInt("requestId", object.getRequestId());
		writer.writeInt("allianceId", object.getAllianceId());
		writer.writeObject(object.getAllianceName(), new StringSerializer("allianceName"));
		writer.writeObject(object.getAllianceTag(), new StringSerializer("allianceTag"));
		writer.writeInt("leaveTurns", object.getLeaveTurns());
		writer.writeObject(object.getMemberType(), new EnumSerializer<AllianceMemberType>(AllianceMemberType.class, "memberType"));
		writer.writeObject(object.getEmailAlerts(), new EnumSerializer<PlayerEmailAlerts>(PlayerEmailAlerts.class, "emailAlerts"));
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		writer.writeInt("locations", object.getLocations());
		writer.writeInt("mobiles", object.getMobiles());
		writer.writeObject(object.getScoreList(), new ListSerializer<IGroupScore>("scoreList", new GroupScoreXmlSerializer("element")));
		writer.endElement(getName());
	}
}
