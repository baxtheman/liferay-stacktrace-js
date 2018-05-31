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

import com.liferay.portal.service.persistence.BasePersistence;

import it.baxtheman.stacktracejs.model.jserrorlog;

/**
 * The persistence interface for the jserrorlog service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author @baxtheman
 * @see jserrorlogPersistenceImpl
 * @see jserrorlogUtil
 * @generated
 */
public interface jserrorlogPersistence extends BasePersistence<jserrorlog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link jserrorlogUtil} to access the jserrorlog persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the jserrorlogs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching jserrorlogs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.baxtheman.stacktracejs.model.jserrorlog> findBygroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the jserrorlogs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.baxtheman.stacktracejs.model.impl.jserrorlogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of jserrorlogs
	* @param end the upper bound of the range of jserrorlogs (not inclusive)
	* @return the range of matching jserrorlogs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.baxtheman.stacktracejs.model.jserrorlog> findBygroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the jserrorlogs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.baxtheman.stacktracejs.model.impl.jserrorlogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of jserrorlogs
	* @param end the upper bound of the range of jserrorlogs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jserrorlogs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.baxtheman.stacktracejs.model.jserrorlog> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first jserrorlog in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jserrorlog
	* @throws it.baxtheman.stacktracejs.NoSuchjserrorlogException if a matching jserrorlog could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.baxtheman.stacktracejs.model.jserrorlog findBygroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.baxtheman.stacktracejs.NoSuchjserrorlogException;

	/**
	* Returns the first jserrorlog in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jserrorlog, or <code>null</code> if a matching jserrorlog could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.baxtheman.stacktracejs.model.jserrorlog fetchBygroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last jserrorlog in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jserrorlog
	* @throws it.baxtheman.stacktracejs.NoSuchjserrorlogException if a matching jserrorlog could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.baxtheman.stacktracejs.model.jserrorlog findBygroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.baxtheman.stacktracejs.NoSuchjserrorlogException;

	/**
	* Returns the last jserrorlog in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jserrorlog, or <code>null</code> if a matching jserrorlog could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.baxtheman.stacktracejs.model.jserrorlog fetchBygroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the jserrorlogs before and after the current jserrorlog in the ordered set where groupId = &#63;.
	*
	* @param jserrorlogId the primary key of the current jserrorlog
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jserrorlog
	* @throws it.baxtheman.stacktracejs.NoSuchjserrorlogException if a jserrorlog with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.baxtheman.stacktracejs.model.jserrorlog[] findBygroupId_PrevAndNext(
		long jserrorlogId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.baxtheman.stacktracejs.NoSuchjserrorlogException;

	/**
	* Removes all the jserrorlogs where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBygroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of jserrorlogs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching jserrorlogs
	* @throws SystemException if a system exception occurred
	*/
	public int countBygroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the jserrorlog in the entity cache if it is enabled.
	*
	* @param jserrorlog the jserrorlog
	*/
	public void cacheResult(
		it.baxtheman.stacktracejs.model.jserrorlog jserrorlog);

	/**
	* Caches the jserrorlogs in the entity cache if it is enabled.
	*
	* @param jserrorlogs the jserrorlogs
	*/
	public void cacheResult(
		java.util.List<it.baxtheman.stacktracejs.model.jserrorlog> jserrorlogs);

	/**
	* Creates a new jserrorlog with the primary key. Does not add the jserrorlog to the database.
	*
	* @param jserrorlogId the primary key for the new jserrorlog
	* @return the new jserrorlog
	*/
	public it.baxtheman.stacktracejs.model.jserrorlog create(long jserrorlogId);

	/**
	* Removes the jserrorlog with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jserrorlogId the primary key of the jserrorlog
	* @return the jserrorlog that was removed
	* @throws it.baxtheman.stacktracejs.NoSuchjserrorlogException if a jserrorlog with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.baxtheman.stacktracejs.model.jserrorlog remove(long jserrorlogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.baxtheman.stacktracejs.NoSuchjserrorlogException;

	public it.baxtheman.stacktracejs.model.jserrorlog updateImpl(
		it.baxtheman.stacktracejs.model.jserrorlog jserrorlog)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the jserrorlog with the primary key or throws a {@link it.baxtheman.stacktracejs.NoSuchjserrorlogException} if it could not be found.
	*
	* @param jserrorlogId the primary key of the jserrorlog
	* @return the jserrorlog
	* @throws it.baxtheman.stacktracejs.NoSuchjserrorlogException if a jserrorlog with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.baxtheman.stacktracejs.model.jserrorlog findByPrimaryKey(
		long jserrorlogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.baxtheman.stacktracejs.NoSuchjserrorlogException;

	/**
	* Returns the jserrorlog with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jserrorlogId the primary key of the jserrorlog
	* @return the jserrorlog, or <code>null</code> if a jserrorlog with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.baxtheman.stacktracejs.model.jserrorlog fetchByPrimaryKey(
		long jserrorlogId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the jserrorlogs.
	*
	* @return the jserrorlogs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.baxtheman.stacktracejs.model.jserrorlog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<it.baxtheman.stacktracejs.model.jserrorlog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the jserrorlogs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.baxtheman.stacktracejs.model.impl.jserrorlogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jserrorlogs
	* @param end the upper bound of the range of jserrorlogs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of jserrorlogs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.baxtheman.stacktracejs.model.jserrorlog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the jserrorlogs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of jserrorlogs.
	*
	* @return the number of jserrorlogs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}