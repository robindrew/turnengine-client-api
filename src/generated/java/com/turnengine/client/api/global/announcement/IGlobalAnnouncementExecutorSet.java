package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.IGlobalBeanExecutorSet;
import com.turnengine.client.api.global.game.GameLevel;
import java.util.List;

public interface IGlobalAnnouncementExecutorSet extends IBeanExecutorSet, IGlobalBeanExecutorSet {

	Integer postAnnouncement(long loginId, int gameLevelId, GameLevel gameLevel, String subject, String body);

	Integer getAnnouncementCount(int gameId);

	List<IAnnouncement> getAnnouncementList(int gameLevelId, GameLevel gameLevel);

	Boolean deleteAnnouncement(long loginId, int id);
}
