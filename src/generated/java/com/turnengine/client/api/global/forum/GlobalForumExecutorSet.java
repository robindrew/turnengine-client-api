package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import java.util.List;

public class GlobalForumExecutorSet implements IGlobalForumExecutorSet {

	private final IBeanExecutorLocator locator;

	public GlobalForumExecutorSet(IBeanExecutorLocator locator) {
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
	public IForum createForum(long loginId, String name, int parent) {
		CreateForum bean = new CreateForum(loginId, name, parent);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IForumThread createForumThread(long loginId, int forumId, String subject, String content) {
		CreateForumThread bean = new CreateForumThread(loginId, forumId, subject, content);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IForumPost createForumPost(long loginId, int threadId, String subject, String content) {
		CreateForumPost bean = new CreateForumPost(loginId, threadId, subject, content);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setForumOrder(long loginId, int forumId, int order) {
		SetForumOrder bean = new SetForumOrder(loginId, forumId, order);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IForum> getForumList(long loginId) {
		GetForumList bean = new GetForumList(loginId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IForumThread> getThreadList(long loginId, int forumId, int pageNumber, int pageSize) {
		GetThreadList bean = new GetThreadList(loginId, forumId, pageNumber, pageSize);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IForumThread getThread(long loginId, int threadId) {
		GetThread bean = new GetThread(loginId, threadId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IForumPost editPost(long loginId, int postId, String subject, String content) {
		EditPost bean = new EditPost(loginId, postId, subject, content);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setForumFlag(long loginId, int forumId, ForumFlag flag, boolean set) {
		SetForumFlag bean = new SetForumFlag(loginId, forumId, flag, set);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setThreadFlag(long loginId, int threadId, ForumFlag flag, boolean set) {
		SetThreadFlag bean = new SetThreadFlag(loginId, threadId, flag, set);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setPostFlag(long loginId, int postId, ForumFlag flag, boolean set) {
		SetPostFlag bean = new SetPostFlag(loginId, postId, flag, set);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IForumPost> getPostList(long loginId, int threadId, int pageNumber, int pageSize) {
		GetPostList bean = new GetPostList(loginId, threadId, pageNumber, pageSize);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
