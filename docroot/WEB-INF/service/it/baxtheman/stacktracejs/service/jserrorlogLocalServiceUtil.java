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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for jserrorlog. This utility wraps
 * {@link it.baxtheman.stacktracejs.service.impl.jserrorlogLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author @baxtheman
 * @see jserrorlogLocalService
 * @see it.baxtheman.stacktracejs.service.base.jserrorlogLocalServiceBaseImpl
 * @see it.baxtheman.stacktracejs.service.impl.jserrorlogLocalServiceImpl
 * @generated
 */
public class jserrorlogLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link it.baxtheman.stacktracejs.service.impl.jserrorlogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the jserrorlog to the database. Also notifies the appropriate model listeners.
	*
	* @param jserrorlog the jserrorlog
	* @return the jserrorlog that was added
	* @throws SystemException if a system exception occurred
	*/
	public static it.baxtheman.stacktracejs.model.jserrorlog addjserrorlog(
		it.baxtheman.stacktracejs.model.jserrorlog jserrorlog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addjserrorlog(jserrorlog);
	}

	/**
	* Creates a new jserrorlog with the primary key. Does not add the jserrorlog to the database.
	*
	* @param jserrorlogId the primary key for the new jserrorlog
	* @return the new jserrorlog
	*/
	public static it.baxtheman.stacktracejs.model.jserrorlog createjserrorlog(
		long jserrorlogId) {
		return getService().createjserrorlog(jserrorlogId);
	}

	/**
	* Deletes the jserrorlog with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jserrorlogId the primary key of the jserrorlog
	* @return the jserrorlog that was removed
	* @throws PortalException if a jserrorlog with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.baxtheman.stacktracejs.model.jserrorlog deletejserrorlog(
		long jserrorlogId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletejserrorlog(jserrorlogId);
	}

	/**
	* Deletes the jserrorlog from the database. Also notifies the appropriate model listeners.
	*
	* @param jserrorlog the jserrorlog
	* @return the jserrorlog that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static it.baxtheman.stacktracejs.model.jserrorlog deletejserrorlog(
		it.baxtheman.stacktracejs.model.jserrorlog jserrorlog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletejserrorlog(jserrorlog);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static it.baxtheman.stacktracejs.model.jserrorlog fetchjserrorlog(
		long jserrorlogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchjserrorlog(jserrorlogId);
	}

	/**
	* Returns the jserrorlog with the primary key.
	*
	* @param jserrorlogId the primary key of the jserrorlog
	* @return the jserrorlog
	* @throws PortalException if a jserrorlog with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.baxtheman.stacktracejs.model.jserrorlog getjserrorlog(
		long jserrorlogId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getjserrorlog(jserrorlogId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<it.baxtheman.stacktracejs.model.jserrorlog> getjserrorlogs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getjserrorlogs(start, end);
	}

	/**
	* Returns the number of jserrorlogs.
	*
	* @return the number of jserrorlogs
	* @throws SystemException if a system exception occurred
	*/
	public static int getjserrorlogsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getjserrorlogsCount();
	}

	/**
	* Updates the jserrorlog in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jserrorlog the jserrorlog
	* @return the jserrorlog that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static it.baxtheman.stacktracejs.model.jserrorlog updatejserrorlog(
		it.baxtheman.stacktracejs.model.jserrorlog jserrorlog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatejserrorlog(jserrorlog);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static it.baxtheman.stacktracejs.model.jserrorlog addjserrorlog(
		long userId, long groupId, java.lang.String location,
		java.lang.String msg, java.lang.String url, java.lang.String line)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addjserrorlog(userId, groupId, location, msg, url, line);
	}

	public static void clearService() {
		_service = null;
	}

	public static jserrorlogLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					jserrorlogLocalService.class.getName());

			if (invokableLocalService instanceof jserrorlogLocalService) {
				_service = (jserrorlogLocalService)invokableLocalService;
			}
			else {
				_service = new jserrorlogLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(jserrorlogLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(jserrorlogLocalService service) {
	}

	private static jserrorlogLocalService _service;
}