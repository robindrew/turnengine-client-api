package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.factory.IObjectFactory;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.turnengine.client.api.common.plugin.PluginDetails;
import com.turnengine.client.api.common.plugin.PluginDetailsXmlSerializer;
import com.turnengine.client.api.global.admin.AdminHostAddress;
import com.turnengine.client.api.global.admin.AdminHostAddressXmlSerializer;
import com.turnengine.client.api.global.admin.GetAdminHostAddress;
import com.turnengine.client.api.global.admin.GetAdminHostAddressXmlSerializer;
import com.turnengine.client.api.global.admin.SendEmail;
import com.turnengine.client.api.global.admin.SendEmailXmlSerializer;
import com.turnengine.client.api.global.announcement.Announcement;
import com.turnengine.client.api.global.announcement.AnnouncementXmlSerializer;
import com.turnengine.client.api.global.announcement.DeleteAnnouncement;
import com.turnengine.client.api.global.announcement.DeleteAnnouncementXmlSerializer;
import com.turnengine.client.api.global.announcement.GetAnnouncementCount;
import com.turnengine.client.api.global.announcement.GetAnnouncementCountXmlSerializer;
import com.turnengine.client.api.global.announcement.GetAnnouncementList;
import com.turnengine.client.api.global.announcement.GetAnnouncementListXmlSerializer;
import com.turnengine.client.api.global.announcement.PostAnnouncement;
import com.turnengine.client.api.global.announcement.PostAnnouncementXmlSerializer;
import com.turnengine.client.api.global.error.CommandStackTrace;
import com.turnengine.client.api.global.error.CommandStackTraceXmlSerializer;
import com.turnengine.client.api.global.error.GetCommandStackTrace;
import com.turnengine.client.api.global.error.GetCommandStackTraceList;
import com.turnengine.client.api.global.error.GetCommandStackTraceListXmlSerializer;
import com.turnengine.client.api.global.error.GetCommandStackTraceXmlSerializer;
import com.turnengine.client.api.global.forum.CreateForum;
import com.turnengine.client.api.global.forum.CreateForumPost;
import com.turnengine.client.api.global.forum.CreateForumPostXmlSerializer;
import com.turnengine.client.api.global.forum.CreateForumThread;
import com.turnengine.client.api.global.forum.CreateForumThreadXmlSerializer;
import com.turnengine.client.api.global.forum.CreateForumXmlSerializer;
import com.turnengine.client.api.global.forum.EditPost;
import com.turnengine.client.api.global.forum.EditPostXmlSerializer;
import com.turnengine.client.api.global.forum.Forum;
import com.turnengine.client.api.global.forum.ForumPost;
import com.turnengine.client.api.global.forum.ForumPostXmlSerializer;
import com.turnengine.client.api.global.forum.ForumThread;
import com.turnengine.client.api.global.forum.ForumThreadXmlSerializer;
import com.turnengine.client.api.global.forum.ForumUser;
import com.turnengine.client.api.global.forum.ForumUserXmlSerializer;
import com.turnengine.client.api.global.forum.ForumXmlSerializer;
import com.turnengine.client.api.global.forum.GetForumList;
import com.turnengine.client.api.global.forum.GetForumListXmlSerializer;
import com.turnengine.client.api.global.forum.GetPostList;
import com.turnengine.client.api.global.forum.GetPostListXmlSerializer;
import com.turnengine.client.api.global.forum.GetThread;
import com.turnengine.client.api.global.forum.GetThreadList;
import com.turnengine.client.api.global.forum.GetThreadListXmlSerializer;
import com.turnengine.client.api.global.forum.GetThreadXmlSerializer;
import com.turnengine.client.api.global.forum.SetForumFlag;
import com.turnengine.client.api.global.forum.SetForumFlagXmlSerializer;
import com.turnengine.client.api.global.forum.SetForumOrder;
import com.turnengine.client.api.global.forum.SetForumOrderXmlSerializer;
import com.turnengine.client.api.global.forum.SetPostFlag;
import com.turnengine.client.api.global.forum.SetPostFlagXmlSerializer;
import com.turnengine.client.api.global.forum.SetThreadFlag;
import com.turnengine.client.api.global.forum.SetThreadFlagXmlSerializer;
import com.turnengine.client.api.global.game.Game;
import com.turnengine.client.api.global.game.GameDefinition;
import com.turnengine.client.api.global.game.GameDefinitionXmlSerializer;
import com.turnengine.client.api.global.game.GameHost;
import com.turnengine.client.api.global.game.GameHostXmlSerializer;
import com.turnengine.client.api.global.game.GameInstance;
import com.turnengine.client.api.global.game.GameInstanceProperty;
import com.turnengine.client.api.global.game.GameInstancePropertyXmlSerializer;
import com.turnengine.client.api.global.game.GameInstanceXmlSerializer;
import com.turnengine.client.api.global.game.GameVersion;
import com.turnengine.client.api.global.game.GameVersionXmlSerializer;
import com.turnengine.client.api.global.game.GameXmlSerializer;
import com.turnengine.client.api.global.game.GetGameById;
import com.turnengine.client.api.global.game.GetGameByIdXmlSerializer;
import com.turnengine.client.api.global.game.GetGameByName;
import com.turnengine.client.api.global.game.GetGameByNameXmlSerializer;
import com.turnengine.client.api.global.game.GetGameDefinition;
import com.turnengine.client.api.global.game.GetGameDefinitionXmlSerializer;
import com.turnengine.client.api.global.game.GetGameDefinitions;
import com.turnengine.client.api.global.game.GetGameDefinitionsByGameName;
import com.turnengine.client.api.global.game.GetGameDefinitionsByGameNameXmlSerializer;
import com.turnengine.client.api.global.game.GetGameDefinitionsXmlSerializer;
import com.turnengine.client.api.global.game.GetGameHostById;
import com.turnengine.client.api.global.game.GetGameHostByIdXmlSerializer;
import com.turnengine.client.api.global.game.GetGameHostByName;
import com.turnengine.client.api.global.game.GetGameHostByNameXmlSerializer;
import com.turnengine.client.api.global.game.GetGameHosts;
import com.turnengine.client.api.global.game.GetGameHostsXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstanceById;
import com.turnengine.client.api.global.game.GetGameInstanceByIdXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstanceByName;
import com.turnengine.client.api.global.game.GetGameInstanceByNameXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstanceByNames;
import com.turnengine.client.api.global.game.GetGameInstanceByNamesXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstancePropertyList;
import com.turnengine.client.api.global.game.GetGameInstancePropertyListXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstances;
import com.turnengine.client.api.global.game.GetGameInstancesByGameName;
import com.turnengine.client.api.global.game.GetGameInstancesByGameNameXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstancesXmlSerializer;
import com.turnengine.client.api.global.game.GetGameVersionById;
import com.turnengine.client.api.global.game.GetGameVersionByIdXmlSerializer;
import com.turnengine.client.api.global.game.GetGameVersionByName;
import com.turnengine.client.api.global.game.GetGameVersionByNameXmlSerializer;
import com.turnengine.client.api.global.game.GetGameVersions;
import com.turnengine.client.api.global.game.GetGameVersionsXmlSerializer;
import com.turnengine.client.api.global.game.GetGames;
import com.turnengine.client.api.global.game.GetGamesXmlSerializer;
import com.turnengine.client.api.global.game.NewGame;
import com.turnengine.client.api.global.game.NewGameHost;
import com.turnengine.client.api.global.game.NewGameHostXmlSerializer;
import com.turnengine.client.api.global.game.NewGameInstance;
import com.turnengine.client.api.global.game.NewGameInstanceXmlSerializer;
import com.turnengine.client.api.global.game.NewGameVersion;
import com.turnengine.client.api.global.game.NewGameVersionXmlSerializer;
import com.turnengine.client.api.global.game.NewGameXmlSerializer;
import com.turnengine.client.api.global.game.SetGameInstanceProperty;
import com.turnengine.client.api.global.game.SetGameInstancePropertyXmlSerializer;
import com.turnengine.client.api.global.image.Image;
import com.turnengine.client.api.global.image.ImageXmlSerializer;
import com.turnengine.client.api.global.translation.GetTranslationById;
import com.turnengine.client.api.global.translation.GetTranslationByIdXmlSerializer;
import com.turnengine.client.api.global.translation.GetTranslationByText;
import com.turnengine.client.api.global.translation.GetTranslationByTextXmlSerializer;
import com.turnengine.client.api.global.translation.NewTranslation;
import com.turnengine.client.api.global.translation.NewTranslationXmlSerializer;
import com.turnengine.client.api.global.translation.SetTranslation;
import com.turnengine.client.api.global.translation.SetTranslationXmlSerializer;
import com.turnengine.client.api.global.translation.Translation;
import com.turnengine.client.api.global.translation.TranslationXmlSerializer;
import com.turnengine.client.api.global.user.AdminSetUserPassword;
import com.turnengine.client.api.global.user.AdminSetUserPasswordXmlSerializer;
import com.turnengine.client.api.global.user.AdminVerifyUser;
import com.turnengine.client.api.global.user.AdminVerifyUserXmlSerializer;
import com.turnengine.client.api.global.user.ChangeUserPassword;
import com.turnengine.client.api.global.user.ChangeUserPasswordXmlSerializer;
import com.turnengine.client.api.global.user.CountUsers;
import com.turnengine.client.api.global.user.CountUsersXmlSerializer;
import com.turnengine.client.api.global.user.GetUser;
import com.turnengine.client.api.global.user.GetUserAddressCodeList;
import com.turnengine.client.api.global.user.GetUserAddressCodeListXmlSerializer;
import com.turnengine.client.api.global.user.GetUserAdminInfo;
import com.turnengine.client.api.global.user.GetUserAdminInfoList;
import com.turnengine.client.api.global.user.GetUserAdminInfoListXmlSerializer;
import com.turnengine.client.api.global.user.GetUserAdminInfoXmlSerializer;
import com.turnengine.client.api.global.user.GetUserAvatar;
import com.turnengine.client.api.global.user.GetUserAvatarXmlSerializer;
import com.turnengine.client.api.global.user.GetUserByEmail;
import com.turnengine.client.api.global.user.GetUserByEmailXmlSerializer;
import com.turnengine.client.api.global.user.GetUserById;
import com.turnengine.client.api.global.user.GetUserByIdXmlSerializer;
import com.turnengine.client.api.global.user.GetUserByLoginId;
import com.turnengine.client.api.global.user.GetUserByLoginIdXmlSerializer;
import com.turnengine.client.api.global.user.GetUserByName;
import com.turnengine.client.api.global.user.GetUserByNameXmlSerializer;
import com.turnengine.client.api.global.user.GetUserList;
import com.turnengine.client.api.global.user.GetUserListXmlSerializer;
import com.turnengine.client.api.global.user.GetUserNames;
import com.turnengine.client.api.global.user.GetUserNamesXmlSerializer;
import com.turnengine.client.api.global.user.GetUserSimilarityList;
import com.turnengine.client.api.global.user.GetUserSimilarityListXmlSerializer;
import com.turnengine.client.api.global.user.GetUserXmlSerializer;
import com.turnengine.client.api.global.user.LoginUser;
import com.turnengine.client.api.global.user.LoginUserXmlSerializer;
import com.turnengine.client.api.global.user.LogoutUser;
import com.turnengine.client.api.global.user.LogoutUserXmlSerializer;
import com.turnengine.client.api.global.user.RenameUser;
import com.turnengine.client.api.global.user.RenameUserXmlSerializer;
import com.turnengine.client.api.global.user.ResetPassword;
import com.turnengine.client.api.global.user.ResetPasswordXmlSerializer;
import com.turnengine.client.api.global.user.SendResetPasswordEmail;
import com.turnengine.client.api.global.user.SendResetPasswordEmailXmlSerializer;
import com.turnengine.client.api.global.user.SetResetPasswordEmail;
import com.turnengine.client.api.global.user.SetResetPasswordEmailXmlSerializer;
import com.turnengine.client.api.global.user.SetSignupUserEmail;
import com.turnengine.client.api.global.user.SetSignupUserEmailXmlSerializer;
import com.turnengine.client.api.global.user.SetSignupVerification;
import com.turnengine.client.api.global.user.SetSignupVerificationXmlSerializer;
import com.turnengine.client.api.global.user.SetUserAddress;
import com.turnengine.client.api.global.user.SetUserAddressXmlSerializer;
import com.turnengine.client.api.global.user.SetUserAvatar;
import com.turnengine.client.api.global.user.SetUserAvatarXmlSerializer;
import com.turnengine.client.api.global.user.SetUserGamePermission;
import com.turnengine.client.api.global.user.SetUserGamePermissionXmlSerializer;
import com.turnengine.client.api.global.user.SetUserLanguage;
import com.turnengine.client.api.global.user.SetUserLanguageXmlSerializer;
import com.turnengine.client.api.global.user.SetUserPermission;
import com.turnengine.client.api.global.user.SetUserPermissionXmlSerializer;
import com.turnengine.client.api.global.user.SignupUser;
import com.turnengine.client.api.global.user.SignupUserXmlSerializer;
import com.turnengine.client.api.global.user.UpdateUserAddressCode;
import com.turnengine.client.api.global.user.UpdateUserAddressCodeXmlSerializer;
import com.turnengine.client.api.global.user.User;
import com.turnengine.client.api.global.user.UserAddressCode;
import com.turnengine.client.api.global.user.UserAddressCodeXmlSerializer;
import com.turnengine.client.api.global.user.UserAdminInfo;
import com.turnengine.client.api.global.user.UserAdminInfoXmlSerializer;
import com.turnengine.client.api.global.user.UserSimilarity;
import com.turnengine.client.api.global.user.UserSimilarityXmlSerializer;
import com.turnengine.client.api.global.user.UserXmlSerializer;
import com.turnengine.client.api.global.user.VerifyUser;
import com.turnengine.client.api.global.user.VerifyUserXmlSerializer;
import com.turnengine.client.api.local.action.Action;
import com.turnengine.client.api.local.action.ActionAvailable;
import com.turnengine.client.api.local.action.ActionAvailableXmlSerializer;
import com.turnengine.client.api.local.action.ActionCondition;
import com.turnengine.client.api.local.action.ActionConditionXmlSerializer;
import com.turnengine.client.api.local.action.ActionExecuting;
import com.turnengine.client.api.local.action.ActionExecutingXmlSerializer;
import com.turnengine.client.api.local.action.ActionQueued;
import com.turnengine.client.api.local.action.ActionQueuedXmlSerializer;
import com.turnengine.client.api.local.action.ActionStatus;
import com.turnengine.client.api.local.action.ActionStatusXmlSerializer;
import com.turnengine.client.api.local.action.ActionTarget;
import com.turnengine.client.api.local.action.ActionTargetXmlSerializer;
import com.turnengine.client.api.local.action.ActionXmlSerializer;
import com.turnengine.client.api.local.action.AddAction;
import com.turnengine.client.api.local.action.AddActionCondition;
import com.turnengine.client.api.local.action.AddActionConditionXmlSerializer;
import com.turnengine.client.api.local.action.AddActionPlugin;
import com.turnengine.client.api.local.action.AddActionPluginXmlSerializer;
import com.turnengine.client.api.local.action.AddActionTarget;
import com.turnengine.client.api.local.action.AddActionTargetXmlSerializer;
import com.turnengine.client.api.local.action.AddActionXmlSerializer;
import com.turnengine.client.api.local.action.CancelActionAtLocation;
import com.turnengine.client.api.local.action.CancelActionAtLocationXmlSerializer;
import com.turnengine.client.api.local.action.CancelActionAtPlayer;
import com.turnengine.client.api.local.action.CancelActionAtPlayerXmlSerializer;
import com.turnengine.client.api.local.action.ClearActionQueuedAtLocation;
import com.turnengine.client.api.local.action.ClearActionQueuedAtLocationXmlSerializer;
import com.turnengine.client.api.local.action.ClearActionQueuedAtPlayer;
import com.turnengine.client.api.local.action.ClearActionQueuedAtPlayerXmlSerializer;
import com.turnengine.client.api.local.action.ClearActionsQueuedAtLocation;
import com.turnengine.client.api.local.action.ClearActionsQueuedAtLocationXmlSerializer;
import com.turnengine.client.api.local.action.ClearActionsQueuedAtPlayer;
import com.turnengine.client.api.local.action.ClearActionsQueuedAtPlayerXmlSerializer;
import com.turnengine.client.api.local.action.GetActionConditionList;
import com.turnengine.client.api.local.action.GetActionConditionListXmlSerializer;
import com.turnengine.client.api.local.action.GetActionList;
import com.turnengine.client.api.local.action.GetActionListXmlSerializer;
import com.turnengine.client.api.local.action.GetActionPlugin;
import com.turnengine.client.api.local.action.GetActionPluginXmlSerializer;
import com.turnengine.client.api.local.action.GetActionTargetList;
import com.turnengine.client.api.local.action.GetActionTargetListXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsAvailableAtLocation;
import com.turnengine.client.api.local.action.ListActionsAvailableAtLocationXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsAvailableAtMobile;
import com.turnengine.client.api.local.action.ListActionsAvailableAtMobileXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsAvailableAtPlayer;
import com.turnengine.client.api.local.action.ListActionsAvailableAtPlayerXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsExecutingAtLocation;
import com.turnengine.client.api.local.action.ListActionsExecutingAtLocationXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsExecutingAtPlayer;
import com.turnengine.client.api.local.action.ListActionsExecutingAtPlayerXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsQueuedAtLocation;
import com.turnengine.client.api.local.action.ListActionsQueuedAtLocationXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsQueuedAtPlayer;
import com.turnengine.client.api.local.action.ListActionsQueuedAtPlayerXmlSerializer;
import com.turnengine.client.api.local.action.StartActionAtLocation;
import com.turnengine.client.api.local.action.StartActionAtLocationToLocation;
import com.turnengine.client.api.local.action.StartActionAtLocationToLocationXmlSerializer;
import com.turnengine.client.api.local.action.StartActionAtLocationXmlSerializer;
import com.turnengine.client.api.local.action.StartActionAtMobileToLocation;
import com.turnengine.client.api.local.action.StartActionAtMobileToLocationXmlSerializer;
import com.turnengine.client.api.local.action.StartActionAtPlayer;
import com.turnengine.client.api.local.action.StartActionAtPlayerXmlSerializer;
import com.turnengine.client.api.local.alliance.Alliance;
import com.turnengine.client.api.local.alliance.AllianceInfo;
import com.turnengine.client.api.local.alliance.AllianceInfoXmlSerializer;
import com.turnengine.client.api.local.alliance.AllianceProperty;
import com.turnengine.client.api.local.alliance.AlliancePropertyXmlSerializer;
import com.turnengine.client.api.local.alliance.AllianceSetupInfo;
import com.turnengine.client.api.local.alliance.AllianceSetupInfoXmlSerializer;
import com.turnengine.client.api.local.alliance.AllianceXmlSerializer;
import com.turnengine.client.api.local.alliance.DisbandAlliance;
import com.turnengine.client.api.local.alliance.DisbandAllianceXmlSerializer;
import com.turnengine.client.api.local.alliance.FormAlliance;
import com.turnengine.client.api.local.alliance.FormAllianceXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAlliance;
import com.turnengine.client.api.local.alliance.GetAllianceById;
import com.turnengine.client.api.local.alliance.GetAllianceByIdXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceByName;
import com.turnengine.client.api.local.alliance.GetAllianceByNameXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceCount;
import com.turnengine.client.api.local.alliance.GetAllianceCountXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceInfo;
import com.turnengine.client.api.local.alliance.GetAllianceInfoXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceInviteLimit;
import com.turnengine.client.api.local.alliance.GetAllianceInviteLimitXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceList;
import com.turnengine.client.api.local.alliance.GetAllianceListXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceLogo;
import com.turnengine.client.api.local.alliance.GetAllianceLogoXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceMemberCount;
import com.turnengine.client.api.local.alliance.GetAllianceMemberCountXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceMemberLimit;
import com.turnengine.client.api.local.alliance.GetAllianceMemberLimitXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAlliancePropertyList;
import com.turnengine.client.api.local.alliance.GetAlliancePropertyListXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceScores;
import com.turnengine.client.api.local.alliance.GetAllianceScoresXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceSetupInfo;
import com.turnengine.client.api.local.alliance.GetAllianceSetupInfoXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceXmlSerializer;
import com.turnengine.client.api.local.alliance.GetInvitedToJoinAllianceList;
import com.turnengine.client.api.local.alliance.GetInvitedToJoinAllianceListXmlSerializer;
import com.turnengine.client.api.local.alliance.GetRequestedToJoinAllianceList;
import com.turnengine.client.api.local.alliance.GetRequestedToJoinAllianceListXmlSerializer;
import com.turnengine.client.api.local.alliance.InviteToJoinAlliance;
import com.turnengine.client.api.local.alliance.InviteToJoinAllianceByName;
import com.turnengine.client.api.local.alliance.InviteToJoinAllianceByNameXmlSerializer;
import com.turnengine.client.api.local.alliance.InviteToJoinAllianceXmlSerializer;
import com.turnengine.client.api.local.alliance.KickAllianceMember;
import com.turnengine.client.api.local.alliance.KickAllianceMemberXmlSerializer;
import com.turnengine.client.api.local.alliance.LeaveAlliance;
import com.turnengine.client.api.local.alliance.LeaveAllianceXmlSerializer;
import com.turnengine.client.api.local.alliance.RequestToJoinAlliance;
import com.turnengine.client.api.local.alliance.RequestToJoinAllianceByName;
import com.turnengine.client.api.local.alliance.RequestToJoinAllianceByNameXmlSerializer;
import com.turnengine.client.api.local.alliance.RequestToJoinAllianceXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAllianceInviteLimit;
import com.turnengine.client.api.local.alliance.SetAllianceInviteLimitXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAllianceLeaveTurns;
import com.turnengine.client.api.local.alliance.SetAllianceLeaveTurnsXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAllianceLogo;
import com.turnengine.client.api.local.alliance.SetAllianceLogoXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAllianceMemberLimit;
import com.turnengine.client.api.local.alliance.SetAllianceMemberLimitXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAllianceProperty;
import com.turnengine.client.api.local.alliance.SetAlliancePropertyXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAlliancesEnabled;
import com.turnengine.client.api.local.alliance.SetAlliancesEnabledXmlSerializer;
import com.turnengine.client.api.local.allianceforum.AllianceForum;
import com.turnengine.client.api.local.allianceforum.AllianceForumPost;
import com.turnengine.client.api.local.allianceforum.AllianceForumPostXmlSerializer;
import com.turnengine.client.api.local.allianceforum.AllianceForumThread;
import com.turnengine.client.api.local.allianceforum.AllianceForumThreadXmlSerializer;
import com.turnengine.client.api.local.allianceforum.AllianceForumUser;
import com.turnengine.client.api.local.allianceforum.AllianceForumUserXmlSerializer;
import com.turnengine.client.api.local.allianceforum.AllianceForumXmlSerializer;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForum;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumPost;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumPostXmlSerializer;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumThread;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumThreadXmlSerializer;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumXmlSerializer;
import com.turnengine.client.api.local.allianceforum.EditAlliancePost;
import com.turnengine.client.api.local.allianceforum.EditAlliancePostXmlSerializer;
import com.turnengine.client.api.local.allianceforum.GetAllianceForumList;
import com.turnengine.client.api.local.allianceforum.GetAllianceForumListXmlSerializer;
import com.turnengine.client.api.local.allianceforum.GetAlliancePostList;
import com.turnengine.client.api.local.allianceforum.GetAlliancePostListXmlSerializer;
import com.turnengine.client.api.local.allianceforum.GetAllianceThread;
import com.turnengine.client.api.local.allianceforum.GetAllianceThreadList;
import com.turnengine.client.api.local.allianceforum.GetAllianceThreadListXmlSerializer;
import com.turnengine.client.api.local.allianceforum.GetAllianceThreadXmlSerializer;
import com.turnengine.client.api.local.allianceforum.SetAllianceForumFlag;
import com.turnengine.client.api.local.allianceforum.SetAllianceForumFlagXmlSerializer;
import com.turnengine.client.api.local.allianceforum.SetAllianceForumOrder;
import com.turnengine.client.api.local.allianceforum.SetAllianceForumOrderXmlSerializer;
import com.turnengine.client.api.local.allianceforum.SetAlliancePostFlag;
import com.turnengine.client.api.local.allianceforum.SetAlliancePostFlagXmlSerializer;
import com.turnengine.client.api.local.allianceforum.SetAllianceThreadFlag;
import com.turnengine.client.api.local.allianceforum.SetAllianceThreadFlagXmlSerializer;
import com.turnengine.client.api.local.error.GetLocalTrace;
import com.turnengine.client.api.local.error.GetLocalTraceList;
import com.turnengine.client.api.local.error.GetLocalTraceListXmlSerializer;
import com.turnengine.client.api.local.error.GetLocalTraceXmlSerializer;
import com.turnengine.client.api.local.error.LocalTrace;
import com.turnengine.client.api.local.error.LocalTraceXmlSerializer;
import com.turnengine.client.api.local.faction.AddFaction;
import com.turnengine.client.api.local.faction.AddFactionXmlSerializer;
import com.turnengine.client.api.local.faction.Faction;
import com.turnengine.client.api.local.faction.FactionXmlSerializer;
import com.turnengine.client.api.local.faction.GetFactionById;
import com.turnengine.client.api.local.faction.GetFactionByIdXmlSerializer;
import com.turnengine.client.api.local.faction.GetFactionByName;
import com.turnengine.client.api.local.faction.GetFactionByNameXmlSerializer;
import com.turnengine.client.api.local.faction.GetFactions;
import com.turnengine.client.api.local.faction.GetFactionsXmlSerializer;
import com.turnengine.client.api.local.game.AddGameUnits;
import com.turnengine.client.api.local.game.AddGameUnitsXmlSerializer;
import com.turnengine.client.api.local.game.GameUnits;
import com.turnengine.client.api.local.game.GameUnitsXmlSerializer;
import com.turnengine.client.api.local.game.GetGameStatus;
import com.turnengine.client.api.local.game.GetGameStatusXmlSerializer;
import com.turnengine.client.api.local.game.GetGameUnits;
import com.turnengine.client.api.local.game.GetGameUnitsXmlSerializer;
import com.turnengine.client.api.local.game.ResetGame;
import com.turnengine.client.api.local.game.ResetGameXmlSerializer;
import com.turnengine.client.api.local.game.SetGameInstance;
import com.turnengine.client.api.local.game.SetGameInstanceXmlSerializer;
import com.turnengine.client.api.local.game.ShutdownGame;
import com.turnengine.client.api.local.game.ShutdownGameXmlSerializer;
import com.turnengine.client.api.local.game.StartupGame;
import com.turnengine.client.api.local.game.StartupGameXmlSerializer;
import com.turnengine.client.api.local.group.AddChildGroup;
import com.turnengine.client.api.local.group.AddChildGroupXmlSerializer;
import com.turnengine.client.api.local.group.AddParentGroup;
import com.turnengine.client.api.local.group.AddParentGroupXmlSerializer;
import com.turnengine.client.api.local.group.GetGroupById;
import com.turnengine.client.api.local.group.GetGroupByIdXmlSerializer;
import com.turnengine.client.api.local.group.GetGroupByName;
import com.turnengine.client.api.local.group.GetGroupByNameXmlSerializer;
import com.turnengine.client.api.local.group.GetGroupListByFactionName;
import com.turnengine.client.api.local.group.GetGroupListByFactionNameXmlSerializer;
import com.turnengine.client.api.local.group.GetGroups;
import com.turnengine.client.api.local.group.GetGroupsXmlSerializer;
import com.turnengine.client.api.local.group.Group;
import com.turnengine.client.api.local.group.GroupXmlSerializer;
import com.turnengine.client.api.local.location.AddUnitsAtLocation;
import com.turnengine.client.api.local.location.AddUnitsAtLocationXmlSerializer;
import com.turnengine.client.api.local.location.CheckRenameLocation;
import com.turnengine.client.api.local.location.CheckRenameLocationXmlSerializer;
import com.turnengine.client.api.local.location.Coordinate;
import com.turnengine.client.api.local.location.CoordinateXmlSerializer;
import com.turnengine.client.api.local.location.GenerateLocations;
import com.turnengine.client.api.local.location.GenerateLocationsXmlSerializer;
import com.turnengine.client.api.local.location.GeneratedLocation;
import com.turnengine.client.api.local.location.GeneratedLocationXmlSerializer;
import com.turnengine.client.api.local.location.GetCoordinates;
import com.turnengine.client.api.local.location.GetCoordinatesXmlSerializer;
import com.turnengine.client.api.local.location.GetGridInfoList;
import com.turnengine.client.api.local.location.GetGridInfoListXmlSerializer;
import com.turnengine.client.api.local.location.GetLocation;
import com.turnengine.client.api.local.location.GetLocationCoordinatePlugin;
import com.turnengine.client.api.local.location.GetLocationCoordinatePluginXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationCount;
import com.turnengine.client.api.local.location.GetLocationCountXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationGenerationPlugin;
import com.turnengine.client.api.local.location.GetLocationGenerationPluginXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationId;
import com.turnengine.client.api.local.location.GetLocationIdXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationIdsForPlayer;
import com.turnengine.client.api.local.location.GetLocationIdsForPlayerXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationList;
import com.turnengine.client.api.local.location.GetLocationListXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationPropertyList;
import com.turnengine.client.api.local.location.GetLocationPropertyListXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationSetupInfo;
import com.turnengine.client.api.local.location.GetLocationSetupInfoXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationSignupsEnabled;
import com.turnengine.client.api.local.location.GetLocationSignupsEnabledXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationsEnabled;
import com.turnengine.client.api.local.location.GetLocationsEnabledXmlSerializer;
import com.turnengine.client.api.local.location.Grid;
import com.turnengine.client.api.local.location.GridInfo;
import com.turnengine.client.api.local.location.GridInfoXmlSerializer;
import com.turnengine.client.api.local.location.GridXmlSerializer;
import com.turnengine.client.api.local.location.Location;
import com.turnengine.client.api.local.location.LocationInfo;
import com.turnengine.client.api.local.location.LocationInfoXmlSerializer;
import com.turnengine.client.api.local.location.LocationProperty;
import com.turnengine.client.api.local.location.LocationPropertyXmlSerializer;
import com.turnengine.client.api.local.location.LocationSetupInfo;
import com.turnengine.client.api.local.location.LocationSetupInfoXmlSerializer;
import com.turnengine.client.api.local.location.LocationXmlSerializer;
import com.turnengine.client.api.local.location.RenameLocation;
import com.turnengine.client.api.local.location.RenameLocationXmlSerializer;
import com.turnengine.client.api.local.location.SetLocationCoordinatePlugin;
import com.turnengine.client.api.local.location.SetLocationCoordinatePluginXmlSerializer;
import com.turnengine.client.api.local.location.SetLocationGenerationPlugin;
import com.turnengine.client.api.local.location.SetLocationGenerationPluginXmlSerializer;
import com.turnengine.client.api.local.location.SetLocationProperty;
import com.turnengine.client.api.local.location.SetLocationPropertyXmlSerializer;
import com.turnengine.client.api.local.location.SetLocationSignupsEnabled;
import com.turnengine.client.api.local.location.SetLocationSignupsEnabledXmlSerializer;
import com.turnengine.client.api.local.location.SetLocationsEnabled;
import com.turnengine.client.api.local.location.SetLocationsEnabledXmlSerializer;
import com.turnengine.client.api.local.message.GetMessage;
import com.turnengine.client.api.local.message.GetMessageCountByFormat;
import com.turnengine.client.api.local.message.GetMessageCountByFormatXmlSerializer;
import com.turnengine.client.api.local.message.GetMessageSummary;
import com.turnengine.client.api.local.message.GetMessageSummaryXmlSerializer;
import com.turnengine.client.api.local.message.GetMessageXmlSerializer;
import com.turnengine.client.api.local.message.ListMessages;
import com.turnengine.client.api.local.message.ListMessagesXmlSerializer;
import com.turnengine.client.api.local.message.MakeNote;
import com.turnengine.client.api.local.message.MakeNoteXmlSerializer;
import com.turnengine.client.api.local.message.Message;
import com.turnengine.client.api.local.message.MessageList;
import com.turnengine.client.api.local.message.MessageListXmlSerializer;
import com.turnengine.client.api.local.message.MessageSummary;
import com.turnengine.client.api.local.message.MessageSummaryXmlSerializer;
import com.turnengine.client.api.local.message.MessageXmlSerializer;
import com.turnengine.client.api.local.message.PostNews;
import com.turnengine.client.api.local.message.PostNewsXmlSerializer;
import com.turnengine.client.api.local.message.SendMail;
import com.turnengine.client.api.local.message.SendMailXmlSerializer;
import com.turnengine.client.api.local.mobile.AddUnitsAtMobile;
import com.turnengine.client.api.local.mobile.AddUnitsAtMobileXmlSerializer;
import com.turnengine.client.api.local.mobile.ClearMobileQueue;
import com.turnengine.client.api.local.mobile.ClearMobileQueueXmlSerializer;
import com.turnengine.client.api.local.mobile.CreateMobileAtLocation;
import com.turnengine.client.api.local.mobile.CreateMobileAtLocationXmlSerializer;
import com.turnengine.client.api.local.mobile.CreateMobileAtMobile;
import com.turnengine.client.api.local.mobile.CreateMobileAtMobileXmlSerializer;
import com.turnengine.client.api.local.mobile.DestroyEmptyMobile;
import com.turnengine.client.api.local.mobile.DestroyEmptyMobileXmlSerializer;
import com.turnengine.client.api.local.mobile.GetCombatPlugin;
import com.turnengine.client.api.local.mobile.GetCombatPluginXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobile;
import com.turnengine.client.api.local.mobile.GetMobileIdsForPlayer;
import com.turnengine.client.api.local.mobile.GetMobileIdsForPlayerXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobileList;
import com.turnengine.client.api.local.mobile.GetMobileListXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobilePropertyList;
import com.turnengine.client.api.local.mobile.GetMobilePropertyListXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobileQueueList;
import com.turnengine.client.api.local.mobile.GetMobileQueueListXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobileSetupInfo;
import com.turnengine.client.api.local.mobile.GetMobileSetupInfoXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobileXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobilesEnabled;
import com.turnengine.client.api.local.mobile.GetMobilesEnabledXmlSerializer;
import com.turnengine.client.api.local.mobile.ListMobilesAtLocation;
import com.turnengine.client.api.local.mobile.ListMobilesAtLocationXmlSerializer;
import com.turnengine.client.api.local.mobile.Mobile;
import com.turnengine.client.api.local.mobile.MobileInfo;
import com.turnengine.client.api.local.mobile.MobileInfoXmlSerializer;
import com.turnengine.client.api.local.mobile.MobileProperty;
import com.turnengine.client.api.local.mobile.MobilePropertyXmlSerializer;
import com.turnengine.client.api.local.mobile.MobileQueueItem;
import com.turnengine.client.api.local.mobile.MobileQueueItemXmlSerializer;
import com.turnengine.client.api.local.mobile.MobileSetupInfo;
import com.turnengine.client.api.local.mobile.MobileSetupInfoXmlSerializer;
import com.turnengine.client.api.local.mobile.MobileXmlSerializer;
import com.turnengine.client.api.local.mobile.MoveMobile;
import com.turnengine.client.api.local.mobile.MoveMobileToCoordinates;
import com.turnengine.client.api.local.mobile.MoveMobileToCoordinatesXmlSerializer;
import com.turnengine.client.api.local.mobile.MoveMobileXmlSerializer;
import com.turnengine.client.api.local.mobile.RenameMobile;
import com.turnengine.client.api.local.mobile.RenameMobileXmlSerializer;
import com.turnengine.client.api.local.mobile.SetCombatPlugin;
import com.turnengine.client.api.local.mobile.SetCombatPluginXmlSerializer;
import com.turnengine.client.api.local.mobile.SetMobileMove;
import com.turnengine.client.api.local.mobile.SetMobileMoveXmlSerializer;
import com.turnengine.client.api.local.mobile.SetMobileMovementPlugin;
import com.turnengine.client.api.local.mobile.SetMobileMovementPluginXmlSerializer;
import com.turnengine.client.api.local.mobile.SetMobileProperty;
import com.turnengine.client.api.local.mobile.SetMobilePropertyXmlSerializer;
import com.turnengine.client.api.local.mobile.SetMobileWait;
import com.turnengine.client.api.local.mobile.SetMobileWaitXmlSerializer;
import com.turnengine.client.api.local.mobile.SetMobilesEnabled;
import com.turnengine.client.api.local.mobile.SetMobilesEnabledXmlSerializer;
import com.turnengine.client.api.local.mobile.TransferUnitsBetweenMobiles;
import com.turnengine.client.api.local.mobile.TransferUnitsBetweenMobilesXmlSerializer;
import com.turnengine.client.api.local.mobile.TransferUnitsFromMobile;
import com.turnengine.client.api.local.mobile.TransferUnitsFromMobileXmlSerializer;
import com.turnengine.client.api.local.mobile.TransferUnitsToMobile;
import com.turnengine.client.api.local.mobile.TransferUnitsToMobileXmlSerializer;
import com.turnengine.client.api.local.mobile.WaitMobile;
import com.turnengine.client.api.local.mobile.WaitMobileXmlSerializer;
import com.turnengine.client.api.local.player.AddUnitsAtPlayer;
import com.turnengine.client.api.local.player.AddUnitsAtPlayerXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayer;
import com.turnengine.client.api.local.player.GetPlayerActionQueueLimit;
import com.turnengine.client.api.local.player.GetPlayerActionQueueLimitXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerAvatar;
import com.turnengine.client.api.local.player.GetPlayerAvatarXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerById;
import com.turnengine.client.api.local.player.GetPlayerByIdXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerByName;
import com.turnengine.client.api.local.player.GetPlayerByNameXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerByUserId;
import com.turnengine.client.api.local.player.GetPlayerByUserIdXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerCount;
import com.turnengine.client.api.local.player.GetPlayerCountByFactionId;
import com.turnengine.client.api.local.player.GetPlayerCountByFactionIdXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerCountXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerInfo;
import com.turnengine.client.api.local.player.GetPlayerInfoXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerLimit;
import com.turnengine.client.api.local.player.GetPlayerLimitXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerList;
import com.turnengine.client.api.local.player.GetPlayerListXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerPropertyList;
import com.turnengine.client.api.local.player.GetPlayerPropertyListXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerScore;
import com.turnengine.client.api.local.player.GetPlayerScoreList;
import com.turnengine.client.api.local.player.GetPlayerScoreListXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerScoreXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerScores;
import com.turnengine.client.api.local.player.GetPlayerScoresXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerSetupInfo;
import com.turnengine.client.api.local.player.GetPlayerSetupInfoXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerSignupPlugin;
import com.turnengine.client.api.local.player.GetPlayerSignupPluginXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerSignupsEnabled;
import com.turnengine.client.api.local.player.GetPlayerSignupsEnabledXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerXmlSerializer;
import com.turnengine.client.api.local.player.GetUserAdminInfoByPlayer;
import com.turnengine.client.api.local.player.GetUserAdminInfoByPlayerXmlSerializer;
import com.turnengine.client.api.local.player.IsPlayerSignedUp;
import com.turnengine.client.api.local.player.IsPlayerSignedUpXmlSerializer;
import com.turnengine.client.api.local.player.Player;
import com.turnengine.client.api.local.player.PlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoXmlSerializer;
import com.turnengine.client.api.local.player.PlayerProperty;
import com.turnengine.client.api.local.player.PlayerPropertyXmlSerializer;
import com.turnengine.client.api.local.player.PlayerSetupInfo;
import com.turnengine.client.api.local.player.PlayerSetupInfoXmlSerializer;
import com.turnengine.client.api.local.player.PlayerXmlSerializer;
import com.turnengine.client.api.local.player.RenamePlayer;
import com.turnengine.client.api.local.player.RenamePlayerXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerActionQueueLimit;
import com.turnengine.client.api.local.player.SetPlayerActionQueueLimitXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerAvatar;
import com.turnengine.client.api.local.player.SetPlayerAvatarXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerLimit;
import com.turnengine.client.api.local.player.SetPlayerLimitXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerProperty;
import com.turnengine.client.api.local.player.SetPlayerPropertyXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerSignupPlugin;
import com.turnengine.client.api.local.player.SetPlayerSignupPluginXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerSignupsEnabled;
import com.turnengine.client.api.local.player.SetPlayerSignupsEnabledXmlSerializer;
import com.turnengine.client.api.local.player.SignupPlayer;
import com.turnengine.client.api.local.player.SignupPlayerXmlSerializer;
import com.turnengine.client.api.local.property.GetLocalProperty;
import com.turnengine.client.api.local.property.GetLocalPropertyXmlSerializer;
import com.turnengine.client.api.local.property.SetLocalProperty;
import com.turnengine.client.api.local.property.SetLocalPropertyXmlSerializer;
import com.turnengine.client.api.local.score.AllianceRanking;
import com.turnengine.client.api.local.score.AllianceRankingXmlSerializer;
import com.turnengine.client.api.local.score.GetAllianceRankingList;
import com.turnengine.client.api.local.score.GetAllianceRankingListXmlSerializer;
import com.turnengine.client.api.local.score.GetPlayerRankingList;
import com.turnengine.client.api.local.score.GetPlayerRankingListXmlSerializer;
import com.turnengine.client.api.local.score.GetRankingGroupList;
import com.turnengine.client.api.local.score.GetRankingGroupListXmlSerializer;
import com.turnengine.client.api.local.score.GetRankingList;
import com.turnengine.client.api.local.score.GetRankingListXmlSerializer;
import com.turnengine.client.api.local.score.GetScoreDivisor;
import com.turnengine.client.api.local.score.GetScoreDivisorXmlSerializer;
import com.turnengine.client.api.local.score.GetUnitScore;
import com.turnengine.client.api.local.score.GetUnitScoreXmlSerializer;
import com.turnengine.client.api.local.score.GetUnitScores;
import com.turnengine.client.api.local.score.GetUnitScoresXmlSerializer;
import com.turnengine.client.api.local.score.GroupScore;
import com.turnengine.client.api.local.score.GroupScoreXmlSerializer;
import com.turnengine.client.api.local.score.PlayerRanking;
import com.turnengine.client.api.local.score.PlayerRankingXmlSerializer;
import com.turnengine.client.api.local.score.Ranking;
import com.turnengine.client.api.local.score.RankingXmlSerializer;
import com.turnengine.client.api.local.score.SetScoreDivisor;
import com.turnengine.client.api.local.score.SetScoreDivisorXmlSerializer;
import com.turnengine.client.api.local.score.SetScoreUpdaterGroup;
import com.turnengine.client.api.local.score.SetScoreUpdaterGroupXmlSerializer;
import com.turnengine.client.api.local.score.SetUnitScore;
import com.turnengine.client.api.local.score.SetUnitScoreXmlSerializer;
import com.turnengine.client.api.local.score.TurnScore;
import com.turnengine.client.api.local.score.TurnScoreXmlSerializer;
import com.turnengine.client.api.local.score.UnitScore;
import com.turnengine.client.api.local.score.UnitScoreXmlSerializer;
import com.turnengine.client.api.local.setup.ClearSetup;
import com.turnengine.client.api.local.setup.ClearSetupXmlSerializer;
import com.turnengine.client.api.local.setup.GetSetupBeanList;
import com.turnengine.client.api.local.setup.GetSetupBeanListXmlSerializer;
import com.turnengine.client.api.local.setup.SetSetupBeanList;
import com.turnengine.client.api.local.setup.SetSetupBeanListFile;
import com.turnengine.client.api.local.setup.SetSetupBeanListFileXmlSerializer;
import com.turnengine.client.api.local.setup.SetSetupBeanListXmlSerializer;
import com.turnengine.client.api.local.setup.SetupAddAction;
import com.turnengine.client.api.local.setup.SetupAddActionCondition;
import com.turnengine.client.api.local.setup.SetupAddActionConditionXmlSerializer;
import com.turnengine.client.api.local.setup.SetupAddActionTarget;
import com.turnengine.client.api.local.setup.SetupAddActionTargetXmlSerializer;
import com.turnengine.client.api.local.setup.SetupAddActionXmlSerializer;
import com.turnengine.client.api.local.setup.SetupAddChildGroup;
import com.turnengine.client.api.local.setup.SetupAddChildGroupXmlSerializer;
import com.turnengine.client.api.local.setup.SetupAddFaction;
import com.turnengine.client.api.local.setup.SetupAddFactionXmlSerializer;
import com.turnengine.client.api.local.setup.SetupAddParentGroup;
import com.turnengine.client.api.local.setup.SetupAddParentGroupXmlSerializer;
import com.turnengine.client.api.local.setup.SetupAddUnit;
import com.turnengine.client.api.local.setup.SetupAddUnitXmlSerializer;
import com.turnengine.client.api.local.setup.SetupAddUpkeep;
import com.turnengine.client.api.local.setup.SetupAddUpkeepCondition;
import com.turnengine.client.api.local.setup.SetupAddUpkeepConditionXmlSerializer;
import com.turnengine.client.api.local.setup.SetupAddUpkeepXmlSerializer;
import com.turnengine.client.api.local.setup.SetupRoot;
import com.turnengine.client.api.local.setup.SetupRootXmlSerializer;
import com.turnengine.client.api.local.setup.SetupSetScoreDivisor;
import com.turnengine.client.api.local.setup.SetupSetScoreDivisorXmlSerializer;
import com.turnengine.client.api.local.setup.SetupSetScoreUpdaterGroup;
import com.turnengine.client.api.local.setup.SetupSetScoreUpdaterGroupXmlSerializer;
import com.turnengine.client.api.local.setup.SetupSetStorageGroup;
import com.turnengine.client.api.local.setup.SetupSetStorageGroupXmlSerializer;
import com.turnengine.client.api.local.setup.SetupSetStorageItem;
import com.turnengine.client.api.local.setup.SetupSetStorageItemXmlSerializer;
import com.turnengine.client.api.local.setup.SetupSetUnitScore;
import com.turnengine.client.api.local.setup.SetupSetUnitScoreXmlSerializer;
import com.turnengine.client.api.local.storage.GetStorageGroups;
import com.turnengine.client.api.local.storage.GetStorageGroupsXmlSerializer;
import com.turnengine.client.api.local.storage.GetStorageItems;
import com.turnengine.client.api.local.storage.GetStorageItemsXmlSerializer;
import com.turnengine.client.api.local.storage.SetStorageGroup;
import com.turnengine.client.api.local.storage.SetStorageGroupXmlSerializer;
import com.turnengine.client.api.local.storage.SetStorageItem;
import com.turnengine.client.api.local.storage.SetStorageItemXmlSerializer;
import com.turnengine.client.api.local.storage.StorageGroup;
import com.turnengine.client.api.local.storage.StorageGroupXmlSerializer;
import com.turnengine.client.api.local.storage.StorageItem;
import com.turnengine.client.api.local.storage.StorageItemXmlSerializer;
import com.turnengine.client.api.local.trading.BuyGoodsAtLocation;
import com.turnengine.client.api.local.trading.BuyGoodsAtLocationXmlSerializer;
import com.turnengine.client.api.local.trading.GetGoodsPriceListAtLocation;
import com.turnengine.client.api.local.trading.GetGoodsPriceListAtLocationXmlSerializer;
import com.turnengine.client.api.local.trading.Price;
import com.turnengine.client.api.local.trading.PriceXmlSerializer;
import com.turnengine.client.api.local.trading.SellGoodsAtLocation;
import com.turnengine.client.api.local.trading.SellGoodsAtLocationXmlSerializer;
import com.turnengine.client.api.local.trading.SetTradeAtLocationPlugin;
import com.turnengine.client.api.local.trading.SetTradeAtLocationPluginXmlSerializer;
import com.turnengine.client.api.local.trading.Trade;
import com.turnengine.client.api.local.trading.TradeXmlSerializer;
import com.turnengine.client.api.local.turn.ExecuteTurns;
import com.turnengine.client.api.local.turn.ExecuteTurnsXmlSerializer;
import com.turnengine.client.api.local.turn.GetNextTurnUpdateTime;
import com.turnengine.client.api.local.turn.GetNextTurnUpdateTimeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnDetails;
import com.turnengine.client.api.local.turn.GetTurnDetailsXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnFinishTime;
import com.turnengine.client.api.local.turn.GetTurnFinishTimeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnInterval;
import com.turnengine.client.api.local.turn.GetTurnIntervalXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnNumber;
import com.turnengine.client.api.local.turn.GetTurnNumberXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnStartTime;
import com.turnengine.client.api.local.turn.GetTurnStartTimeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnSummary;
import com.turnengine.client.api.local.turn.GetTurnSummaryXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnUpdating;
import com.turnengine.client.api.local.turn.GetTurnUpdatingXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurns;
import com.turnengine.client.api.local.turn.GetTurnsEnabled;
import com.turnengine.client.api.local.turn.GetTurnsEnabledXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnsXmlSerializer;
import com.turnengine.client.api.local.turn.SetTurnFinishTime;
import com.turnengine.client.api.local.turn.SetTurnFinishTimeXmlSerializer;
import com.turnengine.client.api.local.turn.SetTurnInterval;
import com.turnengine.client.api.local.turn.SetTurnIntervalTime;
import com.turnengine.client.api.local.turn.SetTurnIntervalTimeXmlSerializer;
import com.turnengine.client.api.local.turn.SetTurnIntervalXmlSerializer;
import com.turnengine.client.api.local.turn.SetTurnStartTime;
import com.turnengine.client.api.local.turn.SetTurnStartTimeXmlSerializer;
import com.turnengine.client.api.local.turn.SetTurnsEnabled;
import com.turnengine.client.api.local.turn.SetTurnsEnabledXmlSerializer;
import com.turnengine.client.api.local.turn.Turn;
import com.turnengine.client.api.local.turn.TurnComponent;
import com.turnengine.client.api.local.turn.TurnComponentXmlSerializer;
import com.turnengine.client.api.local.turn.TurnDetails;
import com.turnengine.client.api.local.turn.TurnDetailsXmlSerializer;
import com.turnengine.client.api.local.turn.TurnSummary;
import com.turnengine.client.api.local.turn.TurnSummaryXmlSerializer;
import com.turnengine.client.api.local.turn.TurnXmlSerializer;
import com.turnengine.client.api.local.unit.AddUnit;
import com.turnengine.client.api.local.unit.AddUnitXmlSerializer;
import com.turnengine.client.api.local.unit.GetAllUnitsAtPlayer;
import com.turnengine.client.api.local.unit.GetAllUnitsAtPlayerXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitById;
import com.turnengine.client.api.local.unit.GetUnitByIdXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitByName;
import com.turnengine.client.api.local.unit.GetUnitByNameXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnits;
import com.turnengine.client.api.local.unit.GetUnitsAtPlayer;
import com.turnengine.client.api.local.unit.GetUnitsAtPlayerXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitsByFactionId;
import com.turnengine.client.api.local.unit.GetUnitsByFactionIdXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitsByFactionName;
import com.turnengine.client.api.local.unit.GetUnitsByFactionNameXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitsByGroupId;
import com.turnengine.client.api.local.unit.GetUnitsByGroupIdXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitsByGroupName;
import com.turnengine.client.api.local.unit.GetUnitsByGroupNameXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitsXmlSerializer;
import com.turnengine.client.api.local.unit.Unit;
import com.turnengine.client.api.local.unit.UnitCount;
import com.turnengine.client.api.local.unit.UnitCountRange;
import com.turnengine.client.api.local.unit.UnitCountRangeXmlSerializer;
import com.turnengine.client.api.local.unit.UnitCountXmlSerializer;
import com.turnengine.client.api.local.unit.UnitNameCount;
import com.turnengine.client.api.local.unit.UnitNameCountXmlSerializer;
import com.turnengine.client.api.local.unit.UnitXmlSerializer;
import com.turnengine.client.api.local.upkeep.AddUpkeep;
import com.turnengine.client.api.local.upkeep.AddUpkeepCondition;
import com.turnengine.client.api.local.upkeep.AddUpkeepConditionXmlSerializer;
import com.turnengine.client.api.local.upkeep.AddUpkeepXmlSerializer;
import com.turnengine.client.api.local.upkeep.GetUpkeepAtLocation;
import com.turnengine.client.api.local.upkeep.GetUpkeepAtLocationXmlSerializer;
import com.turnengine.client.api.local.upkeep.GetUpkeepConditionList;
import com.turnengine.client.api.local.upkeep.GetUpkeepConditionListXmlSerializer;
import com.turnengine.client.api.local.upkeep.GetUpkeepList;
import com.turnengine.client.api.local.upkeep.GetUpkeepListXmlSerializer;
import com.turnengine.client.api.local.upkeep.Upkeep;
import com.turnengine.client.api.local.upkeep.UpkeepCondition;
import com.turnengine.client.api.local.upkeep.UpkeepConditionXmlSerializer;
import com.turnengine.client.api.local.upkeep.UpkeepXmlSerializer;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalXmlSerializerFactory implements IObjectFactory<IXmlSerializer<?>> {

	private final Map<Object, Class<? extends IXmlSerializer<?>>> objectMap = new ConcurrentHashMap<Object, Class<? extends IXmlSerializer<?>>>();;

	public GlobalXmlSerializerFactory() {

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id
		objectMap.put(PluginDetails.SERIALIZATION_ID, PluginDetailsXmlSerializer.class);

		// Mappings by name
		objectMap.put("PluginDetails", PluginDetailsXmlSerializer.class);

		// Mappings by id
		objectMap.put(AdminHostAddress.SERIALIZATION_ID, AdminHostAddressXmlSerializer.class);
		objectMap.put(SendEmail.SERIALIZATION_ID, SendEmailXmlSerializer.class);
		objectMap.put(GetAdminHostAddress.SERIALIZATION_ID, GetAdminHostAddressXmlSerializer.class);

		// Mappings by name
		objectMap.put("AdminHostAddress", AdminHostAddressXmlSerializer.class);
		objectMap.put("SendEmail", SendEmailXmlSerializer.class);
		objectMap.put("GetAdminHostAddress", GetAdminHostAddressXmlSerializer.class);

		// Mappings by id
		objectMap.put(Announcement.SERIALIZATION_ID, AnnouncementXmlSerializer.class);
		objectMap.put(PostAnnouncement.SERIALIZATION_ID, PostAnnouncementXmlSerializer.class);
		objectMap.put(GetAnnouncementCount.SERIALIZATION_ID, GetAnnouncementCountXmlSerializer.class);
		objectMap.put(GetAnnouncementList.SERIALIZATION_ID, GetAnnouncementListXmlSerializer.class);
		objectMap.put(DeleteAnnouncement.SERIALIZATION_ID, DeleteAnnouncementXmlSerializer.class);

		// Mappings by name
		objectMap.put("Announcement", AnnouncementXmlSerializer.class);
		objectMap.put("PostAnnouncement", PostAnnouncementXmlSerializer.class);
		objectMap.put("GetAnnouncementCount", GetAnnouncementCountXmlSerializer.class);
		objectMap.put("GetAnnouncementList", GetAnnouncementListXmlSerializer.class);
		objectMap.put("DeleteAnnouncement", DeleteAnnouncementXmlSerializer.class);

		// Mappings by id
		objectMap.put(CommandStackTrace.SERIALIZATION_ID, CommandStackTraceXmlSerializer.class);
		objectMap.put(GetCommandStackTrace.SERIALIZATION_ID, GetCommandStackTraceXmlSerializer.class);
		objectMap.put(GetCommandStackTraceList.SERIALIZATION_ID, GetCommandStackTraceListXmlSerializer.class);

		// Mappings by name
		objectMap.put("CommandStackTrace", CommandStackTraceXmlSerializer.class);
		objectMap.put("GetCommandStackTrace", GetCommandStackTraceXmlSerializer.class);
		objectMap.put("GetCommandStackTraceList", GetCommandStackTraceListXmlSerializer.class);

		// Mappings by id
		objectMap.put(Image.SERIALIZATION_ID, ImageXmlSerializer.class);

		// Mappings by name
		objectMap.put("Image", ImageXmlSerializer.class);

		// Mappings by id
		objectMap.put(Translation.SERIALIZATION_ID, TranslationXmlSerializer.class);
		objectMap.put(NewTranslation.SERIALIZATION_ID, NewTranslationXmlSerializer.class);
		objectMap.put(SetTranslation.SERIALIZATION_ID, SetTranslationXmlSerializer.class);
		objectMap.put(GetTranslationById.SERIALIZATION_ID, GetTranslationByIdXmlSerializer.class);
		objectMap.put(GetTranslationByText.SERIALIZATION_ID, GetTranslationByTextXmlSerializer.class);

		// Mappings by name
		objectMap.put("Translation", TranslationXmlSerializer.class);
		objectMap.put("NewTranslation", NewTranslationXmlSerializer.class);
		objectMap.put("SetTranslation", SetTranslationXmlSerializer.class);
		objectMap.put("GetTranslationById", GetTranslationByIdXmlSerializer.class);
		objectMap.put("GetTranslationByText", GetTranslationByTextXmlSerializer.class);

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id
		objectMap.put(GameUnits.SERIALIZATION_ID, GameUnitsXmlSerializer.class);
		objectMap.put(SetGameInstance.SERIALIZATION_ID, SetGameInstanceXmlSerializer.class);
		objectMap.put(StartupGame.SERIALIZATION_ID, StartupGameXmlSerializer.class);
		objectMap.put(ResetGame.SERIALIZATION_ID, ResetGameXmlSerializer.class);
		objectMap.put(ShutdownGame.SERIALIZATION_ID, ShutdownGameXmlSerializer.class);
		objectMap.put(GetGameStatus.SERIALIZATION_ID, GetGameStatusXmlSerializer.class);
		objectMap.put(AddGameUnits.SERIALIZATION_ID, AddGameUnitsXmlSerializer.class);
		objectMap.put(GetGameUnits.SERIALIZATION_ID, GetGameUnitsXmlSerializer.class);

		// Mappings by name
		objectMap.put("GameUnits", GameUnitsXmlSerializer.class);
		objectMap.put("SetGameInstance", SetGameInstanceXmlSerializer.class);
		objectMap.put("StartupGame", StartupGameXmlSerializer.class);
		objectMap.put("ResetGame", ResetGameXmlSerializer.class);
		objectMap.put("ShutdownGame", ShutdownGameXmlSerializer.class);
		objectMap.put("GetGameStatus", GetGameStatusXmlSerializer.class);
		objectMap.put("AddGameUnits", AddGameUnitsXmlSerializer.class);
		objectMap.put("GetGameUnits", GetGameUnitsXmlSerializer.class);

		// Mappings by id
		objectMap.put(Faction.SERIALIZATION_ID, FactionXmlSerializer.class);
		objectMap.put(AddFaction.SERIALIZATION_ID, AddFactionXmlSerializer.class);
		objectMap.put(GetFactionById.SERIALIZATION_ID, GetFactionByIdXmlSerializer.class);
		objectMap.put(GetFactionByName.SERIALIZATION_ID, GetFactionByNameXmlSerializer.class);
		objectMap.put(GetFactions.SERIALIZATION_ID, GetFactionsXmlSerializer.class);

		// Mappings by name
		objectMap.put("Faction", FactionXmlSerializer.class);
		objectMap.put("AddFaction", AddFactionXmlSerializer.class);
		objectMap.put("GetFactionById", GetFactionByIdXmlSerializer.class);
		objectMap.put("GetFactionByName", GetFactionByNameXmlSerializer.class);
		objectMap.put("GetFactions", GetFactionsXmlSerializer.class);

		// Mappings by id
		objectMap.put(LocalTrace.SERIALIZATION_ID, LocalTraceXmlSerializer.class);
		objectMap.put(GetLocalTrace.SERIALIZATION_ID, GetLocalTraceXmlSerializer.class);
		objectMap.put(GetLocalTraceList.SERIALIZATION_ID, GetLocalTraceListXmlSerializer.class);

		// Mappings by name
		objectMap.put("LocalTrace", LocalTraceXmlSerializer.class);
		objectMap.put("GetLocalTrace", GetLocalTraceXmlSerializer.class);
		objectMap.put("GetLocalTraceList", GetLocalTraceListXmlSerializer.class);

		// Mappings by id
		objectMap.put(AllianceForumUser.SERIALIZATION_ID, AllianceForumUserXmlSerializer.class);
		objectMap.put(AllianceForum.SERIALIZATION_ID, AllianceForumXmlSerializer.class);
		objectMap.put(AllianceForumThread.SERIALIZATION_ID, AllianceForumThreadXmlSerializer.class);
		objectMap.put(AllianceForumPost.SERIALIZATION_ID, AllianceForumPostXmlSerializer.class);
		objectMap.put(CreateAllianceForum.SERIALIZATION_ID, CreateAllianceForumXmlSerializer.class);
		objectMap.put(CreateAllianceForumThread.SERIALIZATION_ID, CreateAllianceForumThreadXmlSerializer.class);
		objectMap.put(CreateAllianceForumPost.SERIALIZATION_ID, CreateAllianceForumPostXmlSerializer.class);
		objectMap.put(SetAllianceForumOrder.SERIALIZATION_ID, SetAllianceForumOrderXmlSerializer.class);
		objectMap.put(GetAllianceForumList.SERIALIZATION_ID, GetAllianceForumListXmlSerializer.class);
		objectMap.put(GetAllianceThreadList.SERIALIZATION_ID, GetAllianceThreadListXmlSerializer.class);
		objectMap.put(GetAllianceThread.SERIALIZATION_ID, GetAllianceThreadXmlSerializer.class);
		objectMap.put(EditAlliancePost.SERIALIZATION_ID, EditAlliancePostXmlSerializer.class);
		objectMap.put(SetAllianceForumFlag.SERIALIZATION_ID, SetAllianceForumFlagXmlSerializer.class);
		objectMap.put(SetAllianceThreadFlag.SERIALIZATION_ID, SetAllianceThreadFlagXmlSerializer.class);
		objectMap.put(SetAlliancePostFlag.SERIALIZATION_ID, SetAlliancePostFlagXmlSerializer.class);
		objectMap.put(GetAlliancePostList.SERIALIZATION_ID, GetAlliancePostListXmlSerializer.class);

		// Mappings by name
		objectMap.put("AllianceForumUser", AllianceForumUserXmlSerializer.class);
		objectMap.put("AllianceForum", AllianceForumXmlSerializer.class);
		objectMap.put("AllianceForumThread", AllianceForumThreadXmlSerializer.class);
		objectMap.put("AllianceForumPost", AllianceForumPostXmlSerializer.class);
		objectMap.put("CreateAllianceForum", CreateAllianceForumXmlSerializer.class);
		objectMap.put("CreateAllianceForumThread", CreateAllianceForumThreadXmlSerializer.class);
		objectMap.put("CreateAllianceForumPost", CreateAllianceForumPostXmlSerializer.class);
		objectMap.put("SetAllianceForumOrder", SetAllianceForumOrderXmlSerializer.class);
		objectMap.put("GetAllianceForumList", GetAllianceForumListXmlSerializer.class);
		objectMap.put("GetAllianceThreadList", GetAllianceThreadListXmlSerializer.class);
		objectMap.put("GetAllianceThread", GetAllianceThreadXmlSerializer.class);
		objectMap.put("EditAlliancePost", EditAlliancePostXmlSerializer.class);
		objectMap.put("SetAllianceForumFlag", SetAllianceForumFlagXmlSerializer.class);
		objectMap.put("SetAllianceThreadFlag", SetAllianceThreadFlagXmlSerializer.class);
		objectMap.put("SetAlliancePostFlag", SetAlliancePostFlagXmlSerializer.class);
		objectMap.put("GetAlliancePostList", GetAlliancePostListXmlSerializer.class);

		// Mappings by id
		objectMap.put(ForumUser.SERIALIZATION_ID, ForumUserXmlSerializer.class);
		objectMap.put(Forum.SERIALIZATION_ID, ForumXmlSerializer.class);
		objectMap.put(ForumThread.SERIALIZATION_ID, ForumThreadXmlSerializer.class);
		objectMap.put(ForumPost.SERIALIZATION_ID, ForumPostXmlSerializer.class);
		objectMap.put(CreateForum.SERIALIZATION_ID, CreateForumXmlSerializer.class);
		objectMap.put(CreateForumThread.SERIALIZATION_ID, CreateForumThreadXmlSerializer.class);
		objectMap.put(CreateForumPost.SERIALIZATION_ID, CreateForumPostXmlSerializer.class);
		objectMap.put(SetForumOrder.SERIALIZATION_ID, SetForumOrderXmlSerializer.class);
		objectMap.put(GetForumList.SERIALIZATION_ID, GetForumListXmlSerializer.class);
		objectMap.put(GetThreadList.SERIALIZATION_ID, GetThreadListXmlSerializer.class);
		objectMap.put(GetThread.SERIALIZATION_ID, GetThreadXmlSerializer.class);
		objectMap.put(EditPost.SERIALIZATION_ID, EditPostXmlSerializer.class);
		objectMap.put(SetForumFlag.SERIALIZATION_ID, SetForumFlagXmlSerializer.class);
		objectMap.put(SetThreadFlag.SERIALIZATION_ID, SetThreadFlagXmlSerializer.class);
		objectMap.put(SetPostFlag.SERIALIZATION_ID, SetPostFlagXmlSerializer.class);
		objectMap.put(GetPostList.SERIALIZATION_ID, GetPostListXmlSerializer.class);

		// Mappings by name
		objectMap.put("ForumUser", ForumUserXmlSerializer.class);
		objectMap.put("Forum", ForumXmlSerializer.class);
		objectMap.put("ForumThread", ForumThreadXmlSerializer.class);
		objectMap.put("ForumPost", ForumPostXmlSerializer.class);
		objectMap.put("CreateForum", CreateForumXmlSerializer.class);
		objectMap.put("CreateForumThread", CreateForumThreadXmlSerializer.class);
		objectMap.put("CreateForumPost", CreateForumPostXmlSerializer.class);
		objectMap.put("SetForumOrder", SetForumOrderXmlSerializer.class);
		objectMap.put("GetForumList", GetForumListXmlSerializer.class);
		objectMap.put("GetThreadList", GetThreadListXmlSerializer.class);
		objectMap.put("GetThread", GetThreadXmlSerializer.class);
		objectMap.put("EditPost", EditPostXmlSerializer.class);
		objectMap.put("SetForumFlag", SetForumFlagXmlSerializer.class);
		objectMap.put("SetThreadFlag", SetThreadFlagXmlSerializer.class);
		objectMap.put("SetPostFlag", SetPostFlagXmlSerializer.class);
		objectMap.put("GetPostList", GetPostListXmlSerializer.class);

		// Mappings by id
		objectMap.put(Group.SERIALIZATION_ID, GroupXmlSerializer.class);
		objectMap.put(AddParentGroup.SERIALIZATION_ID, AddParentGroupXmlSerializer.class);
		objectMap.put(AddChildGroup.SERIALIZATION_ID, AddChildGroupXmlSerializer.class);
		objectMap.put(GetGroupById.SERIALIZATION_ID, GetGroupByIdXmlSerializer.class);
		objectMap.put(GetGroupByName.SERIALIZATION_ID, GetGroupByNameXmlSerializer.class);
		objectMap.put(GetGroups.SERIALIZATION_ID, GetGroupsXmlSerializer.class);
		objectMap.put(GetGroupListByFactionName.SERIALIZATION_ID, GetGroupListByFactionNameXmlSerializer.class);

		// Mappings by name
		objectMap.put("Group", GroupXmlSerializer.class);
		objectMap.put("AddParentGroup", AddParentGroupXmlSerializer.class);
		objectMap.put("AddChildGroup", AddChildGroupXmlSerializer.class);
		objectMap.put("GetGroupById", GetGroupByIdXmlSerializer.class);
		objectMap.put("GetGroupByName", GetGroupByNameXmlSerializer.class);
		objectMap.put("GetGroups", GetGroupsXmlSerializer.class);
		objectMap.put("GetGroupListByFactionName", GetGroupListByFactionNameXmlSerializer.class);

		// Mappings by id
		objectMap.put(SetLocalProperty.SERIALIZATION_ID, SetLocalPropertyXmlSerializer.class);
		objectMap.put(GetLocalProperty.SERIALIZATION_ID, GetLocalPropertyXmlSerializer.class);

		// Mappings by name
		objectMap.put("SetLocalProperty", SetLocalPropertyXmlSerializer.class);
		objectMap.put("GetLocalProperty", GetLocalPropertyXmlSerializer.class);

		// Mappings by id
		objectMap.put(Message.SERIALIZATION_ID, MessageXmlSerializer.class);
		objectMap.put(MessageSummary.SERIALIZATION_ID, MessageSummaryXmlSerializer.class);
		objectMap.put(MessageList.SERIALIZATION_ID, MessageListXmlSerializer.class);
		objectMap.put(SendMail.SERIALIZATION_ID, SendMailXmlSerializer.class);
		objectMap.put(MakeNote.SERIALIZATION_ID, MakeNoteXmlSerializer.class);
		objectMap.put(PostNews.SERIALIZATION_ID, PostNewsXmlSerializer.class);
		objectMap.put(ListMessages.SERIALIZATION_ID, ListMessagesXmlSerializer.class);
		objectMap.put(GetMessageSummary.SERIALIZATION_ID, GetMessageSummaryXmlSerializer.class);
		objectMap.put(GetMessage.SERIALIZATION_ID, GetMessageXmlSerializer.class);
		objectMap.put(GetMessageCountByFormat.SERIALIZATION_ID, GetMessageCountByFormatXmlSerializer.class);

		// Mappings by name
		objectMap.put("Message", MessageXmlSerializer.class);
		objectMap.put("MessageSummary", MessageSummaryXmlSerializer.class);
		objectMap.put("MessageList", MessageListXmlSerializer.class);
		objectMap.put("SendMail", SendMailXmlSerializer.class);
		objectMap.put("MakeNote", MakeNoteXmlSerializer.class);
		objectMap.put("PostNews", PostNewsXmlSerializer.class);
		objectMap.put("ListMessages", ListMessagesXmlSerializer.class);
		objectMap.put("GetMessageSummary", GetMessageSummaryXmlSerializer.class);
		objectMap.put("GetMessage", GetMessageXmlSerializer.class);
		objectMap.put("GetMessageCountByFormat", GetMessageCountByFormatXmlSerializer.class);

		// Mappings by id
		objectMap.put(UnitScore.SERIALIZATION_ID, UnitScoreXmlSerializer.class);
		objectMap.put(GroupScore.SERIALIZATION_ID, GroupScoreXmlSerializer.class);
		objectMap.put(Ranking.SERIALIZATION_ID, RankingXmlSerializer.class);
		objectMap.put(PlayerRanking.SERIALIZATION_ID, PlayerRankingXmlSerializer.class);
		objectMap.put(AllianceRanking.SERIALIZATION_ID, AllianceRankingXmlSerializer.class);
		objectMap.put(TurnScore.SERIALIZATION_ID, TurnScoreXmlSerializer.class);
		objectMap.put(SetUnitScore.SERIALIZATION_ID, SetUnitScoreXmlSerializer.class);
		objectMap.put(GetUnitScore.SERIALIZATION_ID, GetUnitScoreXmlSerializer.class);
		objectMap.put(GetUnitScores.SERIALIZATION_ID, GetUnitScoresXmlSerializer.class);
		objectMap.put(SetScoreUpdaterGroup.SERIALIZATION_ID, SetScoreUpdaterGroupXmlSerializer.class);
		objectMap.put(GetRankingList.SERIALIZATION_ID, GetRankingListXmlSerializer.class);
		objectMap.put(GetRankingGroupList.SERIALIZATION_ID, GetRankingGroupListXmlSerializer.class);
		objectMap.put(GetPlayerRankingList.SERIALIZATION_ID, GetPlayerRankingListXmlSerializer.class);
		objectMap.put(GetAllianceRankingList.SERIALIZATION_ID, GetAllianceRankingListXmlSerializer.class);
		objectMap.put(SetScoreDivisor.SERIALIZATION_ID, SetScoreDivisorXmlSerializer.class);
		objectMap.put(GetScoreDivisor.SERIALIZATION_ID, GetScoreDivisorXmlSerializer.class);

		// Mappings by name
		objectMap.put("UnitScore", UnitScoreXmlSerializer.class);
		objectMap.put("GroupScore", GroupScoreXmlSerializer.class);
		objectMap.put("Ranking", RankingXmlSerializer.class);
		objectMap.put("PlayerRanking", PlayerRankingXmlSerializer.class);
		objectMap.put("AllianceRanking", AllianceRankingXmlSerializer.class);
		objectMap.put("TurnScore", TurnScoreXmlSerializer.class);
		objectMap.put("SetUnitScore", SetUnitScoreXmlSerializer.class);
		objectMap.put("GetUnitScore", GetUnitScoreXmlSerializer.class);
		objectMap.put("GetUnitScores", GetUnitScoresXmlSerializer.class);
		objectMap.put("SetScoreUpdaterGroup", SetScoreUpdaterGroupXmlSerializer.class);
		objectMap.put("GetRankingList", GetRankingListXmlSerializer.class);
		objectMap.put("GetRankingGroupList", GetRankingGroupListXmlSerializer.class);
		objectMap.put("GetPlayerRankingList", GetPlayerRankingListXmlSerializer.class);
		objectMap.put("GetAllianceRankingList", GetAllianceRankingListXmlSerializer.class);
		objectMap.put("SetScoreDivisor", SetScoreDivisorXmlSerializer.class);
		objectMap.put("GetScoreDivisor", GetScoreDivisorXmlSerializer.class);

		// Mappings by id
		objectMap.put(Game.SERIALIZATION_ID, GameXmlSerializer.class);
		objectMap.put(GameVersion.SERIALIZATION_ID, GameVersionXmlSerializer.class);
		objectMap.put(GameInstance.SERIALIZATION_ID, GameInstanceXmlSerializer.class);
		objectMap.put(GameDefinition.SERIALIZATION_ID, GameDefinitionXmlSerializer.class);
		objectMap.put(GameHost.SERIALIZATION_ID, GameHostXmlSerializer.class);
		objectMap.put(GameInstanceProperty.SERIALIZATION_ID, GameInstancePropertyXmlSerializer.class);
		objectMap.put(NewGame.SERIALIZATION_ID, NewGameXmlSerializer.class);
		objectMap.put(NewGameVersion.SERIALIZATION_ID, NewGameVersionXmlSerializer.class);
		objectMap.put(NewGameInstance.SERIALIZATION_ID, NewGameInstanceXmlSerializer.class);
		objectMap.put(GetGameById.SERIALIZATION_ID, GetGameByIdXmlSerializer.class);
		objectMap.put(GetGameByName.SERIALIZATION_ID, GetGameByNameXmlSerializer.class);
		objectMap.put(GetGameVersionById.SERIALIZATION_ID, GetGameVersionByIdXmlSerializer.class);
		objectMap.put(GetGameVersionByName.SERIALIZATION_ID, GetGameVersionByNameXmlSerializer.class);
		objectMap.put(GetGameInstanceById.SERIALIZATION_ID, GetGameInstanceByIdXmlSerializer.class);
		objectMap.put(GetGameInstanceByName.SERIALIZATION_ID, GetGameInstanceByNameXmlSerializer.class);
		objectMap.put(GetGames.SERIALIZATION_ID, GetGamesXmlSerializer.class);
		objectMap.put(GetGameVersions.SERIALIZATION_ID, GetGameVersionsXmlSerializer.class);
		objectMap.put(GetGameInstances.SERIALIZATION_ID, GetGameInstancesXmlSerializer.class);
		objectMap.put(GetGameDefinitions.SERIALIZATION_ID, GetGameDefinitionsXmlSerializer.class);
		objectMap.put(GetGameDefinition.SERIALIZATION_ID, GetGameDefinitionXmlSerializer.class);
		objectMap.put(NewGameHost.SERIALIZATION_ID, NewGameHostXmlSerializer.class);
		objectMap.put(GetGameInstanceByNames.SERIALIZATION_ID, GetGameInstanceByNamesXmlSerializer.class);
		objectMap.put(GetGameHostByName.SERIALIZATION_ID, GetGameHostByNameXmlSerializer.class);
		objectMap.put(GetGameHostById.SERIALIZATION_ID, GetGameHostByIdXmlSerializer.class);
		objectMap.put(GetGameHosts.SERIALIZATION_ID, GetGameHostsXmlSerializer.class);
		objectMap.put(GetGameInstancesByGameName.SERIALIZATION_ID, GetGameInstancesByGameNameXmlSerializer.class);
		objectMap.put(GetGameDefinitionsByGameName.SERIALIZATION_ID, GetGameDefinitionsByGameNameXmlSerializer.class);
		objectMap.put(SetGameInstanceProperty.SERIALIZATION_ID, SetGameInstancePropertyXmlSerializer.class);
		objectMap.put(GetGameInstancePropertyList.SERIALIZATION_ID, GetGameInstancePropertyListXmlSerializer.class);

		// Mappings by name
		objectMap.put("Game", GameXmlSerializer.class);
		objectMap.put("GameVersion", GameVersionXmlSerializer.class);
		objectMap.put("GameInstance", GameInstanceXmlSerializer.class);
		objectMap.put("GameDefinition", GameDefinitionXmlSerializer.class);
		objectMap.put("GameHost", GameHostXmlSerializer.class);
		objectMap.put("GameInstanceProperty", GameInstancePropertyXmlSerializer.class);
		objectMap.put("NewGame", NewGameXmlSerializer.class);
		objectMap.put("NewGameVersion", NewGameVersionXmlSerializer.class);
		objectMap.put("NewGameInstance", NewGameInstanceXmlSerializer.class);
		objectMap.put("GetGameById", GetGameByIdXmlSerializer.class);
		objectMap.put("GetGameByName", GetGameByNameXmlSerializer.class);
		objectMap.put("GetGameVersionById", GetGameVersionByIdXmlSerializer.class);
		objectMap.put("GetGameVersionByName", GetGameVersionByNameXmlSerializer.class);
		objectMap.put("GetGameInstanceById", GetGameInstanceByIdXmlSerializer.class);
		objectMap.put("GetGameInstanceByName", GetGameInstanceByNameXmlSerializer.class);
		objectMap.put("GetGames", GetGamesXmlSerializer.class);
		objectMap.put("GetGameVersions", GetGameVersionsXmlSerializer.class);
		objectMap.put("GetGameInstances", GetGameInstancesXmlSerializer.class);
		objectMap.put("GetGameDefinitions", GetGameDefinitionsXmlSerializer.class);
		objectMap.put("GetGameDefinition", GetGameDefinitionXmlSerializer.class);
		objectMap.put("NewGameHost", NewGameHostXmlSerializer.class);
		objectMap.put("GetGameInstanceByNames", GetGameInstanceByNamesXmlSerializer.class);
		objectMap.put("GetGameHostByName", GetGameHostByNameXmlSerializer.class);
		objectMap.put("GetGameHostById", GetGameHostByIdXmlSerializer.class);
		objectMap.put("GetGameHosts", GetGameHostsXmlSerializer.class);
		objectMap.put("GetGameInstancesByGameName", GetGameInstancesByGameNameXmlSerializer.class);
		objectMap.put("GetGameDefinitionsByGameName", GetGameDefinitionsByGameNameXmlSerializer.class);
		objectMap.put("SetGameInstanceProperty", SetGameInstancePropertyXmlSerializer.class);
		objectMap.put("GetGameInstancePropertyList", GetGameInstancePropertyListXmlSerializer.class);

		// Mappings by id
		objectMap.put(Mobile.SERIALIZATION_ID, MobileXmlSerializer.class);
		objectMap.put(MobileInfo.SERIALIZATION_ID, MobileInfoXmlSerializer.class);
		objectMap.put(MobileSetupInfo.SERIALIZATION_ID, MobileSetupInfoXmlSerializer.class);
		objectMap.put(MobileProperty.SERIALIZATION_ID, MobilePropertyXmlSerializer.class);
		objectMap.put(MobileQueueItem.SERIALIZATION_ID, MobileQueueItemXmlSerializer.class);
		objectMap.put(CreateMobileAtLocation.SERIALIZATION_ID, CreateMobileAtLocationXmlSerializer.class);
		objectMap.put(ListMobilesAtLocation.SERIALIZATION_ID, ListMobilesAtLocationXmlSerializer.class);
		objectMap.put(TransferUnitsToMobile.SERIALIZATION_ID, TransferUnitsToMobileXmlSerializer.class);
		objectMap.put(TransferUnitsFromMobile.SERIALIZATION_ID, TransferUnitsFromMobileXmlSerializer.class);
		objectMap.put(GetMobileList.SERIALIZATION_ID, GetMobileListXmlSerializer.class);
		objectMap.put(GetMobile.SERIALIZATION_ID, GetMobileXmlSerializer.class);
		objectMap.put(MoveMobile.SERIALIZATION_ID, MoveMobileXmlSerializer.class);
		objectMap.put(DestroyEmptyMobile.SERIALIZATION_ID, DestroyEmptyMobileXmlSerializer.class);
		objectMap.put(CreateMobileAtMobile.SERIALIZATION_ID, CreateMobileAtMobileXmlSerializer.class);
		objectMap.put(MoveMobileToCoordinates.SERIALIZATION_ID, MoveMobileToCoordinatesXmlSerializer.class);
		objectMap.put(TransferUnitsBetweenMobiles.SERIALIZATION_ID, TransferUnitsBetweenMobilesXmlSerializer.class);
		objectMap.put(RenameMobile.SERIALIZATION_ID, RenameMobileXmlSerializer.class);
		objectMap.put(AddUnitsAtMobile.SERIALIZATION_ID, AddUnitsAtMobileXmlSerializer.class);
		objectMap.put(SetCombatPlugin.SERIALIZATION_ID, SetCombatPluginXmlSerializer.class);
		objectMap.put(GetMobileSetupInfo.SERIALIZATION_ID, GetMobileSetupInfoXmlSerializer.class);
		objectMap.put(SetMobilesEnabled.SERIALIZATION_ID, SetMobilesEnabledXmlSerializer.class);
		objectMap.put(GetMobilesEnabled.SERIALIZATION_ID, GetMobilesEnabledXmlSerializer.class);
		objectMap.put(GetCombatPlugin.SERIALIZATION_ID, GetCombatPluginXmlSerializer.class);
		objectMap.put(SetMobileProperty.SERIALIZATION_ID, SetMobilePropertyXmlSerializer.class);
		objectMap.put(GetMobilePropertyList.SERIALIZATION_ID, GetMobilePropertyListXmlSerializer.class);
		objectMap.put(SetMobileMovementPlugin.SERIALIZATION_ID, SetMobileMovementPluginXmlSerializer.class);
		objectMap.put(ClearMobileQueue.SERIALIZATION_ID, ClearMobileQueueXmlSerializer.class);
		objectMap.put(WaitMobile.SERIALIZATION_ID, WaitMobileXmlSerializer.class);
		objectMap.put(GetMobileQueueList.SERIALIZATION_ID, GetMobileQueueListXmlSerializer.class);
		objectMap.put(SetMobileWait.SERIALIZATION_ID, SetMobileWaitXmlSerializer.class);
		objectMap.put(SetMobileMove.SERIALIZATION_ID, SetMobileMoveXmlSerializer.class);
		objectMap.put(GetMobileIdsForPlayer.SERIALIZATION_ID, GetMobileIdsForPlayerXmlSerializer.class);

		// Mappings by name
		objectMap.put("Mobile", MobileXmlSerializer.class);
		objectMap.put("MobileInfo", MobileInfoXmlSerializer.class);
		objectMap.put("MobileSetupInfo", MobileSetupInfoXmlSerializer.class);
		objectMap.put("MobileProperty", MobilePropertyXmlSerializer.class);
		objectMap.put("MobileQueueItem", MobileQueueItemXmlSerializer.class);
		objectMap.put("CreateMobileAtLocation", CreateMobileAtLocationXmlSerializer.class);
		objectMap.put("ListMobilesAtLocation", ListMobilesAtLocationXmlSerializer.class);
		objectMap.put("TransferUnitsToMobile", TransferUnitsToMobileXmlSerializer.class);
		objectMap.put("TransferUnitsFromMobile", TransferUnitsFromMobileXmlSerializer.class);
		objectMap.put("GetMobileList", GetMobileListXmlSerializer.class);
		objectMap.put("GetMobile", GetMobileXmlSerializer.class);
		objectMap.put("MoveMobile", MoveMobileXmlSerializer.class);
		objectMap.put("DestroyEmptyMobile", DestroyEmptyMobileXmlSerializer.class);
		objectMap.put("CreateMobileAtMobile", CreateMobileAtMobileXmlSerializer.class);
		objectMap.put("MoveMobileToCoordinates", MoveMobileToCoordinatesXmlSerializer.class);
		objectMap.put("TransferUnitsBetweenMobiles", TransferUnitsBetweenMobilesXmlSerializer.class);
		objectMap.put("RenameMobile", RenameMobileXmlSerializer.class);
		objectMap.put("AddUnitsAtMobile", AddUnitsAtMobileXmlSerializer.class);
		objectMap.put("SetCombatPlugin", SetCombatPluginXmlSerializer.class);
		objectMap.put("GetMobileSetupInfo", GetMobileSetupInfoXmlSerializer.class);
		objectMap.put("SetMobilesEnabled", SetMobilesEnabledXmlSerializer.class);
		objectMap.put("GetMobilesEnabled", GetMobilesEnabledXmlSerializer.class);
		objectMap.put("GetCombatPlugin", GetCombatPluginXmlSerializer.class);
		objectMap.put("SetMobileProperty", SetMobilePropertyXmlSerializer.class);
		objectMap.put("GetMobilePropertyList", GetMobilePropertyListXmlSerializer.class);
		objectMap.put("SetMobileMovementPlugin", SetMobileMovementPluginXmlSerializer.class);
		objectMap.put("ClearMobileQueue", ClearMobileQueueXmlSerializer.class);
		objectMap.put("WaitMobile", WaitMobileXmlSerializer.class);
		objectMap.put("GetMobileQueueList", GetMobileQueueListXmlSerializer.class);
		objectMap.put("SetMobileWait", SetMobileWaitXmlSerializer.class);
		objectMap.put("SetMobileMove", SetMobileMoveXmlSerializer.class);
		objectMap.put("GetMobileIdsForPlayer", GetMobileIdsForPlayerXmlSerializer.class);

		// Mappings by id
		objectMap.put(StorageGroup.SERIALIZATION_ID, StorageGroupXmlSerializer.class);
		objectMap.put(StorageItem.SERIALIZATION_ID, StorageItemXmlSerializer.class);
		objectMap.put(SetStorageGroup.SERIALIZATION_ID, SetStorageGroupXmlSerializer.class);
		objectMap.put(SetStorageItem.SERIALIZATION_ID, SetStorageItemXmlSerializer.class);
		objectMap.put(GetStorageGroups.SERIALIZATION_ID, GetStorageGroupsXmlSerializer.class);
		objectMap.put(GetStorageItems.SERIALIZATION_ID, GetStorageItemsXmlSerializer.class);

		// Mappings by name
		objectMap.put("StorageGroup", StorageGroupXmlSerializer.class);
		objectMap.put("StorageItem", StorageItemXmlSerializer.class);
		objectMap.put("SetStorageGroup", SetStorageGroupXmlSerializer.class);
		objectMap.put("SetStorageItem", SetStorageItemXmlSerializer.class);
		objectMap.put("GetStorageGroups", GetStorageGroupsXmlSerializer.class);
		objectMap.put("GetStorageItems", GetStorageItemsXmlSerializer.class);

		// Mappings by id
		objectMap.put(User.SERIALIZATION_ID, UserXmlSerializer.class);
		objectMap.put(UserAddressCode.SERIALIZATION_ID, UserAddressCodeXmlSerializer.class);
		objectMap.put(UserAdminInfo.SERIALIZATION_ID, UserAdminInfoXmlSerializer.class);
		objectMap.put(UserSimilarity.SERIALIZATION_ID, UserSimilarityXmlSerializer.class);
		objectMap.put(SignupUser.SERIALIZATION_ID, SignupUserXmlSerializer.class);
		objectMap.put(VerifyUser.SERIALIZATION_ID, VerifyUserXmlSerializer.class);
		objectMap.put(SetUserAddress.SERIALIZATION_ID, SetUserAddressXmlSerializer.class);
		objectMap.put(LoginUser.SERIALIZATION_ID, LoginUserXmlSerializer.class);
		objectMap.put(RenameUser.SERIALIZATION_ID, RenameUserXmlSerializer.class);
		objectMap.put(LogoutUser.SERIALIZATION_ID, LogoutUserXmlSerializer.class);
		objectMap.put(SetUserLanguage.SERIALIZATION_ID, SetUserLanguageXmlSerializer.class);
		objectMap.put(GetUserById.SERIALIZATION_ID, GetUserByIdXmlSerializer.class);
		objectMap.put(GetUserByName.SERIALIZATION_ID, GetUserByNameXmlSerializer.class);
		objectMap.put(GetUserByEmail.SERIALIZATION_ID, GetUserByEmailXmlSerializer.class);
		objectMap.put(GetUserByLoginId.SERIALIZATION_ID, GetUserByLoginIdXmlSerializer.class);
		objectMap.put(CountUsers.SERIALIZATION_ID, CountUsersXmlSerializer.class);
		objectMap.put(AdminVerifyUser.SERIALIZATION_ID, AdminVerifyUserXmlSerializer.class);
		objectMap.put(SetUserPermission.SERIALIZATION_ID, SetUserPermissionXmlSerializer.class);
		objectMap.put(SetUserGamePermission.SERIALIZATION_ID, SetUserGamePermissionXmlSerializer.class);
		objectMap.put(SetSignupVerification.SERIALIZATION_ID, SetSignupVerificationXmlSerializer.class);
		objectMap.put(GetUser.SERIALIZATION_ID, GetUserXmlSerializer.class);
		objectMap.put(GetUserNames.SERIALIZATION_ID, GetUserNamesXmlSerializer.class);
		objectMap.put(ChangeUserPassword.SERIALIZATION_ID, ChangeUserPasswordXmlSerializer.class);
		objectMap.put(GetUserAddressCodeList.SERIALIZATION_ID, GetUserAddressCodeListXmlSerializer.class);
		objectMap.put(GetUserAdminInfoList.SERIALIZATION_ID, GetUserAdminInfoListXmlSerializer.class);
		objectMap.put(GetUserAdminInfo.SERIALIZATION_ID, GetUserAdminInfoXmlSerializer.class);
		objectMap.put(UpdateUserAddressCode.SERIALIZATION_ID, UpdateUserAddressCodeXmlSerializer.class);
		objectMap.put(GetUserSimilarityList.SERIALIZATION_ID, GetUserSimilarityListXmlSerializer.class);
		objectMap.put(AdminSetUserPassword.SERIALIZATION_ID, AdminSetUserPasswordXmlSerializer.class);
		objectMap.put(SetUserAvatar.SERIALIZATION_ID, SetUserAvatarXmlSerializer.class);
		objectMap.put(GetUserAvatar.SERIALIZATION_ID, GetUserAvatarXmlSerializer.class);
		objectMap.put(SendResetPasswordEmail.SERIALIZATION_ID, SendResetPasswordEmailXmlSerializer.class);
		objectMap.put(ResetPassword.SERIALIZATION_ID, ResetPasswordXmlSerializer.class);
		objectMap.put(SetResetPasswordEmail.SERIALIZATION_ID, SetResetPasswordEmailXmlSerializer.class);
		objectMap.put(SetSignupUserEmail.SERIALIZATION_ID, SetSignupUserEmailXmlSerializer.class);
		objectMap.put(GetUserList.SERIALIZATION_ID, GetUserListXmlSerializer.class);

		// Mappings by name
		objectMap.put("User", UserXmlSerializer.class);
		objectMap.put("UserAddressCode", UserAddressCodeXmlSerializer.class);
		objectMap.put("UserAdminInfo", UserAdminInfoXmlSerializer.class);
		objectMap.put("UserSimilarity", UserSimilarityXmlSerializer.class);
		objectMap.put("SignupUser", SignupUserXmlSerializer.class);
		objectMap.put("VerifyUser", VerifyUserXmlSerializer.class);
		objectMap.put("SetUserAddress", SetUserAddressXmlSerializer.class);
		objectMap.put("LoginUser", LoginUserXmlSerializer.class);
		objectMap.put("RenameUser", RenameUserXmlSerializer.class);
		objectMap.put("LogoutUser", LogoutUserXmlSerializer.class);
		objectMap.put("SetUserLanguage", SetUserLanguageXmlSerializer.class);
		objectMap.put("GetUserById", GetUserByIdXmlSerializer.class);
		objectMap.put("GetUserByName", GetUserByNameXmlSerializer.class);
		objectMap.put("GetUserByEmail", GetUserByEmailXmlSerializer.class);
		objectMap.put("GetUserByLoginId", GetUserByLoginIdXmlSerializer.class);
		objectMap.put("CountUsers", CountUsersXmlSerializer.class);
		objectMap.put("AdminVerifyUser", AdminVerifyUserXmlSerializer.class);
		objectMap.put("SetUserPermission", SetUserPermissionXmlSerializer.class);
		objectMap.put("SetUserGamePermission", SetUserGamePermissionXmlSerializer.class);
		objectMap.put("SetSignupVerification", SetSignupVerificationXmlSerializer.class);
		objectMap.put("GetUser", GetUserXmlSerializer.class);
		objectMap.put("GetUserNames", GetUserNamesXmlSerializer.class);
		objectMap.put("ChangeUserPassword", ChangeUserPasswordXmlSerializer.class);
		objectMap.put("GetUserAddressCodeList", GetUserAddressCodeListXmlSerializer.class);
		objectMap.put("GetUserAdminInfoList", GetUserAdminInfoListXmlSerializer.class);
		objectMap.put("GetUserAdminInfo", GetUserAdminInfoXmlSerializer.class);
		objectMap.put("UpdateUserAddressCode", UpdateUserAddressCodeXmlSerializer.class);
		objectMap.put("GetUserSimilarityList", GetUserSimilarityListXmlSerializer.class);
		objectMap.put("AdminSetUserPassword", AdminSetUserPasswordXmlSerializer.class);
		objectMap.put("SetUserAvatar", SetUserAvatarXmlSerializer.class);
		objectMap.put("GetUserAvatar", GetUserAvatarXmlSerializer.class);
		objectMap.put("SendResetPasswordEmail", SendResetPasswordEmailXmlSerializer.class);
		objectMap.put("ResetPassword", ResetPasswordXmlSerializer.class);
		objectMap.put("SetResetPasswordEmail", SetResetPasswordEmailXmlSerializer.class);
		objectMap.put("SetSignupUserEmail", SetSignupUserEmailXmlSerializer.class);
		objectMap.put("GetUserList", GetUserListXmlSerializer.class);

		// Mappings by id
		objectMap.put(Alliance.SERIALIZATION_ID, AllianceXmlSerializer.class);
		objectMap.put(AllianceInfo.SERIALIZATION_ID, AllianceInfoXmlSerializer.class);
		objectMap.put(AllianceSetupInfo.SERIALIZATION_ID, AllianceSetupInfoXmlSerializer.class);
		objectMap.put(AllianceProperty.SERIALIZATION_ID, AlliancePropertyXmlSerializer.class);
		objectMap.put(GetAllianceCount.SERIALIZATION_ID, GetAllianceCountXmlSerializer.class);
		objectMap.put(GetAllianceMemberCount.SERIALIZATION_ID, GetAllianceMemberCountXmlSerializer.class);
		objectMap.put(GetAllianceById.SERIALIZATION_ID, GetAllianceByIdXmlSerializer.class);
		objectMap.put(GetAllianceByName.SERIALIZATION_ID, GetAllianceByNameXmlSerializer.class);
		objectMap.put(FormAlliance.SERIALIZATION_ID, FormAllianceXmlSerializer.class);
		objectMap.put(DisbandAlliance.SERIALIZATION_ID, DisbandAllianceXmlSerializer.class);
		objectMap.put(LeaveAlliance.SERIALIZATION_ID, LeaveAllianceXmlSerializer.class);
		objectMap.put(InviteToJoinAlliance.SERIALIZATION_ID, InviteToJoinAllianceXmlSerializer.class);
		objectMap.put(RequestToJoinAlliance.SERIALIZATION_ID, RequestToJoinAllianceXmlSerializer.class);
		objectMap.put(KickAllianceMember.SERIALIZATION_ID, KickAllianceMemberXmlSerializer.class);
		objectMap.put(GetInvitedToJoinAllianceList.SERIALIZATION_ID, GetInvitedToJoinAllianceListXmlSerializer.class);
		objectMap.put(GetAllianceInviteLimit.SERIALIZATION_ID, GetAllianceInviteLimitXmlSerializer.class);
		objectMap.put(SetAllianceInviteLimit.SERIALIZATION_ID, SetAllianceInviteLimitXmlSerializer.class);
		objectMap.put(GetAllianceMemberLimit.SERIALIZATION_ID, GetAllianceMemberLimitXmlSerializer.class);
		objectMap.put(SetAllianceMemberLimit.SERIALIZATION_ID, SetAllianceMemberLimitXmlSerializer.class);
		objectMap.put(SetAlliancesEnabled.SERIALIZATION_ID, SetAlliancesEnabledXmlSerializer.class);
		objectMap.put(GetAllianceList.SERIALIZATION_ID, GetAllianceListXmlSerializer.class);
		objectMap.put(GetAlliance.SERIALIZATION_ID, GetAllianceXmlSerializer.class);
		objectMap.put(GetRequestedToJoinAllianceList.SERIALIZATION_ID, GetRequestedToJoinAllianceListXmlSerializer.class);
		objectMap.put(InviteToJoinAllianceByName.SERIALIZATION_ID, InviteToJoinAllianceByNameXmlSerializer.class);
		objectMap.put(RequestToJoinAllianceByName.SERIALIZATION_ID, RequestToJoinAllianceByNameXmlSerializer.class);
		objectMap.put(SetAllianceLeaveTurns.SERIALIZATION_ID, SetAllianceLeaveTurnsXmlSerializer.class);
		objectMap.put(GetAllianceSetupInfo.SERIALIZATION_ID, GetAllianceSetupInfoXmlSerializer.class);
		objectMap.put(SetAllianceProperty.SERIALIZATION_ID, SetAlliancePropertyXmlSerializer.class);
		objectMap.put(GetAlliancePropertyList.SERIALIZATION_ID, GetAlliancePropertyListXmlSerializer.class);
		objectMap.put(GetAllianceScores.SERIALIZATION_ID, GetAllianceScoresXmlSerializer.class);
		objectMap.put(SetAllianceLogo.SERIALIZATION_ID, SetAllianceLogoXmlSerializer.class);
		objectMap.put(GetAllianceLogo.SERIALIZATION_ID, GetAllianceLogoXmlSerializer.class);
		objectMap.put(GetAllianceInfo.SERIALIZATION_ID, GetAllianceInfoXmlSerializer.class);

		// Mappings by name
		objectMap.put("Alliance", AllianceXmlSerializer.class);
		objectMap.put("AllianceInfo", AllianceInfoXmlSerializer.class);
		objectMap.put("AllianceSetupInfo", AllianceSetupInfoXmlSerializer.class);
		objectMap.put("AllianceProperty", AlliancePropertyXmlSerializer.class);
		objectMap.put("GetAllianceCount", GetAllianceCountXmlSerializer.class);
		objectMap.put("GetAllianceMemberCount", GetAllianceMemberCountXmlSerializer.class);
		objectMap.put("GetAllianceById", GetAllianceByIdXmlSerializer.class);
		objectMap.put("GetAllianceByName", GetAllianceByNameXmlSerializer.class);
		objectMap.put("FormAlliance", FormAllianceXmlSerializer.class);
		objectMap.put("DisbandAlliance", DisbandAllianceXmlSerializer.class);
		objectMap.put("LeaveAlliance", LeaveAllianceXmlSerializer.class);
		objectMap.put("InviteToJoinAlliance", InviteToJoinAllianceXmlSerializer.class);
		objectMap.put("RequestToJoinAlliance", RequestToJoinAllianceXmlSerializer.class);
		objectMap.put("KickAllianceMember", KickAllianceMemberXmlSerializer.class);
		objectMap.put("GetInvitedToJoinAllianceList", GetInvitedToJoinAllianceListXmlSerializer.class);
		objectMap.put("GetAllianceInviteLimit", GetAllianceInviteLimitXmlSerializer.class);
		objectMap.put("SetAllianceInviteLimit", SetAllianceInviteLimitXmlSerializer.class);
		objectMap.put("GetAllianceMemberLimit", GetAllianceMemberLimitXmlSerializer.class);
		objectMap.put("SetAllianceMemberLimit", SetAllianceMemberLimitXmlSerializer.class);
		objectMap.put("SetAlliancesEnabled", SetAlliancesEnabledXmlSerializer.class);
		objectMap.put("GetAllianceList", GetAllianceListXmlSerializer.class);
		objectMap.put("GetAlliance", GetAllianceXmlSerializer.class);
		objectMap.put("GetRequestedToJoinAllianceList", GetRequestedToJoinAllianceListXmlSerializer.class);
		objectMap.put("InviteToJoinAllianceByName", InviteToJoinAllianceByNameXmlSerializer.class);
		objectMap.put("RequestToJoinAllianceByName", RequestToJoinAllianceByNameXmlSerializer.class);
		objectMap.put("SetAllianceLeaveTurns", SetAllianceLeaveTurnsXmlSerializer.class);
		objectMap.put("GetAllianceSetupInfo", GetAllianceSetupInfoXmlSerializer.class);
		objectMap.put("SetAllianceProperty", SetAlliancePropertyXmlSerializer.class);
		objectMap.put("GetAlliancePropertyList", GetAlliancePropertyListXmlSerializer.class);
		objectMap.put("GetAllianceScores", GetAllianceScoresXmlSerializer.class);
		objectMap.put("SetAllianceLogo", SetAllianceLogoXmlSerializer.class);
		objectMap.put("GetAllianceLogo", GetAllianceLogoXmlSerializer.class);
		objectMap.put("GetAllianceInfo", GetAllianceInfoXmlSerializer.class);

		// Mappings by id
		objectMap.put(Upkeep.SERIALIZATION_ID, UpkeepXmlSerializer.class);
		objectMap.put(UpkeepCondition.SERIALIZATION_ID, UpkeepConditionXmlSerializer.class);
		objectMap.put(AddUpkeep.SERIALIZATION_ID, AddUpkeepXmlSerializer.class);
		objectMap.put(AddUpkeepCondition.SERIALIZATION_ID, AddUpkeepConditionXmlSerializer.class);
		objectMap.put(GetUpkeepList.SERIALIZATION_ID, GetUpkeepListXmlSerializer.class);
		objectMap.put(GetUpkeepConditionList.SERIALIZATION_ID, GetUpkeepConditionListXmlSerializer.class);
		objectMap.put(GetUpkeepAtLocation.SERIALIZATION_ID, GetUpkeepAtLocationXmlSerializer.class);

		// Mappings by name
		objectMap.put("Upkeep", UpkeepXmlSerializer.class);
		objectMap.put("UpkeepCondition", UpkeepConditionXmlSerializer.class);
		objectMap.put("AddUpkeep", AddUpkeepXmlSerializer.class);
		objectMap.put("AddUpkeepCondition", AddUpkeepConditionXmlSerializer.class);
		objectMap.put("GetUpkeepList", GetUpkeepListXmlSerializer.class);
		objectMap.put("GetUpkeepConditionList", GetUpkeepConditionListXmlSerializer.class);
		objectMap.put("GetUpkeepAtLocation", GetUpkeepAtLocationXmlSerializer.class);

		// Mappings by id
		objectMap.put(ServiceStatus.SERIALIZATION_ID, ServiceStatusXmlSerializer.class);
		objectMap.put(SystemStatus.SERIALIZATION_ID, SystemStatusXmlSerializer.class);
		objectMap.put(SystemLoadAverage.SERIALIZATION_ID, SystemLoadAverageXmlSerializer.class);
		objectMap.put(SystemDiskUsage.SERIALIZATION_ID, SystemDiskUsageXmlSerializer.class);
		objectMap.put(ProcessInfo.SERIALIZATION_ID, ProcessInfoXmlSerializer.class);
		objectMap.put(ProjectInfo.SERIALIZATION_ID, ProjectInfoXmlSerializer.class);
		objectMap.put(ServiceInfo.SERIALIZATION_ID, ServiceInfoXmlSerializer.class);
		objectMap.put(ReleaseInfo.SERIALIZATION_ID, ReleaseInfoXmlSerializer.class);
		objectMap.put(ServicePersistorProperties.SERIALIZATION_ID, ServicePersistorPropertiesXmlSerializer.class);
		objectMap.put(OpenIdParameter.SERIALIZATION_ID, OpenIdParameterXmlSerializer.class);
		objectMap.put(OpenIdForm.SERIALIZATION_ID, OpenIdFormXmlSerializer.class);
		objectMap.put(LoggedException.SERIALIZATION_ID, LoggedExceptionXmlSerializer.class);
		objectMap.put(Ping.SERIALIZATION_ID, PingXmlSerializer.class);
		objectMap.put(GetServiceStatus.SERIALIZATION_ID, GetServiceStatusXmlSerializer.class);
		objectMap.put(GetSystemStatus.SERIALIZATION_ID, GetSystemStatusXmlSerializer.class);
		objectMap.put(GetCommandAvailable.SERIALIZATION_ID, GetCommandAvailableXmlSerializer.class);
		objectMap.put(StartService.SERIALIZATION_ID, StartServiceXmlSerializer.class);
		objectMap.put(StopService.SERIALIZATION_ID, StopServiceXmlSerializer.class);
		objectMap.put(GetServiceProcessList.SERIALIZATION_ID, GetServiceProcessListXmlSerializer.class);
		objectMap.put(GetAvailableReleaseList.SERIALIZATION_ID, GetAvailableReleaseListXmlSerializer.class);
		objectMap.put(GetAvailableServiceList.SERIALIZATION_ID, GetAvailableServiceListXmlSerializer.class);
		objectMap.put(GetGoogleOpenIdForm.SERIALIZATION_ID, GetGoogleOpenIdFormXmlSerializer.class);
		objectMap.put(GetLoggedExceptions.SERIALIZATION_ID, GetLoggedExceptionsXmlSerializer.class);
		objectMap.put(ThrowException.SERIALIZATION_ID, ThrowExceptionXmlSerializer.class);

		// Mappings by name
		objectMap.put("ServiceStatus", ServiceStatusXmlSerializer.class);
		objectMap.put("SystemStatus", SystemStatusXmlSerializer.class);
		objectMap.put("SystemLoadAverage", SystemLoadAverageXmlSerializer.class);
		objectMap.put("SystemDiskUsage", SystemDiskUsageXmlSerializer.class);
		objectMap.put("ProcessInfo", ProcessInfoXmlSerializer.class);
		objectMap.put("ProjectInfo", ProjectInfoXmlSerializer.class);
		objectMap.put("ServiceInfo", ServiceInfoXmlSerializer.class);
		objectMap.put("ReleaseInfo", ReleaseInfoXmlSerializer.class);
		objectMap.put("ServicePersistorProperties", ServicePersistorPropertiesXmlSerializer.class);
		objectMap.put("OpenIdParameter", OpenIdParameterXmlSerializer.class);
		objectMap.put("OpenIdForm", OpenIdFormXmlSerializer.class);
		objectMap.put("LoggedException", LoggedExceptionXmlSerializer.class);
		objectMap.put("Ping", PingXmlSerializer.class);
		objectMap.put("GetServiceStatus", GetServiceStatusXmlSerializer.class);
		objectMap.put("GetSystemStatus", GetSystemStatusXmlSerializer.class);
		objectMap.put("GetCommandAvailable", GetCommandAvailableXmlSerializer.class);
		objectMap.put("StartService", StartServiceXmlSerializer.class);
		objectMap.put("StopService", StopServiceXmlSerializer.class);
		objectMap.put("GetServiceProcessList", GetServiceProcessListXmlSerializer.class);
		objectMap.put("GetAvailableReleaseList", GetAvailableReleaseListXmlSerializer.class);
		objectMap.put("GetAvailableServiceList", GetAvailableServiceListXmlSerializer.class);
		objectMap.put("GetGoogleOpenIdForm", GetGoogleOpenIdFormXmlSerializer.class);
		objectMap.put("GetLoggedExceptions", GetLoggedExceptionsXmlSerializer.class);
		objectMap.put("ThrowException", ThrowExceptionXmlSerializer.class);

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id
		objectMap.put(Action.SERIALIZATION_ID, ActionXmlSerializer.class);
		objectMap.put(ActionTarget.SERIALIZATION_ID, ActionTargetXmlSerializer.class);
		objectMap.put(ActionCondition.SERIALIZATION_ID, ActionConditionXmlSerializer.class);
		objectMap.put(ActionQueued.SERIALIZATION_ID, ActionQueuedXmlSerializer.class);
		objectMap.put(ActionExecuting.SERIALIZATION_ID, ActionExecutingXmlSerializer.class);
		objectMap.put(ActionAvailable.SERIALIZATION_ID, ActionAvailableXmlSerializer.class);
		objectMap.put(ActionStatus.SERIALIZATION_ID, ActionStatusXmlSerializer.class);
		objectMap.put(AddAction.SERIALIZATION_ID, AddActionXmlSerializer.class);
		objectMap.put(AddActionTarget.SERIALIZATION_ID, AddActionTargetXmlSerializer.class);
		objectMap.put(AddActionCondition.SERIALIZATION_ID, AddActionConditionXmlSerializer.class);
		objectMap.put(GetActionList.SERIALIZATION_ID, GetActionListXmlSerializer.class);
		objectMap.put(GetActionTargetList.SERIALIZATION_ID, GetActionTargetListXmlSerializer.class);
		objectMap.put(GetActionConditionList.SERIALIZATION_ID, GetActionConditionListXmlSerializer.class);
		objectMap.put(StartActionAtPlayer.SERIALIZATION_ID, StartActionAtPlayerXmlSerializer.class);
		objectMap.put(ClearActionQueuedAtPlayer.SERIALIZATION_ID, ClearActionQueuedAtPlayerXmlSerializer.class);
		objectMap.put(StartActionAtLocation.SERIALIZATION_ID, StartActionAtLocationXmlSerializer.class);
		objectMap.put(ClearActionQueuedAtLocation.SERIALIZATION_ID, ClearActionQueuedAtLocationXmlSerializer.class);
		objectMap.put(ListActionsAvailableAtLocation.SERIALIZATION_ID, ListActionsAvailableAtLocationXmlSerializer.class);
		objectMap.put(ListActionsAvailableAtPlayer.SERIALIZATION_ID, ListActionsAvailableAtPlayerXmlSerializer.class);
		objectMap.put(ListActionsExecutingAtLocation.SERIALIZATION_ID, ListActionsExecutingAtLocationXmlSerializer.class);
		objectMap.put(ListActionsExecutingAtPlayer.SERIALIZATION_ID, ListActionsExecutingAtPlayerXmlSerializer.class);
		objectMap.put(ListActionsQueuedAtLocation.SERIALIZATION_ID, ListActionsQueuedAtLocationXmlSerializer.class);
		objectMap.put(ListActionsQueuedAtPlayer.SERIALIZATION_ID, ListActionsQueuedAtPlayerXmlSerializer.class);
		objectMap.put(ClearActionsQueuedAtLocation.SERIALIZATION_ID, ClearActionsQueuedAtLocationXmlSerializer.class);
		objectMap.put(ClearActionsQueuedAtPlayer.SERIALIZATION_ID, ClearActionsQueuedAtPlayerXmlSerializer.class);
		objectMap.put(StartActionAtMobileToLocation.SERIALIZATION_ID, StartActionAtMobileToLocationXmlSerializer.class);
		objectMap.put(ListActionsAvailableAtMobile.SERIALIZATION_ID, ListActionsAvailableAtMobileXmlSerializer.class);
		objectMap.put(AddActionPlugin.SERIALIZATION_ID, AddActionPluginXmlSerializer.class);
		objectMap.put(StartActionAtLocationToLocation.SERIALIZATION_ID, StartActionAtLocationToLocationXmlSerializer.class);
		objectMap.put(GetActionPlugin.SERIALIZATION_ID, GetActionPluginXmlSerializer.class);
		objectMap.put(CancelActionAtPlayer.SERIALIZATION_ID, CancelActionAtPlayerXmlSerializer.class);
		objectMap.put(CancelActionAtLocation.SERIALIZATION_ID, CancelActionAtLocationXmlSerializer.class);

		// Mappings by name
		objectMap.put("Action", ActionXmlSerializer.class);
		objectMap.put("ActionTarget", ActionTargetXmlSerializer.class);
		objectMap.put("ActionCondition", ActionConditionXmlSerializer.class);
		objectMap.put("ActionQueued", ActionQueuedXmlSerializer.class);
		objectMap.put("ActionExecuting", ActionExecutingXmlSerializer.class);
		objectMap.put("ActionAvailable", ActionAvailableXmlSerializer.class);
		objectMap.put("ActionStatus", ActionStatusXmlSerializer.class);
		objectMap.put("AddAction", AddActionXmlSerializer.class);
		objectMap.put("AddActionTarget", AddActionTargetXmlSerializer.class);
		objectMap.put("AddActionCondition", AddActionConditionXmlSerializer.class);
		objectMap.put("GetActionList", GetActionListXmlSerializer.class);
		objectMap.put("GetActionTargetList", GetActionTargetListXmlSerializer.class);
		objectMap.put("GetActionConditionList", GetActionConditionListXmlSerializer.class);
		objectMap.put("StartActionAtPlayer", StartActionAtPlayerXmlSerializer.class);
		objectMap.put("ClearActionQueuedAtPlayer", ClearActionQueuedAtPlayerXmlSerializer.class);
		objectMap.put("StartActionAtLocation", StartActionAtLocationXmlSerializer.class);
		objectMap.put("ClearActionQueuedAtLocation", ClearActionQueuedAtLocationXmlSerializer.class);
		objectMap.put("ListActionsAvailableAtLocation", ListActionsAvailableAtLocationXmlSerializer.class);
		objectMap.put("ListActionsAvailableAtPlayer", ListActionsAvailableAtPlayerXmlSerializer.class);
		objectMap.put("ListActionsExecutingAtLocation", ListActionsExecutingAtLocationXmlSerializer.class);
		objectMap.put("ListActionsExecutingAtPlayer", ListActionsExecutingAtPlayerXmlSerializer.class);
		objectMap.put("ListActionsQueuedAtLocation", ListActionsQueuedAtLocationXmlSerializer.class);
		objectMap.put("ListActionsQueuedAtPlayer", ListActionsQueuedAtPlayerXmlSerializer.class);
		objectMap.put("ClearActionsQueuedAtLocation", ClearActionsQueuedAtLocationXmlSerializer.class);
		objectMap.put("ClearActionsQueuedAtPlayer", ClearActionsQueuedAtPlayerXmlSerializer.class);
		objectMap.put("StartActionAtMobileToLocation", StartActionAtMobileToLocationXmlSerializer.class);
		objectMap.put("ListActionsAvailableAtMobile", ListActionsAvailableAtMobileXmlSerializer.class);
		objectMap.put("AddActionPlugin", AddActionPluginXmlSerializer.class);
		objectMap.put("StartActionAtLocationToLocation", StartActionAtLocationToLocationXmlSerializer.class);
		objectMap.put("GetActionPlugin", GetActionPluginXmlSerializer.class);
		objectMap.put("CancelActionAtPlayer", CancelActionAtPlayerXmlSerializer.class);
		objectMap.put("CancelActionAtLocation", CancelActionAtLocationXmlSerializer.class);

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id
		objectMap.put(TurnSummary.SERIALIZATION_ID, TurnSummaryXmlSerializer.class);
		objectMap.put(Turn.SERIALIZATION_ID, TurnXmlSerializer.class);
		objectMap.put(TurnComponent.SERIALIZATION_ID, TurnComponentXmlSerializer.class);
		objectMap.put(TurnDetails.SERIALIZATION_ID, TurnDetailsXmlSerializer.class);
		objectMap.put(GetTurnNumber.SERIALIZATION_ID, GetTurnNumberXmlSerializer.class);
		objectMap.put(ExecuteTurns.SERIALIZATION_ID, ExecuteTurnsXmlSerializer.class);
		objectMap.put(SetTurnInterval.SERIALIZATION_ID, SetTurnIntervalXmlSerializer.class);
		objectMap.put(GetTurnInterval.SERIALIZATION_ID, GetTurnIntervalXmlSerializer.class);
		objectMap.put(SetTurnsEnabled.SERIALIZATION_ID, SetTurnsEnabledXmlSerializer.class);
		objectMap.put(GetTurnUpdating.SERIALIZATION_ID, GetTurnUpdatingXmlSerializer.class);
		objectMap.put(GetNextTurnUpdateTime.SERIALIZATION_ID, GetNextTurnUpdateTimeXmlSerializer.class);
		objectMap.put(GetTurnSummary.SERIALIZATION_ID, GetTurnSummaryXmlSerializer.class);
		objectMap.put(GetTurns.SERIALIZATION_ID, GetTurnsXmlSerializer.class);
		objectMap.put(GetTurnDetails.SERIALIZATION_ID, GetTurnDetailsXmlSerializer.class);
		objectMap.put(SetTurnStartTime.SERIALIZATION_ID, SetTurnStartTimeXmlSerializer.class);
		objectMap.put(GetTurnStartTime.SERIALIZATION_ID, GetTurnStartTimeXmlSerializer.class);
		objectMap.put(SetTurnIntervalTime.SERIALIZATION_ID, SetTurnIntervalTimeXmlSerializer.class);
		objectMap.put(SetTurnFinishTime.SERIALIZATION_ID, SetTurnFinishTimeXmlSerializer.class);
		objectMap.put(GetTurnFinishTime.SERIALIZATION_ID, GetTurnFinishTimeXmlSerializer.class);
		objectMap.put(GetTurnsEnabled.SERIALIZATION_ID, GetTurnsEnabledXmlSerializer.class);

		// Mappings by name
		objectMap.put("TurnSummary", TurnSummaryXmlSerializer.class);
		objectMap.put("Turn", TurnXmlSerializer.class);
		objectMap.put("TurnComponent", TurnComponentXmlSerializer.class);
		objectMap.put("TurnDetails", TurnDetailsXmlSerializer.class);
		objectMap.put("GetTurnNumber", GetTurnNumberXmlSerializer.class);
		objectMap.put("ExecuteTurns", ExecuteTurnsXmlSerializer.class);
		objectMap.put("SetTurnInterval", SetTurnIntervalXmlSerializer.class);
		objectMap.put("GetTurnInterval", GetTurnIntervalXmlSerializer.class);
		objectMap.put("SetTurnsEnabled", SetTurnsEnabledXmlSerializer.class);
		objectMap.put("GetTurnUpdating", GetTurnUpdatingXmlSerializer.class);
		objectMap.put("GetNextTurnUpdateTime", GetNextTurnUpdateTimeXmlSerializer.class);
		objectMap.put("GetTurnSummary", GetTurnSummaryXmlSerializer.class);
		objectMap.put("GetTurns", GetTurnsXmlSerializer.class);
		objectMap.put("GetTurnDetails", GetTurnDetailsXmlSerializer.class);
		objectMap.put("SetTurnStartTime", SetTurnStartTimeXmlSerializer.class);
		objectMap.put("GetTurnStartTime", GetTurnStartTimeXmlSerializer.class);
		objectMap.put("SetTurnIntervalTime", SetTurnIntervalTimeXmlSerializer.class);
		objectMap.put("SetTurnFinishTime", SetTurnFinishTimeXmlSerializer.class);
		objectMap.put("GetTurnFinishTime", GetTurnFinishTimeXmlSerializer.class);
		objectMap.put("GetTurnsEnabled", GetTurnsEnabledXmlSerializer.class);

		// Mappings by id
		objectMap.put(Trade.SERIALIZATION_ID, TradeXmlSerializer.class);
		objectMap.put(Price.SERIALIZATION_ID, PriceXmlSerializer.class);
		objectMap.put(GetGoodsPriceListAtLocation.SERIALIZATION_ID, GetGoodsPriceListAtLocationXmlSerializer.class);
		objectMap.put(BuyGoodsAtLocation.SERIALIZATION_ID, BuyGoodsAtLocationXmlSerializer.class);
		objectMap.put(SellGoodsAtLocation.SERIALIZATION_ID, SellGoodsAtLocationXmlSerializer.class);
		objectMap.put(SetTradeAtLocationPlugin.SERIALIZATION_ID, SetTradeAtLocationPluginXmlSerializer.class);

		// Mappings by name
		objectMap.put("Trade", TradeXmlSerializer.class);
		objectMap.put("Price", PriceXmlSerializer.class);
		objectMap.put("GetGoodsPriceListAtLocation", GetGoodsPriceListAtLocationXmlSerializer.class);
		objectMap.put("BuyGoodsAtLocation", BuyGoodsAtLocationXmlSerializer.class);
		objectMap.put("SellGoodsAtLocation", SellGoodsAtLocationXmlSerializer.class);
		objectMap.put("SetTradeAtLocationPlugin", SetTradeAtLocationPluginXmlSerializer.class);

		// Mappings by id
		objectMap.put(Location.SERIALIZATION_ID, LocationXmlSerializer.class);
		objectMap.put(Coordinate.SERIALIZATION_ID, CoordinateXmlSerializer.class);
		objectMap.put(GeneratedLocation.SERIALIZATION_ID, GeneratedLocationXmlSerializer.class);
		objectMap.put(LocationInfo.SERIALIZATION_ID, LocationInfoXmlSerializer.class);
		objectMap.put(Grid.SERIALIZATION_ID, GridXmlSerializer.class);
		objectMap.put(GridInfo.SERIALIZATION_ID, GridInfoXmlSerializer.class);
		objectMap.put(LocationSetupInfo.SERIALIZATION_ID, LocationSetupInfoXmlSerializer.class);
		objectMap.put(LocationProperty.SERIALIZATION_ID, LocationPropertyXmlSerializer.class);
		objectMap.put(SetLocationGenerationPlugin.SERIALIZATION_ID, SetLocationGenerationPluginXmlSerializer.class);
		objectMap.put(GenerateLocations.SERIALIZATION_ID, GenerateLocationsXmlSerializer.class);
		objectMap.put(SetLocationCoordinatePlugin.SERIALIZATION_ID, SetLocationCoordinatePluginXmlSerializer.class);
		objectMap.put(SetLocationsEnabled.SERIALIZATION_ID, SetLocationsEnabledXmlSerializer.class);
		objectMap.put(GetLocationsEnabled.SERIALIZATION_ID, GetLocationsEnabledXmlSerializer.class);
		objectMap.put(SetLocationSignupsEnabled.SERIALIZATION_ID, SetLocationSignupsEnabledXmlSerializer.class);
		objectMap.put(GetLocationSignupsEnabled.SERIALIZATION_ID, GetLocationSignupsEnabledXmlSerializer.class);
		objectMap.put(GetLocationList.SERIALIZATION_ID, GetLocationListXmlSerializer.class);
		objectMap.put(GetLocation.SERIALIZATION_ID, GetLocationXmlSerializer.class);
		objectMap.put(RenameLocation.SERIALIZATION_ID, RenameLocationXmlSerializer.class);
		objectMap.put(AddUnitsAtLocation.SERIALIZATION_ID, AddUnitsAtLocationXmlSerializer.class);
		objectMap.put(GetGridInfoList.SERIALIZATION_ID, GetGridInfoListXmlSerializer.class);
		objectMap.put(GetLocationId.SERIALIZATION_ID, GetLocationIdXmlSerializer.class);
		objectMap.put(GetCoordinates.SERIALIZATION_ID, GetCoordinatesXmlSerializer.class);
		objectMap.put(GetLocationCount.SERIALIZATION_ID, GetLocationCountXmlSerializer.class);
		objectMap.put(GetLocationSetupInfo.SERIALIZATION_ID, GetLocationSetupInfoXmlSerializer.class);
		objectMap.put(GetLocationCoordinatePlugin.SERIALIZATION_ID, GetLocationCoordinatePluginXmlSerializer.class);
		objectMap.put(GetLocationGenerationPlugin.SERIALIZATION_ID, GetLocationGenerationPluginXmlSerializer.class);
		objectMap.put(SetLocationProperty.SERIALIZATION_ID, SetLocationPropertyXmlSerializer.class);
		objectMap.put(GetLocationPropertyList.SERIALIZATION_ID, GetLocationPropertyListXmlSerializer.class);
		objectMap.put(GetLocationIdsForPlayer.SERIALIZATION_ID, GetLocationIdsForPlayerXmlSerializer.class);
		objectMap.put(CheckRenameLocation.SERIALIZATION_ID, CheckRenameLocationXmlSerializer.class);

		// Mappings by name
		objectMap.put("Location", LocationXmlSerializer.class);
		objectMap.put("Coordinate", CoordinateXmlSerializer.class);
		objectMap.put("GeneratedLocation", GeneratedLocationXmlSerializer.class);
		objectMap.put("LocationInfo", LocationInfoXmlSerializer.class);
		objectMap.put("Grid", GridXmlSerializer.class);
		objectMap.put("GridInfo", GridInfoXmlSerializer.class);
		objectMap.put("LocationSetupInfo", LocationSetupInfoXmlSerializer.class);
		objectMap.put("LocationProperty", LocationPropertyXmlSerializer.class);
		objectMap.put("SetLocationGenerationPlugin", SetLocationGenerationPluginXmlSerializer.class);
		objectMap.put("GenerateLocations", GenerateLocationsXmlSerializer.class);
		objectMap.put("SetLocationCoordinatePlugin", SetLocationCoordinatePluginXmlSerializer.class);
		objectMap.put("SetLocationsEnabled", SetLocationsEnabledXmlSerializer.class);
		objectMap.put("GetLocationsEnabled", GetLocationsEnabledXmlSerializer.class);
		objectMap.put("SetLocationSignupsEnabled", SetLocationSignupsEnabledXmlSerializer.class);
		objectMap.put("GetLocationSignupsEnabled", GetLocationSignupsEnabledXmlSerializer.class);
		objectMap.put("GetLocationList", GetLocationListXmlSerializer.class);
		objectMap.put("GetLocation", GetLocationXmlSerializer.class);
		objectMap.put("RenameLocation", RenameLocationXmlSerializer.class);
		objectMap.put("AddUnitsAtLocation", AddUnitsAtLocationXmlSerializer.class);
		objectMap.put("GetGridInfoList", GetGridInfoListXmlSerializer.class);
		objectMap.put("GetLocationId", GetLocationIdXmlSerializer.class);
		objectMap.put("GetCoordinates", GetCoordinatesXmlSerializer.class);
		objectMap.put("GetLocationCount", GetLocationCountXmlSerializer.class);
		objectMap.put("GetLocationSetupInfo", GetLocationSetupInfoXmlSerializer.class);
		objectMap.put("GetLocationCoordinatePlugin", GetLocationCoordinatePluginXmlSerializer.class);
		objectMap.put("GetLocationGenerationPlugin", GetLocationGenerationPluginXmlSerializer.class);
		objectMap.put("SetLocationProperty", SetLocationPropertyXmlSerializer.class);
		objectMap.put("GetLocationPropertyList", GetLocationPropertyListXmlSerializer.class);
		objectMap.put("GetLocationIdsForPlayer", GetLocationIdsForPlayerXmlSerializer.class);
		objectMap.put("CheckRenameLocation", CheckRenameLocationXmlSerializer.class);

		// Mappings by id
		objectMap.put(SetupRoot.SERIALIZATION_ID, SetupRootXmlSerializer.class);
		objectMap.put(SetupAddFaction.SERIALIZATION_ID, SetupAddFactionXmlSerializer.class);
		objectMap.put(SetupAddParentGroup.SERIALIZATION_ID, SetupAddParentGroupXmlSerializer.class);
		objectMap.put(SetupAddChildGroup.SERIALIZATION_ID, SetupAddChildGroupXmlSerializer.class);
		objectMap.put(SetupAddUnit.SERIALIZATION_ID, SetupAddUnitXmlSerializer.class);
		objectMap.put(SetupSetStorageGroup.SERIALIZATION_ID, SetupSetStorageGroupXmlSerializer.class);
		objectMap.put(SetupSetStorageItem.SERIALIZATION_ID, SetupSetStorageItemXmlSerializer.class);
		objectMap.put(SetupSetUnitScore.SERIALIZATION_ID, SetupSetUnitScoreXmlSerializer.class);
		objectMap.put(SetupSetScoreUpdaterGroup.SERIALIZATION_ID, SetupSetScoreUpdaterGroupXmlSerializer.class);
		objectMap.put(SetupSetScoreDivisor.SERIALIZATION_ID, SetupSetScoreDivisorXmlSerializer.class);
		objectMap.put(SetupAddUpkeep.SERIALIZATION_ID, SetupAddUpkeepXmlSerializer.class);
		objectMap.put(SetupAddUpkeepCondition.SERIALIZATION_ID, SetupAddUpkeepConditionXmlSerializer.class);
		objectMap.put(SetupAddAction.SERIALIZATION_ID, SetupAddActionXmlSerializer.class);
		objectMap.put(SetupAddActionTarget.SERIALIZATION_ID, SetupAddActionTargetXmlSerializer.class);
		objectMap.put(SetupAddActionCondition.SERIALIZATION_ID, SetupAddActionConditionXmlSerializer.class);
		objectMap.put(SetSetupBeanList.SERIALIZATION_ID, SetSetupBeanListXmlSerializer.class);
		objectMap.put(SetSetupBeanListFile.SERIALIZATION_ID, SetSetupBeanListFileXmlSerializer.class);
		objectMap.put(GetSetupBeanList.SERIALIZATION_ID, GetSetupBeanListXmlSerializer.class);
		objectMap.put(ClearSetup.SERIALIZATION_ID, ClearSetupXmlSerializer.class);

		// Mappings by name
		objectMap.put("SetupRoot", SetupRootXmlSerializer.class);
		objectMap.put("SetupAddFaction", SetupAddFactionXmlSerializer.class);
		objectMap.put("SetupAddParentGroup", SetupAddParentGroupXmlSerializer.class);
		objectMap.put("SetupAddChildGroup", SetupAddChildGroupXmlSerializer.class);
		objectMap.put("SetupAddUnit", SetupAddUnitXmlSerializer.class);
		objectMap.put("SetupSetStorageGroup", SetupSetStorageGroupXmlSerializer.class);
		objectMap.put("SetupSetStorageItem", SetupSetStorageItemXmlSerializer.class);
		objectMap.put("SetupSetUnitScore", SetupSetUnitScoreXmlSerializer.class);
		objectMap.put("SetupSetScoreUpdaterGroup", SetupSetScoreUpdaterGroupXmlSerializer.class);
		objectMap.put("SetupSetScoreDivisor", SetupSetScoreDivisorXmlSerializer.class);
		objectMap.put("SetupAddUpkeep", SetupAddUpkeepXmlSerializer.class);
		objectMap.put("SetupAddUpkeepCondition", SetupAddUpkeepConditionXmlSerializer.class);
		objectMap.put("SetupAddAction", SetupAddActionXmlSerializer.class);
		objectMap.put("SetupAddActionTarget", SetupAddActionTargetXmlSerializer.class);
		objectMap.put("SetupAddActionCondition", SetupAddActionConditionXmlSerializer.class);
		objectMap.put("SetSetupBeanList", SetSetupBeanListXmlSerializer.class);
		objectMap.put("SetSetupBeanListFile", SetSetupBeanListFileXmlSerializer.class);
		objectMap.put("GetSetupBeanList", GetSetupBeanListXmlSerializer.class);
		objectMap.put("ClearSetup", ClearSetupXmlSerializer.class);

		// Mappings by id
		objectMap.put(Unit.SERIALIZATION_ID, UnitXmlSerializer.class);
		objectMap.put(UnitCount.SERIALIZATION_ID, UnitCountXmlSerializer.class);
		objectMap.put(UnitNameCount.SERIALIZATION_ID, UnitNameCountXmlSerializer.class);
		objectMap.put(UnitCountRange.SERIALIZATION_ID, UnitCountRangeXmlSerializer.class);
		objectMap.put(AddUnit.SERIALIZATION_ID, AddUnitXmlSerializer.class);
		objectMap.put(GetUnitById.SERIALIZATION_ID, GetUnitByIdXmlSerializer.class);
		objectMap.put(GetUnitByName.SERIALIZATION_ID, GetUnitByNameXmlSerializer.class);
		objectMap.put(GetUnits.SERIALIZATION_ID, GetUnitsXmlSerializer.class);
		objectMap.put(GetUnitsByFactionId.SERIALIZATION_ID, GetUnitsByFactionIdXmlSerializer.class);
		objectMap.put(GetUnitsByFactionName.SERIALIZATION_ID, GetUnitsByFactionNameXmlSerializer.class);
		objectMap.put(GetUnitsByGroupId.SERIALIZATION_ID, GetUnitsByGroupIdXmlSerializer.class);
		objectMap.put(GetUnitsByGroupName.SERIALIZATION_ID, GetUnitsByGroupNameXmlSerializer.class);
		objectMap.put(GetAllUnitsAtPlayer.SERIALIZATION_ID, GetAllUnitsAtPlayerXmlSerializer.class);
		objectMap.put(GetUnitsAtPlayer.SERIALIZATION_ID, GetUnitsAtPlayerXmlSerializer.class);

		// Mappings by name
		objectMap.put("Unit", UnitXmlSerializer.class);
		objectMap.put("UnitCount", UnitCountXmlSerializer.class);
		objectMap.put("UnitNameCount", UnitNameCountXmlSerializer.class);
		objectMap.put("UnitCountRange", UnitCountRangeXmlSerializer.class);
		objectMap.put("AddUnit", AddUnitXmlSerializer.class);
		objectMap.put("GetUnitById", GetUnitByIdXmlSerializer.class);
		objectMap.put("GetUnitByName", GetUnitByNameXmlSerializer.class);
		objectMap.put("GetUnits", GetUnitsXmlSerializer.class);
		objectMap.put("GetUnitsByFactionId", GetUnitsByFactionIdXmlSerializer.class);
		objectMap.put("GetUnitsByFactionName", GetUnitsByFactionNameXmlSerializer.class);
		objectMap.put("GetUnitsByGroupId", GetUnitsByGroupIdXmlSerializer.class);
		objectMap.put("GetUnitsByGroupName", GetUnitsByGroupNameXmlSerializer.class);
		objectMap.put("GetAllUnitsAtPlayer", GetAllUnitsAtPlayerXmlSerializer.class);
		objectMap.put("GetUnitsAtPlayer", GetUnitsAtPlayerXmlSerializer.class);

		// Mappings by id
		objectMap.put(Player.SERIALIZATION_ID, PlayerXmlSerializer.class);
		objectMap.put(PlayerInfo.SERIALIZATION_ID, PlayerInfoXmlSerializer.class);
		objectMap.put(PlayerSetupInfo.SERIALIZATION_ID, PlayerSetupInfoXmlSerializer.class);
		objectMap.put(PlayerProperty.SERIALIZATION_ID, PlayerPropertyXmlSerializer.class);
		objectMap.put(SignupPlayer.SERIALIZATION_ID, SignupPlayerXmlSerializer.class);
		objectMap.put(GetPlayerById.SERIALIZATION_ID, GetPlayerByIdXmlSerializer.class);
		objectMap.put(GetPlayerByUserId.SERIALIZATION_ID, GetPlayerByUserIdXmlSerializer.class);
		objectMap.put(GetPlayerByName.SERIALIZATION_ID, GetPlayerByNameXmlSerializer.class);
		objectMap.put(SetPlayerSignupsEnabled.SERIALIZATION_ID, SetPlayerSignupsEnabledXmlSerializer.class);
		objectMap.put(GetPlayerSignupsEnabled.SERIALIZATION_ID, GetPlayerSignupsEnabledXmlSerializer.class);
		objectMap.put(SetPlayerLimit.SERIALIZATION_ID, SetPlayerLimitXmlSerializer.class);
		objectMap.put(GetPlayerLimit.SERIALIZATION_ID, GetPlayerLimitXmlSerializer.class);
		objectMap.put(SetPlayerActionQueueLimit.SERIALIZATION_ID, SetPlayerActionQueueLimitXmlSerializer.class);
		objectMap.put(GetPlayerActionQueueLimit.SERIALIZATION_ID, GetPlayerActionQueueLimitXmlSerializer.class);
		objectMap.put(RenamePlayer.SERIALIZATION_ID, RenamePlayerXmlSerializer.class);
		objectMap.put(GetPlayerCount.SERIALIZATION_ID, GetPlayerCountXmlSerializer.class);
		objectMap.put(GetPlayerCountByFactionId.SERIALIZATION_ID, GetPlayerCountByFactionIdXmlSerializer.class);
		objectMap.put(IsPlayerSignedUp.SERIALIZATION_ID, IsPlayerSignedUpXmlSerializer.class);
		objectMap.put(SetPlayerSignupPlugin.SERIALIZATION_ID, SetPlayerSignupPluginXmlSerializer.class);
		objectMap.put(GetPlayer.SERIALIZATION_ID, GetPlayerXmlSerializer.class);
		objectMap.put(GetPlayerList.SERIALIZATION_ID, GetPlayerListXmlSerializer.class);
		objectMap.put(GetPlayerScore.SERIALIZATION_ID, GetPlayerScoreXmlSerializer.class);
		objectMap.put(GetPlayerScoreList.SERIALIZATION_ID, GetPlayerScoreListXmlSerializer.class);
		objectMap.put(AddUnitsAtPlayer.SERIALIZATION_ID, AddUnitsAtPlayerXmlSerializer.class);
		objectMap.put(GetPlayerSetupInfo.SERIALIZATION_ID, GetPlayerSetupInfoXmlSerializer.class);
		objectMap.put(GetPlayerSignupPlugin.SERIALIZATION_ID, GetPlayerSignupPluginXmlSerializer.class);
		objectMap.put(SetPlayerProperty.SERIALIZATION_ID, SetPlayerPropertyXmlSerializer.class);
		objectMap.put(GetPlayerPropertyList.SERIALIZATION_ID, GetPlayerPropertyListXmlSerializer.class);
		objectMap.put(GetPlayerInfo.SERIALIZATION_ID, GetPlayerInfoXmlSerializer.class);
		objectMap.put(GetPlayerScores.SERIALIZATION_ID, GetPlayerScoresXmlSerializer.class);
		objectMap.put(GetUserAdminInfoByPlayer.SERIALIZATION_ID, GetUserAdminInfoByPlayerXmlSerializer.class);
		objectMap.put(SetPlayerAvatar.SERIALIZATION_ID, SetPlayerAvatarXmlSerializer.class);
		objectMap.put(GetPlayerAvatar.SERIALIZATION_ID, GetPlayerAvatarXmlSerializer.class);

		// Mappings by name
		objectMap.put("Player", PlayerXmlSerializer.class);
		objectMap.put("PlayerInfo", PlayerInfoXmlSerializer.class);
		objectMap.put("PlayerSetupInfo", PlayerSetupInfoXmlSerializer.class);
		objectMap.put("PlayerProperty", PlayerPropertyXmlSerializer.class);
		objectMap.put("SignupPlayer", SignupPlayerXmlSerializer.class);
		objectMap.put("GetPlayerById", GetPlayerByIdXmlSerializer.class);
		objectMap.put("GetPlayerByUserId", GetPlayerByUserIdXmlSerializer.class);
		objectMap.put("GetPlayerByName", GetPlayerByNameXmlSerializer.class);
		objectMap.put("SetPlayerSignupsEnabled", SetPlayerSignupsEnabledXmlSerializer.class);
		objectMap.put("GetPlayerSignupsEnabled", GetPlayerSignupsEnabledXmlSerializer.class);
		objectMap.put("SetPlayerLimit", SetPlayerLimitXmlSerializer.class);
		objectMap.put("GetPlayerLimit", GetPlayerLimitXmlSerializer.class);
		objectMap.put("SetPlayerActionQueueLimit", SetPlayerActionQueueLimitXmlSerializer.class);
		objectMap.put("GetPlayerActionQueueLimit", GetPlayerActionQueueLimitXmlSerializer.class);
		objectMap.put("RenamePlayer", RenamePlayerXmlSerializer.class);
		objectMap.put("GetPlayerCount", GetPlayerCountXmlSerializer.class);
		objectMap.put("GetPlayerCountByFactionId", GetPlayerCountByFactionIdXmlSerializer.class);
		objectMap.put("IsPlayerSignedUp", IsPlayerSignedUpXmlSerializer.class);
		objectMap.put("SetPlayerSignupPlugin", SetPlayerSignupPluginXmlSerializer.class);
		objectMap.put("GetPlayer", GetPlayerXmlSerializer.class);
		objectMap.put("GetPlayerList", GetPlayerListXmlSerializer.class);
		objectMap.put("GetPlayerScore", GetPlayerScoreXmlSerializer.class);
		objectMap.put("GetPlayerScoreList", GetPlayerScoreListXmlSerializer.class);
		objectMap.put("AddUnitsAtPlayer", AddUnitsAtPlayerXmlSerializer.class);
		objectMap.put("GetPlayerSetupInfo", GetPlayerSetupInfoXmlSerializer.class);
		objectMap.put("GetPlayerSignupPlugin", GetPlayerSignupPluginXmlSerializer.class);
		objectMap.put("SetPlayerProperty", SetPlayerPropertyXmlSerializer.class);
		objectMap.put("GetPlayerPropertyList", GetPlayerPropertyListXmlSerializer.class);
		objectMap.put("GetPlayerInfo", GetPlayerInfoXmlSerializer.class);
		objectMap.put("GetPlayerScores", GetPlayerScoresXmlSerializer.class);
		objectMap.put("GetUserAdminInfoByPlayer", GetUserAdminInfoByPlayerXmlSerializer.class);
		objectMap.put("SetPlayerAvatar", SetPlayerAvatarXmlSerializer.class);
		objectMap.put("GetPlayerAvatar", GetPlayerAvatarXmlSerializer.class);

		// Mappings by id

		// Mappings by name
	}

	@Override
	public Set<Class<?>> getTypes() {
		return new HashSet<Class<?>>(objectMap.values());
	}

	@Override
	public boolean containsType(Object key) {
		return objectMap.containsKey(key);
	}

	@Override
	public Class<? extends IXmlSerializer<?>> getType(Object key) {
		if (key == null) {
			throw new NullPointerException("key");
		}
		Class<? extends IXmlSerializer<?>> type = objectMap.get(key);
		if (type == null) {
			throw new IllegalArgumentException("key: '" + key + "'");
		}
		return type;
	}

	@Override
	public IXmlSerializer<?> newInstance(Object key) {
		Class<? extends IXmlSerializer<?>> type = getType(key);
		try {
			return type.newInstance();
		} catch (Exception e) {
			throw new IllegalStateException("Unable to instantiate " + type, e);
		}
	}
}
