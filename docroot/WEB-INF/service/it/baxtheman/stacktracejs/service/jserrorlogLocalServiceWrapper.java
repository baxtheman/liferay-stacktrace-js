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

package it.baxtheman.stacktracejs.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link jserrorlogLocalService}.
 *
 * @author @baxtheman
 * @see jserrorlogLocalService
 * @generated
 */
public class jserrorlogLocalServiceWrapper implements jserrorlogLocalService,
	ServiceWrapper<jserrorlogLocalService> {
	public jserrorlogLocalServiceWrapper(
		jserrorlogLocalService jserrorlogLocalService) {
		_jserrorlogLocalService = jserrorlogLocalService;
	}

	/**
	* Adds the jserrorlog to the database. Also notifies the appropriate model listeners.
	*
	* @param jserrorlog the jserrorlog
	* @return the jserrorlog that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public it.baxtheman.stacktracejs.model.jserrorlog addjserrorlog(
		it.baxtheman.stacktracejs.model.jserrorlog jserrorlog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.addjserrorlog(jserrorlog);
	}

	/**
	* Creates a new jserrorlog with the primary key. Does not add the jserrorlog to the database.
	*
	* @param jserrorlogId the primary key for the new jserrorlog
	* @return the new jserrorlog
	*/
	@Override
	public it.baxtheman.stacktracejs.model.jserrorlog createjserrorlog(
		long jserrorlogId) {
		return _jserrorlogLocalService.createjserrorlog(jserrorlogId);
	}

	/**
	* Deletes the jserrorlog with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jserrorlogId the primary key of the jserrorlog
	* @return the jserrorlog that was removed
	* @throws PortalException if a jserrorlog with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public it.baxtheman.stacktracejs.model.jserrorlog deletejserrorlog(
		long jserrorlogId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.deletejserrorlog(jserrorlogId);
	}

	/**
	* Deletes the jserrorlog from the database. Also notifies the appropriate model listeners.
	*
	* @param jserrorlog the jserrorlog
	* @return the jserrorlog that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public it.baxtheman.stacktracejs.model.jserrorlog deletejserrorlog(
		it.baxtheman.stacktracejs.model.jserrorlog jserrorlog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.deletejserrorlog(jserrorlog);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jserrorlogLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.baxtheman.stacktracejs.model.impl.jserrorlogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.baxtheman.stacktracejs.model.impl.jserrorlogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public it.baxtheman.stacktracejs.model.jserrorlog fetchjserrorlog(
		long jserrorlogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.fetchjserrorlog(jserrorlogId);
	}

	/**
	* Returns the jserrorlog with the primary key.
	*
	* @param jserrorlogId the primary key of the jserrorlog
	* @return the jserrorlog
	* @throws PortalException if a jserrorlog with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public it.baxtheman.stacktracejs.model.jserrorlog getjserrorlog(
		long jserrorlogId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.getjserrorlog(jserrorlogId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the jserrorlogs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.baxtheman.stacktracejs.model.impl.jserrorlogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jserrorlogs
	* @param end the upper bound of the range of jserrorlogs (not inclusive)
	* @return the range of jserrorlogs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<it.baxtheman.stacktracejs.model.jserrorlog> getjserrorlogs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.getjserrorlogs(start, end);
	}

	/**
	* Returns the number of jserrorlogs.
	*
	* @return the number of jserrorlogs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getjserrorlogsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.getjserrorlogsCount();
	}

	/**
	* Updates the jserrorlog in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jserrorlog the jserrorlog
	* @return the jserrorlog that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public it.baxtheman.stacktracejs.model.jserrorlog updatejserrorlog(
		it.baxtheman.stacktracejs.model.jserrorlog jserrorlog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.updatejserrorlog(jserrorlog);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _jserrorlogLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_jserrorlogLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _jserrorlogLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public it.baxtheman.stacktracejs.model.jserrorlog addjserrorlog(
		long userId, long groupId, java.lang.String location,
		java.lang.String msg, java.lang.String url, java.lang.String line)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlogLocalService.addjserrorlog(userId, groupId, location,
			msg, url, line);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public jserrorlogLocalService getWrappedjserrorlogLocalService() {
		return _jserrorlogLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedjserrorlogLocalService(
		jserrorlogLocalService jserrorlogLocalService) {
		_jserrorlogLocalService = jserrorlogLocalService;
	}

	@Override
	public jserrorlogLocalService getWrappedService() {
		return _jserrorlogLocalService;
	}

	@Override
	public void setWrappedService(jserrorlogLocalService jserrorlogLocalService) {
		_jserrorlogLocalService = jserrorlogLocalService;
	}

	private jserrorlogLocalService _jserrorlogLocalService;
}