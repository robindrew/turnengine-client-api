package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.robindrew.common.locale.LanguageCountry;
import com.turnengine.client.api.common.command.IGlobalBeanExecutorSet;
import com.turnengine.client.api.global.game.GameLevel;
import com.turnengine.client.api.global.image.IImage;
import java.util.List;

public interface IGlobalUserExecutorSet extends IBeanExecutorSet, IGlobalBeanExecutorSet {

	Integer signupUser(String name, String password, String email, String address, LanguageCountry language);

	Boolean verifyUser(int id, long code, String address);

	Boolean setUserAddress(int id, String address);

	Long loginUser(String nameOrEmail, String password, String address);

	Boolean renameUser(long loginId, String from, String to);

	Boolean logoutUser(long loginId);

	Boolean setUserLanguage(long loginId, LanguageCountry language);

	IUser getUserById(long loginId, int id);

	IUser getUserByName(long loginId, String name);

	IUser getUserByEmail(long loginId, String email);

	IUser getUserByLoginId(long loginId, long id);

	Integer countUsers();

	Boolean adminVerifyUser(long loginId, int id);

	Boolean setUserPermission(long loginId, int id, UserPermissionType type);

	Boolean setUserGamePermission(long loginId, int userId, int id, UserPermissionType type, GameLevel level);

	Boolean setSignupVerification(long loginId, Boolean enabled);

	IUser getUser(long loginId);

	List<String> getUserNames(long loginId);

	Boolean changeUserPassword(long loginId, String oldPassword, String newPassword);

	List<IUserAddressCode> getUserAddressCodeList(long loginId, int userId, String code);

	List<IUserAdminInfo> getUserAdminInfoList(long loginId);

	IUserAdminInfo getUserAdminInfo(long loginId, int userId);

	Boolean updateUserAddressCode(long loginId, String code);

	List<IUserSimilarity> getUserSimilarityList(long loginId, UserSimilarityOrder order, int threshold, int pageNumber, int pageSize);

	Boolean adminSetUserPassword(long loginId, String name, String password);

	Boolean setUserAvatar(long loginId, byte[] image);

	IImage getUserAvatar(int userId, int width, int height, boolean fill);

	Boolean sendResetPasswordEmail(String email);

	Boolean resetPassword(String email, String password, long code);

	Boolean setResetPasswordEmail(long loginId, int instanceId, String subject, String content);

	Boolean setSignupUserEmail(long loginId, int instanceId, String subject, String content);
}
