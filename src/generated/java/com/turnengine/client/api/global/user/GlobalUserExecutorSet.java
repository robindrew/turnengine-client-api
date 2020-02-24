package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.robindrew.common.locale.LanguageCountry;
import com.turnengine.client.api.global.game.GameLevel;
import com.turnengine.client.api.global.image.IImage;
import java.util.List;

public class GlobalUserExecutorSet implements IGlobalUserExecutorSet {

	private final IBeanExecutorLocator locator;

	public GlobalUserExecutorSet(IBeanExecutorLocator locator) {
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
	public Integer signupUser(String name, String password, String email, String address, LanguageCountry language) {
		SignupUser bean = new SignupUser(name, password, email, address, language);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean verifyUser(int id, long code, String address) {
		VerifyUser bean = new VerifyUser(id, code, address);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setUserAddress(int id, String address) {
		SetUserAddress bean = new SetUserAddress(id, address);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Long loginUser(String nameOrEmail, String password, String address) {
		LoginUser bean = new LoginUser(nameOrEmail, password, address);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean renameUser(long loginId, String from, String to) {
		RenameUser bean = new RenameUser(loginId, from, to);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean logoutUser(long loginId) {
		LogoutUser bean = new LogoutUser(loginId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setUserLanguage(long loginId, LanguageCountry language) {
		SetUserLanguage bean = new SetUserLanguage(loginId, language);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IUser getUserById(long loginId, int id) {
		GetUserById bean = new GetUserById(loginId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IUser getUserByName(long loginId, String name) {
		GetUserByName bean = new GetUserByName(loginId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IUser getUserByEmail(long loginId, String email) {
		GetUserByEmail bean = new GetUserByEmail(loginId, email);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IUser getUserByLoginId(long loginId, long id) {
		GetUserByLoginId bean = new GetUserByLoginId(loginId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Integer countUsers() {
		CountUsers bean = new CountUsers();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean adminVerifyUser(long loginId, int id) {
		AdminVerifyUser bean = new AdminVerifyUser(loginId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setUserPermission(long loginId, int id, UserPermissionType type) {
		SetUserPermission bean = new SetUserPermission(loginId, id, type);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setUserGamePermission(long loginId, int userId, int id, UserPermissionType type, GameLevel level) {
		SetUserGamePermission bean = new SetUserGamePermission(loginId, userId, id, type, level);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setSignupVerification(long loginId, Boolean enabled) {
		SetSignupVerification bean = new SetSignupVerification(loginId, enabled);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IUser getUser(long loginId) {
		GetUser bean = new GetUser(loginId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<String> getUserNames(long loginId) {
		GetUserNames bean = new GetUserNames(loginId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean changeUserPassword(long loginId, String oldPassword, String newPassword) {
		ChangeUserPassword bean = new ChangeUserPassword(loginId, oldPassword, newPassword);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUserAddressCode> getUserAddressCodeList(long loginId, int userId, String code) {
		GetUserAddressCodeList bean = new GetUserAddressCodeList(loginId, userId, code);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUserAdminInfo> getUserAdminInfoList(long loginId) {
		GetUserAdminInfoList bean = new GetUserAdminInfoList(loginId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IUserAdminInfo getUserAdminInfo(long loginId, int userId) {
		GetUserAdminInfo bean = new GetUserAdminInfo(loginId, userId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean updateUserAddressCode(long loginId, String code) {
		UpdateUserAddressCode bean = new UpdateUserAddressCode(loginId, code);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUserSimilarity> getUserSimilarityList(long loginId, UserSimilarityOrder order, int threshold, int pageNumber, int pageSize) {
		GetUserSimilarityList bean = new GetUserSimilarityList(loginId, order, threshold, pageNumber, pageSize);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean adminSetUserPassword(long loginId, String name, String password) {
		AdminSetUserPassword bean = new AdminSetUserPassword(loginId, name, password);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setUserAvatar(long loginId, byte[] image) {
		SetUserAvatar bean = new SetUserAvatar(loginId, image);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IImage getUserAvatar(int userId, int width, int height, boolean fill) {
		GetUserAvatar bean = new GetUserAvatar(userId, width, height, fill);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean sendResetPasswordEmail(String email) {
		SendResetPasswordEmail bean = new SendResetPasswordEmail(email);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean resetPassword(String email, String password, long code) {
		ResetPassword bean = new ResetPassword(email, password, code);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setResetPasswordEmail(long loginId, int instanceId, String subject, String content) {
		SetResetPasswordEmail bean = new SetResetPasswordEmail(loginId, instanceId, subject, content);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setSignupUserEmail(long loginId, int instanceId, String subject, String content) {
		SetSignupUserEmail bean = new SetSignupUserEmail(loginId, instanceId, subject, content);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUser> getUserList(long loginId) {
		GetUserList bean = new GetUserList(loginId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
