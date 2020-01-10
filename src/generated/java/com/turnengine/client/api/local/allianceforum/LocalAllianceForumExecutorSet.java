package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.global.forum.ForumFlag;
import java.util.List;

public class LocalAllianceForumExecutorSet implements ILocalAllianceForumExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalAllianceForumExecutorSet(IBeanExecutorLocator locator) {
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
	public IAllianceForum createAllianceForum(long loginId, int instanceId, String name, int parent) {
		CreateAllianceForum bean = new CreateAllianceForum(loginId, instanceId, name, parent);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IAllianceForumThread createAllianceForumThread(long loginId, int instanceId, int forumId, String subject, String content) {
		CreateAllianceForumThread bean = new CreateAllianceForumThread(loginId, instanceId, forumId, subject, content);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IAllianceForumPost createAllianceForumPost(long loginId, int instanceId, int threadId, String subject, String content) {
		CreateAllianceForumPost bean = new CreateAllianceForumPost(loginId, instanceId, threadId, subject, content);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setAllianceForumOrder(long loginId, int instanceId, int forumId, int order) {
		SetAllianceForumOrder bean = new SetAllianceForumOrder(loginId, instanceId, forumId, order);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IAllianceForum> getAllianceForumList(long loginId, int instanceId) {
		GetAllianceForumList bean = new GetAllianceForumList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IAllianceForumThread> getAllianceThreadList(long loginId, int instanceId, int forumId, int pageNumber, int pageSize) {
		GetAllianceThreadList bean = new GetAllianceThreadList(loginId, instanceId, forumId, pageNumber, pageSize);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IAllianceForumThread getAllianceThread(long loginId, int instanceId, int threadId) {
		GetAllianceThread bean = new GetAllianceThread(loginId, instanceId, threadId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IAllianceForumPost editAlliancePost(long loginId, int instanceId, int postId, String subject, String content) {
		EditAlliancePost bean = new EditAlliancePost(loginId, instanceId, postId, subject, content);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setAllianceForumFlag(long loginId, int instanceId, int forumId, ForumFlag flag, boolean set) {
		SetAllianceForumFlag bean = new SetAllianceForumFlag(loginId, instanceId, forumId, flag, set);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setAllianceThreadFlag(long loginId, int instanceId, int threadId, ForumFlag flag, boolean set) {
		SetAllianceThreadFlag bean = new SetAllianceThreadFlag(loginId, instanceId, threadId, flag, set);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setAlliancePostFlag(long loginId, int instanceId, int postId, ForumFlag flag, boolean set) {
		SetAlliancePostFlag bean = new SetAlliancePostFlag(loginId, instanceId, postId, flag, set);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IAllianceForumPost> getAlliancePostList(long loginId, int instanceId, int threadId, int pageNumber, int pageSize) {
		GetAlliancePostList bean = new GetAlliancePostList(loginId, instanceId, threadId, pageNumber, pageSize);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
