package com.turnengine.client.api.error;

import java.util.HashMap;
import java.util.Map;

import com.robindrew.codegenerator.api.error.IErrorCode;
import com.turnengine.client.api.global.admin.AdminErrorCode;
import com.turnengine.client.api.global.forum.ForumErrorCode;
import com.turnengine.client.api.global.game.GameErrorCode;
import com.turnengine.client.api.global.image.ImageErrorCode;
import com.turnengine.client.api.global.user.UserErrorCode;
import com.turnengine.client.api.local.alliance.AllianceErrorCode;
import com.turnengine.client.api.local.faction.FactionErrorCode;
import com.turnengine.client.api.local.group.GroupErrorCode;
import com.turnengine.client.api.local.location.LocationErrorCode;
import com.turnengine.client.api.local.message.MessageErrorCode;
import com.turnengine.client.api.local.mobile.MobileErrorCode;
import com.turnengine.client.api.local.player.PlayerErrorCode;
import com.turnengine.client.api.local.setup.SetupErrorCode;
import com.turnengine.client.api.local.storage.StorageErrorCode;
import com.turnengine.client.api.local.turn.TurnErrorCode;
import com.turnengine.client.api.local.unit.UnitErrorCode;

public class ErrorCodeRegistry {

	private final Map<Integer, IErrorCode> idToCodeMap = new HashMap<>();
	private final Map<String, IErrorCode> nameToCodeMap = new HashMap<>();

	public ErrorCodeRegistry() {
		register(AdminErrorCode.class);
		register(AllianceErrorCode.class);
		register(FactionErrorCode.class);
		register(ForumErrorCode.class);
		register(GameErrorCode.class);
		register(GroupErrorCode.class);
		register(ImageErrorCode.class);
		register(LocationErrorCode.class);
		register(MessageErrorCode.class);
		register(MobileErrorCode.class);
		register(PlayerErrorCode.class);
		register(SetupErrorCode.class);
		register(StorageErrorCode.class);
		register(TurnErrorCode.class);
		register(UnitErrorCode.class);
		register(UserErrorCode.class);
	}

	private <E extends Enum<E>> void register(Class<E> type) {
		for (E constant : type.getEnumConstants()) {
			register((IErrorCode) constant);
		}
	}

	private void register(IErrorCode code) {
		idToCodeMap.put(code.getId(), code);
		nameToCodeMap.put(code.name(), code);
	}

	public IErrorCode get(int id) {
		IErrorCode code = idToCodeMap.get(id);
		if (code == null) {
			throw new IllegalArgumentException("ErrorCode not registered with id: " + id);
		}
		return code;
	}

	public IErrorCode get(String name) {
		IErrorCode code = nameToCodeMap.get(name);
		if (code == null) {
			throw new IllegalArgumentException("ErrorCode not registered with name: '" + name + "'");
		}
		return code;
	}

}
