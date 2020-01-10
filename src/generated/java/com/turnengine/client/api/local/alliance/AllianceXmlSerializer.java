package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoXmlSerializer;
import com.turnengine.client.api.local.score.GroupScoreXmlSerializer;
import com.turnengine.client.api.local.score.IGroupScore;
import java.util.List;

public class AllianceXmlSerializer implements IXmlSerializer<IAlliance> {

	private String name;

	public AllianceXmlSerializer() {
		this("Alliance");
	}

	public AllianceXmlSerializer(String name) {
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
	public IAlliance readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("leaderId");
		String param4 = reader.readObject(new StringSerializer("leaderName"));
		int param5 = reader.readInt("factionId");
		boolean param6 = reader.readBoolean("invited");
		int param7 = reader.readInt("members");
		List<IPlayerInfo> param8 = reader.readObject(new ListSerializer<IPlayerInfo>("memberList", new PlayerInfoXmlSerializer("element")));
		List<IGroupScore> param9 = reader.readObject(new ListSerializer<IGroupScore>("scoreList", new GroupScoreXmlSerializer("element")));
		String param10 = reader.readObject(new StringSerializer("tag"));
		reader.endElement(getName());

		// Create the bean
		return new Alliance(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAlliance object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("leaderId", object.getLeaderId());
		writer.writeObject(object.getLeaderName(), new StringSerializer("leaderName"));
		writer.writeInt("factionId", object.getFactionId());
		writer.writeBoolean("invited", object.getInvited());
		writer.writeInt("members", object.getMembers());
		writer.writeObject(object.getMemberList(), new ListSerializer<IPlayerInfo>("memberList", new PlayerInfoXmlSerializer("element")));
		writer.writeObject(object.getScoreList(), new ListSerializer<IGroupScore>("scoreList", new GroupScoreXmlSerializer("element")));
		writer.writeObject(object.getTag(), new StringSerializer("tag"));
		writer.endElement(getName());
	}
}
