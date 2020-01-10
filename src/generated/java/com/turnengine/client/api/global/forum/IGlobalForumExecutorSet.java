package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.IGlobalBeanExecutorSet;
import java.util.List;

public interface IGlobalForumExecutorSet extends IBeanExecutorSet, IGlobalBeanExecutorSet {

	IForum createForum(long loginId, String name, int parent);

	IForumThread createForumThread(long loginId, int forumId, String subject, String content);

	IForumPost createForumPost(long loginId, int threadId, String subject, String content);

	Boolean setForumOrder(long loginId, int forumId, int order);

	List<IForum> getForumList(long loginId);

	List<IForumThread> getThreadList(long loginId, int forumId, int pageNumber, int pageSize);

	IForumThread getThread(long loginId, int threadId);

	IForumPost editPost(long loginId, int postId, String subject, String content);

	Boolean setForumFlag(long loginId, int forumId, ForumFlag flag, boolean set);

	Boolean setThreadFlag(long loginId, int threadId, ForumFlag flag, boolean set);

	Boolean setPostFlag(long loginId, int postId, ForumFlag flag, boolean set);

	List<IForumPost> getPostList(long loginId, int threadId, int pageNumber, int pageSize);
}
