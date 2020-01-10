package com.turnengine.client.api.global;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.global.admin.GlobalAdminExecutorSet;
import com.turnengine.client.api.global.admin.IGlobalAdminExecutorSet;
import com.turnengine.client.api.global.announcement.GlobalAnnouncementExecutorSet;
import com.turnengine.client.api.global.announcement.IGlobalAnnouncementExecutorSet;
import com.turnengine.client.api.global.common.GlobalCommonExecutorSet;
import com.turnengine.client.api.global.common.IGlobalCommonExecutorSet;
import com.turnengine.client.api.global.error.GlobalErrorExecutorSet;
import com.turnengine.client.api.global.error.IGlobalErrorExecutorSet;
import com.turnengine.client.api.global.forum.GlobalForumExecutorSet;
import com.turnengine.client.api.global.forum.IGlobalForumExecutorSet;
import com.turnengine.client.api.global.game.GlobalGameExecutorSet;
import com.turnengine.client.api.global.game.IGlobalGameExecutorSet;
import com.turnengine.client.api.global.translation.GlobalTranslationExecutorSet;
import com.turnengine.client.api.global.translation.IGlobalTranslationExecutorSet;
import com.turnengine.client.api.global.user.GlobalUserExecutorSet;
import com.turnengine.client.api.global.user.IGlobalUserExecutorSet;

public class GlobalBeanExecutorSetLookup implements IGlobalBeanExecutorSetLookup {

	private final IGlobalAdminExecutorSet admin;
	private final IGlobalAnnouncementExecutorSet announcement;
	private final IGlobalCommonExecutorSet common;
	private final IGlobalErrorExecutorSet error;
	private final IGlobalForumExecutorSet forum;
	private final IGlobalGameExecutorSet game;
	private final IGlobalTranslationExecutorSet translation;
	private final IGlobalUserExecutorSet user;

	public GlobalBeanExecutorSetLookup(IBeanExecutorLocator locator) {
		admin = new GlobalAdminExecutorSet(locator);
		announcement = new GlobalAnnouncementExecutorSet(locator);
		common = new GlobalCommonExecutorSet(locator);
		error = new GlobalErrorExecutorSet(locator);
		forum = new GlobalForumExecutorSet(locator);
		game = new GlobalGameExecutorSet(locator);
		translation = new GlobalTranslationExecutorSet(locator);
		user = new GlobalUserExecutorSet(locator);
	}

	@Override
	public IGlobalAdminExecutorSet getAdminSet() {
		return admin;
	}

	@Override
	public IGlobalAnnouncementExecutorSet getAnnouncementSet() {
		return announcement;
	}

	@Override
	public IGlobalCommonExecutorSet getCommonSet() {
		return common;
	}

	@Override
	public IGlobalErrorExecutorSet getErrorSet() {
		return error;
	}

	@Override
	public IGlobalForumExecutorSet getForumSet() {
		return forum;
	}

	@Override
	public IGlobalGameExecutorSet getGameSet() {
		return game;
	}

	@Override
	public IGlobalTranslationExecutorSet getTranslationSet() {
		return translation;
	}

	@Override
	public IGlobalUserExecutorSet getUserSet() {
		return user;
	}

}
