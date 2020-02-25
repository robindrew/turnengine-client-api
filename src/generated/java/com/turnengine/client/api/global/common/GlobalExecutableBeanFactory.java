package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.codegenerator.api.factory.IObjectFactory;
import com.turnengine.client.api.global.admin.GetAdminHostAddress;
import com.turnengine.client.api.global.admin.SendEmail;
import com.turnengine.client.api.global.announcement.DeleteAnnouncement;
import com.turnengine.client.api.global.announcement.GetAnnouncementCount;
import com.turnengine.client.api.global.announcement.GetAnnouncementList;
import com.turnengine.client.api.global.announcement.PostAnnouncement;
import com.turnengine.client.api.global.error.GetCommandStackTrace;
import com.turnengine.client.api.global.error.GetCommandStackTraceList;
import com.turnengine.client.api.global.forum.CreateForum;
import com.turnengine.client.api.global.forum.CreateForumPost;
import com.turnengine.client.api.global.forum.CreateForumThread;
import com.turnengine.client.api.global.forum.EditPost;
import com.turnengine.client.api.global.forum.GetForumList;
import com.turnengine.client.api.global.forum.GetPostList;
import com.turnengine.client.api.global.forum.GetThread;
import com.turnengine.client.api.global.forum.GetThreadList;
import com.turnengine.client.api.global.forum.SetForumFlag;
import com.turnengine.client.api.global.forum.SetForumOrder;
import com.turnengine.client.api.global.forum.SetPostFlag;
import com.turnengine.client.api.global.forum.SetThreadFlag;
import com.turnengine.client.api.global.game.GetGameById;
import com.turnengine.client.api.global.game.GetGameByName;
import com.turnengine.client.api.global.game.GetGameDefinition;
import com.turnengine.client.api.global.game.GetGameDefinitions;
import com.turnengine.client.api.global.game.GetGameDefinitionsByGameName;
import com.turnengine.client.api.global.game.GetGameHostById;
import com.turnengine.client.api.global.game.GetGameHostByName;
import com.turnengine.client.api.global.game.GetGameHosts;
import com.turnengine.client.api.global.game.GetGameInstanceById;
import com.turnengine.client.api.global.game.GetGameInstanceByName;
import com.turnengine.client.api.global.game.GetGameInstanceByNames;
import com.turnengine.client.api.global.game.GetGameInstancePropertyList;
import com.turnengine.client.api.global.game.GetGameInstances;
import com.turnengine.client.api.global.game.GetGameInstancesByGameName;
import com.turnengine.client.api.global.game.GetGameVersionById;
import com.turnengine.client.api.global.game.GetGameVersionByName;
import com.turnengine.client.api.global.game.GetGameVersions;
import com.turnengine.client.api.global.game.GetGames;
import com.turnengine.client.api.global.game.NewGame;
import com.turnengine.client.api.global.game.NewGameHost;
import com.turnengine.client.api.global.game.NewGameInstance;
import com.turnengine.client.api.global.game.NewGameVersion;
import com.turnengine.client.api.global.game.SetGameInstanceProperty;
import com.turnengine.client.api.global.translation.GetTranslationById;
import com.turnengine.client.api.global.translation.GetTranslationByText;
import com.turnengine.client.api.global.translation.NewTranslation;
import com.turnengine.client.api.global.translation.SetTranslation;
import com.turnengine.client.api.global.user.AdminSetUserPassword;
import com.turnengine.client.api.global.user.AdminVerifyUser;
import com.turnengine.client.api.global.user.ChangeUserPassword;
import com.turnengine.client.api.global.user.CountUsers;
import com.turnengine.client.api.global.user.GetUser;
import com.turnengine.client.api.global.user.GetUserAddressCodeList;
import com.turnengine.client.api.global.user.GetUserAdminInfo;
import com.turnengine.client.api.global.user.GetUserAdminInfoList;
import com.turnengine.client.api.global.user.GetUserAvatar;
import com.turnengine.client.api.global.user.GetUserByEmail;
import com.turnengine.client.api.global.user.GetUserById;
import com.turnengine.client.api.global.user.GetUserByLoginId;
import com.turnengine.client.api.global.user.GetUserByName;
import com.turnengine.client.api.global.user.GetUserList;
import com.turnengine.client.api.global.user.GetUserNames;
import com.turnengine.client.api.global.user.GetUserSimilarityList;
import com.turnengine.client.api.global.user.LoginUser;
import com.turnengine.client.api.global.user.LogoutUser;
import com.turnengine.client.api.global.user.RenameUser;
import com.turnengine.client.api.global.user.ResetPassword;
import com.turnengine.client.api.global.user.SendResetPasswordEmail;
import com.turnengine.client.api.global.user.SetResetPasswordEmail;
import com.turnengine.client.api.global.user.SetSignupUserEmail;
import com.turnengine.client.api.global.user.SetSignupVerification;
import com.turnengine.client.api.global.user.SetUserAddress;
import com.turnengine.client.api.global.user.SetUserAvatar;
import com.turnengine.client.api.global.user.SetUserGamePermission;
import com.turnengine.client.api.global.user.SetUserLanguage;
import com.turnengine.client.api.global.user.SetUserPermission;
import com.turnengine.client.api.global.user.SignupUser;
import com.turnengine.client.api.global.user.UpdateUserAddressCode;
import com.turnengine.client.api.global.user.VerifyUser;
import com.turnengine.client.api.local.action.AddAction;
import com.turnengine.client.api.local.action.AddActionCondition;
import com.turnengine.client.api.local.action.AddActionPlugin;
import com.turnengine.client.api.local.action.AddActionTarget;
import com.turnengine.client.api.local.action.CancelActionAtLocation;
import com.turnengine.client.api.local.action.CancelActionAtPlayer;
import com.turnengine.client.api.local.action.ClearActionQueuedAtLocation;
import com.turnengine.client.api.local.action.ClearActionQueuedAtPlayer;
import com.turnengine.client.api.local.action.ClearActionsQueuedAtLocation;
import com.turnengine.client.api.local.action.ClearActionsQueuedAtPlayer;
import com.turnengine.client.api.local.action.GetActionConditionList;
import com.turnengine.client.api.local.action.GetActionList;
import com.turnengine.client.api.local.action.GetActionPlugin;
import com.turnengine.client.api.local.action.GetActionTargetList;
import com.turnengine.client.api.local.action.ListActionsAvailableAtLocation;
import com.turnengine.client.api.local.action.ListActionsAvailableAtMobile;
import com.turnengine.client.api.local.action.ListActionsAvailableAtPlayer;
import com.turnengine.client.api.local.action.ListActionsExecutingAtLocation;
import com.turnengine.client.api.local.action.ListActionsExecutingAtPlayer;
import com.turnengine.client.api.local.action.ListActionsQueuedAtLocation;
import com.turnengine.client.api.local.action.ListActionsQueuedAtPlayer;
import com.turnengine.client.api.local.action.StartActionAtLocation;
import com.turnengine.client.api.local.action.StartActionAtLocationToLocation;
import com.turnengine.client.api.local.action.StartActionAtMobileToLocation;
import com.turnengine.client.api.local.action.StartActionAtPlayer;
import com.turnengine.client.api.local.alliance.DisbandAlliance;
import com.turnengine.client.api.local.alliance.FormAlliance;
import com.turnengine.client.api.local.alliance.GetAlliance;
import com.turnengine.client.api.local.alliance.GetAllianceById;
import com.turnengine.client.api.local.alliance.GetAllianceByName;
import com.turnengine.client.api.local.alliance.GetAllianceCount;
import com.turnengine.client.api.local.alliance.GetAllianceInfo;
import com.turnengine.client.api.local.alliance.GetAllianceInviteLimit;
import com.turnengine.client.api.local.alliance.GetAllianceList;
import com.turnengine.client.api.local.alliance.GetAllianceLogo;
import com.turnengine.client.api.local.alliance.GetAllianceMemberCount;
import com.turnengine.client.api.local.alliance.GetAllianceMemberLimit;
import com.turnengine.client.api.local.alliance.GetAlliancePropertyList;
import com.turnengine.client.api.local.alliance.GetAllianceScores;
import com.turnengine.client.api.local.alliance.GetAllianceSetupInfo;
import com.turnengine.client.api.local.alliance.GetInvitedToJoinAllianceList;
import com.turnengine.client.api.local.alliance.GetRequestedToJoinAllianceList;
import com.turnengine.client.api.local.alliance.InviteToJoinAlliance;
import com.turnengine.client.api.local.alliance.InviteToJoinAllianceByName;
import com.turnengine.client.api.local.alliance.KickAllianceMember;
import com.turnengine.client.api.local.alliance.LeaveAlliance;
import com.turnengine.client.api.local.alliance.RequestToJoinAlliance;
import com.turnengine.client.api.local.alliance.RequestToJoinAllianceByName;
import com.turnengine.client.api.local.alliance.SetAllianceInviteLimit;
import com.turnengine.client.api.local.alliance.SetAllianceLeaveTurns;
import com.turnengine.client.api.local.alliance.SetAllianceLogo;
import com.turnengine.client.api.local.alliance.SetAllianceMemberLimit;
import com.turnengine.client.api.local.alliance.SetAllianceProperty;
import com.turnengine.client.api.local.alliance.SetAlliancesEnabled;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForum;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumPost;
import com.turnengine.client.api.local.allianceforum.CreateAllianceForumThread;
import com.turnengine.client.api.local.allianceforum.EditAlliancePost;
import com.turnengine.client.api.local.allianceforum.GetAllianceForumList;
import com.turnengine.client.api.local.allianceforum.GetAlliancePostList;
import com.turnengine.client.api.local.allianceforum.GetAllianceThread;
import com.turnengine.client.api.local.allianceforum.GetAllianceThreadList;
import com.turnengine.client.api.local.allianceforum.SetAllianceForumFlag;
import com.turnengine.client.api.local.allianceforum.SetAllianceForumOrder;
import com.turnengine.client.api.local.allianceforum.SetAlliancePostFlag;
import com.turnengine.client.api.local.allianceforum.SetAllianceThreadFlag;
import com.turnengine.client.api.local.error.GetLocalTrace;
import com.turnengine.client.api.local.error.GetLocalTraceList;
import com.turnengine.client.api.local.faction.AddFaction;
import com.turnengine.client.api.local.faction.GetFactionById;
import com.turnengine.client.api.local.faction.GetFactionByName;
import com.turnengine.client.api.local.faction.GetFactions;
import com.turnengine.client.api.local.game.AddGameUnits;
import com.turnengine.client.api.local.game.GetGameStatus;
import com.turnengine.client.api.local.game.GetGameUnits;
import com.turnengine.client.api.local.game.ResetGame;
import com.turnengine.client.api.local.game.SetGameInstance;
import com.turnengine.client.api.local.game.ShutdownGame;
import com.turnengine.client.api.local.game.StartupGame;
import com.turnengine.client.api.local.group.AddChildGroup;
import com.turnengine.client.api.local.group.AddParentGroup;
import com.turnengine.client.api.local.group.GetGroupById;
import com.turnengine.client.api.local.group.GetGroupByName;
import com.turnengine.client.api.local.group.GetGroupListByFactionName;
import com.turnengine.client.api.local.group.GetGroups;
import com.turnengine.client.api.local.location.AddUnitsAtLocation;
import com.turnengine.client.api.local.location.CheckRenameLocation;
import com.turnengine.client.api.local.location.GenerateLocations;
import com.turnengine.client.api.local.location.GetCoordinates;
import com.turnengine.client.api.local.location.GetGridInfoList;
import com.turnengine.client.api.local.location.GetLocation;
import com.turnengine.client.api.local.location.GetLocationCoordinatePlugin;
import com.turnengine.client.api.local.location.GetLocationCount;
import com.turnengine.client.api.local.location.GetLocationGenerationPlugin;
import com.turnengine.client.api.local.location.GetLocationId;
import com.turnengine.client.api.local.location.GetLocationIdsForPlayer;
import com.turnengine.client.api.local.location.GetLocationList;
import com.turnengine.client.api.local.location.GetLocationPropertyList;
import com.turnengine.client.api.local.location.GetLocationSetupInfo;
import com.turnengine.client.api.local.location.GetLocationSignupsEnabled;
import com.turnengine.client.api.local.location.GetLocationsEnabled;
import com.turnengine.client.api.local.location.RenameLocation;
import com.turnengine.client.api.local.location.SetLocationCoordinatePlugin;
import com.turnengine.client.api.local.location.SetLocationGenerationPlugin;
import com.turnengine.client.api.local.location.SetLocationProperty;
import com.turnengine.client.api.local.location.SetLocationSignupsEnabled;
import com.turnengine.client.api.local.location.SetLocationsEnabled;
import com.turnengine.client.api.local.message.GetMessage;
import com.turnengine.client.api.local.message.GetMessageCountByFormat;
import com.turnengine.client.api.local.message.GetMessageSummary;
import com.turnengine.client.api.local.message.ListMessages;
import com.turnengine.client.api.local.message.MakeNote;
import com.turnengine.client.api.local.message.PostNews;
import com.turnengine.client.api.local.message.SendMail;
import com.turnengine.client.api.local.mobile.AddUnitsAtMobile;
import com.turnengine.client.api.local.mobile.ClearMobileQueue;
import com.turnengine.client.api.local.mobile.CreateMobileAtLocation;
import com.turnengine.client.api.local.mobile.CreateMobileAtMobile;
import com.turnengine.client.api.local.mobile.DestroyEmptyMobile;
import com.turnengine.client.api.local.mobile.GetCombatPlugin;
import com.turnengine.client.api.local.mobile.GetMobile;
import com.turnengine.client.api.local.mobile.GetMobileIdsForPlayer;
import com.turnengine.client.api.local.mobile.GetMobileList;
import com.turnengine.client.api.local.mobile.GetMobilePropertyList;
import com.turnengine.client.api.local.mobile.GetMobileQueueList;
import com.turnengine.client.api.local.mobile.GetMobileSetupInfo;
import com.turnengine.client.api.local.mobile.GetMobilesEnabled;
import com.turnengine.client.api.local.mobile.ListMobilesAtLocation;
import com.turnengine.client.api.local.mobile.MoveMobile;
import com.turnengine.client.api.local.mobile.MoveMobileToCoordinates;
import com.turnengine.client.api.local.mobile.RenameMobile;
import com.turnengine.client.api.local.mobile.SetCombatPlugin;
import com.turnengine.client.api.local.mobile.SetMobileMove;
import com.turnengine.client.api.local.mobile.SetMobileMovementPlugin;
import com.turnengine.client.api.local.mobile.SetMobileProperty;
import com.turnengine.client.api.local.mobile.SetMobileWait;
import com.turnengine.client.api.local.mobile.SetMobilesEnabled;
import com.turnengine.client.api.local.mobile.TransferUnitsBetweenMobiles;
import com.turnengine.client.api.local.mobile.TransferUnitsFromMobile;
import com.turnengine.client.api.local.mobile.TransferUnitsToMobile;
import com.turnengine.client.api.local.mobile.WaitMobile;
import com.turnengine.client.api.local.player.AddUnitsAtPlayer;
import com.turnengine.client.api.local.player.GetPlayer;
import com.turnengine.client.api.local.player.GetPlayerActionQueueLimit;
import com.turnengine.client.api.local.player.GetPlayerAvatar;
import com.turnengine.client.api.local.player.GetPlayerById;
import com.turnengine.client.api.local.player.GetPlayerByName;
import com.turnengine.client.api.local.player.GetPlayerByUserId;
import com.turnengine.client.api.local.player.GetPlayerCount;
import com.turnengine.client.api.local.player.GetPlayerCountByFactionId;
import com.turnengine.client.api.local.player.GetPlayerInfo;
import com.turnengine.client.api.local.player.GetPlayerLimit;
import com.turnengine.client.api.local.player.GetPlayerList;
import com.turnengine.client.api.local.player.GetPlayerPropertyList;
import com.turnengine.client.api.local.player.GetPlayerScore;
import com.turnengine.client.api.local.player.GetPlayerScoreList;
import com.turnengine.client.api.local.player.GetPlayerScores;
import com.turnengine.client.api.local.player.GetPlayerSetupInfo;
import com.turnengine.client.api.local.player.GetPlayerSignupPlugin;
import com.turnengine.client.api.local.player.GetPlayerSignupsEnabled;
import com.turnengine.client.api.local.player.GetUserAdminInfoByPlayer;
import com.turnengine.client.api.local.player.IsPlayerSignedUp;
import com.turnengine.client.api.local.player.RenamePlayer;
import com.turnengine.client.api.local.player.SetPlayerActionQueueLimit;
import com.turnengine.client.api.local.player.SetPlayerAvatar;
import com.turnengine.client.api.local.player.SetPlayerLimit;
import com.turnengine.client.api.local.player.SetPlayerProperty;
import com.turnengine.client.api.local.player.SetPlayerSignupPlugin;
import com.turnengine.client.api.local.player.SetPlayerSignupsEnabled;
import com.turnengine.client.api.local.player.SignupPlayer;
import com.turnengine.client.api.local.property.GetLocalProperty;
import com.turnengine.client.api.local.property.SetLocalProperty;
import com.turnengine.client.api.local.score.GetAllianceRankingList;
import com.turnengine.client.api.local.score.GetPlayerRankingList;
import com.turnengine.client.api.local.score.GetRankingGroupList;
import com.turnengine.client.api.local.score.GetRankingList;
import com.turnengine.client.api.local.score.GetScoreDivisor;
import com.turnengine.client.api.local.score.GetUnitScore;
import com.turnengine.client.api.local.score.GetUnitScores;
import com.turnengine.client.api.local.score.SetScoreDivisor;
import com.turnengine.client.api.local.score.SetScoreUpdaterGroup;
import com.turnengine.client.api.local.score.SetUnitScore;
import com.turnengine.client.api.local.setup.ClearSetup;
import com.turnengine.client.api.local.setup.GetSetupBeanList;
import com.turnengine.client.api.local.setup.SetSetupBeanList;
import com.turnengine.client.api.local.setup.SetSetupBeanListFile;
import com.turnengine.client.api.local.storage.GetStorageGroups;
import com.turnengine.client.api.local.storage.GetStorageItems;
import com.turnengine.client.api.local.storage.SetStorageGroup;
import com.turnengine.client.api.local.storage.SetStorageItem;
import com.turnengine.client.api.local.trading.BuyGoodsAtLocation;
import com.turnengine.client.api.local.trading.GetGoodsPriceListAtLocation;
import com.turnengine.client.api.local.trading.SellGoodsAtLocation;
import com.turnengine.client.api.local.trading.SetTradeAtLocationPlugin;
import com.turnengine.client.api.local.turn.ExecuteTurns;
import com.turnengine.client.api.local.turn.GetNextTurnUpdateTime;
import com.turnengine.client.api.local.turn.GetTurnDetails;
import com.turnengine.client.api.local.turn.GetTurnFinishTime;
import com.turnengine.client.api.local.turn.GetTurnInterval;
import com.turnengine.client.api.local.turn.GetTurnNumber;
import com.turnengine.client.api.local.turn.GetTurnStartTime;
import com.turnengine.client.api.local.turn.GetTurnSummary;
import com.turnengine.client.api.local.turn.GetTurnUpdating;
import com.turnengine.client.api.local.turn.GetTurns;
import com.turnengine.client.api.local.turn.GetTurnsEnabled;
import com.turnengine.client.api.local.turn.SetTurnFinishTime;
import com.turnengine.client.api.local.turn.SetTurnInterval;
import com.turnengine.client.api.local.turn.SetTurnIntervalTime;
import com.turnengine.client.api.local.turn.SetTurnStartTime;
import com.turnengine.client.api.local.turn.SetTurnsEnabled;
import com.turnengine.client.api.local.unit.AddUnit;
import com.turnengine.client.api.local.unit.GetAllUnitsAtPlayer;
import com.turnengine.client.api.local.unit.GetUnitById;
import com.turnengine.client.api.local.unit.GetUnitByName;
import com.turnengine.client.api.local.unit.GetUnits;
import com.turnengine.client.api.local.unit.GetUnitsAtPlayer;
import com.turnengine.client.api.local.unit.GetUnitsByFactionId;
import com.turnengine.client.api.local.unit.GetUnitsByFactionName;
import com.turnengine.client.api.local.unit.GetUnitsByGroupId;
import com.turnengine.client.api.local.unit.GetUnitsByGroupName;
import com.turnengine.client.api.local.upkeep.AddUpkeep;
import com.turnengine.client.api.local.upkeep.AddUpkeepCondition;
import com.turnengine.client.api.local.upkeep.GetUpkeepAtLocation;
import com.turnengine.client.api.local.upkeep.GetUpkeepConditionList;
import com.turnengine.client.api.local.upkeep.GetUpkeepList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalExecutableBeanFactory implements IObjectFactory<IExecutableBean<?>> {

	private final Map<Object, Class<? extends IExecutableBean<?>>> objectMap = new ConcurrentHashMap<Object, Class<? extends IExecutableBean<?>>>();;

	public GlobalExecutableBeanFactory() {

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
		objectMap.put(SendEmail.SERIALIZATION_ID, SendEmail.class);
		objectMap.put(GetAdminHostAddress.SERIALIZATION_ID, GetAdminHostAddress.class);

		// Mappings by name
		objectMap.put("SendEmail", SendEmail.class);
		objectMap.put("GetAdminHostAddress", GetAdminHostAddress.class);

		// Mappings by id
		objectMap.put(PostAnnouncement.SERIALIZATION_ID, PostAnnouncement.class);
		objectMap.put(GetAnnouncementCount.SERIALIZATION_ID, GetAnnouncementCount.class);
		objectMap.put(GetAnnouncementList.SERIALIZATION_ID, GetAnnouncementList.class);
		objectMap.put(DeleteAnnouncement.SERIALIZATION_ID, DeleteAnnouncement.class);

		// Mappings by name
		objectMap.put("PostAnnouncement", PostAnnouncement.class);
		objectMap.put("GetAnnouncementCount", GetAnnouncementCount.class);
		objectMap.put("GetAnnouncementList", GetAnnouncementList.class);
		objectMap.put("DeleteAnnouncement", DeleteAnnouncement.class);

		// Mappings by id
		objectMap.put(Ping.SERIALIZATION_ID, Ping.class);
		objectMap.put(GetServiceStatus.SERIALIZATION_ID, GetServiceStatus.class);
		objectMap.put(GetSystemStatus.SERIALIZATION_ID, GetSystemStatus.class);
		objectMap.put(GetCommandAvailable.SERIALIZATION_ID, GetCommandAvailable.class);
		objectMap.put(StartService.SERIALIZATION_ID, StartService.class);
		objectMap.put(StopService.SERIALIZATION_ID, StopService.class);
		objectMap.put(GetServiceProcessList.SERIALIZATION_ID, GetServiceProcessList.class);
		objectMap.put(GetAvailableReleaseList.SERIALIZATION_ID, GetAvailableReleaseList.class);
		objectMap.put(GetAvailableServiceList.SERIALIZATION_ID, GetAvailableServiceList.class);
		objectMap.put(GetGoogleOpenIdForm.SERIALIZATION_ID, GetGoogleOpenIdForm.class);
		objectMap.put(GetLoggedExceptions.SERIALIZATION_ID, GetLoggedExceptions.class);
		objectMap.put(ThrowException.SERIALIZATION_ID, ThrowException.class);

		// Mappings by name
		objectMap.put("Ping", Ping.class);
		objectMap.put("GetServiceStatus", GetServiceStatus.class);
		objectMap.put("GetSystemStatus", GetSystemStatus.class);
		objectMap.put("GetCommandAvailable", GetCommandAvailable.class);
		objectMap.put("StartService", StartService.class);
		objectMap.put("StopService", StopService.class);
		objectMap.put("GetServiceProcessList", GetServiceProcessList.class);
		objectMap.put("GetAvailableReleaseList", GetAvailableReleaseList.class);
		objectMap.put("GetAvailableServiceList", GetAvailableServiceList.class);
		objectMap.put("GetGoogleOpenIdForm", GetGoogleOpenIdForm.class);
		objectMap.put("GetLoggedExceptions", GetLoggedExceptions.class);
		objectMap.put("ThrowException", ThrowException.class);

		// Mappings by id
		objectMap.put(GetCommandStackTrace.SERIALIZATION_ID, GetCommandStackTrace.class);
		objectMap.put(GetCommandStackTraceList.SERIALIZATION_ID, GetCommandStackTraceList.class);

		// Mappings by name
		objectMap.put("GetCommandStackTrace", GetCommandStackTrace.class);
		objectMap.put("GetCommandStackTraceList", GetCommandStackTraceList.class);

		// Mappings by id
		objectMap.put(CreateForum.SERIALIZATION_ID, CreateForum.class);
		objectMap.put(CreateForumThread.SERIALIZATION_ID, CreateForumThread.class);
		objectMap.put(CreateForumPost.SERIALIZATION_ID, CreateForumPost.class);
		objectMap.put(SetForumOrder.SERIALIZATION_ID, SetForumOrder.class);
		objectMap.put(GetForumList.SERIALIZATION_ID, GetForumList.class);
		objectMap.put(GetThreadList.SERIALIZATION_ID, GetThreadList.class);
		objectMap.put(GetThread.SERIALIZATION_ID, GetThread.class);
		objectMap.put(EditPost.SERIALIZATION_ID, EditPost.class);
		objectMap.put(SetForumFlag.SERIALIZATION_ID, SetForumFlag.class);
		objectMap.put(SetThreadFlag.SERIALIZATION_ID, SetThreadFlag.class);
		objectMap.put(SetPostFlag.SERIALIZATION_ID, SetPostFlag.class);
		objectMap.put(GetPostList.SERIALIZATION_ID, GetPostList.class);

		// Mappings by name
		objectMap.put("CreateForum", CreateForum.class);
		objectMap.put("CreateForumThread", CreateForumThread.class);
		objectMap.put("CreateForumPost", CreateForumPost.class);
		objectMap.put("SetForumOrder", SetForumOrder.class);
		objectMap.put("GetForumList", GetForumList.class);
		objectMap.put("GetThreadList", GetThreadList.class);
		objectMap.put("GetThread", GetThread.class);
		objectMap.put("EditPost", EditPost.class);
		objectMap.put("SetForumFlag", SetForumFlag.class);
		objectMap.put("SetThreadFlag", SetThreadFlag.class);
		objectMap.put("SetPostFlag", SetPostFlag.class);
		objectMap.put("GetPostList", GetPostList.class);

		// Mappings by id
		objectMap.put(NewGame.SERIALIZATION_ID, NewGame.class);
		objectMap.put(NewGameVersion.SERIALIZATION_ID, NewGameVersion.class);
		objectMap.put(NewGameInstance.SERIALIZATION_ID, NewGameInstance.class);
		objectMap.put(GetGameById.SERIALIZATION_ID, GetGameById.class);
		objectMap.put(GetGameByName.SERIALIZATION_ID, GetGameByName.class);
		objectMap.put(GetGameVersionById.SERIALIZATION_ID, GetGameVersionById.class);
		objectMap.put(GetGameVersionByName.SERIALIZATION_ID, GetGameVersionByName.class);
		objectMap.put(GetGameInstanceById.SERIALIZATION_ID, GetGameInstanceById.class);
		objectMap.put(GetGameInstanceByName.SERIALIZATION_ID, GetGameInstanceByName.class);
		objectMap.put(GetGames.SERIALIZATION_ID, GetGames.class);
		objectMap.put(GetGameVersions.SERIALIZATION_ID, GetGameVersions.class);
		objectMap.put(GetGameInstances.SERIALIZATION_ID, GetGameInstances.class);
		objectMap.put(GetGameDefinitions.SERIALIZATION_ID, GetGameDefinitions.class);
		objectMap.put(GetGameDefinition.SERIALIZATION_ID, GetGameDefinition.class);
		objectMap.put(NewGameHost.SERIALIZATION_ID, NewGameHost.class);
		objectMap.put(GetGameInstanceByNames.SERIALIZATION_ID, GetGameInstanceByNames.class);
		objectMap.put(GetGameHostByName.SERIALIZATION_ID, GetGameHostByName.class);
		objectMap.put(GetGameHostById.SERIALIZATION_ID, GetGameHostById.class);
		objectMap.put(GetGameHosts.SERIALIZATION_ID, GetGameHosts.class);
		objectMap.put(GetGameInstancesByGameName.SERIALIZATION_ID, GetGameInstancesByGameName.class);
		objectMap.put(GetGameDefinitionsByGameName.SERIALIZATION_ID, GetGameDefinitionsByGameName.class);
		objectMap.put(SetGameInstanceProperty.SERIALIZATION_ID, SetGameInstanceProperty.class);
		objectMap.put(GetGameInstancePropertyList.SERIALIZATION_ID, GetGameInstancePropertyList.class);

		// Mappings by name
		objectMap.put("NewGame", NewGame.class);
		objectMap.put("NewGameVersion", NewGameVersion.class);
		objectMap.put("NewGameInstance", NewGameInstance.class);
		objectMap.put("GetGameById", GetGameById.class);
		objectMap.put("GetGameByName", GetGameByName.class);
		objectMap.put("GetGameVersionById", GetGameVersionById.class);
		objectMap.put("GetGameVersionByName", GetGameVersionByName.class);
		objectMap.put("GetGameInstanceById", GetGameInstanceById.class);
		objectMap.put("GetGameInstanceByName", GetGameInstanceByName.class);
		objectMap.put("GetGames", GetGames.class);
		objectMap.put("GetGameVersions", GetGameVersions.class);
		objectMap.put("GetGameInstances", GetGameInstances.class);
		objectMap.put("GetGameDefinitions", GetGameDefinitions.class);
		objectMap.put("GetGameDefinition", GetGameDefinition.class);
		objectMap.put("NewGameHost", NewGameHost.class);
		objectMap.put("GetGameInstanceByNames", GetGameInstanceByNames.class);
		objectMap.put("GetGameHostByName", GetGameHostByName.class);
		objectMap.put("GetGameHostById", GetGameHostById.class);
		objectMap.put("GetGameHosts", GetGameHosts.class);
		objectMap.put("GetGameInstancesByGameName", GetGameInstancesByGameName.class);
		objectMap.put("GetGameDefinitionsByGameName", GetGameDefinitionsByGameName.class);
		objectMap.put("SetGameInstanceProperty", SetGameInstanceProperty.class);
		objectMap.put("GetGameInstancePropertyList", GetGameInstancePropertyList.class);

		// Mappings by id
		objectMap.put(NewTranslation.SERIALIZATION_ID, NewTranslation.class);
		objectMap.put(SetTranslation.SERIALIZATION_ID, SetTranslation.class);
		objectMap.put(GetTranslationById.SERIALIZATION_ID, GetTranslationById.class);
		objectMap.put(GetTranslationByText.SERIALIZATION_ID, GetTranslationByText.class);

		// Mappings by name
		objectMap.put("NewTranslation", NewTranslation.class);
		objectMap.put("SetTranslation", SetTranslation.class);
		objectMap.put("GetTranslationById", GetTranslationById.class);
		objectMap.put("GetTranslationByText", GetTranslationByText.class);

		// Mappings by id
		objectMap.put(SignupUser.SERIALIZATION_ID, SignupUser.class);
		objectMap.put(VerifyUser.SERIALIZATION_ID, VerifyUser.class);
		objectMap.put(SetUserAddress.SERIALIZATION_ID, SetUserAddress.class);
		objectMap.put(LoginUser.SERIALIZATION_ID, LoginUser.class);
		objectMap.put(RenameUser.SERIALIZATION_ID, RenameUser.class);
		objectMap.put(LogoutUser.SERIALIZATION_ID, LogoutUser.class);
		objectMap.put(SetUserLanguage.SERIALIZATION_ID, SetUserLanguage.class);
		objectMap.put(GetUserById.SERIALIZATION_ID, GetUserById.class);
		objectMap.put(GetUserByName.SERIALIZATION_ID, GetUserByName.class);
		objectMap.put(GetUserByEmail.SERIALIZATION_ID, GetUserByEmail.class);
		objectMap.put(GetUserByLoginId.SERIALIZATION_ID, GetUserByLoginId.class);
		objectMap.put(CountUsers.SERIALIZATION_ID, CountUsers.class);
		objectMap.put(AdminVerifyUser.SERIALIZATION_ID, AdminVerifyUser.class);
		objectMap.put(SetUserPermission.SERIALIZATION_ID, SetUserPermission.class);
		objectMap.put(SetUserGamePermission.SERIALIZATION_ID, SetUserGamePermission.class);
		objectMap.put(SetSignupVerification.SERIALIZATION_ID, SetSignupVerification.class);
		objectMap.put(GetUser.SERIALIZATION_ID, GetUser.class);
		objectMap.put(GetUserNames.SERIALIZATION_ID, GetUserNames.class);
		objectMap.put(ChangeUserPassword.SERIALIZATION_ID, ChangeUserPassword.class);
		objectMap.put(GetUserAddressCodeList.SERIALIZATION_ID, GetUserAddressCodeList.class);
		objectMap.put(GetUserAdminInfoList.SERIALIZATION_ID, GetUserAdminInfoList.class);
		objectMap.put(GetUserAdminInfo.SERIALIZATION_ID, GetUserAdminInfo.class);
		objectMap.put(UpdateUserAddressCode.SERIALIZATION_ID, UpdateUserAddressCode.class);
		objectMap.put(GetUserSimilarityList.SERIALIZATION_ID, GetUserSimilarityList.class);
		objectMap.put(AdminSetUserPassword.SERIALIZATION_ID, AdminSetUserPassword.class);
		objectMap.put(SetUserAvatar.SERIALIZATION_ID, SetUserAvatar.class);
		objectMap.put(GetUserAvatar.SERIALIZATION_ID, GetUserAvatar.class);
		objectMap.put(SendResetPasswordEmail.SERIALIZATION_ID, SendResetPasswordEmail.class);
		objectMap.put(ResetPassword.SERIALIZATION_ID, ResetPassword.class);
		objectMap.put(SetResetPasswordEmail.SERIALIZATION_ID, SetResetPasswordEmail.class);
		objectMap.put(SetSignupUserEmail.SERIALIZATION_ID, SetSignupUserEmail.class);
		objectMap.put(GetUserList.SERIALIZATION_ID, GetUserList.class);

		// Mappings by name
		objectMap.put("SignupUser", SignupUser.class);
		objectMap.put("VerifyUser", VerifyUser.class);
		objectMap.put("SetUserAddress", SetUserAddress.class);
		objectMap.put("LoginUser", LoginUser.class);
		objectMap.put("RenameUser", RenameUser.class);
		objectMap.put("LogoutUser", LogoutUser.class);
		objectMap.put("SetUserLanguage", SetUserLanguage.class);
		objectMap.put("GetUserById", GetUserById.class);
		objectMap.put("GetUserByName", GetUserByName.class);
		objectMap.put("GetUserByEmail", GetUserByEmail.class);
		objectMap.put("GetUserByLoginId", GetUserByLoginId.class);
		objectMap.put("CountUsers", CountUsers.class);
		objectMap.put("AdminVerifyUser", AdminVerifyUser.class);
		objectMap.put("SetUserPermission", SetUserPermission.class);
		objectMap.put("SetUserGamePermission", SetUserGamePermission.class);
		objectMap.put("SetSignupVerification", SetSignupVerification.class);
		objectMap.put("GetUser", GetUser.class);
		objectMap.put("GetUserNames", GetUserNames.class);
		objectMap.put("ChangeUserPassword", ChangeUserPassword.class);
		objectMap.put("GetUserAddressCodeList", GetUserAddressCodeList.class);
		objectMap.put("GetUserAdminInfoList", GetUserAdminInfoList.class);
		objectMap.put("GetUserAdminInfo", GetUserAdminInfo.class);
		objectMap.put("UpdateUserAddressCode", UpdateUserAddressCode.class);
		objectMap.put("GetUserSimilarityList", GetUserSimilarityList.class);
		objectMap.put("AdminSetUserPassword", AdminSetUserPassword.class);
		objectMap.put("SetUserAvatar", SetUserAvatar.class);
		objectMap.put("GetUserAvatar", GetUserAvatar.class);
		objectMap.put("SendResetPasswordEmail", SendResetPasswordEmail.class);
		objectMap.put("ResetPassword", ResetPassword.class);
		objectMap.put("SetResetPasswordEmail", SetResetPasswordEmail.class);
		objectMap.put("SetSignupUserEmail", SetSignupUserEmail.class);
		objectMap.put("GetUserList", GetUserList.class);

		// Mappings by id
		objectMap.put(AddAction.SERIALIZATION_ID, AddAction.class);
		objectMap.put(AddActionTarget.SERIALIZATION_ID, AddActionTarget.class);
		objectMap.put(AddActionCondition.SERIALIZATION_ID, AddActionCondition.class);
		objectMap.put(GetActionList.SERIALIZATION_ID, GetActionList.class);
		objectMap.put(GetActionTargetList.SERIALIZATION_ID, GetActionTargetList.class);
		objectMap.put(GetActionConditionList.SERIALIZATION_ID, GetActionConditionList.class);
		objectMap.put(StartActionAtPlayer.SERIALIZATION_ID, StartActionAtPlayer.class);
		objectMap.put(ClearActionQueuedAtPlayer.SERIALIZATION_ID, ClearActionQueuedAtPlayer.class);
		objectMap.put(StartActionAtLocation.SERIALIZATION_ID, StartActionAtLocation.class);
		objectMap.put(ClearActionQueuedAtLocation.SERIALIZATION_ID, ClearActionQueuedAtLocation.class);
		objectMap.put(ListActionsAvailableAtLocation.SERIALIZATION_ID, ListActionsAvailableAtLocation.class);
		objectMap.put(ListActionsAvailableAtPlayer.SERIALIZATION_ID, ListActionsAvailableAtPlayer.class);
		objectMap.put(ListActionsExecutingAtLocation.SERIALIZATION_ID, ListActionsExecutingAtLocation.class);
		objectMap.put(ListActionsExecutingAtPlayer.SERIALIZATION_ID, ListActionsExecutingAtPlayer.class);
		objectMap.put(ListActionsQueuedAtLocation.SERIALIZATION_ID, ListActionsQueuedAtLocation.class);
		objectMap.put(ListActionsQueuedAtPlayer.SERIALIZATION_ID, ListActionsQueuedAtPlayer.class);
		objectMap.put(ClearActionsQueuedAtLocation.SERIALIZATION_ID, ClearActionsQueuedAtLocation.class);
		objectMap.put(ClearActionsQueuedAtPlayer.SERIALIZATION_ID, ClearActionsQueuedAtPlayer.class);
		objectMap.put(StartActionAtMobileToLocation.SERIALIZATION_ID, StartActionAtMobileToLocation.class);
		objectMap.put(ListActionsAvailableAtMobile.SERIALIZATION_ID, ListActionsAvailableAtMobile.class);
		objectMap.put(AddActionPlugin.SERIALIZATION_ID, AddActionPlugin.class);
		objectMap.put(StartActionAtLocationToLocation.SERIALIZATION_ID, StartActionAtLocationToLocation.class);
		objectMap.put(GetActionPlugin.SERIALIZATION_ID, GetActionPlugin.class);
		objectMap.put(CancelActionAtPlayer.SERIALIZATION_ID, CancelActionAtPlayer.class);
		objectMap.put(CancelActionAtLocation.SERIALIZATION_ID, CancelActionAtLocation.class);

		// Mappings by name
		objectMap.put("AddAction", AddAction.class);
		objectMap.put("AddActionTarget", AddActionTarget.class);
		objectMap.put("AddActionCondition", AddActionCondition.class);
		objectMap.put("GetActionList", GetActionList.class);
		objectMap.put("GetActionTargetList", GetActionTargetList.class);
		objectMap.put("GetActionConditionList", GetActionConditionList.class);
		objectMap.put("StartActionAtPlayer", StartActionAtPlayer.class);
		objectMap.put("ClearActionQueuedAtPlayer", ClearActionQueuedAtPlayer.class);
		objectMap.put("StartActionAtLocation", StartActionAtLocation.class);
		objectMap.put("ClearActionQueuedAtLocation", ClearActionQueuedAtLocation.class);
		objectMap.put("ListActionsAvailableAtLocation", ListActionsAvailableAtLocation.class);
		objectMap.put("ListActionsAvailableAtPlayer", ListActionsAvailableAtPlayer.class);
		objectMap.put("ListActionsExecutingAtLocation", ListActionsExecutingAtLocation.class);
		objectMap.put("ListActionsExecutingAtPlayer", ListActionsExecutingAtPlayer.class);
		objectMap.put("ListActionsQueuedAtLocation", ListActionsQueuedAtLocation.class);
		objectMap.put("ListActionsQueuedAtPlayer", ListActionsQueuedAtPlayer.class);
		objectMap.put("ClearActionsQueuedAtLocation", ClearActionsQueuedAtLocation.class);
		objectMap.put("ClearActionsQueuedAtPlayer", ClearActionsQueuedAtPlayer.class);
		objectMap.put("StartActionAtMobileToLocation", StartActionAtMobileToLocation.class);
		objectMap.put("ListActionsAvailableAtMobile", ListActionsAvailableAtMobile.class);
		objectMap.put("AddActionPlugin", AddActionPlugin.class);
		objectMap.put("StartActionAtLocationToLocation", StartActionAtLocationToLocation.class);
		objectMap.put("GetActionPlugin", GetActionPlugin.class);
		objectMap.put("CancelActionAtPlayer", CancelActionAtPlayer.class);
		objectMap.put("CancelActionAtLocation", CancelActionAtLocation.class);

		// Mappings by id
		objectMap.put(GetAllianceCount.SERIALIZATION_ID, GetAllianceCount.class);
		objectMap.put(GetAllianceMemberCount.SERIALIZATION_ID, GetAllianceMemberCount.class);
		objectMap.put(GetAllianceById.SERIALIZATION_ID, GetAllianceById.class);
		objectMap.put(GetAllianceByName.SERIALIZATION_ID, GetAllianceByName.class);
		objectMap.put(FormAlliance.SERIALIZATION_ID, FormAlliance.class);
		objectMap.put(DisbandAlliance.SERIALIZATION_ID, DisbandAlliance.class);
		objectMap.put(LeaveAlliance.SERIALIZATION_ID, LeaveAlliance.class);
		objectMap.put(InviteToJoinAlliance.SERIALIZATION_ID, InviteToJoinAlliance.class);
		objectMap.put(RequestToJoinAlliance.SERIALIZATION_ID, RequestToJoinAlliance.class);
		objectMap.put(KickAllianceMember.SERIALIZATION_ID, KickAllianceMember.class);
		objectMap.put(GetInvitedToJoinAllianceList.SERIALIZATION_ID, GetInvitedToJoinAllianceList.class);
		objectMap.put(GetAllianceInviteLimit.SERIALIZATION_ID, GetAllianceInviteLimit.class);
		objectMap.put(SetAllianceInviteLimit.SERIALIZATION_ID, SetAllianceInviteLimit.class);
		objectMap.put(GetAllianceMemberLimit.SERIALIZATION_ID, GetAllianceMemberLimit.class);
		objectMap.put(SetAllianceMemberLimit.SERIALIZATION_ID, SetAllianceMemberLimit.class);
		objectMap.put(SetAlliancesEnabled.SERIALIZATION_ID, SetAlliancesEnabled.class);
		objectMap.put(GetAllianceList.SERIALIZATION_ID, GetAllianceList.class);
		objectMap.put(GetAlliance.SERIALIZATION_ID, GetAlliance.class);
		objectMap.put(GetRequestedToJoinAllianceList.SERIALIZATION_ID, GetRequestedToJoinAllianceList.class);
		objectMap.put(InviteToJoinAllianceByName.SERIALIZATION_ID, InviteToJoinAllianceByName.class);
		objectMap.put(RequestToJoinAllianceByName.SERIALIZATION_ID, RequestToJoinAllianceByName.class);
		objectMap.put(SetAllianceLeaveTurns.SERIALIZATION_ID, SetAllianceLeaveTurns.class);
		objectMap.put(GetAllianceSetupInfo.SERIALIZATION_ID, GetAllianceSetupInfo.class);
		objectMap.put(SetAllianceProperty.SERIALIZATION_ID, SetAllianceProperty.class);
		objectMap.put(GetAlliancePropertyList.SERIALIZATION_ID, GetAlliancePropertyList.class);
		objectMap.put(GetAllianceScores.SERIALIZATION_ID, GetAllianceScores.class);
		objectMap.put(SetAllianceLogo.SERIALIZATION_ID, SetAllianceLogo.class);
		objectMap.put(GetAllianceLogo.SERIALIZATION_ID, GetAllianceLogo.class);
		objectMap.put(GetAllianceInfo.SERIALIZATION_ID, GetAllianceInfo.class);

		// Mappings by name
		objectMap.put("GetAllianceCount", GetAllianceCount.class);
		objectMap.put("GetAllianceMemberCount", GetAllianceMemberCount.class);
		objectMap.put("GetAllianceById", GetAllianceById.class);
		objectMap.put("GetAllianceByName", GetAllianceByName.class);
		objectMap.put("FormAlliance", FormAlliance.class);
		objectMap.put("DisbandAlliance", DisbandAlliance.class);
		objectMap.put("LeaveAlliance", LeaveAlliance.class);
		objectMap.put("InviteToJoinAlliance", InviteToJoinAlliance.class);
		objectMap.put("RequestToJoinAlliance", RequestToJoinAlliance.class);
		objectMap.put("KickAllianceMember", KickAllianceMember.class);
		objectMap.put("GetInvitedToJoinAllianceList", GetInvitedToJoinAllianceList.class);
		objectMap.put("GetAllianceInviteLimit", GetAllianceInviteLimit.class);
		objectMap.put("SetAllianceInviteLimit", SetAllianceInviteLimit.class);
		objectMap.put("GetAllianceMemberLimit", GetAllianceMemberLimit.class);
		objectMap.put("SetAllianceMemberLimit", SetAllianceMemberLimit.class);
		objectMap.put("SetAlliancesEnabled", SetAlliancesEnabled.class);
		objectMap.put("GetAllianceList", GetAllianceList.class);
		objectMap.put("GetAlliance", GetAlliance.class);
		objectMap.put("GetRequestedToJoinAllianceList", GetRequestedToJoinAllianceList.class);
		objectMap.put("InviteToJoinAllianceByName", InviteToJoinAllianceByName.class);
		objectMap.put("RequestToJoinAllianceByName", RequestToJoinAllianceByName.class);
		objectMap.put("SetAllianceLeaveTurns", SetAllianceLeaveTurns.class);
		objectMap.put("GetAllianceSetupInfo", GetAllianceSetupInfo.class);
		objectMap.put("SetAllianceProperty", SetAllianceProperty.class);
		objectMap.put("GetAlliancePropertyList", GetAlliancePropertyList.class);
		objectMap.put("GetAllianceScores", GetAllianceScores.class);
		objectMap.put("SetAllianceLogo", SetAllianceLogo.class);
		objectMap.put("GetAllianceLogo", GetAllianceLogo.class);
		objectMap.put("GetAllianceInfo", GetAllianceInfo.class);

		// Mappings by id
		objectMap.put(CreateAllianceForum.SERIALIZATION_ID, CreateAllianceForum.class);
		objectMap.put(CreateAllianceForumThread.SERIALIZATION_ID, CreateAllianceForumThread.class);
		objectMap.put(CreateAllianceForumPost.SERIALIZATION_ID, CreateAllianceForumPost.class);
		objectMap.put(SetAllianceForumOrder.SERIALIZATION_ID, SetAllianceForumOrder.class);
		objectMap.put(GetAllianceForumList.SERIALIZATION_ID, GetAllianceForumList.class);
		objectMap.put(GetAllianceThreadList.SERIALIZATION_ID, GetAllianceThreadList.class);
		objectMap.put(GetAllianceThread.SERIALIZATION_ID, GetAllianceThread.class);
		objectMap.put(EditAlliancePost.SERIALIZATION_ID, EditAlliancePost.class);
		objectMap.put(SetAllianceForumFlag.SERIALIZATION_ID, SetAllianceForumFlag.class);
		objectMap.put(SetAllianceThreadFlag.SERIALIZATION_ID, SetAllianceThreadFlag.class);
		objectMap.put(SetAlliancePostFlag.SERIALIZATION_ID, SetAlliancePostFlag.class);
		objectMap.put(GetAlliancePostList.SERIALIZATION_ID, GetAlliancePostList.class);

		// Mappings by name
		objectMap.put("CreateAllianceForum", CreateAllianceForum.class);
		objectMap.put("CreateAllianceForumThread", CreateAllianceForumThread.class);
		objectMap.put("CreateAllianceForumPost", CreateAllianceForumPost.class);
		objectMap.put("SetAllianceForumOrder", SetAllianceForumOrder.class);
		objectMap.put("GetAllianceForumList", GetAllianceForumList.class);
		objectMap.put("GetAllianceThreadList", GetAllianceThreadList.class);
		objectMap.put("GetAllianceThread", GetAllianceThread.class);
		objectMap.put("EditAlliancePost", EditAlliancePost.class);
		objectMap.put("SetAllianceForumFlag", SetAllianceForumFlag.class);
		objectMap.put("SetAllianceThreadFlag", SetAllianceThreadFlag.class);
		objectMap.put("SetAlliancePostFlag", SetAlliancePostFlag.class);
		objectMap.put("GetAlliancePostList", GetAlliancePostList.class);

		// Mappings by id

		// Mappings by name

		// Mappings by id
		objectMap.put(GetLocalTrace.SERIALIZATION_ID, GetLocalTrace.class);
		objectMap.put(GetLocalTraceList.SERIALIZATION_ID, GetLocalTraceList.class);

		// Mappings by name
		objectMap.put("GetLocalTrace", GetLocalTrace.class);
		objectMap.put("GetLocalTraceList", GetLocalTraceList.class);

		// Mappings by id
		objectMap.put(AddFaction.SERIALIZATION_ID, AddFaction.class);
		objectMap.put(GetFactionById.SERIALIZATION_ID, GetFactionById.class);
		objectMap.put(GetFactionByName.SERIALIZATION_ID, GetFactionByName.class);
		objectMap.put(GetFactions.SERIALIZATION_ID, GetFactions.class);

		// Mappings by name
		objectMap.put("AddFaction", AddFaction.class);
		objectMap.put("GetFactionById", GetFactionById.class);
		objectMap.put("GetFactionByName", GetFactionByName.class);
		objectMap.put("GetFactions", GetFactions.class);

		// Mappings by id
		objectMap.put(SetGameInstance.SERIALIZATION_ID, SetGameInstance.class);
		objectMap.put(StartupGame.SERIALIZATION_ID, StartupGame.class);
		objectMap.put(ResetGame.SERIALIZATION_ID, ResetGame.class);
		objectMap.put(ShutdownGame.SERIALIZATION_ID, ShutdownGame.class);
		objectMap.put(GetGameStatus.SERIALIZATION_ID, GetGameStatus.class);
		objectMap.put(AddGameUnits.SERIALIZATION_ID, AddGameUnits.class);
		objectMap.put(GetGameUnits.SERIALIZATION_ID, GetGameUnits.class);

		// Mappings by name
		objectMap.put("SetGameInstance", SetGameInstance.class);
		objectMap.put("StartupGame", StartupGame.class);
		objectMap.put("ResetGame", ResetGame.class);
		objectMap.put("ShutdownGame", ShutdownGame.class);
		objectMap.put("GetGameStatus", GetGameStatus.class);
		objectMap.put("AddGameUnits", AddGameUnits.class);
		objectMap.put("GetGameUnits", GetGameUnits.class);

		// Mappings by id
		objectMap.put(AddParentGroup.SERIALIZATION_ID, AddParentGroup.class);
		objectMap.put(AddChildGroup.SERIALIZATION_ID, AddChildGroup.class);
		objectMap.put(GetGroupById.SERIALIZATION_ID, GetGroupById.class);
		objectMap.put(GetGroupByName.SERIALIZATION_ID, GetGroupByName.class);
		objectMap.put(GetGroups.SERIALIZATION_ID, GetGroups.class);
		objectMap.put(GetGroupListByFactionName.SERIALIZATION_ID, GetGroupListByFactionName.class);

		// Mappings by name
		objectMap.put("AddParentGroup", AddParentGroup.class);
		objectMap.put("AddChildGroup", AddChildGroup.class);
		objectMap.put("GetGroupById", GetGroupById.class);
		objectMap.put("GetGroupByName", GetGroupByName.class);
		objectMap.put("GetGroups", GetGroups.class);
		objectMap.put("GetGroupListByFactionName", GetGroupListByFactionName.class);

		// Mappings by id
		objectMap.put(SetLocationGenerationPlugin.SERIALIZATION_ID, SetLocationGenerationPlugin.class);
		objectMap.put(GenerateLocations.SERIALIZATION_ID, GenerateLocations.class);
		objectMap.put(SetLocationCoordinatePlugin.SERIALIZATION_ID, SetLocationCoordinatePlugin.class);
		objectMap.put(SetLocationsEnabled.SERIALIZATION_ID, SetLocationsEnabled.class);
		objectMap.put(GetLocationsEnabled.SERIALIZATION_ID, GetLocationsEnabled.class);
		objectMap.put(SetLocationSignupsEnabled.SERIALIZATION_ID, SetLocationSignupsEnabled.class);
		objectMap.put(GetLocationSignupsEnabled.SERIALIZATION_ID, GetLocationSignupsEnabled.class);
		objectMap.put(GetLocationList.SERIALIZATION_ID, GetLocationList.class);
		objectMap.put(GetLocation.SERIALIZATION_ID, GetLocation.class);
		objectMap.put(RenameLocation.SERIALIZATION_ID, RenameLocation.class);
		objectMap.put(AddUnitsAtLocation.SERIALIZATION_ID, AddUnitsAtLocation.class);
		objectMap.put(GetGridInfoList.SERIALIZATION_ID, GetGridInfoList.class);
		objectMap.put(GetLocationId.SERIALIZATION_ID, GetLocationId.class);
		objectMap.put(GetCoordinates.SERIALIZATION_ID, GetCoordinates.class);
		objectMap.put(GetLocationCount.SERIALIZATION_ID, GetLocationCount.class);
		objectMap.put(GetLocationSetupInfo.SERIALIZATION_ID, GetLocationSetupInfo.class);
		objectMap.put(GetLocationCoordinatePlugin.SERIALIZATION_ID, GetLocationCoordinatePlugin.class);
		objectMap.put(GetLocationGenerationPlugin.SERIALIZATION_ID, GetLocationGenerationPlugin.class);
		objectMap.put(SetLocationProperty.SERIALIZATION_ID, SetLocationProperty.class);
		objectMap.put(GetLocationPropertyList.SERIALIZATION_ID, GetLocationPropertyList.class);
		objectMap.put(GetLocationIdsForPlayer.SERIALIZATION_ID, GetLocationIdsForPlayer.class);
		objectMap.put(CheckRenameLocation.SERIALIZATION_ID, CheckRenameLocation.class);

		// Mappings by name
		objectMap.put("SetLocationGenerationPlugin", SetLocationGenerationPlugin.class);
		objectMap.put("GenerateLocations", GenerateLocations.class);
		objectMap.put("SetLocationCoordinatePlugin", SetLocationCoordinatePlugin.class);
		objectMap.put("SetLocationsEnabled", SetLocationsEnabled.class);
		objectMap.put("GetLocationsEnabled", GetLocationsEnabled.class);
		objectMap.put("SetLocationSignupsEnabled", SetLocationSignupsEnabled.class);
		objectMap.put("GetLocationSignupsEnabled", GetLocationSignupsEnabled.class);
		objectMap.put("GetLocationList", GetLocationList.class);
		objectMap.put("GetLocation", GetLocation.class);
		objectMap.put("RenameLocation", RenameLocation.class);
		objectMap.put("AddUnitsAtLocation", AddUnitsAtLocation.class);
		objectMap.put("GetGridInfoList", GetGridInfoList.class);
		objectMap.put("GetLocationId", GetLocationId.class);
		objectMap.put("GetCoordinates", GetCoordinates.class);
		objectMap.put("GetLocationCount", GetLocationCount.class);
		objectMap.put("GetLocationSetupInfo", GetLocationSetupInfo.class);
		objectMap.put("GetLocationCoordinatePlugin", GetLocationCoordinatePlugin.class);
		objectMap.put("GetLocationGenerationPlugin", GetLocationGenerationPlugin.class);
		objectMap.put("SetLocationProperty", SetLocationProperty.class);
		objectMap.put("GetLocationPropertyList", GetLocationPropertyList.class);
		objectMap.put("GetLocationIdsForPlayer", GetLocationIdsForPlayer.class);
		objectMap.put("CheckRenameLocation", CheckRenameLocation.class);

		// Mappings by id
		objectMap.put(SendMail.SERIALIZATION_ID, SendMail.class);
		objectMap.put(MakeNote.SERIALIZATION_ID, MakeNote.class);
		objectMap.put(PostNews.SERIALIZATION_ID, PostNews.class);
		objectMap.put(ListMessages.SERIALIZATION_ID, ListMessages.class);
		objectMap.put(GetMessageSummary.SERIALIZATION_ID, GetMessageSummary.class);
		objectMap.put(GetMessage.SERIALIZATION_ID, GetMessage.class);
		objectMap.put(GetMessageCountByFormat.SERIALIZATION_ID, GetMessageCountByFormat.class);

		// Mappings by name
		objectMap.put("SendMail", SendMail.class);
		objectMap.put("MakeNote", MakeNote.class);
		objectMap.put("PostNews", PostNews.class);
		objectMap.put("ListMessages", ListMessages.class);
		objectMap.put("GetMessageSummary", GetMessageSummary.class);
		objectMap.put("GetMessage", GetMessage.class);
		objectMap.put("GetMessageCountByFormat", GetMessageCountByFormat.class);

		// Mappings by id
		objectMap.put(CreateMobileAtLocation.SERIALIZATION_ID, CreateMobileAtLocation.class);
		objectMap.put(ListMobilesAtLocation.SERIALIZATION_ID, ListMobilesAtLocation.class);
		objectMap.put(TransferUnitsToMobile.SERIALIZATION_ID, TransferUnitsToMobile.class);
		objectMap.put(TransferUnitsFromMobile.SERIALIZATION_ID, TransferUnitsFromMobile.class);
		objectMap.put(GetMobileList.SERIALIZATION_ID, GetMobileList.class);
		objectMap.put(GetMobile.SERIALIZATION_ID, GetMobile.class);
		objectMap.put(MoveMobile.SERIALIZATION_ID, MoveMobile.class);
		objectMap.put(DestroyEmptyMobile.SERIALIZATION_ID, DestroyEmptyMobile.class);
		objectMap.put(CreateMobileAtMobile.SERIALIZATION_ID, CreateMobileAtMobile.class);
		objectMap.put(MoveMobileToCoordinates.SERIALIZATION_ID, MoveMobileToCoordinates.class);
		objectMap.put(TransferUnitsBetweenMobiles.SERIALIZATION_ID, TransferUnitsBetweenMobiles.class);
		objectMap.put(RenameMobile.SERIALIZATION_ID, RenameMobile.class);
		objectMap.put(AddUnitsAtMobile.SERIALIZATION_ID, AddUnitsAtMobile.class);
		objectMap.put(SetCombatPlugin.SERIALIZATION_ID, SetCombatPlugin.class);
		objectMap.put(GetMobileSetupInfo.SERIALIZATION_ID, GetMobileSetupInfo.class);
		objectMap.put(SetMobilesEnabled.SERIALIZATION_ID, SetMobilesEnabled.class);
		objectMap.put(GetMobilesEnabled.SERIALIZATION_ID, GetMobilesEnabled.class);
		objectMap.put(GetCombatPlugin.SERIALIZATION_ID, GetCombatPlugin.class);
		objectMap.put(SetMobileProperty.SERIALIZATION_ID, SetMobileProperty.class);
		objectMap.put(GetMobilePropertyList.SERIALIZATION_ID, GetMobilePropertyList.class);
		objectMap.put(SetMobileMovementPlugin.SERIALIZATION_ID, SetMobileMovementPlugin.class);
		objectMap.put(ClearMobileQueue.SERIALIZATION_ID, ClearMobileQueue.class);
		objectMap.put(WaitMobile.SERIALIZATION_ID, WaitMobile.class);
		objectMap.put(GetMobileQueueList.SERIALIZATION_ID, GetMobileQueueList.class);
		objectMap.put(SetMobileWait.SERIALIZATION_ID, SetMobileWait.class);
		objectMap.put(SetMobileMove.SERIALIZATION_ID, SetMobileMove.class);
		objectMap.put(GetMobileIdsForPlayer.SERIALIZATION_ID, GetMobileIdsForPlayer.class);

		// Mappings by name
		objectMap.put("CreateMobileAtLocation", CreateMobileAtLocation.class);
		objectMap.put("ListMobilesAtLocation", ListMobilesAtLocation.class);
		objectMap.put("TransferUnitsToMobile", TransferUnitsToMobile.class);
		objectMap.put("TransferUnitsFromMobile", TransferUnitsFromMobile.class);
		objectMap.put("GetMobileList", GetMobileList.class);
		objectMap.put("GetMobile", GetMobile.class);
		objectMap.put("MoveMobile", MoveMobile.class);
		objectMap.put("DestroyEmptyMobile", DestroyEmptyMobile.class);
		objectMap.put("CreateMobileAtMobile", CreateMobileAtMobile.class);
		objectMap.put("MoveMobileToCoordinates", MoveMobileToCoordinates.class);
		objectMap.put("TransferUnitsBetweenMobiles", TransferUnitsBetweenMobiles.class);
		objectMap.put("RenameMobile", RenameMobile.class);
		objectMap.put("AddUnitsAtMobile", AddUnitsAtMobile.class);
		objectMap.put("SetCombatPlugin", SetCombatPlugin.class);
		objectMap.put("GetMobileSetupInfo", GetMobileSetupInfo.class);
		objectMap.put("SetMobilesEnabled", SetMobilesEnabled.class);
		objectMap.put("GetMobilesEnabled", GetMobilesEnabled.class);
		objectMap.put("GetCombatPlugin", GetCombatPlugin.class);
		objectMap.put("SetMobileProperty", SetMobileProperty.class);
		objectMap.put("GetMobilePropertyList", GetMobilePropertyList.class);
		objectMap.put("SetMobileMovementPlugin", SetMobileMovementPlugin.class);
		objectMap.put("ClearMobileQueue", ClearMobileQueue.class);
		objectMap.put("WaitMobile", WaitMobile.class);
		objectMap.put("GetMobileQueueList", GetMobileQueueList.class);
		objectMap.put("SetMobileWait", SetMobileWait.class);
		objectMap.put("SetMobileMove", SetMobileMove.class);
		objectMap.put("GetMobileIdsForPlayer", GetMobileIdsForPlayer.class);

		// Mappings by id
		objectMap.put(SignupPlayer.SERIALIZATION_ID, SignupPlayer.class);
		objectMap.put(GetPlayerById.SERIALIZATION_ID, GetPlayerById.class);
		objectMap.put(GetPlayerByUserId.SERIALIZATION_ID, GetPlayerByUserId.class);
		objectMap.put(GetPlayerByName.SERIALIZATION_ID, GetPlayerByName.class);
		objectMap.put(SetPlayerSignupsEnabled.SERIALIZATION_ID, SetPlayerSignupsEnabled.class);
		objectMap.put(GetPlayerSignupsEnabled.SERIALIZATION_ID, GetPlayerSignupsEnabled.class);
		objectMap.put(SetPlayerLimit.SERIALIZATION_ID, SetPlayerLimit.class);
		objectMap.put(GetPlayerLimit.SERIALIZATION_ID, GetPlayerLimit.class);
		objectMap.put(SetPlayerActionQueueLimit.SERIALIZATION_ID, SetPlayerActionQueueLimit.class);
		objectMap.put(GetPlayerActionQueueLimit.SERIALIZATION_ID, GetPlayerActionQueueLimit.class);
		objectMap.put(RenamePlayer.SERIALIZATION_ID, RenamePlayer.class);
		objectMap.put(GetPlayerCount.SERIALIZATION_ID, GetPlayerCount.class);
		objectMap.put(GetPlayerCountByFactionId.SERIALIZATION_ID, GetPlayerCountByFactionId.class);
		objectMap.put(IsPlayerSignedUp.SERIALIZATION_ID, IsPlayerSignedUp.class);
		objectMap.put(SetPlayerSignupPlugin.SERIALIZATION_ID, SetPlayerSignupPlugin.class);
		objectMap.put(GetPlayer.SERIALIZATION_ID, GetPlayer.class);
		objectMap.put(GetPlayerList.SERIALIZATION_ID, GetPlayerList.class);
		objectMap.put(GetPlayerScore.SERIALIZATION_ID, GetPlayerScore.class);
		objectMap.put(GetPlayerScoreList.SERIALIZATION_ID, GetPlayerScoreList.class);
		objectMap.put(AddUnitsAtPlayer.SERIALIZATION_ID, AddUnitsAtPlayer.class);
		objectMap.put(GetPlayerSetupInfo.SERIALIZATION_ID, GetPlayerSetupInfo.class);
		objectMap.put(GetPlayerSignupPlugin.SERIALIZATION_ID, GetPlayerSignupPlugin.class);
		objectMap.put(SetPlayerProperty.SERIALIZATION_ID, SetPlayerProperty.class);
		objectMap.put(GetPlayerPropertyList.SERIALIZATION_ID, GetPlayerPropertyList.class);
		objectMap.put(GetPlayerInfo.SERIALIZATION_ID, GetPlayerInfo.class);
		objectMap.put(GetPlayerScores.SERIALIZATION_ID, GetPlayerScores.class);
		objectMap.put(GetUserAdminInfoByPlayer.SERIALIZATION_ID, GetUserAdminInfoByPlayer.class);
		objectMap.put(SetPlayerAvatar.SERIALIZATION_ID, SetPlayerAvatar.class);
		objectMap.put(GetPlayerAvatar.SERIALIZATION_ID, GetPlayerAvatar.class);

		// Mappings by name
		objectMap.put("SignupPlayer", SignupPlayer.class);
		objectMap.put("GetPlayerById", GetPlayerById.class);
		objectMap.put("GetPlayerByUserId", GetPlayerByUserId.class);
		objectMap.put("GetPlayerByName", GetPlayerByName.class);
		objectMap.put("SetPlayerSignupsEnabled", SetPlayerSignupsEnabled.class);
		objectMap.put("GetPlayerSignupsEnabled", GetPlayerSignupsEnabled.class);
		objectMap.put("SetPlayerLimit", SetPlayerLimit.class);
		objectMap.put("GetPlayerLimit", GetPlayerLimit.class);
		objectMap.put("SetPlayerActionQueueLimit", SetPlayerActionQueueLimit.class);
		objectMap.put("GetPlayerActionQueueLimit", GetPlayerActionQueueLimit.class);
		objectMap.put("RenamePlayer", RenamePlayer.class);
		objectMap.put("GetPlayerCount", GetPlayerCount.class);
		objectMap.put("GetPlayerCountByFactionId", GetPlayerCountByFactionId.class);
		objectMap.put("IsPlayerSignedUp", IsPlayerSignedUp.class);
		objectMap.put("SetPlayerSignupPlugin", SetPlayerSignupPlugin.class);
		objectMap.put("GetPlayer", GetPlayer.class);
		objectMap.put("GetPlayerList", GetPlayerList.class);
		objectMap.put("GetPlayerScore", GetPlayerScore.class);
		objectMap.put("GetPlayerScoreList", GetPlayerScoreList.class);
		objectMap.put("AddUnitsAtPlayer", AddUnitsAtPlayer.class);
		objectMap.put("GetPlayerSetupInfo", GetPlayerSetupInfo.class);
		objectMap.put("GetPlayerSignupPlugin", GetPlayerSignupPlugin.class);
		objectMap.put("SetPlayerProperty", SetPlayerProperty.class);
		objectMap.put("GetPlayerPropertyList", GetPlayerPropertyList.class);
		objectMap.put("GetPlayerInfo", GetPlayerInfo.class);
		objectMap.put("GetPlayerScores", GetPlayerScores.class);
		objectMap.put("GetUserAdminInfoByPlayer", GetUserAdminInfoByPlayer.class);
		objectMap.put("SetPlayerAvatar", SetPlayerAvatar.class);
		objectMap.put("GetPlayerAvatar", GetPlayerAvatar.class);

		// Mappings by id
		objectMap.put(SetLocalProperty.SERIALIZATION_ID, SetLocalProperty.class);
		objectMap.put(GetLocalProperty.SERIALIZATION_ID, GetLocalProperty.class);

		// Mappings by name
		objectMap.put("SetLocalProperty", SetLocalProperty.class);
		objectMap.put("GetLocalProperty", GetLocalProperty.class);

		// Mappings by id
		objectMap.put(SetUnitScore.SERIALIZATION_ID, SetUnitScore.class);
		objectMap.put(GetUnitScore.SERIALIZATION_ID, GetUnitScore.class);
		objectMap.put(GetUnitScores.SERIALIZATION_ID, GetUnitScores.class);
		objectMap.put(SetScoreUpdaterGroup.SERIALIZATION_ID, SetScoreUpdaterGroup.class);
		objectMap.put(GetRankingList.SERIALIZATION_ID, GetRankingList.class);
		objectMap.put(GetRankingGroupList.SERIALIZATION_ID, GetRankingGroupList.class);
		objectMap.put(GetPlayerRankingList.SERIALIZATION_ID, GetPlayerRankingList.class);
		objectMap.put(GetAllianceRankingList.SERIALIZATION_ID, GetAllianceRankingList.class);
		objectMap.put(SetScoreDivisor.SERIALIZATION_ID, SetScoreDivisor.class);
		objectMap.put(GetScoreDivisor.SERIALIZATION_ID, GetScoreDivisor.class);

		// Mappings by name
		objectMap.put("SetUnitScore", SetUnitScore.class);
		objectMap.put("GetUnitScore", GetUnitScore.class);
		objectMap.put("GetUnitScores", GetUnitScores.class);
		objectMap.put("SetScoreUpdaterGroup", SetScoreUpdaterGroup.class);
		objectMap.put("GetRankingList", GetRankingList.class);
		objectMap.put("GetRankingGroupList", GetRankingGroupList.class);
		objectMap.put("GetPlayerRankingList", GetPlayerRankingList.class);
		objectMap.put("GetAllianceRankingList", GetAllianceRankingList.class);
		objectMap.put("SetScoreDivisor", SetScoreDivisor.class);
		objectMap.put("GetScoreDivisor", GetScoreDivisor.class);

		// Mappings by id
		objectMap.put(SetSetupBeanList.SERIALIZATION_ID, SetSetupBeanList.class);
		objectMap.put(SetSetupBeanListFile.SERIALIZATION_ID, SetSetupBeanListFile.class);
		objectMap.put(GetSetupBeanList.SERIALIZATION_ID, GetSetupBeanList.class);
		objectMap.put(ClearSetup.SERIALIZATION_ID, ClearSetup.class);

		// Mappings by name
		objectMap.put("SetSetupBeanList", SetSetupBeanList.class);
		objectMap.put("SetSetupBeanListFile", SetSetupBeanListFile.class);
		objectMap.put("GetSetupBeanList", GetSetupBeanList.class);
		objectMap.put("ClearSetup", ClearSetup.class);

		// Mappings by id
		objectMap.put(SetStorageGroup.SERIALIZATION_ID, SetStorageGroup.class);
		objectMap.put(SetStorageItem.SERIALIZATION_ID, SetStorageItem.class);
		objectMap.put(GetStorageGroups.SERIALIZATION_ID, GetStorageGroups.class);
		objectMap.put(GetStorageItems.SERIALIZATION_ID, GetStorageItems.class);

		// Mappings by name
		objectMap.put("SetStorageGroup", SetStorageGroup.class);
		objectMap.put("SetStorageItem", SetStorageItem.class);
		objectMap.put("GetStorageGroups", GetStorageGroups.class);
		objectMap.put("GetStorageItems", GetStorageItems.class);

		// Mappings by id
		objectMap.put(GetGoodsPriceListAtLocation.SERIALIZATION_ID, GetGoodsPriceListAtLocation.class);
		objectMap.put(BuyGoodsAtLocation.SERIALIZATION_ID, BuyGoodsAtLocation.class);
		objectMap.put(SellGoodsAtLocation.SERIALIZATION_ID, SellGoodsAtLocation.class);
		objectMap.put(SetTradeAtLocationPlugin.SERIALIZATION_ID, SetTradeAtLocationPlugin.class);

		// Mappings by name
		objectMap.put("GetGoodsPriceListAtLocation", GetGoodsPriceListAtLocation.class);
		objectMap.put("BuyGoodsAtLocation", BuyGoodsAtLocation.class);
		objectMap.put("SellGoodsAtLocation", SellGoodsAtLocation.class);
		objectMap.put("SetTradeAtLocationPlugin", SetTradeAtLocationPlugin.class);

		// Mappings by id
		objectMap.put(GetTurnNumber.SERIALIZATION_ID, GetTurnNumber.class);
		objectMap.put(ExecuteTurns.SERIALIZATION_ID, ExecuteTurns.class);
		objectMap.put(SetTurnInterval.SERIALIZATION_ID, SetTurnInterval.class);
		objectMap.put(GetTurnInterval.SERIALIZATION_ID, GetTurnInterval.class);
		objectMap.put(SetTurnsEnabled.SERIALIZATION_ID, SetTurnsEnabled.class);
		objectMap.put(GetTurnUpdating.SERIALIZATION_ID, GetTurnUpdating.class);
		objectMap.put(GetNextTurnUpdateTime.SERIALIZATION_ID, GetNextTurnUpdateTime.class);
		objectMap.put(GetTurnSummary.SERIALIZATION_ID, GetTurnSummary.class);
		objectMap.put(GetTurns.SERIALIZATION_ID, GetTurns.class);
		objectMap.put(GetTurnDetails.SERIALIZATION_ID, GetTurnDetails.class);
		objectMap.put(SetTurnStartTime.SERIALIZATION_ID, SetTurnStartTime.class);
		objectMap.put(GetTurnStartTime.SERIALIZATION_ID, GetTurnStartTime.class);
		objectMap.put(SetTurnIntervalTime.SERIALIZATION_ID, SetTurnIntervalTime.class);
		objectMap.put(SetTurnFinishTime.SERIALIZATION_ID, SetTurnFinishTime.class);
		objectMap.put(GetTurnFinishTime.SERIALIZATION_ID, GetTurnFinishTime.class);
		objectMap.put(GetTurnsEnabled.SERIALIZATION_ID, GetTurnsEnabled.class);

		// Mappings by name
		objectMap.put("GetTurnNumber", GetTurnNumber.class);
		objectMap.put("ExecuteTurns", ExecuteTurns.class);
		objectMap.put("SetTurnInterval", SetTurnInterval.class);
		objectMap.put("GetTurnInterval", GetTurnInterval.class);
		objectMap.put("SetTurnsEnabled", SetTurnsEnabled.class);
		objectMap.put("GetTurnUpdating", GetTurnUpdating.class);
		objectMap.put("GetNextTurnUpdateTime", GetNextTurnUpdateTime.class);
		objectMap.put("GetTurnSummary", GetTurnSummary.class);
		objectMap.put("GetTurns", GetTurns.class);
		objectMap.put("GetTurnDetails", GetTurnDetails.class);
		objectMap.put("SetTurnStartTime", SetTurnStartTime.class);
		objectMap.put("GetTurnStartTime", GetTurnStartTime.class);
		objectMap.put("SetTurnIntervalTime", SetTurnIntervalTime.class);
		objectMap.put("SetTurnFinishTime", SetTurnFinishTime.class);
		objectMap.put("GetTurnFinishTime", GetTurnFinishTime.class);
		objectMap.put("GetTurnsEnabled", GetTurnsEnabled.class);

		// Mappings by id
		objectMap.put(AddUnit.SERIALIZATION_ID, AddUnit.class);
		objectMap.put(GetUnitById.SERIALIZATION_ID, GetUnitById.class);
		objectMap.put(GetUnitByName.SERIALIZATION_ID, GetUnitByName.class);
		objectMap.put(GetUnits.SERIALIZATION_ID, GetUnits.class);
		objectMap.put(GetUnitsByFactionId.SERIALIZATION_ID, GetUnitsByFactionId.class);
		objectMap.put(GetUnitsByFactionName.SERIALIZATION_ID, GetUnitsByFactionName.class);
		objectMap.put(GetUnitsByGroupId.SERIALIZATION_ID, GetUnitsByGroupId.class);
		objectMap.put(GetUnitsByGroupName.SERIALIZATION_ID, GetUnitsByGroupName.class);
		objectMap.put(GetAllUnitsAtPlayer.SERIALIZATION_ID, GetAllUnitsAtPlayer.class);
		objectMap.put(GetUnitsAtPlayer.SERIALIZATION_ID, GetUnitsAtPlayer.class);

		// Mappings by name
		objectMap.put("AddUnit", AddUnit.class);
		objectMap.put("GetUnitById", GetUnitById.class);
		objectMap.put("GetUnitByName", GetUnitByName.class);
		objectMap.put("GetUnits", GetUnits.class);
		objectMap.put("GetUnitsByFactionId", GetUnitsByFactionId.class);
		objectMap.put("GetUnitsByFactionName", GetUnitsByFactionName.class);
		objectMap.put("GetUnitsByGroupId", GetUnitsByGroupId.class);
		objectMap.put("GetUnitsByGroupName", GetUnitsByGroupName.class);
		objectMap.put("GetAllUnitsAtPlayer", GetAllUnitsAtPlayer.class);
		objectMap.put("GetUnitsAtPlayer", GetUnitsAtPlayer.class);

		// Mappings by id
		objectMap.put(AddUpkeep.SERIALIZATION_ID, AddUpkeep.class);
		objectMap.put(AddUpkeepCondition.SERIALIZATION_ID, AddUpkeepCondition.class);
		objectMap.put(GetUpkeepList.SERIALIZATION_ID, GetUpkeepList.class);
		objectMap.put(GetUpkeepConditionList.SERIALIZATION_ID, GetUpkeepConditionList.class);
		objectMap.put(GetUpkeepAtLocation.SERIALIZATION_ID, GetUpkeepAtLocation.class);

		// Mappings by name
		objectMap.put("AddUpkeep", AddUpkeep.class);
		objectMap.put("AddUpkeepCondition", AddUpkeepCondition.class);
		objectMap.put("GetUpkeepList", GetUpkeepList.class);
		objectMap.put("GetUpkeepConditionList", GetUpkeepConditionList.class);
		objectMap.put("GetUpkeepAtLocation", GetUpkeepAtLocation.class);

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
	public Class<? extends IExecutableBean<?>> getType(Object key) {
		if (key == null) {
			throw new NullPointerException("key");
		}
		Class<? extends IExecutableBean<?>> type = objectMap.get(key);
		if (type == null) {
			throw new IllegalArgumentException("key: '" + key + "'");
		}
		return type;
	}

	@Override
	public IExecutableBean<?> newInstance(Object key) {
		Class<? extends IExecutableBean<?>> type = getType(key);
		try {
			return type.newInstance();
		} catch (Exception e) {
			throw new IllegalStateException("Unable to instantiate " + type, e);
		}
	}
}
