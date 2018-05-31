/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.baxtheman.stacktracejs.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.User;
import com.liferay.portal.service.GroupLocalServiceUtil;

import it.baxtheman.stacktracejs.model.jserrorlog;
import it.baxtheman.stacktracejs.service.base.jserrorlogLocalServiceBaseImpl;

/**
 * The implementation of the jserrorlog local service. <p> All custom service
 * methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link it.baxtheman.service.jserrorlogLocalService} interface. <p> This is a
 * local service. Methods of this service will not have security checks based on
 * the propagated JAAS credentials because this service can only be accessed
 * from within the same VM. </p>
 *
 * @author @baxtheman
 * @see it.baxtheman.service.base.jserrorlogLocalServiceBaseImpl
 * @see it.baxtheman.service.jserrorlogLocalServiceUtil
 */
public class jserrorlogLocalServiceImpl extends jserrorlogLocalServiceBaseImpl {

	private static final Log _log =
		LogFactoryUtil.getLog(jserrorlogLocalServiceImpl.class);

	public jserrorlog addjserrorlog(
		long userId, long groupId, String userAgent, String location,
		String msg, String url, String line)
		throws SystemException, PortalException {

		jserrorlog entry = jserrorlogPersistence.create(
			counterLocalService.increment(
				jserrorlogLocalServiceImpl.class.getName()));

		User user = userPersistence.findByPrimaryKey(userId);
		Group group = GroupLocalServiceUtil.getGroup(groupId);

		entry.setUserId(userId);
		entry.setUserName(user.getScreenName());
		entry.setGroupId(groupId);
		entry.setCompanyId(group.getCompanyId());
		entry.setCreateDate(new Date());

		entry.setUserAgent(userAgent);
		entry.setLocation(location);
		entry.setMsg(msg);
		entry.setUrl(url);
		entry.setLine(line);

		_log.error(entry);

		jserrorlogPersistence.update(entry);

		return entry;
	}
}
