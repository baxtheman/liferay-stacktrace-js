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

package it.baxtheman.stacktracejs.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import it.baxtheman.stacktracejs.model.jserrorlog;
import it.baxtheman.stacktracejs.service.jserrorlogLocalServiceUtil;

/**
 * @author @baxtheman
 * @generated
 */
public abstract class jserrorlogActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public jserrorlogActionableDynamicQuery() throws SystemException {
		setBaseLocalService(jserrorlogLocalServiceUtil.getService());
		setClass(jserrorlog.class);

		setClassLoader(it.baxtheman.stacktracejs.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("jserrorlogId");
	}
}