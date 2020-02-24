package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.factory.IObjectFactory;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.turnengine.client.api.global.admin.GetAdminHostAddress;
import com.turnengine.client.api.global.admin.GetAdminHostAddressReturnTypeXmlSerializer;
import com.turnengine.client.api.global.admin.SendEmail;
import com.turnengine.client.api.global.admin.SendEmailReturnTypeXmlSerializer;
import com.turnengine.client.api.global.announcement.DeleteAnnouncement;
import com.turnengine.client.api.global.announcement.DeleteAnnouncementReturnTypeXmlSerializer;
import com.turnengine.client.api.global.announcement.GetAnnouncementCount;
import com.turnengine.client.api.global.announcement.GetAnnouncementCountReturnTypeXmlSerializer;
import com.turnengine.client.api.global.announcement.GetAnnouncementList;
import com.turnengine.client.api.global.announcement.GetAnnouncementListReturnTypeXmlSerializer;
import com.turnengine.client.api.global.announcement.PostAnnouncement;
import com.turnengine.client.api.global.announcement.PostAnnouncementReturnTypeXmlSerializer;
import com.turnengine.client.api.global.error.GetCommandStackTrace;
import com.turnengine.client.api.global.error.GetCommandStackTraceList;
import com.turnengine.client.api.global.error.GetCommandStackTraceListReturnTypeXmlSerializer;
import com.turnengine.client.api.global.error.GetCommandStackTraceReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.CreateForum;
import com.turnengine.client.api.global.forum.CreateForumPost;
import com.turnengine.client.api.global.forum.CreateForumPostReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.CreateForumReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.CreateForumThread;
import com.turnengine.client.api.global.forum.CreateForumThreadReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.EditPost;
import com.turnengine.client.api.global.forum.EditPostReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.GetForumList;
import com.turnengine.client.api.global.forum.GetForumListReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.GetPostList;
import com.turnengine.client.api.global.forum.GetPostListReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.GetThread;
import com.turnengine.client.api.global.forum.GetThreadList;
import com.turnengine.client.api.global.forum.GetThreadListReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.GetThreadReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.SetForumFlag;
import com.turnengine.client.api.global.forum.SetForumFlagReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.SetForumOrder;
import com.turnengine.client.api.global.forum.SetForumOrderReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.SetPostFlag;
import com.turnengine.client.api.global.forum.SetPostFlagReturnTypeXmlSerializer;
import com.turnengine.client.api.global.forum.SetThreadFlag;
import com.turnengine.client.api.global.forum.SetThreadFlagReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameById;
import com.turnengine.client.api.global.game.GetGameByIdReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameByName;
import com.turnengine.client.api.global.game.GetGameByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameDefinition;
import com.turnengine.client.api.global.game.GetGameDefinitionReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameDefinitions;
import com.turnengine.client.api.global.game.GetGameDefinitionsByGameName;
import com.turnengine.client.api.global.game.GetGameDefinitionsByGameNameReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameDefinitionsReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameHostById;
import com.turnengine.client.api.global.game.GetGameHostByIdReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameHostByName;
import com.turnengine.client.api.global.game.GetGameHostByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameHosts;
import com.turnengine.client.api.global.game.GetGameHostsReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstanceById;
import com.turnengine.client.api.global.game.GetGameInstanceByIdReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstanceByName;
import com.turnengine.client.api.global.game.GetGameInstanceByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstanceByNames;
import com.turnengine.client.api.global.game.GetGameInstanceByNamesReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstancePropertyList;
import com.turnengine.client.api.global.game.GetGameInstancePropertyListReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstances;
import com.turnengine.client.api.global.game.GetGameInstancesByGameName;
import com.turnengine.client.api.global.game.GetGameInstancesByGameNameReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameInstancesReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameVersionById;
import com.turnengine.client.api.global.game.GetGameVersionByIdReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameVersionByName;
import com.turnengine.client.api.global.game.GetGameVersionByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGameVersions;
import com.turnengine.client.api.global.game.GetGameVersionsReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.GetGames;
import com.turnengine.client.api.global.game.GetGamesReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.NewGame;
import com.turnengine.client.api.global.game.NewGameHost;
import com.turnengine.client.api.global.game.NewGameHostReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.NewGameInstance;
import com.turnengine.client.api.global.game.NewGameInstanceReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.NewGameReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.NewGameVersion;
import com.turnengine.client.api.global.game.NewGameVersionReturnTypeXmlSerializer;
import com.turnengine.client.api.global.game.SetGameInstanceProperty;
import com.turnengine.client.api.global.game.SetGameInstancePropertyReturnTypeXmlSerializer;
import com.turnengine.client.api.global.translation.GetTranslationById;
import com.turnengine.client.api.global.translation.GetTranslationByIdReturnTypeXmlSerializer;
import com.turnengine.client.api.global.translation.GetTranslationByText;
import com.turnengine.client.api.global.translation.GetTranslationByTextReturnTypeXmlSerializer;
import com.turnengine.client.api.global.translation.NewTranslation;
import com.turnengine.client.api.global.translation.NewTranslationReturnTypeXmlSerializer;
import com.turnengine.client.api.global.translation.SetTranslation;
import com.turnengine.client.api.global.translation.SetTranslationReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.AdminSetUserPassword;
import com.turnengine.client.api.global.user.AdminSetUserPasswordReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.AdminVerifyUser;
import com.turnengine.client.api.global.user.AdminVerifyUserReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.ChangeUserPassword;
import com.turnengine.client.api.global.user.ChangeUserPasswordReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.CountUsers;
import com.turnengine.client.api.global.user.CountUsersReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUser;
import com.turnengine.client.api.global.user.GetUserAddressCodeList;
import com.turnengine.client.api.global.user.GetUserAddressCodeListReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUserAdminInfo;
import com.turnengine.client.api.global.user.GetUserAdminInfoList;
import com.turnengine.client.api.global.user.GetUserAdminInfoListReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUserAdminInfoReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUserAvatar;
import com.turnengine.client.api.global.user.GetUserAvatarReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUserByEmail;
import com.turnengine.client.api.global.user.GetUserByEmailReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUserById;
import com.turnengine.client.api.global.user.GetUserByIdReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUserByLoginId;
import com.turnengine.client.api.global.user.GetUserByLoginIdReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUserByName;
import com.turnengine.client.api.global.user.GetUserByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUserList;
import com.turnengine.client.api.global.user.GetUserListReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUserNames;
import com.turnengine.client.api.global.user.GetUserNamesReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUserReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.GetUserSimilarityList;
import com.turnengine.client.api.global.user.GetUserSimilarityListReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.LoginUser;
import com.turnengine.client.api.global.user.LoginUserReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.LogoutUser;
import com.turnengine.client.api.global.user.LogoutUserReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.RenameUser;
import com.turnengine.client.api.global.user.RenameUserReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.ResetPassword;
import com.turnengine.client.api.global.user.ResetPasswordReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.SendResetPasswordEmail;
import com.turnengine.client.api.global.user.SendResetPasswordEmailReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.SetResetPasswordEmail;
import com.turnengine.client.api.global.user.SetResetPasswordEmailReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.SetSignupUserEmail;
import com.turnengine.client.api.global.user.SetSignupUserEmailReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.SetSignupVerification;
import com.turnengine.client.api.global.user.SetSignupVerificationReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.SetUserAddress;
import com.turnengine.client.api.global.user.SetUserAddressReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.SetUserAvatar;
import com.turnengine.client.api.global.user.SetUserAvatarReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.SetUserGamePermission;
import com.turnengine.client.api.global.user.SetUserGamePermissionReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.SetUserLanguage;
import com.turnengine.client.api.global.user.SetUserLanguageReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.SetUserPermission;
import com.turnengine.client.api.global.user.SetUserPermissionReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.SignupUser;
import com.turnengine.client.api.global.user.SignupUserReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.UpdateUserAddressCode;
import com.turnengine.client.api.global.user.UpdateUserAddressCodeReturnTypeXmlSerializer;
import com.turnengine.client.api.global.user.VerifyUser;
import com.turnengine.client.api.global.user.VerifyUserReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.AddAction;
import com.turnengine.client.api.local.action.AddActionCondition;
import com.turnengine.client.api.local.action.AddActionConditionReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.AddActionPlugin;
import com.turnengine.client.api.local.action.AddActionPluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.AddActionReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.AddActionTarget;
import com.turnengine.client.api.local.action.AddActionTargetReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.CancelActionAtLocation;
import com.turnengine.client.api.local.action.CancelActionAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.CancelActionAtPlayer;
import com.turnengine.client.api.local.action.CancelActionAtPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.ClearActionQueuedAtLocation;
import com.turnengine.client.api.local.action.ClearActionQueuedAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.ClearActionQueuedAtPlayer;
import com.turnengine.client.api.local.action.ClearActionQueuedAtPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.ClearActionsQueuedAtLocation;
import com.turnengine.client.api.local.action.ClearActionsQueuedAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.ClearActionsQueuedAtPlayer;
import com.turnengine.client.api.local.action.ClearActionsQueuedAtPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.GetActionConditionList;
import com.turnengine.client.api.local.action.GetActionConditionListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.GetActionList;
import com.turnengine.client.api.local.action.GetActionListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.GetActionPlugin;
import com.turnengine.client.api.local.action.GetActionPluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.GetActionTargetList;
import com.turnengine.client.api.local.action.GetActionTargetListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsAvailableAtLocation;
import com.turnengine.client.api.local.action.ListActionsAvailableAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsAvailableAtMobile;
import com.turnengine.client.api.local.action.ListActionsAvailableAtMobileReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsAvailableAtPlayer;
import com.turnengine.client.api.local.action.ListActionsAvailableAtPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsExecutingAtLocation;
import com.turnengine.client.api.local.action.ListActionsExecutingAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsExecutingAtPlayer;
import com.turnengine.client.api.local.action.ListActionsExecutingAtPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsQueuedAtLocation;
import com.turnengine.client.api.local.action.ListActionsQueuedAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.ListActionsQueuedAtPlayer;
import com.turnengine.client.api.local.action.ListActionsQueuedAtPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.StartActionAtLocation;
import com.turnengine.client.api.local.action.StartActionAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.StartActionAtLocationToLocation;
import com.turnengine.client.api.local.action.StartActionAtLocationToLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.StartActionAtMobileToLocation;
import com.turnengine.client.api.local.action.StartActionAtMobileToLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.action.StartActionAtPlayer;
import com.turnengine.client.api.local.action.StartActionAtPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.DisbandAlliance;
import com.turnengine.client.api.local.alliance.DisbandAllianceReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.FormAlliance;
import com.turnengine.client.api.local.alliance.FormAllianceReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAlliance;
import com.turnengine.client.api.local.alliance.GetAllianceById;
import com.turnengine.client.api.local.alliance.GetAllianceByIdReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceByName;
import com.turnengine.client.api.local.alliance.GetAllianceByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceCount;
import com.turnengine.client.api.local.alliance.GetAllianceCountReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceInfo;
import com.turnengine.client.api.local.alliance.GetAllianceInfoReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceInviteLimit;
import com.turnengine.client.api.local.alliance.GetAllianceInviteLimitReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceList;
import com.turnengine.client.api.local.alliance.GetAllianceListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceLogo;
import com.turnengine.client.api.local.alliance.GetAllianceLogoReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceMemberCount;
import com.turnengine.client.api.local.alliance.GetAllianceMemberCountReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceMemberLimit;
import com.turnengine.client.api.local.alliance.GetAllianceMemberLimitReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAlliancePropertyList;
import com.turnengine.client.api.local.alliance.GetAlliancePropertyListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceScores;
import com.turnengine.client.api.local.alliance.GetAllianceScoresReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetAllianceSetupInfo;
import com.turnengine.client.api.local.alliance.GetAllianceSetupInfoReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetInvitedToJoinAllianceList;
import com.turnengine.client.api.local.alliance.GetInvitedToJoinAllianceListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.GetRequestedToJoinAllianceList;
import com.turnengine.client.api.local.alliance.GetRequestedToJoinAllianceListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.InviteToJoinAlliance;
import com.turnengine.client.api.local.alliance.InviteToJoinAllianceByName;
import com.turnengine.client.api.local.alliance.InviteToJoinAllianceByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.InviteToJoinAllianceReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.KickAllianceMember;
import com.turnengine.client.api.local.alliance.KickAllianceMemberReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.LeaveAlliance;
import com.turnengine.client.api.local.alliance.LeaveAllianceReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.RequestToJoinAlliance;
import com.turnengine.client.api.local.alliance.RequestToJoinAllianceByName;
import com.turnengine.client.api.local.alliance.RequestToJoinAllianceByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.RequestToJoinAllianceReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAllianceInviteLimit;
import com.turnengine.client.api.local.alliance.SetAllianceInviteLimitReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAllianceLeaveTurns;
import com.turnengine.client.api.local.alliance.SetAllianceLeaveTurnsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAllianceLogo;
import com.turnengine.client.api.local.alliance.SetAllianceLogoReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAllianceMemberLimit;
import com.turnengine.client.api.local.alliance.SetAllianceMemberLimitReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAllianceProperty;
import com.turnengine.client.api.local.alliance.SetAlliancePropertyReturnTypeXmlSerializer;
import com.turnengine.client.api.local.alliance.SetAlliancesEnabled;
import com.turnengine.client.api.local.alliance.SetAlliancesEnabledReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForum;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumPost;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumPostReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumThread;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumThreadReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.EditAlliancePost;
import com.turnengine.client.api.local.allianceforum.EditAlliancePostReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.GetAllianceForumList;
import com.turnengine.client.api.local.allianceforum.GetAllianceForumListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.GetAlliancePostList;
import com.turnengine.client.api.local.allianceforum.GetAlliancePostListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.GetAllianceThread;
import com.turnengine.client.api.local.allianceforum.GetAllianceThreadList;
import com.turnengine.client.api.local.allianceforum.GetAllianceThreadListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.GetAllianceThreadReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.SetAllianceForumFlag;
import com.turnengine.client.api.local.allianceforum.SetAllianceForumFlagReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.SetAllianceForumOrder;
import com.turnengine.client.api.local.allianceforum.SetAllianceForumOrderReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.SetAlliancePostFlag;
import com.turnengine.client.api.local.allianceforum.SetAlliancePostFlagReturnTypeXmlSerializer;
import com.turnengine.client.api.local.allianceforum.SetAllianceThreadFlag;
import com.turnengine.client.api.local.allianceforum.SetAllianceThreadFlagReturnTypeXmlSerializer;
import com.turnengine.client.api.local.error.GetLocalTrace;
import com.turnengine.client.api.local.error.GetLocalTraceList;
import com.turnengine.client.api.local.error.GetLocalTraceListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.error.GetLocalTraceReturnTypeXmlSerializer;
import com.turnengine.client.api.local.faction.AddFaction;
import com.turnengine.client.api.local.faction.AddFactionReturnTypeXmlSerializer;
import com.turnengine.client.api.local.faction.GetFactionById;
import com.turnengine.client.api.local.faction.GetFactionByIdReturnTypeXmlSerializer;
import com.turnengine.client.api.local.faction.GetFactionByName;
import com.turnengine.client.api.local.faction.GetFactionByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.faction.GetFactions;
import com.turnengine.client.api.local.faction.GetFactionsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.game.AddGameUnits;
import com.turnengine.client.api.local.game.AddGameUnitsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.game.GetGameStatus;
import com.turnengine.client.api.local.game.GetGameStatusReturnTypeXmlSerializer;
import com.turnengine.client.api.local.game.GetGameUnits;
import com.turnengine.client.api.local.game.GetGameUnitsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.game.ResetGame;
import com.turnengine.client.api.local.game.ResetGameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.game.SetGameInstance;
import com.turnengine.client.api.local.game.SetGameInstanceReturnTypeXmlSerializer;
import com.turnengine.client.api.local.game.ShutdownGame;
import com.turnengine.client.api.local.game.ShutdownGameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.game.StartupGame;
import com.turnengine.client.api.local.game.StartupGameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.group.AddChildGroup;
import com.turnengine.client.api.local.group.AddChildGroupReturnTypeXmlSerializer;
import com.turnengine.client.api.local.group.AddParentGroup;
import com.turnengine.client.api.local.group.AddParentGroupReturnTypeXmlSerializer;
import com.turnengine.client.api.local.group.GetGroupById;
import com.turnengine.client.api.local.group.GetGroupByIdReturnTypeXmlSerializer;
import com.turnengine.client.api.local.group.GetGroupByName;
import com.turnengine.client.api.local.group.GetGroupByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.group.GetGroupListByFactionName;
import com.turnengine.client.api.local.group.GetGroupListByFactionNameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.group.GetGroups;
import com.turnengine.client.api.local.group.GetGroupsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.AddUnitsAtLocation;
import com.turnengine.client.api.local.location.AddUnitsAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.CheckRenameLocation;
import com.turnengine.client.api.local.location.CheckRenameLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GenerateLocations;
import com.turnengine.client.api.local.location.GenerateLocationsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetCoordinates;
import com.turnengine.client.api.local.location.GetCoordinatesReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetGridInfoList;
import com.turnengine.client.api.local.location.GetGridInfoListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetLocation;
import com.turnengine.client.api.local.location.GetLocationCoordinatePlugin;
import com.turnengine.client.api.local.location.GetLocationCoordinatePluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationCount;
import com.turnengine.client.api.local.location.GetLocationCountReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationGenerationPlugin;
import com.turnengine.client.api.local.location.GetLocationGenerationPluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationId;
import com.turnengine.client.api.local.location.GetLocationIdReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationIdsForPlayer;
import com.turnengine.client.api.local.location.GetLocationIdsForPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationList;
import com.turnengine.client.api.local.location.GetLocationListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationPropertyList;
import com.turnengine.client.api.local.location.GetLocationPropertyListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationSetupInfo;
import com.turnengine.client.api.local.location.GetLocationSetupInfoReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationSignupsEnabled;
import com.turnengine.client.api.local.location.GetLocationSignupsEnabledReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.GetLocationsEnabled;
import com.turnengine.client.api.local.location.GetLocationsEnabledReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.RenameLocation;
import com.turnengine.client.api.local.location.RenameLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.SetLocationCoordinatePlugin;
import com.turnengine.client.api.local.location.SetLocationCoordinatePluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.SetLocationGenerationPlugin;
import com.turnengine.client.api.local.location.SetLocationGenerationPluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.SetLocationProperty;
import com.turnengine.client.api.local.location.SetLocationPropertyReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.SetLocationSignupsEnabled;
import com.turnengine.client.api.local.location.SetLocationSignupsEnabledReturnTypeXmlSerializer;
import com.turnengine.client.api.local.location.SetLocationsEnabled;
import com.turnengine.client.api.local.location.SetLocationsEnabledReturnTypeXmlSerializer;
import com.turnengine.client.api.local.message.GetMessage;
import com.turnengine.client.api.local.message.GetMessageCountByFormat;
import com.turnengine.client.api.local.message.GetMessageCountByFormatReturnTypeXmlSerializer;
import com.turnengine.client.api.local.message.GetMessageReturnTypeXmlSerializer;
import com.turnengine.client.api.local.message.GetMessageSummary;
import com.turnengine.client.api.local.message.GetMessageSummaryReturnTypeXmlSerializer;
import com.turnengine.client.api.local.message.ListMessages;
import com.turnengine.client.api.local.message.ListMessagesReturnTypeXmlSerializer;
import com.turnengine.client.api.local.message.MakeNote;
import com.turnengine.client.api.local.message.MakeNoteReturnTypeXmlSerializer;
import com.turnengine.client.api.local.message.PostNews;
import com.turnengine.client.api.local.message.PostNewsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.message.SendMail;
import com.turnengine.client.api.local.message.SendMailReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.AddUnitsAtMobile;
import com.turnengine.client.api.local.mobile.AddUnitsAtMobileReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.ClearMobileQueue;
import com.turnengine.client.api.local.mobile.ClearMobileQueueReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.CreateMobileAtLocation;
import com.turnengine.client.api.local.mobile.CreateMobileAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.CreateMobileAtMobile;
import com.turnengine.client.api.local.mobile.CreateMobileAtMobileReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.DestroyEmptyMobile;
import com.turnengine.client.api.local.mobile.DestroyEmptyMobileReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.GetCombatPlugin;
import com.turnengine.client.api.local.mobile.GetCombatPluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobile;
import com.turnengine.client.api.local.mobile.GetMobileIdsForPlayer;
import com.turnengine.client.api.local.mobile.GetMobileIdsForPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobileList;
import com.turnengine.client.api.local.mobile.GetMobileListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobilePropertyList;
import com.turnengine.client.api.local.mobile.GetMobilePropertyListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobileQueueList;
import com.turnengine.client.api.local.mobile.GetMobileQueueListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobileReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobileSetupInfo;
import com.turnengine.client.api.local.mobile.GetMobileSetupInfoReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.GetMobilesEnabled;
import com.turnengine.client.api.local.mobile.GetMobilesEnabledReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.ListMobilesAtLocation;
import com.turnengine.client.api.local.mobile.ListMobilesAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.MoveMobile;
import com.turnengine.client.api.local.mobile.MoveMobileReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.MoveMobileToCoordinates;
import com.turnengine.client.api.local.mobile.MoveMobileToCoordinatesReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.RenameMobile;
import com.turnengine.client.api.local.mobile.RenameMobileReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.SetCombatPlugin;
import com.turnengine.client.api.local.mobile.SetCombatPluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.SetMobileMove;
import com.turnengine.client.api.local.mobile.SetMobileMoveReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.SetMobileMovementPlugin;
import com.turnengine.client.api.local.mobile.SetMobileMovementPluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.SetMobileProperty;
import com.turnengine.client.api.local.mobile.SetMobilePropertyReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.SetMobileWait;
import com.turnengine.client.api.local.mobile.SetMobileWaitReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.SetMobilesEnabled;
import com.turnengine.client.api.local.mobile.SetMobilesEnabledReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.TransferUnitsBetweenMobiles;
import com.turnengine.client.api.local.mobile.TransferUnitsBetweenMobilesReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.TransferUnitsFromMobile;
import com.turnengine.client.api.local.mobile.TransferUnitsFromMobileReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.TransferUnitsToMobile;
import com.turnengine.client.api.local.mobile.TransferUnitsToMobileReturnTypeXmlSerializer;
import com.turnengine.client.api.local.mobile.WaitMobile;
import com.turnengine.client.api.local.mobile.WaitMobileReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.AddUnitsAtPlayer;
import com.turnengine.client.api.local.player.AddUnitsAtPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayer;
import com.turnengine.client.api.local.player.GetPlayerActionQueueLimit;
import com.turnengine.client.api.local.player.GetPlayerActionQueueLimitReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerAvatar;
import com.turnengine.client.api.local.player.GetPlayerAvatarReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerById;
import com.turnengine.client.api.local.player.GetPlayerByIdReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerByName;
import com.turnengine.client.api.local.player.GetPlayerByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerByUserId;
import com.turnengine.client.api.local.player.GetPlayerByUserIdReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerCount;
import com.turnengine.client.api.local.player.GetPlayerCountByFactionId;
import com.turnengine.client.api.local.player.GetPlayerCountByFactionIdReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerCountReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerInfo;
import com.turnengine.client.api.local.player.GetPlayerInfoReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerLimit;
import com.turnengine.client.api.local.player.GetPlayerLimitReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerList;
import com.turnengine.client.api.local.player.GetPlayerListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerPropertyList;
import com.turnengine.client.api.local.player.GetPlayerPropertyListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerScore;
import com.turnengine.client.api.local.player.GetPlayerScoreList;
import com.turnengine.client.api.local.player.GetPlayerScoreListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerScoreReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerScores;
import com.turnengine.client.api.local.player.GetPlayerScoresReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerSetupInfo;
import com.turnengine.client.api.local.player.GetPlayerSetupInfoReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerSignupPlugin;
import com.turnengine.client.api.local.player.GetPlayerSignupPluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetPlayerSignupsEnabled;
import com.turnengine.client.api.local.player.GetPlayerSignupsEnabledReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.GetUserAdminInfoByPlayer;
import com.turnengine.client.api.local.player.GetUserAdminInfoByPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.IsPlayerSignedUp;
import com.turnengine.client.api.local.player.IsPlayerSignedUpReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.RenamePlayer;
import com.turnengine.client.api.local.player.RenamePlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerActionQueueLimit;
import com.turnengine.client.api.local.player.SetPlayerActionQueueLimitReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerAvatar;
import com.turnengine.client.api.local.player.SetPlayerAvatarReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerLimit;
import com.turnengine.client.api.local.player.SetPlayerLimitReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerProperty;
import com.turnengine.client.api.local.player.SetPlayerPropertyReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerSignupPlugin;
import com.turnengine.client.api.local.player.SetPlayerSignupPluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.SetPlayerSignupsEnabled;
import com.turnengine.client.api.local.player.SetPlayerSignupsEnabledReturnTypeXmlSerializer;
import com.turnengine.client.api.local.player.SignupPlayer;
import com.turnengine.client.api.local.player.SignupPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.property.GetLocalProperty;
import com.turnengine.client.api.local.property.GetLocalPropertyReturnTypeXmlSerializer;
import com.turnengine.client.api.local.property.SetLocalProperty;
import com.turnengine.client.api.local.property.SetLocalPropertyReturnTypeXmlSerializer;
import com.turnengine.client.api.local.score.GetAllianceRankingList;
import com.turnengine.client.api.local.score.GetAllianceRankingListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.score.GetPlayerRankingList;
import com.turnengine.client.api.local.score.GetPlayerRankingListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.score.GetRankingGroupList;
import com.turnengine.client.api.local.score.GetRankingGroupListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.score.GetRankingList;
import com.turnengine.client.api.local.score.GetRankingListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.score.GetScoreDivisor;
import com.turnengine.client.api.local.score.GetScoreDivisorReturnTypeXmlSerializer;
import com.turnengine.client.api.local.score.GetUnitScore;
import com.turnengine.client.api.local.score.GetUnitScoreReturnTypeXmlSerializer;
import com.turnengine.client.api.local.score.GetUnitScores;
import com.turnengine.client.api.local.score.GetUnitScoresReturnTypeXmlSerializer;
import com.turnengine.client.api.local.score.SetScoreDivisor;
import com.turnengine.client.api.local.score.SetScoreDivisorReturnTypeXmlSerializer;
import com.turnengine.client.api.local.score.SetScoreUpdaterGroup;
import com.turnengine.client.api.local.score.SetScoreUpdaterGroupReturnTypeXmlSerializer;
import com.turnengine.client.api.local.score.SetUnitScore;
import com.turnengine.client.api.local.score.SetUnitScoreReturnTypeXmlSerializer;
import com.turnengine.client.api.local.setup.ClearSetup;
import com.turnengine.client.api.local.setup.ClearSetupReturnTypeXmlSerializer;
import com.turnengine.client.api.local.setup.GetSetupBeanList;
import com.turnengine.client.api.local.setup.GetSetupBeanListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.setup.SetSetupBeanList;
import com.turnengine.client.api.local.setup.SetSetupBeanListFile;
import com.turnengine.client.api.local.setup.SetSetupBeanListFileReturnTypeXmlSerializer;
import com.turnengine.client.api.local.setup.SetSetupBeanListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.storage.GetStorageGroups;
import com.turnengine.client.api.local.storage.GetStorageGroupsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.storage.GetStorageItems;
import com.turnengine.client.api.local.storage.GetStorageItemsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.storage.SetStorageGroup;
import com.turnengine.client.api.local.storage.SetStorageGroupReturnTypeXmlSerializer;
import com.turnengine.client.api.local.storage.SetStorageItem;
import com.turnengine.client.api.local.storage.SetStorageItemReturnTypeXmlSerializer;
import com.turnengine.client.api.local.trading.BuyGoodsAtLocation;
import com.turnengine.client.api.local.trading.BuyGoodsAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.trading.GetGoodsPriceListAtLocation;
import com.turnengine.client.api.local.trading.GetGoodsPriceListAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.trading.SellGoodsAtLocation;
import com.turnengine.client.api.local.trading.SellGoodsAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.trading.SetTradeAtLocationPlugin;
import com.turnengine.client.api.local.trading.SetTradeAtLocationPluginReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.ExecuteTurns;
import com.turnengine.client.api.local.turn.ExecuteTurnsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.GetNextTurnUpdateTime;
import com.turnengine.client.api.local.turn.GetNextTurnUpdateTimeReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnDetails;
import com.turnengine.client.api.local.turn.GetTurnDetailsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnFinishTime;
import com.turnengine.client.api.local.turn.GetTurnFinishTimeReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnInterval;
import com.turnengine.client.api.local.turn.GetTurnIntervalReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnNumber;
import com.turnengine.client.api.local.turn.GetTurnNumberReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnStartTime;
import com.turnengine.client.api.local.turn.GetTurnStartTimeReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnSummary;
import com.turnengine.client.api.local.turn.GetTurnSummaryReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnUpdating;
import com.turnengine.client.api.local.turn.GetTurnUpdatingReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurns;
import com.turnengine.client.api.local.turn.GetTurnsEnabled;
import com.turnengine.client.api.local.turn.GetTurnsEnabledReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.GetTurnsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.SetTurnFinishTime;
import com.turnengine.client.api.local.turn.SetTurnFinishTimeReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.SetTurnInterval;
import com.turnengine.client.api.local.turn.SetTurnIntervalReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.SetTurnIntervalTime;
import com.turnengine.client.api.local.turn.SetTurnIntervalTimeReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.SetTurnStartTime;
import com.turnengine.client.api.local.turn.SetTurnStartTimeReturnTypeXmlSerializer;
import com.turnengine.client.api.local.turn.SetTurnsEnabled;
import com.turnengine.client.api.local.turn.SetTurnsEnabledReturnTypeXmlSerializer;
import com.turnengine.client.api.local.unit.AddUnit;
import com.turnengine.client.api.local.unit.AddUnitReturnTypeXmlSerializer;
import com.turnengine.client.api.local.unit.GetAllUnitsAtPlayer;
import com.turnengine.client.api.local.unit.GetAllUnitsAtPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitById;
import com.turnengine.client.api.local.unit.GetUnitByIdReturnTypeXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitByName;
import com.turnengine.client.api.local.unit.GetUnitByNameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnits;
import com.turnengine.client.api.local.unit.GetUnitsAtPlayer;
import com.turnengine.client.api.local.unit.GetUnitsAtPlayerReturnTypeXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitsByFactionId;
import com.turnengine.client.api.local.unit.GetUnitsByFactionIdReturnTypeXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitsByFactionName;
import com.turnengine.client.api.local.unit.GetUnitsByFactionNameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitsByGroupId;
import com.turnengine.client.api.local.unit.GetUnitsByGroupIdReturnTypeXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitsByGroupName;
import com.turnengine.client.api.local.unit.GetUnitsByGroupNameReturnTypeXmlSerializer;
import com.turnengine.client.api.local.unit.GetUnitsReturnTypeXmlSerializer;
import com.turnengine.client.api.local.upkeep.AddUpkeep;
import com.turnengine.client.api.local.upkeep.AddUpkeepCondition;
import com.turnengine.client.api.local.upkeep.AddUpkeepConditionReturnTypeXmlSerializer;
import com.turnengine.client.api.local.upkeep.AddUpkeepReturnTypeXmlSerializer;
import com.turnengine.client.api.local.upkeep.GetUpkeepAtLocation;
import com.turnengine.client.api.local.upkeep.GetUpkeepAtLocationReturnTypeXmlSerializer;
import com.turnengine.client.api.local.upkeep.GetUpkeepConditionList;
import com.turnengine.client.api.local.upkeep.GetUpkeepConditionListReturnTypeXmlSerializer;
import com.turnengine.client.api.local.upkeep.GetUpkeepList;
import com.turnengine.client.api.local.upkeep.GetUpkeepListReturnTypeXmlSerializer;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalReturnTypeXmlSerializerFactory implements IObjectFactory<IXmlSerializer<?>> {

	private final Map<Object, Class<? extends IXmlSerializer<?>>> objectMap = new ConcurrentHashMap<Object, Class<? extends IXmlSerializer<?>>>();;

	public GlobalReturnTypeXmlSerializerFactory() {

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
		objectMap.put(GetCommandStackTrace.SERIALIZATION_ID, GetCommandStackTraceReturnTypeXmlSerializer.class);
		objectMap.put(GetCommandStackTraceList.SERIALIZATION_ID, GetCommandStackTraceListReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("GetCommandStackTrace", GetCommandStackTraceReturnTypeXmlSerializer.class);
		objectMap.put("GetCommandStackTraceList", GetCommandStackTraceListReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(NewTranslation.SERIALIZATION_ID, NewTranslationReturnTypeXmlSerializer.class);
		objectMap.put(SetTranslation.SERIALIZATION_ID, SetTranslationReturnTypeXmlSerializer.class);
		objectMap.put(GetTranslationById.SERIALIZATION_ID, GetTranslationByIdReturnTypeXmlSerializer.class);
		objectMap.put(GetTranslationByText.SERIALIZATION_ID, GetTranslationByTextReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("NewTranslation", NewTranslationReturnTypeXmlSerializer.class);
		objectMap.put("SetTranslation", SetTranslationReturnTypeXmlSerializer.class);
		objectMap.put("GetTranslationById", GetTranslationByIdReturnTypeXmlSerializer.class);
		objectMap.put("GetTranslationByText", GetTranslationByTextReturnTypeXmlSerializer.class);

		// Mappings by id

		// Mappings by name

		// Mappings by id
		objectMap.put(SendEmail.SERIALIZATION_ID, SendEmailReturnTypeXmlSerializer.class);
		objectMap.put(GetAdminHostAddress.SERIALIZATION_ID, GetAdminHostAddressReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("SendEmail", SendEmailReturnTypeXmlSerializer.class);
		objectMap.put("GetAdminHostAddress", GetAdminHostAddressReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(PostAnnouncement.SERIALIZATION_ID, PostAnnouncementReturnTypeXmlSerializer.class);
		objectMap.put(GetAnnouncementCount.SERIALIZATION_ID, GetAnnouncementCountReturnTypeXmlSerializer.class);
		objectMap.put(GetAnnouncementList.SERIALIZATION_ID, GetAnnouncementListReturnTypeXmlSerializer.class);
		objectMap.put(DeleteAnnouncement.SERIALIZATION_ID, DeleteAnnouncementReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("PostAnnouncement", PostAnnouncementReturnTypeXmlSerializer.class);
		objectMap.put("GetAnnouncementCount", GetAnnouncementCountReturnTypeXmlSerializer.class);
		objectMap.put("GetAnnouncementList", GetAnnouncementListReturnTypeXmlSerializer.class);
		objectMap.put("DeleteAnnouncement", DeleteAnnouncementReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(AddFaction.SERIALIZATION_ID, AddFactionReturnTypeXmlSerializer.class);
		objectMap.put(GetFactionById.SERIALIZATION_ID, GetFactionByIdReturnTypeXmlSerializer.class);
		objectMap.put(GetFactionByName.SERIALIZATION_ID, GetFactionByNameReturnTypeXmlSerializer.class);
		objectMap.put(GetFactions.SERIALIZATION_ID, GetFactionsReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("AddFaction", AddFactionReturnTypeXmlSerializer.class);
		objectMap.put("GetFactionById", GetFactionByIdReturnTypeXmlSerializer.class);
		objectMap.put("GetFactionByName", GetFactionByNameReturnTypeXmlSerializer.class);
		objectMap.put("GetFactions", GetFactionsReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(GetLocalTrace.SERIALIZATION_ID, GetLocalTraceReturnTypeXmlSerializer.class);
		objectMap.put(GetLocalTraceList.SERIALIZATION_ID, GetLocalTraceListReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("GetLocalTrace", GetLocalTraceReturnTypeXmlSerializer.class);
		objectMap.put("GetLocalTraceList", GetLocalTraceListReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(SetGameInstance.SERIALIZATION_ID, SetGameInstanceReturnTypeXmlSerializer.class);
		objectMap.put(StartupGame.SERIALIZATION_ID, StartupGameReturnTypeXmlSerializer.class);
		objectMap.put(ResetGame.SERIALIZATION_ID, ResetGameReturnTypeXmlSerializer.class);
		objectMap.put(ShutdownGame.SERIALIZATION_ID, ShutdownGameReturnTypeXmlSerializer.class);
		objectMap.put(GetGameStatus.SERIALIZATION_ID, GetGameStatusReturnTypeXmlSerializer.class);
		objectMap.put(AddGameUnits.SERIALIZATION_ID, AddGameUnitsReturnTypeXmlSerializer.class);
		objectMap.put(GetGameUnits.SERIALIZATION_ID, GetGameUnitsReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("SetGameInstance", SetGameInstanceReturnTypeXmlSerializer.class);
		objectMap.put("StartupGame", StartupGameReturnTypeXmlSerializer.class);
		objectMap.put("ResetGame", ResetGameReturnTypeXmlSerializer.class);
		objectMap.put("ShutdownGame", ShutdownGameReturnTypeXmlSerializer.class);
		objectMap.put("GetGameStatus", GetGameStatusReturnTypeXmlSerializer.class);
		objectMap.put("AddGameUnits", AddGameUnitsReturnTypeXmlSerializer.class);
		objectMap.put("GetGameUnits", GetGameUnitsReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(Ping.SERIALIZATION_ID, PingReturnTypeXmlSerializer.class);
		objectMap.put(GetServiceStatus.SERIALIZATION_ID, GetServiceStatusReturnTypeXmlSerializer.class);
		objectMap.put(GetSystemStatus.SERIALIZATION_ID, GetSystemStatusReturnTypeXmlSerializer.class);
		objectMap.put(GetCommandAvailable.SERIALIZATION_ID, GetCommandAvailableReturnTypeXmlSerializer.class);
		objectMap.put(StartService.SERIALIZATION_ID, StartServiceReturnTypeXmlSerializer.class);
		objectMap.put(StopService.SERIALIZATION_ID, StopServiceReturnTypeXmlSerializer.class);
		objectMap.put(GetServiceProcessList.SERIALIZATION_ID, GetServiceProcessListReturnTypeXmlSerializer.class);
		objectMap.put(GetAvailableReleaseList.SERIALIZATION_ID, GetAvailableReleaseListReturnTypeXmlSerializer.class);
		objectMap.put(GetAvailableServiceList.SERIALIZATION_ID, GetAvailableServiceListReturnTypeXmlSerializer.class);
		objectMap.put(GetGoogleOpenIdForm.SERIALIZATION_ID, GetGoogleOpenIdFormReturnTypeXmlSerializer.class);
		objectMap.put(GetLoggedExceptions.SERIALIZATION_ID, GetLoggedExceptionsReturnTypeXmlSerializer.class);
		objectMap.put(ThrowException.SERIALIZATION_ID, ThrowExceptionReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("Ping", PingReturnTypeXmlSerializer.class);
		objectMap.put("GetServiceStatus", GetServiceStatusReturnTypeXmlSerializer.class);
		objectMap.put("GetSystemStatus", GetSystemStatusReturnTypeXmlSerializer.class);
		objectMap.put("GetCommandAvailable", GetCommandAvailableReturnTypeXmlSerializer.class);
		objectMap.put("StartService", StartServiceReturnTypeXmlSerializer.class);
		objectMap.put("StopService", StopServiceReturnTypeXmlSerializer.class);
		objectMap.put("GetServiceProcessList", GetServiceProcessListReturnTypeXmlSerializer.class);
		objectMap.put("GetAvailableReleaseList", GetAvailableReleaseListReturnTypeXmlSerializer.class);
		objectMap.put("GetAvailableServiceList", GetAvailableServiceListReturnTypeXmlSerializer.class);
		objectMap.put("GetGoogleOpenIdForm", GetGoogleOpenIdFormReturnTypeXmlSerializer.class);
		objectMap.put("GetLoggedExceptions", GetLoggedExceptionsReturnTypeXmlSerializer.class);
		objectMap.put("ThrowException", ThrowExceptionReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(AddParentGroup.SERIALIZATION_ID, AddParentGroupReturnTypeXmlSerializer.class);
		objectMap.put(AddChildGroup.SERIALIZATION_ID, AddChildGroupReturnTypeXmlSerializer.class);
		objectMap.put(GetGroupById.SERIALIZATION_ID, GetGroupByIdReturnTypeXmlSerializer.class);
		objectMap.put(GetGroupByName.SERIALIZATION_ID, GetGroupByNameReturnTypeXmlSerializer.class);
		objectMap.put(GetGroups.SERIALIZATION_ID, GetGroupsReturnTypeXmlSerializer.class);
		objectMap.put(GetGroupListByFactionName.SERIALIZATION_ID, GetGroupListByFactionNameReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("AddParentGroup", AddParentGroupReturnTypeXmlSerializer.class);
		objectMap.put("AddChildGroup", AddChildGroupReturnTypeXmlSerializer.class);
		objectMap.put("GetGroupById", GetGroupByIdReturnTypeXmlSerializer.class);
		objectMap.put("GetGroupByName", GetGroupByNameReturnTypeXmlSerializer.class);
		objectMap.put("GetGroups", GetGroupsReturnTypeXmlSerializer.class);
		objectMap.put("GetGroupListByFactionName", GetGroupListByFactionNameReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(SendMail.SERIALIZATION_ID, SendMailReturnTypeXmlSerializer.class);
		objectMap.put(MakeNote.SERIALIZATION_ID, MakeNoteReturnTypeXmlSerializer.class);
		objectMap.put(PostNews.SERIALIZATION_ID, PostNewsReturnTypeXmlSerializer.class);
		objectMap.put(ListMessages.SERIALIZATION_ID, ListMessagesReturnTypeXmlSerializer.class);
		objectMap.put(GetMessageSummary.SERIALIZATION_ID, GetMessageSummaryReturnTypeXmlSerializer.class);
		objectMap.put(GetMessage.SERIALIZATION_ID, GetMessageReturnTypeXmlSerializer.class);
		objectMap.put(GetMessageCountByFormat.SERIALIZATION_ID, GetMessageCountByFormatReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("SendMail", SendMailReturnTypeXmlSerializer.class);
		objectMap.put("MakeNote", MakeNoteReturnTypeXmlSerializer.class);
		objectMap.put("PostNews", PostNewsReturnTypeXmlSerializer.class);
		objectMap.put("ListMessages", ListMessagesReturnTypeXmlSerializer.class);
		objectMap.put("GetMessageSummary", GetMessageSummaryReturnTypeXmlSerializer.class);
		objectMap.put("GetMessage", GetMessageReturnTypeXmlSerializer.class);
		objectMap.put("GetMessageCountByFormat", GetMessageCountByFormatReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(SetLocalProperty.SERIALIZATION_ID, SetLocalPropertyReturnTypeXmlSerializer.class);
		objectMap.put(GetLocalProperty.SERIALIZATION_ID, GetLocalPropertyReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("SetLocalProperty", SetLocalPropertyReturnTypeXmlSerializer.class);
		objectMap.put("GetLocalProperty", GetLocalPropertyReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(CreateForum.SERIALIZATION_ID, CreateForumReturnTypeXmlSerializer.class);
		objectMap.put(CreateForumThread.SERIALIZATION_ID, CreateForumThreadReturnTypeXmlSerializer.class);
		objectMap.put(CreateForumPost.SERIALIZATION_ID, CreateForumPostReturnTypeXmlSerializer.class);
		objectMap.put(SetForumOrder.SERIALIZATION_ID, SetForumOrderReturnTypeXmlSerializer.class);
		objectMap.put(GetForumList.SERIALIZATION_ID, GetForumListReturnTypeXmlSerializer.class);
		objectMap.put(GetThreadList.SERIALIZATION_ID, GetThreadListReturnTypeXmlSerializer.class);
		objectMap.put(GetThread.SERIALIZATION_ID, GetThreadReturnTypeXmlSerializer.class);
		objectMap.put(EditPost.SERIALIZATION_ID, EditPostReturnTypeXmlSerializer.class);
		objectMap.put(SetForumFlag.SERIALIZATION_ID, SetForumFlagReturnTypeXmlSerializer.class);
		objectMap.put(SetThreadFlag.SERIALIZATION_ID, SetThreadFlagReturnTypeXmlSerializer.class);
		objectMap.put(SetPostFlag.SERIALIZATION_ID, SetPostFlagReturnTypeXmlSerializer.class);
		objectMap.put(GetPostList.SERIALIZATION_ID, GetPostListReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("CreateForum", CreateForumReturnTypeXmlSerializer.class);
		objectMap.put("CreateForumThread", CreateForumThreadReturnTypeXmlSerializer.class);
		objectMap.put("CreateForumPost", CreateForumPostReturnTypeXmlSerializer.class);
		objectMap.put("SetForumOrder", SetForumOrderReturnTypeXmlSerializer.class);
		objectMap.put("GetForumList", GetForumListReturnTypeXmlSerializer.class);
		objectMap.put("GetThreadList", GetThreadListReturnTypeXmlSerializer.class);
		objectMap.put("GetThread", GetThreadReturnTypeXmlSerializer.class);
		objectMap.put("EditPost", EditPostReturnTypeXmlSerializer.class);
		objectMap.put("SetForumFlag", SetForumFlagReturnTypeXmlSerializer.class);
		objectMap.put("SetThreadFlag", SetThreadFlagReturnTypeXmlSerializer.class);
		objectMap.put("SetPostFlag", SetPostFlagReturnTypeXmlSerializer.class);
		objectMap.put("GetPostList", GetPostListReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(NewGame.SERIALIZATION_ID, NewGameReturnTypeXmlSerializer.class);
		objectMap.put(NewGameVersion.SERIALIZATION_ID, NewGameVersionReturnTypeXmlSerializer.class);
		objectMap.put(NewGameInstance.SERIALIZATION_ID, NewGameInstanceReturnTypeXmlSerializer.class);
		objectMap.put(GetGameById.SERIALIZATION_ID, GetGameByIdReturnTypeXmlSerializer.class);
		objectMap.put(GetGameByName.SERIALIZATION_ID, GetGameByNameReturnTypeXmlSerializer.class);
		objectMap.put(GetGameVersionById.SERIALIZATION_ID, GetGameVersionByIdReturnTypeXmlSerializer.class);
		objectMap.put(GetGameVersionByName.SERIALIZATION_ID, GetGameVersionByNameReturnTypeXmlSerializer.class);
		objectMap.put(GetGameInstanceById.SERIALIZATION_ID, GetGameInstanceByIdReturnTypeXmlSerializer.class);
		objectMap.put(GetGameInstanceByName.SERIALIZATION_ID, GetGameInstanceByNameReturnTypeXmlSerializer.class);
		objectMap.put(GetGames.SERIALIZATION_ID, GetGamesReturnTypeXmlSerializer.class);
		objectMap.put(GetGameVersions.SERIALIZATION_ID, GetGameVersionsReturnTypeXmlSerializer.class);
		objectMap.put(GetGameInstances.SERIALIZATION_ID, GetGameInstancesReturnTypeXmlSerializer.class);
		objectMap.put(GetGameDefinitions.SERIALIZATION_ID, GetGameDefinitionsReturnTypeXmlSerializer.class);
		objectMap.put(GetGameDefinition.SERIALIZATION_ID, GetGameDefinitionReturnTypeXmlSerializer.class);
		objectMap.put(NewGameHost.SERIALIZATION_ID, NewGameHostReturnTypeXmlSerializer.class);
		objectMap.put(GetGameInstanceByNames.SERIALIZATION_ID, GetGameInstanceByNamesReturnTypeXmlSerializer.class);
		objectMap.put(GetGameHostByName.SERIALIZATION_ID, GetGameHostByNameReturnTypeXmlSerializer.class);
		objectMap.put(GetGameHostById.SERIALIZATION_ID, GetGameHostByIdReturnTypeXmlSerializer.class);
		objectMap.put(GetGameHosts.SERIALIZATION_ID, GetGameHostsReturnTypeXmlSerializer.class);
		objectMap.put(GetGameInstancesByGameName.SERIALIZATION_ID, GetGameInstancesByGameNameReturnTypeXmlSerializer.class);
		objectMap.put(GetGameDefinitionsByGameName.SERIALIZATION_ID, GetGameDefinitionsByGameNameReturnTypeXmlSerializer.class);
		objectMap.put(SetGameInstanceProperty.SERIALIZATION_ID, SetGameInstancePropertyReturnTypeXmlSerializer.class);
		objectMap.put(GetGameInstancePropertyList.SERIALIZATION_ID, GetGameInstancePropertyListReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("NewGame", NewGameReturnTypeXmlSerializer.class);
		objectMap.put("NewGameVersion", NewGameVersionReturnTypeXmlSerializer.class);
		objectMap.put("NewGameInstance", NewGameInstanceReturnTypeXmlSerializer.class);
		objectMap.put("GetGameById", GetGameByIdReturnTypeXmlSerializer.class);
		objectMap.put("GetGameByName", GetGameByNameReturnTypeXmlSerializer.class);
		objectMap.put("GetGameVersionById", GetGameVersionByIdReturnTypeXmlSerializer.class);
		objectMap.put("GetGameVersionByName", GetGameVersionByNameReturnTypeXmlSerializer.class);
		objectMap.put("GetGameInstanceById", GetGameInstanceByIdReturnTypeXmlSerializer.class);
		objectMap.put("GetGameInstanceByName", GetGameInstanceByNameReturnTypeXmlSerializer.class);
		objectMap.put("GetGames", GetGamesReturnTypeXmlSerializer.class);
		objectMap.put("GetGameVersions", GetGameVersionsReturnTypeXmlSerializer.class);
		objectMap.put("GetGameInstances", GetGameInstancesReturnTypeXmlSerializer.class);
		objectMap.put("GetGameDefinitions", GetGameDefinitionsReturnTypeXmlSerializer.class);
		objectMap.put("GetGameDefinition", GetGameDefinitionReturnTypeXmlSerializer.class);
		objectMap.put("NewGameHost", NewGameHostReturnTypeXmlSerializer.class);
		objectMap.put("GetGameInstanceByNames", GetGameInstanceByNamesReturnTypeXmlSerializer.class);
		objectMap.put("GetGameHostByName", GetGameHostByNameReturnTypeXmlSerializer.class);
		objectMap.put("GetGameHostById", GetGameHostByIdReturnTypeXmlSerializer.class);
		objectMap.put("GetGameHosts", GetGameHostsReturnTypeXmlSerializer.class);
		objectMap.put("GetGameInstancesByGameName", GetGameInstancesByGameNameReturnTypeXmlSerializer.class);
		objectMap.put("GetGameDefinitionsByGameName", GetGameDefinitionsByGameNameReturnTypeXmlSerializer.class);
		objectMap.put("SetGameInstanceProperty", SetGameInstancePropertyReturnTypeXmlSerializer.class);
		objectMap.put("GetGameInstancePropertyList", GetGameInstancePropertyListReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(AddAction.SERIALIZATION_ID, AddActionReturnTypeXmlSerializer.class);
		objectMap.put(AddActionTarget.SERIALIZATION_ID, AddActionTargetReturnTypeXmlSerializer.class);
		objectMap.put(AddActionCondition.SERIALIZATION_ID, AddActionConditionReturnTypeXmlSerializer.class);
		objectMap.put(GetActionList.SERIALIZATION_ID, GetActionListReturnTypeXmlSerializer.class);
		objectMap.put(GetActionTargetList.SERIALIZATION_ID, GetActionTargetListReturnTypeXmlSerializer.class);
		objectMap.put(GetActionConditionList.SERIALIZATION_ID, GetActionConditionListReturnTypeXmlSerializer.class);
		objectMap.put(StartActionAtPlayer.SERIALIZATION_ID, StartActionAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put(ClearActionQueuedAtPlayer.SERIALIZATION_ID, ClearActionQueuedAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put(StartActionAtLocation.SERIALIZATION_ID, StartActionAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(ClearActionQueuedAtLocation.SERIALIZATION_ID, ClearActionQueuedAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(ListActionsAvailableAtLocation.SERIALIZATION_ID, ListActionsAvailableAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(ListActionsAvailableAtPlayer.SERIALIZATION_ID, ListActionsAvailableAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put(ListActionsExecutingAtLocation.SERIALIZATION_ID, ListActionsExecutingAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(ListActionsExecutingAtPlayer.SERIALIZATION_ID, ListActionsExecutingAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put(ListActionsQueuedAtLocation.SERIALIZATION_ID, ListActionsQueuedAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(ListActionsQueuedAtPlayer.SERIALIZATION_ID, ListActionsQueuedAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put(ClearActionsQueuedAtLocation.SERIALIZATION_ID, ClearActionsQueuedAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(ClearActionsQueuedAtPlayer.SERIALIZATION_ID, ClearActionsQueuedAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put(StartActionAtMobileToLocation.SERIALIZATION_ID, StartActionAtMobileToLocationReturnTypeXmlSerializer.class);
		objectMap.put(ListActionsAvailableAtMobile.SERIALIZATION_ID, ListActionsAvailableAtMobileReturnTypeXmlSerializer.class);
		objectMap.put(AddActionPlugin.SERIALIZATION_ID, AddActionPluginReturnTypeXmlSerializer.class);
		objectMap.put(StartActionAtLocationToLocation.SERIALIZATION_ID, StartActionAtLocationToLocationReturnTypeXmlSerializer.class);
		objectMap.put(GetActionPlugin.SERIALIZATION_ID, GetActionPluginReturnTypeXmlSerializer.class);
		objectMap.put(CancelActionAtPlayer.SERIALIZATION_ID, CancelActionAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put(CancelActionAtLocation.SERIALIZATION_ID, CancelActionAtLocationReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("AddAction", AddActionReturnTypeXmlSerializer.class);
		objectMap.put("AddActionTarget", AddActionTargetReturnTypeXmlSerializer.class);
		objectMap.put("AddActionCondition", AddActionConditionReturnTypeXmlSerializer.class);
		objectMap.put("GetActionList", GetActionListReturnTypeXmlSerializer.class);
		objectMap.put("GetActionTargetList", GetActionTargetListReturnTypeXmlSerializer.class);
		objectMap.put("GetActionConditionList", GetActionConditionListReturnTypeXmlSerializer.class);
		objectMap.put("StartActionAtPlayer", StartActionAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put("ClearActionQueuedAtPlayer", ClearActionQueuedAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put("StartActionAtLocation", StartActionAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("ClearActionQueuedAtLocation", ClearActionQueuedAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("ListActionsAvailableAtLocation", ListActionsAvailableAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("ListActionsAvailableAtPlayer", ListActionsAvailableAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put("ListActionsExecutingAtLocation", ListActionsExecutingAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("ListActionsExecutingAtPlayer", ListActionsExecutingAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put("ListActionsQueuedAtLocation", ListActionsQueuedAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("ListActionsQueuedAtPlayer", ListActionsQueuedAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put("ClearActionsQueuedAtLocation", ClearActionsQueuedAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("ClearActionsQueuedAtPlayer", ClearActionsQueuedAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put("StartActionAtMobileToLocation", StartActionAtMobileToLocationReturnTypeXmlSerializer.class);
		objectMap.put("ListActionsAvailableAtMobile", ListActionsAvailableAtMobileReturnTypeXmlSerializer.class);
		objectMap.put("AddActionPlugin", AddActionPluginReturnTypeXmlSerializer.class);
		objectMap.put("StartActionAtLocationToLocation", StartActionAtLocationToLocationReturnTypeXmlSerializer.class);
		objectMap.put("GetActionPlugin", GetActionPluginReturnTypeXmlSerializer.class);
		objectMap.put("CancelActionAtPlayer", CancelActionAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put("CancelActionAtLocation", CancelActionAtLocationReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(SignupUser.SERIALIZATION_ID, SignupUserReturnTypeXmlSerializer.class);
		objectMap.put(VerifyUser.SERIALIZATION_ID, VerifyUserReturnTypeXmlSerializer.class);
		objectMap.put(SetUserAddress.SERIALIZATION_ID, SetUserAddressReturnTypeXmlSerializer.class);
		objectMap.put(LoginUser.SERIALIZATION_ID, LoginUserReturnTypeXmlSerializer.class);
		objectMap.put(RenameUser.SERIALIZATION_ID, RenameUserReturnTypeXmlSerializer.class);
		objectMap.put(LogoutUser.SERIALIZATION_ID, LogoutUserReturnTypeXmlSerializer.class);
		objectMap.put(SetUserLanguage.SERIALIZATION_ID, SetUserLanguageReturnTypeXmlSerializer.class);
		objectMap.put(GetUserById.SERIALIZATION_ID, GetUserByIdReturnTypeXmlSerializer.class);
		objectMap.put(GetUserByName.SERIALIZATION_ID, GetUserByNameReturnTypeXmlSerializer.class);
		objectMap.put(GetUserByEmail.SERIALIZATION_ID, GetUserByEmailReturnTypeXmlSerializer.class);
		objectMap.put(GetUserByLoginId.SERIALIZATION_ID, GetUserByLoginIdReturnTypeXmlSerializer.class);
		objectMap.put(CountUsers.SERIALIZATION_ID, CountUsersReturnTypeXmlSerializer.class);
		objectMap.put(AdminVerifyUser.SERIALIZATION_ID, AdminVerifyUserReturnTypeXmlSerializer.class);
		objectMap.put(SetUserPermission.SERIALIZATION_ID, SetUserPermissionReturnTypeXmlSerializer.class);
		objectMap.put(SetUserGamePermission.SERIALIZATION_ID, SetUserGamePermissionReturnTypeXmlSerializer.class);
		objectMap.put(SetSignupVerification.SERIALIZATION_ID, SetSignupVerificationReturnTypeXmlSerializer.class);
		objectMap.put(GetUser.SERIALIZATION_ID, GetUserReturnTypeXmlSerializer.class);
		objectMap.put(GetUserNames.SERIALIZATION_ID, GetUserNamesReturnTypeXmlSerializer.class);
		objectMap.put(ChangeUserPassword.SERIALIZATION_ID, ChangeUserPasswordReturnTypeXmlSerializer.class);
		objectMap.put(GetUserAddressCodeList.SERIALIZATION_ID, GetUserAddressCodeListReturnTypeXmlSerializer.class);
		objectMap.put(GetUserAdminInfoList.SERIALIZATION_ID, GetUserAdminInfoListReturnTypeXmlSerializer.class);
		objectMap.put(GetUserAdminInfo.SERIALIZATION_ID, GetUserAdminInfoReturnTypeXmlSerializer.class);
		objectMap.put(UpdateUserAddressCode.SERIALIZATION_ID, UpdateUserAddressCodeReturnTypeXmlSerializer.class);
		objectMap.put(GetUserSimilarityList.SERIALIZATION_ID, GetUserSimilarityListReturnTypeXmlSerializer.class);
		objectMap.put(AdminSetUserPassword.SERIALIZATION_ID, AdminSetUserPasswordReturnTypeXmlSerializer.class);
		objectMap.put(SetUserAvatar.SERIALIZATION_ID, SetUserAvatarReturnTypeXmlSerializer.class);
		objectMap.put(GetUserAvatar.SERIALIZATION_ID, GetUserAvatarReturnTypeXmlSerializer.class);
		objectMap.put(SendResetPasswordEmail.SERIALIZATION_ID, SendResetPasswordEmailReturnTypeXmlSerializer.class);
		objectMap.put(ResetPassword.SERIALIZATION_ID, ResetPasswordReturnTypeXmlSerializer.class);
		objectMap.put(SetResetPasswordEmail.SERIALIZATION_ID, SetResetPasswordEmailReturnTypeXmlSerializer.class);
		objectMap.put(SetSignupUserEmail.SERIALIZATION_ID, SetSignupUserEmailReturnTypeXmlSerializer.class);
		objectMap.put(GetUserList.SERIALIZATION_ID, GetUserListReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("SignupUser", SignupUserReturnTypeXmlSerializer.class);
		objectMap.put("VerifyUser", VerifyUserReturnTypeXmlSerializer.class);
		objectMap.put("SetUserAddress", SetUserAddressReturnTypeXmlSerializer.class);
		objectMap.put("LoginUser", LoginUserReturnTypeXmlSerializer.class);
		objectMap.put("RenameUser", RenameUserReturnTypeXmlSerializer.class);
		objectMap.put("LogoutUser", LogoutUserReturnTypeXmlSerializer.class);
		objectMap.put("SetUserLanguage", SetUserLanguageReturnTypeXmlSerializer.class);
		objectMap.put("GetUserById", GetUserByIdReturnTypeXmlSerializer.class);
		objectMap.put("GetUserByName", GetUserByNameReturnTypeXmlSerializer.class);
		objectMap.put("GetUserByEmail", GetUserByEmailReturnTypeXmlSerializer.class);
		objectMap.put("GetUserByLoginId", GetUserByLoginIdReturnTypeXmlSerializer.class);
		objectMap.put("CountUsers", CountUsersReturnTypeXmlSerializer.class);
		objectMap.put("AdminVerifyUser", AdminVerifyUserReturnTypeXmlSerializer.class);
		objectMap.put("SetUserPermission", SetUserPermissionReturnTypeXmlSerializer.class);
		objectMap.put("SetUserGamePermission", SetUserGamePermissionReturnTypeXmlSerializer.class);
		objectMap.put("SetSignupVerification", SetSignupVerificationReturnTypeXmlSerializer.class);
		objectMap.put("GetUser", GetUserReturnTypeXmlSerializer.class);
		objectMap.put("GetUserNames", GetUserNamesReturnTypeXmlSerializer.class);
		objectMap.put("ChangeUserPassword", ChangeUserPasswordReturnTypeXmlSerializer.class);
		objectMap.put("GetUserAddressCodeList", GetUserAddressCodeListReturnTypeXmlSerializer.class);
		objectMap.put("GetUserAdminInfoList", GetUserAdminInfoListReturnTypeXmlSerializer.class);
		objectMap.put("GetUserAdminInfo", GetUserAdminInfoReturnTypeXmlSerializer.class);
		objectMap.put("UpdateUserAddressCode", UpdateUserAddressCodeReturnTypeXmlSerializer.class);
		objectMap.put("GetUserSimilarityList", GetUserSimilarityListReturnTypeXmlSerializer.class);
		objectMap.put("AdminSetUserPassword", AdminSetUserPasswordReturnTypeXmlSerializer.class);
		objectMap.put("SetUserAvatar", SetUserAvatarReturnTypeXmlSerializer.class);
		objectMap.put("GetUserAvatar", GetUserAvatarReturnTypeXmlSerializer.class);
		objectMap.put("SendResetPasswordEmail", SendResetPasswordEmailReturnTypeXmlSerializer.class);
		objectMap.put("ResetPassword", ResetPasswordReturnTypeXmlSerializer.class);
		objectMap.put("SetResetPasswordEmail", SetResetPasswordEmailReturnTypeXmlSerializer.class);
		objectMap.put("SetSignupUserEmail", SetSignupUserEmailReturnTypeXmlSerializer.class);
		objectMap.put("GetUserList", GetUserListReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(CreateAllianceForum.SERIALIZATION_ID, CreateAllianceForumReturnTypeXmlSerializer.class);
		objectMap.put(CreateAllianceForumThread.SERIALIZATION_ID, CreateAllianceForumThreadReturnTypeXmlSerializer.class);
		objectMap.put(CreateAllianceForumPost.SERIALIZATION_ID, CreateAllianceForumPostReturnTypeXmlSerializer.class);
		objectMap.put(SetAllianceForumOrder.SERIALIZATION_ID, SetAllianceForumOrderReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceForumList.SERIALIZATION_ID, GetAllianceForumListReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceThreadList.SERIALIZATION_ID, GetAllianceThreadListReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceThread.SERIALIZATION_ID, GetAllianceThreadReturnTypeXmlSerializer.class);
		objectMap.put(EditAlliancePost.SERIALIZATION_ID, EditAlliancePostReturnTypeXmlSerializer.class);
		objectMap.put(SetAllianceForumFlag.SERIALIZATION_ID, SetAllianceForumFlagReturnTypeXmlSerializer.class);
		objectMap.put(SetAllianceThreadFlag.SERIALIZATION_ID, SetAllianceThreadFlagReturnTypeXmlSerializer.class);
		objectMap.put(SetAlliancePostFlag.SERIALIZATION_ID, SetAlliancePostFlagReturnTypeXmlSerializer.class);
		objectMap.put(GetAlliancePostList.SERIALIZATION_ID, GetAlliancePostListReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("CreateAllianceForum", CreateAllianceForumReturnTypeXmlSerializer.class);
		objectMap.put("CreateAllianceForumThread", CreateAllianceForumThreadReturnTypeXmlSerializer.class);
		objectMap.put("CreateAllianceForumPost", CreateAllianceForumPostReturnTypeXmlSerializer.class);
		objectMap.put("SetAllianceForumOrder", SetAllianceForumOrderReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceForumList", GetAllianceForumListReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceThreadList", GetAllianceThreadListReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceThread", GetAllianceThreadReturnTypeXmlSerializer.class);
		objectMap.put("EditAlliancePost", EditAlliancePostReturnTypeXmlSerializer.class);
		objectMap.put("SetAllianceForumFlag", SetAllianceForumFlagReturnTypeXmlSerializer.class);
		objectMap.put("SetAllianceThreadFlag", SetAllianceThreadFlagReturnTypeXmlSerializer.class);
		objectMap.put("SetAlliancePostFlag", SetAlliancePostFlagReturnTypeXmlSerializer.class);
		objectMap.put("GetAlliancePostList", GetAlliancePostListReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(SetLocationGenerationPlugin.SERIALIZATION_ID, SetLocationGenerationPluginReturnTypeXmlSerializer.class);
		objectMap.put(GenerateLocations.SERIALIZATION_ID, GenerateLocationsReturnTypeXmlSerializer.class);
		objectMap.put(SetLocationCoordinatePlugin.SERIALIZATION_ID, SetLocationCoordinatePluginReturnTypeXmlSerializer.class);
		objectMap.put(SetLocationsEnabled.SERIALIZATION_ID, SetLocationsEnabledReturnTypeXmlSerializer.class);
		objectMap.put(GetLocationsEnabled.SERIALIZATION_ID, GetLocationsEnabledReturnTypeXmlSerializer.class);
		objectMap.put(SetLocationSignupsEnabled.SERIALIZATION_ID, SetLocationSignupsEnabledReturnTypeXmlSerializer.class);
		objectMap.put(GetLocationSignupsEnabled.SERIALIZATION_ID, GetLocationSignupsEnabledReturnTypeXmlSerializer.class);
		objectMap.put(GetLocationList.SERIALIZATION_ID, GetLocationListReturnTypeXmlSerializer.class);
		objectMap.put(GetLocation.SERIALIZATION_ID, GetLocationReturnTypeXmlSerializer.class);
		objectMap.put(RenameLocation.SERIALIZATION_ID, RenameLocationReturnTypeXmlSerializer.class);
		objectMap.put(AddUnitsAtLocation.SERIALIZATION_ID, AddUnitsAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(GetGridInfoList.SERIALIZATION_ID, GetGridInfoListReturnTypeXmlSerializer.class);
		objectMap.put(GetLocationId.SERIALIZATION_ID, GetLocationIdReturnTypeXmlSerializer.class);
		objectMap.put(GetCoordinates.SERIALIZATION_ID, GetCoordinatesReturnTypeXmlSerializer.class);
		objectMap.put(GetLocationCount.SERIALIZATION_ID, GetLocationCountReturnTypeXmlSerializer.class);
		objectMap.put(GetLocationSetupInfo.SERIALIZATION_ID, GetLocationSetupInfoReturnTypeXmlSerializer.class);
		objectMap.put(GetLocationCoordinatePlugin.SERIALIZATION_ID, GetLocationCoordinatePluginReturnTypeXmlSerializer.class);
		objectMap.put(GetLocationGenerationPlugin.SERIALIZATION_ID, GetLocationGenerationPluginReturnTypeXmlSerializer.class);
		objectMap.put(SetLocationProperty.SERIALIZATION_ID, SetLocationPropertyReturnTypeXmlSerializer.class);
		objectMap.put(GetLocationPropertyList.SERIALIZATION_ID, GetLocationPropertyListReturnTypeXmlSerializer.class);
		objectMap.put(GetLocationIdsForPlayer.SERIALIZATION_ID, GetLocationIdsForPlayerReturnTypeXmlSerializer.class);
		objectMap.put(CheckRenameLocation.SERIALIZATION_ID, CheckRenameLocationReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("SetLocationGenerationPlugin", SetLocationGenerationPluginReturnTypeXmlSerializer.class);
		objectMap.put("GenerateLocations", GenerateLocationsReturnTypeXmlSerializer.class);
		objectMap.put("SetLocationCoordinatePlugin", SetLocationCoordinatePluginReturnTypeXmlSerializer.class);
		objectMap.put("SetLocationsEnabled", SetLocationsEnabledReturnTypeXmlSerializer.class);
		objectMap.put("GetLocationsEnabled", GetLocationsEnabledReturnTypeXmlSerializer.class);
		objectMap.put("SetLocationSignupsEnabled", SetLocationSignupsEnabledReturnTypeXmlSerializer.class);
		objectMap.put("GetLocationSignupsEnabled", GetLocationSignupsEnabledReturnTypeXmlSerializer.class);
		objectMap.put("GetLocationList", GetLocationListReturnTypeXmlSerializer.class);
		objectMap.put("GetLocation", GetLocationReturnTypeXmlSerializer.class);
		objectMap.put("RenameLocation", RenameLocationReturnTypeXmlSerializer.class);
		objectMap.put("AddUnitsAtLocation", AddUnitsAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("GetGridInfoList", GetGridInfoListReturnTypeXmlSerializer.class);
		objectMap.put("GetLocationId", GetLocationIdReturnTypeXmlSerializer.class);
		objectMap.put("GetCoordinates", GetCoordinatesReturnTypeXmlSerializer.class);
		objectMap.put("GetLocationCount", GetLocationCountReturnTypeXmlSerializer.class);
		objectMap.put("GetLocationSetupInfo", GetLocationSetupInfoReturnTypeXmlSerializer.class);
		objectMap.put("GetLocationCoordinatePlugin", GetLocationCoordinatePluginReturnTypeXmlSerializer.class);
		objectMap.put("GetLocationGenerationPlugin", GetLocationGenerationPluginReturnTypeXmlSerializer.class);
		objectMap.put("SetLocationProperty", SetLocationPropertyReturnTypeXmlSerializer.class);
		objectMap.put("GetLocationPropertyList", GetLocationPropertyListReturnTypeXmlSerializer.class);
		objectMap.put("GetLocationIdsForPlayer", GetLocationIdsForPlayerReturnTypeXmlSerializer.class);
		objectMap.put("CheckRenameLocation", CheckRenameLocationReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(CreateMobileAtLocation.SERIALIZATION_ID, CreateMobileAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(ListMobilesAtLocation.SERIALIZATION_ID, ListMobilesAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(TransferUnitsToMobile.SERIALIZATION_ID, TransferUnitsToMobileReturnTypeXmlSerializer.class);
		objectMap.put(TransferUnitsFromMobile.SERIALIZATION_ID, TransferUnitsFromMobileReturnTypeXmlSerializer.class);
		objectMap.put(GetMobileList.SERIALIZATION_ID, GetMobileListReturnTypeXmlSerializer.class);
		objectMap.put(GetMobile.SERIALIZATION_ID, GetMobileReturnTypeXmlSerializer.class);
		objectMap.put(MoveMobile.SERIALIZATION_ID, MoveMobileReturnTypeXmlSerializer.class);
		objectMap.put(DestroyEmptyMobile.SERIALIZATION_ID, DestroyEmptyMobileReturnTypeXmlSerializer.class);
		objectMap.put(CreateMobileAtMobile.SERIALIZATION_ID, CreateMobileAtMobileReturnTypeXmlSerializer.class);
		objectMap.put(MoveMobileToCoordinates.SERIALIZATION_ID, MoveMobileToCoordinatesReturnTypeXmlSerializer.class);
		objectMap.put(TransferUnitsBetweenMobiles.SERIALIZATION_ID, TransferUnitsBetweenMobilesReturnTypeXmlSerializer.class);
		objectMap.put(RenameMobile.SERIALIZATION_ID, RenameMobileReturnTypeXmlSerializer.class);
		objectMap.put(AddUnitsAtMobile.SERIALIZATION_ID, AddUnitsAtMobileReturnTypeXmlSerializer.class);
		objectMap.put(SetCombatPlugin.SERIALIZATION_ID, SetCombatPluginReturnTypeXmlSerializer.class);
		objectMap.put(GetMobileSetupInfo.SERIALIZATION_ID, GetMobileSetupInfoReturnTypeXmlSerializer.class);
		objectMap.put(SetMobilesEnabled.SERIALIZATION_ID, SetMobilesEnabledReturnTypeXmlSerializer.class);
		objectMap.put(GetMobilesEnabled.SERIALIZATION_ID, GetMobilesEnabledReturnTypeXmlSerializer.class);
		objectMap.put(GetCombatPlugin.SERIALIZATION_ID, GetCombatPluginReturnTypeXmlSerializer.class);
		objectMap.put(SetMobileProperty.SERIALIZATION_ID, SetMobilePropertyReturnTypeXmlSerializer.class);
		objectMap.put(GetMobilePropertyList.SERIALIZATION_ID, GetMobilePropertyListReturnTypeXmlSerializer.class);
		objectMap.put(SetMobileMovementPlugin.SERIALIZATION_ID, SetMobileMovementPluginReturnTypeXmlSerializer.class);
		objectMap.put(ClearMobileQueue.SERIALIZATION_ID, ClearMobileQueueReturnTypeXmlSerializer.class);
		objectMap.put(WaitMobile.SERIALIZATION_ID, WaitMobileReturnTypeXmlSerializer.class);
		objectMap.put(GetMobileQueueList.SERIALIZATION_ID, GetMobileQueueListReturnTypeXmlSerializer.class);
		objectMap.put(SetMobileWait.SERIALIZATION_ID, SetMobileWaitReturnTypeXmlSerializer.class);
		objectMap.put(SetMobileMove.SERIALIZATION_ID, SetMobileMoveReturnTypeXmlSerializer.class);
		objectMap.put(GetMobileIdsForPlayer.SERIALIZATION_ID, GetMobileIdsForPlayerReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("CreateMobileAtLocation", CreateMobileAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("ListMobilesAtLocation", ListMobilesAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("TransferUnitsToMobile", TransferUnitsToMobileReturnTypeXmlSerializer.class);
		objectMap.put("TransferUnitsFromMobile", TransferUnitsFromMobileReturnTypeXmlSerializer.class);
		objectMap.put("GetMobileList", GetMobileListReturnTypeXmlSerializer.class);
		objectMap.put("GetMobile", GetMobileReturnTypeXmlSerializer.class);
		objectMap.put("MoveMobile", MoveMobileReturnTypeXmlSerializer.class);
		objectMap.put("DestroyEmptyMobile", DestroyEmptyMobileReturnTypeXmlSerializer.class);
		objectMap.put("CreateMobileAtMobile", CreateMobileAtMobileReturnTypeXmlSerializer.class);
		objectMap.put("MoveMobileToCoordinates", MoveMobileToCoordinatesReturnTypeXmlSerializer.class);
		objectMap.put("TransferUnitsBetweenMobiles", TransferUnitsBetweenMobilesReturnTypeXmlSerializer.class);
		objectMap.put("RenameMobile", RenameMobileReturnTypeXmlSerializer.class);
		objectMap.put("AddUnitsAtMobile", AddUnitsAtMobileReturnTypeXmlSerializer.class);
		objectMap.put("SetCombatPlugin", SetCombatPluginReturnTypeXmlSerializer.class);
		objectMap.put("GetMobileSetupInfo", GetMobileSetupInfoReturnTypeXmlSerializer.class);
		objectMap.put("SetMobilesEnabled", SetMobilesEnabledReturnTypeXmlSerializer.class);
		objectMap.put("GetMobilesEnabled", GetMobilesEnabledReturnTypeXmlSerializer.class);
		objectMap.put("GetCombatPlugin", GetCombatPluginReturnTypeXmlSerializer.class);
		objectMap.put("SetMobileProperty", SetMobilePropertyReturnTypeXmlSerializer.class);
		objectMap.put("GetMobilePropertyList", GetMobilePropertyListReturnTypeXmlSerializer.class);
		objectMap.put("SetMobileMovementPlugin", SetMobileMovementPluginReturnTypeXmlSerializer.class);
		objectMap.put("ClearMobileQueue", ClearMobileQueueReturnTypeXmlSerializer.class);
		objectMap.put("WaitMobile", WaitMobileReturnTypeXmlSerializer.class);
		objectMap.put("GetMobileQueueList", GetMobileQueueListReturnTypeXmlSerializer.class);
		objectMap.put("SetMobileWait", SetMobileWaitReturnTypeXmlSerializer.class);
		objectMap.put("SetMobileMove", SetMobileMoveReturnTypeXmlSerializer.class);
		objectMap.put("GetMobileIdsForPlayer", GetMobileIdsForPlayerReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(AddUpkeep.SERIALIZATION_ID, AddUpkeepReturnTypeXmlSerializer.class);
		objectMap.put(AddUpkeepCondition.SERIALIZATION_ID, AddUpkeepConditionReturnTypeXmlSerializer.class);
		objectMap.put(GetUpkeepList.SERIALIZATION_ID, GetUpkeepListReturnTypeXmlSerializer.class);
		objectMap.put(GetUpkeepConditionList.SERIALIZATION_ID, GetUpkeepConditionListReturnTypeXmlSerializer.class);
		objectMap.put(GetUpkeepAtLocation.SERIALIZATION_ID, GetUpkeepAtLocationReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("AddUpkeep", AddUpkeepReturnTypeXmlSerializer.class);
		objectMap.put("AddUpkeepCondition", AddUpkeepConditionReturnTypeXmlSerializer.class);
		objectMap.put("GetUpkeepList", GetUpkeepListReturnTypeXmlSerializer.class);
		objectMap.put("GetUpkeepConditionList", GetUpkeepConditionListReturnTypeXmlSerializer.class);
		objectMap.put("GetUpkeepAtLocation", GetUpkeepAtLocationReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(GetGoodsPriceListAtLocation.SERIALIZATION_ID, GetGoodsPriceListAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(BuyGoodsAtLocation.SERIALIZATION_ID, BuyGoodsAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(SellGoodsAtLocation.SERIALIZATION_ID, SellGoodsAtLocationReturnTypeXmlSerializer.class);
		objectMap.put(SetTradeAtLocationPlugin.SERIALIZATION_ID, SetTradeAtLocationPluginReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("GetGoodsPriceListAtLocation", GetGoodsPriceListAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("BuyGoodsAtLocation", BuyGoodsAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("SellGoodsAtLocation", SellGoodsAtLocationReturnTypeXmlSerializer.class);
		objectMap.put("SetTradeAtLocationPlugin", SetTradeAtLocationPluginReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(SetSetupBeanList.SERIALIZATION_ID, SetSetupBeanListReturnTypeXmlSerializer.class);
		objectMap.put(SetSetupBeanListFile.SERIALIZATION_ID, SetSetupBeanListFileReturnTypeXmlSerializer.class);
		objectMap.put(GetSetupBeanList.SERIALIZATION_ID, GetSetupBeanListReturnTypeXmlSerializer.class);
		objectMap.put(ClearSetup.SERIALIZATION_ID, ClearSetupReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("SetSetupBeanList", SetSetupBeanListReturnTypeXmlSerializer.class);
		objectMap.put("SetSetupBeanListFile", SetSetupBeanListFileReturnTypeXmlSerializer.class);
		objectMap.put("GetSetupBeanList", GetSetupBeanListReturnTypeXmlSerializer.class);
		objectMap.put("ClearSetup", ClearSetupReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(SignupPlayer.SERIALIZATION_ID, SignupPlayerReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerById.SERIALIZATION_ID, GetPlayerByIdReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerByUserId.SERIALIZATION_ID, GetPlayerByUserIdReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerByName.SERIALIZATION_ID, GetPlayerByNameReturnTypeXmlSerializer.class);
		objectMap.put(SetPlayerSignupsEnabled.SERIALIZATION_ID, SetPlayerSignupsEnabledReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerSignupsEnabled.SERIALIZATION_ID, GetPlayerSignupsEnabledReturnTypeXmlSerializer.class);
		objectMap.put(SetPlayerLimit.SERIALIZATION_ID, SetPlayerLimitReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerLimit.SERIALIZATION_ID, GetPlayerLimitReturnTypeXmlSerializer.class);
		objectMap.put(SetPlayerActionQueueLimit.SERIALIZATION_ID, SetPlayerActionQueueLimitReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerActionQueueLimit.SERIALIZATION_ID, GetPlayerActionQueueLimitReturnTypeXmlSerializer.class);
		objectMap.put(RenamePlayer.SERIALIZATION_ID, RenamePlayerReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerCount.SERIALIZATION_ID, GetPlayerCountReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerCountByFactionId.SERIALIZATION_ID, GetPlayerCountByFactionIdReturnTypeXmlSerializer.class);
		objectMap.put(IsPlayerSignedUp.SERIALIZATION_ID, IsPlayerSignedUpReturnTypeXmlSerializer.class);
		objectMap.put(SetPlayerSignupPlugin.SERIALIZATION_ID, SetPlayerSignupPluginReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayer.SERIALIZATION_ID, GetPlayerReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerList.SERIALIZATION_ID, GetPlayerListReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerScore.SERIALIZATION_ID, GetPlayerScoreReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerScoreList.SERIALIZATION_ID, GetPlayerScoreListReturnTypeXmlSerializer.class);
		objectMap.put(AddUnitsAtPlayer.SERIALIZATION_ID, AddUnitsAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerSetupInfo.SERIALIZATION_ID, GetPlayerSetupInfoReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerSignupPlugin.SERIALIZATION_ID, GetPlayerSignupPluginReturnTypeXmlSerializer.class);
		objectMap.put(SetPlayerProperty.SERIALIZATION_ID, SetPlayerPropertyReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerPropertyList.SERIALIZATION_ID, GetPlayerPropertyListReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerInfo.SERIALIZATION_ID, GetPlayerInfoReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerScores.SERIALIZATION_ID, GetPlayerScoresReturnTypeXmlSerializer.class);
		objectMap.put(GetUserAdminInfoByPlayer.SERIALIZATION_ID, GetUserAdminInfoByPlayerReturnTypeXmlSerializer.class);
		objectMap.put(SetPlayerAvatar.SERIALIZATION_ID, SetPlayerAvatarReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerAvatar.SERIALIZATION_ID, GetPlayerAvatarReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("SignupPlayer", SignupPlayerReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerById", GetPlayerByIdReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerByUserId", GetPlayerByUserIdReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerByName", GetPlayerByNameReturnTypeXmlSerializer.class);
		objectMap.put("SetPlayerSignupsEnabled", SetPlayerSignupsEnabledReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerSignupsEnabled", GetPlayerSignupsEnabledReturnTypeXmlSerializer.class);
		objectMap.put("SetPlayerLimit", SetPlayerLimitReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerLimit", GetPlayerLimitReturnTypeXmlSerializer.class);
		objectMap.put("SetPlayerActionQueueLimit", SetPlayerActionQueueLimitReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerActionQueueLimit", GetPlayerActionQueueLimitReturnTypeXmlSerializer.class);
		objectMap.put("RenamePlayer", RenamePlayerReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerCount", GetPlayerCountReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerCountByFactionId", GetPlayerCountByFactionIdReturnTypeXmlSerializer.class);
		objectMap.put("IsPlayerSignedUp", IsPlayerSignedUpReturnTypeXmlSerializer.class);
		objectMap.put("SetPlayerSignupPlugin", SetPlayerSignupPluginReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayer", GetPlayerReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerList", GetPlayerListReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerScore", GetPlayerScoreReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerScoreList", GetPlayerScoreListReturnTypeXmlSerializer.class);
		objectMap.put("AddUnitsAtPlayer", AddUnitsAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerSetupInfo", GetPlayerSetupInfoReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerSignupPlugin", GetPlayerSignupPluginReturnTypeXmlSerializer.class);
		objectMap.put("SetPlayerProperty", SetPlayerPropertyReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerPropertyList", GetPlayerPropertyListReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerInfo", GetPlayerInfoReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerScores", GetPlayerScoresReturnTypeXmlSerializer.class);
		objectMap.put("GetUserAdminInfoByPlayer", GetUserAdminInfoByPlayerReturnTypeXmlSerializer.class);
		objectMap.put("SetPlayerAvatar", SetPlayerAvatarReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerAvatar", GetPlayerAvatarReturnTypeXmlSerializer.class);

		// Mappings by id

		// Mappings by name

		// Mappings by id
		objectMap.put(SetStorageGroup.SERIALIZATION_ID, SetStorageGroupReturnTypeXmlSerializer.class);
		objectMap.put(SetStorageItem.SERIALIZATION_ID, SetStorageItemReturnTypeXmlSerializer.class);
		objectMap.put(GetStorageGroups.SERIALIZATION_ID, GetStorageGroupsReturnTypeXmlSerializer.class);
		objectMap.put(GetStorageItems.SERIALIZATION_ID, GetStorageItemsReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("SetStorageGroup", SetStorageGroupReturnTypeXmlSerializer.class);
		objectMap.put("SetStorageItem", SetStorageItemReturnTypeXmlSerializer.class);
		objectMap.put("GetStorageGroups", GetStorageGroupsReturnTypeXmlSerializer.class);
		objectMap.put("GetStorageItems", GetStorageItemsReturnTypeXmlSerializer.class);

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id
		objectMap.put(SetUnitScore.SERIALIZATION_ID, SetUnitScoreReturnTypeXmlSerializer.class);
		objectMap.put(GetUnitScore.SERIALIZATION_ID, GetUnitScoreReturnTypeXmlSerializer.class);
		objectMap.put(GetUnitScores.SERIALIZATION_ID, GetUnitScoresReturnTypeXmlSerializer.class);
		objectMap.put(SetScoreUpdaterGroup.SERIALIZATION_ID, SetScoreUpdaterGroupReturnTypeXmlSerializer.class);
		objectMap.put(GetRankingList.SERIALIZATION_ID, GetRankingListReturnTypeXmlSerializer.class);
		objectMap.put(GetRankingGroupList.SERIALIZATION_ID, GetRankingGroupListReturnTypeXmlSerializer.class);
		objectMap.put(GetPlayerRankingList.SERIALIZATION_ID, GetPlayerRankingListReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceRankingList.SERIALIZATION_ID, GetAllianceRankingListReturnTypeXmlSerializer.class);
		objectMap.put(SetScoreDivisor.SERIALIZATION_ID, SetScoreDivisorReturnTypeXmlSerializer.class);
		objectMap.put(GetScoreDivisor.SERIALIZATION_ID, GetScoreDivisorReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("SetUnitScore", SetUnitScoreReturnTypeXmlSerializer.class);
		objectMap.put("GetUnitScore", GetUnitScoreReturnTypeXmlSerializer.class);
		objectMap.put("GetUnitScores", GetUnitScoresReturnTypeXmlSerializer.class);
		objectMap.put("SetScoreUpdaterGroup", SetScoreUpdaterGroupReturnTypeXmlSerializer.class);
		objectMap.put("GetRankingList", GetRankingListReturnTypeXmlSerializer.class);
		objectMap.put("GetRankingGroupList", GetRankingGroupListReturnTypeXmlSerializer.class);
		objectMap.put("GetPlayerRankingList", GetPlayerRankingListReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceRankingList", GetAllianceRankingListReturnTypeXmlSerializer.class);
		objectMap.put("SetScoreDivisor", SetScoreDivisorReturnTypeXmlSerializer.class);
		objectMap.put("GetScoreDivisor", GetScoreDivisorReturnTypeXmlSerializer.class);

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
		objectMap.put(GetTurnNumber.SERIALIZATION_ID, GetTurnNumberReturnTypeXmlSerializer.class);
		objectMap.put(ExecuteTurns.SERIALIZATION_ID, ExecuteTurnsReturnTypeXmlSerializer.class);
		objectMap.put(SetTurnInterval.SERIALIZATION_ID, SetTurnIntervalReturnTypeXmlSerializer.class);
		objectMap.put(GetTurnInterval.SERIALIZATION_ID, GetTurnIntervalReturnTypeXmlSerializer.class);
		objectMap.put(SetTurnsEnabled.SERIALIZATION_ID, SetTurnsEnabledReturnTypeXmlSerializer.class);
		objectMap.put(GetTurnUpdating.SERIALIZATION_ID, GetTurnUpdatingReturnTypeXmlSerializer.class);
		objectMap.put(GetNextTurnUpdateTime.SERIALIZATION_ID, GetNextTurnUpdateTimeReturnTypeXmlSerializer.class);
		objectMap.put(GetTurnSummary.SERIALIZATION_ID, GetTurnSummaryReturnTypeXmlSerializer.class);
		objectMap.put(GetTurns.SERIALIZATION_ID, GetTurnsReturnTypeXmlSerializer.class);
		objectMap.put(GetTurnDetails.SERIALIZATION_ID, GetTurnDetailsReturnTypeXmlSerializer.class);
		objectMap.put(SetTurnStartTime.SERIALIZATION_ID, SetTurnStartTimeReturnTypeXmlSerializer.class);
		objectMap.put(GetTurnStartTime.SERIALIZATION_ID, GetTurnStartTimeReturnTypeXmlSerializer.class);
		objectMap.put(SetTurnIntervalTime.SERIALIZATION_ID, SetTurnIntervalTimeReturnTypeXmlSerializer.class);
		objectMap.put(SetTurnFinishTime.SERIALIZATION_ID, SetTurnFinishTimeReturnTypeXmlSerializer.class);
		objectMap.put(GetTurnFinishTime.SERIALIZATION_ID, GetTurnFinishTimeReturnTypeXmlSerializer.class);
		objectMap.put(GetTurnsEnabled.SERIALIZATION_ID, GetTurnsEnabledReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("GetTurnNumber", GetTurnNumberReturnTypeXmlSerializer.class);
		objectMap.put("ExecuteTurns", ExecuteTurnsReturnTypeXmlSerializer.class);
		objectMap.put("SetTurnInterval", SetTurnIntervalReturnTypeXmlSerializer.class);
		objectMap.put("GetTurnInterval", GetTurnIntervalReturnTypeXmlSerializer.class);
		objectMap.put("SetTurnsEnabled", SetTurnsEnabledReturnTypeXmlSerializer.class);
		objectMap.put("GetTurnUpdating", GetTurnUpdatingReturnTypeXmlSerializer.class);
		objectMap.put("GetNextTurnUpdateTime", GetNextTurnUpdateTimeReturnTypeXmlSerializer.class);
		objectMap.put("GetTurnSummary", GetTurnSummaryReturnTypeXmlSerializer.class);
		objectMap.put("GetTurns", GetTurnsReturnTypeXmlSerializer.class);
		objectMap.put("GetTurnDetails", GetTurnDetailsReturnTypeXmlSerializer.class);
		objectMap.put("SetTurnStartTime", SetTurnStartTimeReturnTypeXmlSerializer.class);
		objectMap.put("GetTurnStartTime", GetTurnStartTimeReturnTypeXmlSerializer.class);
		objectMap.put("SetTurnIntervalTime", SetTurnIntervalTimeReturnTypeXmlSerializer.class);
		objectMap.put("SetTurnFinishTime", SetTurnFinishTimeReturnTypeXmlSerializer.class);
		objectMap.put("GetTurnFinishTime", GetTurnFinishTimeReturnTypeXmlSerializer.class);
		objectMap.put("GetTurnsEnabled", GetTurnsEnabledReturnTypeXmlSerializer.class);

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id

		// Mappings by name

		// Mappings by id
		objectMap.put(GetAllianceCount.SERIALIZATION_ID, GetAllianceCountReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceMemberCount.SERIALIZATION_ID, GetAllianceMemberCountReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceById.SERIALIZATION_ID, GetAllianceByIdReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceByName.SERIALIZATION_ID, GetAllianceByNameReturnTypeXmlSerializer.class);
		objectMap.put(FormAlliance.SERIALIZATION_ID, FormAllianceReturnTypeXmlSerializer.class);
		objectMap.put(DisbandAlliance.SERIALIZATION_ID, DisbandAllianceReturnTypeXmlSerializer.class);
		objectMap.put(LeaveAlliance.SERIALIZATION_ID, LeaveAllianceReturnTypeXmlSerializer.class);
		objectMap.put(InviteToJoinAlliance.SERIALIZATION_ID, InviteToJoinAllianceReturnTypeXmlSerializer.class);
		objectMap.put(RequestToJoinAlliance.SERIALIZATION_ID, RequestToJoinAllianceReturnTypeXmlSerializer.class);
		objectMap.put(KickAllianceMember.SERIALIZATION_ID, KickAllianceMemberReturnTypeXmlSerializer.class);
		objectMap.put(GetInvitedToJoinAllianceList.SERIALIZATION_ID, GetInvitedToJoinAllianceListReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceInviteLimit.SERIALIZATION_ID, GetAllianceInviteLimitReturnTypeXmlSerializer.class);
		objectMap.put(SetAllianceInviteLimit.SERIALIZATION_ID, SetAllianceInviteLimitReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceMemberLimit.SERIALIZATION_ID, GetAllianceMemberLimitReturnTypeXmlSerializer.class);
		objectMap.put(SetAllianceMemberLimit.SERIALIZATION_ID, SetAllianceMemberLimitReturnTypeXmlSerializer.class);
		objectMap.put(SetAlliancesEnabled.SERIALIZATION_ID, SetAlliancesEnabledReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceList.SERIALIZATION_ID, GetAllianceListReturnTypeXmlSerializer.class);
		objectMap.put(GetAlliance.SERIALIZATION_ID, GetAllianceReturnTypeXmlSerializer.class);
		objectMap.put(GetRequestedToJoinAllianceList.SERIALIZATION_ID, GetRequestedToJoinAllianceListReturnTypeXmlSerializer.class);
		objectMap.put(InviteToJoinAllianceByName.SERIALIZATION_ID, InviteToJoinAllianceByNameReturnTypeXmlSerializer.class);
		objectMap.put(RequestToJoinAllianceByName.SERIALIZATION_ID, RequestToJoinAllianceByNameReturnTypeXmlSerializer.class);
		objectMap.put(SetAllianceLeaveTurns.SERIALIZATION_ID, SetAllianceLeaveTurnsReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceSetupInfo.SERIALIZATION_ID, GetAllianceSetupInfoReturnTypeXmlSerializer.class);
		objectMap.put(SetAllianceProperty.SERIALIZATION_ID, SetAlliancePropertyReturnTypeXmlSerializer.class);
		objectMap.put(GetAlliancePropertyList.SERIALIZATION_ID, GetAlliancePropertyListReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceScores.SERIALIZATION_ID, GetAllianceScoresReturnTypeXmlSerializer.class);
		objectMap.put(SetAllianceLogo.SERIALIZATION_ID, SetAllianceLogoReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceLogo.SERIALIZATION_ID, GetAllianceLogoReturnTypeXmlSerializer.class);
		objectMap.put(GetAllianceInfo.SERIALIZATION_ID, GetAllianceInfoReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("GetAllianceCount", GetAllianceCountReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceMemberCount", GetAllianceMemberCountReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceById", GetAllianceByIdReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceByName", GetAllianceByNameReturnTypeXmlSerializer.class);
		objectMap.put("FormAlliance", FormAllianceReturnTypeXmlSerializer.class);
		objectMap.put("DisbandAlliance", DisbandAllianceReturnTypeXmlSerializer.class);
		objectMap.put("LeaveAlliance", LeaveAllianceReturnTypeXmlSerializer.class);
		objectMap.put("InviteToJoinAlliance", InviteToJoinAllianceReturnTypeXmlSerializer.class);
		objectMap.put("RequestToJoinAlliance", RequestToJoinAllianceReturnTypeXmlSerializer.class);
		objectMap.put("KickAllianceMember", KickAllianceMemberReturnTypeXmlSerializer.class);
		objectMap.put("GetInvitedToJoinAllianceList", GetInvitedToJoinAllianceListReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceInviteLimit", GetAllianceInviteLimitReturnTypeXmlSerializer.class);
		objectMap.put("SetAllianceInviteLimit", SetAllianceInviteLimitReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceMemberLimit", GetAllianceMemberLimitReturnTypeXmlSerializer.class);
		objectMap.put("SetAllianceMemberLimit", SetAllianceMemberLimitReturnTypeXmlSerializer.class);
		objectMap.put("SetAlliancesEnabled", SetAlliancesEnabledReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceList", GetAllianceListReturnTypeXmlSerializer.class);
		objectMap.put("GetAlliance", GetAllianceReturnTypeXmlSerializer.class);
		objectMap.put("GetRequestedToJoinAllianceList", GetRequestedToJoinAllianceListReturnTypeXmlSerializer.class);
		objectMap.put("InviteToJoinAllianceByName", InviteToJoinAllianceByNameReturnTypeXmlSerializer.class);
		objectMap.put("RequestToJoinAllianceByName", RequestToJoinAllianceByNameReturnTypeXmlSerializer.class);
		objectMap.put("SetAllianceLeaveTurns", SetAllianceLeaveTurnsReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceSetupInfo", GetAllianceSetupInfoReturnTypeXmlSerializer.class);
		objectMap.put("SetAllianceProperty", SetAlliancePropertyReturnTypeXmlSerializer.class);
		objectMap.put("GetAlliancePropertyList", GetAlliancePropertyListReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceScores", GetAllianceScoresReturnTypeXmlSerializer.class);
		objectMap.put("SetAllianceLogo", SetAllianceLogoReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceLogo", GetAllianceLogoReturnTypeXmlSerializer.class);
		objectMap.put("GetAllianceInfo", GetAllianceInfoReturnTypeXmlSerializer.class);

		// Mappings by id
		objectMap.put(AddUnit.SERIALIZATION_ID, AddUnitReturnTypeXmlSerializer.class);
		objectMap.put(GetUnitById.SERIALIZATION_ID, GetUnitByIdReturnTypeXmlSerializer.class);
		objectMap.put(GetUnitByName.SERIALIZATION_ID, GetUnitByNameReturnTypeXmlSerializer.class);
		objectMap.put(GetUnits.SERIALIZATION_ID, GetUnitsReturnTypeXmlSerializer.class);
		objectMap.put(GetUnitsByFactionId.SERIALIZATION_ID, GetUnitsByFactionIdReturnTypeXmlSerializer.class);
		objectMap.put(GetUnitsByFactionName.SERIALIZATION_ID, GetUnitsByFactionNameReturnTypeXmlSerializer.class);
		objectMap.put(GetUnitsByGroupId.SERIALIZATION_ID, GetUnitsByGroupIdReturnTypeXmlSerializer.class);
		objectMap.put(GetUnitsByGroupName.SERIALIZATION_ID, GetUnitsByGroupNameReturnTypeXmlSerializer.class);
		objectMap.put(GetAllUnitsAtPlayer.SERIALIZATION_ID, GetAllUnitsAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put(GetUnitsAtPlayer.SERIALIZATION_ID, GetUnitsAtPlayerReturnTypeXmlSerializer.class);

		// Mappings by name
		objectMap.put("AddUnit", AddUnitReturnTypeXmlSerializer.class);
		objectMap.put("GetUnitById", GetUnitByIdReturnTypeXmlSerializer.class);
		objectMap.put("GetUnitByName", GetUnitByNameReturnTypeXmlSerializer.class);
		objectMap.put("GetUnits", GetUnitsReturnTypeXmlSerializer.class);
		objectMap.put("GetUnitsByFactionId", GetUnitsByFactionIdReturnTypeXmlSerializer.class);
		objectMap.put("GetUnitsByFactionName", GetUnitsByFactionNameReturnTypeXmlSerializer.class);
		objectMap.put("GetUnitsByGroupId", GetUnitsByGroupIdReturnTypeXmlSerializer.class);
		objectMap.put("GetUnitsByGroupName", GetUnitsByGroupNameReturnTypeXmlSerializer.class);
		objectMap.put("GetAllUnitsAtPlayer", GetAllUnitsAtPlayerReturnTypeXmlSerializer.class);
		objectMap.put("GetUnitsAtPlayer", GetUnitsAtPlayerReturnTypeXmlSerializer.class);

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
