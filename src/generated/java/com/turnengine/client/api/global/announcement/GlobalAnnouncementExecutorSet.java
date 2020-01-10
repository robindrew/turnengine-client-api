package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.global.game.GameLevel;
import java.util.List;

public class GlobalAnnouncementExecutorSet implements IGlobalAnnouncementExecutorSet {

	private final IBeanExecutorLocator locator;

	public GlobalAnnouncementExecutorSet(IBeanExecutorLocator locator) {
		if (locator == null) {
			throw new NullPointerException("locator");
		}
		this.locator = locator;
	}

	/**
	 * Getter for the locator field.
	 * @return the value of the locator field.
	 */
	public IBeanExecutorLocator getLocator() {
		return locator;
	}

	@Override
	public Integer postAnnouncement(long loginId, int gameLevelId, GameLevel gameLevel, String subject, String body) {
		PostAnnouncement bean = new PostAnnouncement(loginId, gameLevelId, gameLevel, subject, body);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Integer getAnnouncementCount(int gameId) {
		GetAnnouncementCount bean = new GetAnnouncementCount(gameId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IAnnouncement> getAnnouncementList(int gameLevelId, GameLevel gameLevel) {
		GetAnnouncementList bean = new GetAnnouncementList(gameLevelId, gameLevel);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean deleteAnnouncement(long loginId, int id) {
		DeleteAnnouncement bean = new DeleteAnnouncement(loginId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
