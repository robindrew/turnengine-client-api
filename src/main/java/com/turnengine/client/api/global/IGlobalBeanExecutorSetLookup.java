package com.turnengine.client.api.global;

import com.turnengine.client.api.global.admin.IGlobalAdminExecutorSet;
import com.turnengine.client.api.global.announcement.IGlobalAnnouncementExecutorSet;
import com.turnengine.client.api.global.common.IGlobalCommonExecutorSet;
import com.turnengine.client.api.global.error.IGlobalErrorExecutorSet;
import com.turnengine.client.api.global.forum.IGlobalForumExecutorSet;
import com.turnengine.client.api.global.game.IGlobalGameExecutorSet;
import com.turnengine.client.api.global.translation.IGlobalTranslationExecutorSet;
import com.turnengine.client.api.global.user.IGlobalUserExecutorSet;

public interface IGlobalBeanExecutorSetLookup {

	IGlobalAdminExecutorSet getAdminSet();

	IGlobalAnnouncementExecutorSet getAnnouncementSet();

	IGlobalCommonExecutorSet getCommonSet();

	IGlobalErrorExecutorSet getErrorSet();

	IGlobalForumExecutorSet getForumSet();

	IGlobalGameExecutorSet getGameSet();

	IGlobalTranslationExecutorSet getTranslationSet();

	IGlobalUserExecutorSet getUserSet();
}
