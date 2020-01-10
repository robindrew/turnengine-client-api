package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import com.turnengine.client.api.global.forum.ForumFlag;
import java.util.List;

public interface ILocalAllianceForumExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	IAllianceForum createAllianceForum(long loginId, int instanceId, String name, int parent);

	IAllianceForumThread createAllianceForumThread(long loginId, int instanceId, int forumId, String subject, String content);

	IAllianceForumPost createAllianceForumPost(long loginId, int instanceId, int threadId, String subject, String content);

	Boolean setAllianceForumOrder(long loginId, int instanceId, int forumId, int order);

	List<IAllianceForum> getAllianceForumList(long loginId, int instanceId);

	List<IAllianceForumThread> getAllianceThreadList(long loginId, int instanceId, int forumId, int pageNumber, int pageSize);

	IAllianceForumThread getAllianceThread(long loginId, int instanceId, int threadId);

	IAllianceForumPost editAlliancePost(long loginId, int instanceId, int postId, String subject, String content);

	Boolean setAllianceForumFlag(long loginId, int instanceId, int forumId, ForumFlag flag, boolean set);

	Boolean setAllianceThreadFlag(long loginId, int instanceId, int threadId, ForumFlag flag, boolean set);

	Boolean setAlliancePostFlag(long loginId, int instanceId, int postId, ForumFlag flag, boolean set);

	List<IAllianceForumPost> getAlliancePostList(long loginId, int instanceId, int threadId, int pageNumber, int pageSize);
}
