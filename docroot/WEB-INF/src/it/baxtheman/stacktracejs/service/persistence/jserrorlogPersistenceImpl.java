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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import it.baxtheman.stacktracejs.NoSuchjserrorlogException;
import it.baxtheman.stacktracejs.model.impl.jserrorlogImpl;
import it.baxtheman.stacktracejs.model.impl.jserrorlogModelImpl;
import it.baxtheman.stacktracejs.model.jserrorlog;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the jserrorlog service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author @baxtheman
 * @see jserrorlogPersistence
 * @see jserrorlogUtil
 * @generated
 */
public class jserrorlogPersistenceImpl extends BasePersistenceImpl<jserrorlog>
	implements jserrorlogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link jserrorlogUtil} to access the jserrorlog persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = jserrorlogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
			jserrorlogModelImpl.FINDER_CACHE_ENABLED, jserrorlogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
			jserrorlogModelImpl.FINDER_CACHE_ENABLED, jserrorlogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
			jserrorlogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
			jserrorlogModelImpl.FINDER_CACHE_ENABLED, jserrorlogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
			jserrorlogModelImpl.FINDER_CACHE_ENABLED, jserrorlogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygroupId",
			new String[] { Long.class.getName() },
			jserrorlogModelImpl.GROUPID_COLUMN_BITMASK |
			jserrorlogModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
			jserrorlogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the jserrorlogs where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching jserrorlogs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<jserrorlog> findBygroupId(long groupId)
		throws SystemException {
		return findBygroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<jserrorlog> findBygroupId(long groupId, int start, int end)
		throws SystemException {
		return findBygroupId(groupId, start, end, null);
	}

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
	@Override
	public List<jserrorlog> findBygroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<jserrorlog> list = (List<jserrorlog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (jserrorlog jserrorlog : list) {
				if ((groupId != jserrorlog.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_JSERRORLOG_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(jserrorlogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<jserrorlog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<jserrorlog>(list);
				}
				else {
					list = (List<jserrorlog>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first jserrorlog in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jserrorlog
	 * @throws it.baxtheman.stacktracejs.NoSuchjserrorlogException if a matching jserrorlog could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public jserrorlog findBygroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchjserrorlogException, SystemException {
		jserrorlog jserrorlog = fetchBygroupId_First(groupId, orderByComparator);

		if (jserrorlog != null) {
			return jserrorlog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchjserrorlogException(msg.toString());
	}

	/**
	 * Returns the first jserrorlog in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jserrorlog, or <code>null</code> if a matching jserrorlog could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public jserrorlog fetchBygroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<jserrorlog> list = findBygroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jserrorlog in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jserrorlog
	 * @throws it.baxtheman.stacktracejs.NoSuchjserrorlogException if a matching jserrorlog could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public jserrorlog findBygroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchjserrorlogException, SystemException {
		jserrorlog jserrorlog = fetchBygroupId_Last(groupId, orderByComparator);

		if (jserrorlog != null) {
			return jserrorlog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchjserrorlogException(msg.toString());
	}

	/**
	 * Returns the last jserrorlog in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jserrorlog, or <code>null</code> if a matching jserrorlog could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public jserrorlog fetchBygroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBygroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<jserrorlog> list = findBygroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public jserrorlog[] findBygroupId_PrevAndNext(long jserrorlogId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchjserrorlogException, SystemException {
		jserrorlog jserrorlog = findByPrimaryKey(jserrorlogId);

		Session session = null;

		try {
			session = openSession();

			jserrorlog[] array = new jserrorlogImpl[3];

			array[0] = getBygroupId_PrevAndNext(session, jserrorlog, groupId,
					orderByComparator, true);

			array[1] = jserrorlog;

			array[2] = getBygroupId_PrevAndNext(session, jserrorlog, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected jserrorlog getBygroupId_PrevAndNext(Session session,
		jserrorlog jserrorlog, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JSERRORLOG_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(jserrorlogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jserrorlog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<jserrorlog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jserrorlogs where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBygroupId(long groupId) throws SystemException {
		for (jserrorlog jserrorlog : findBygroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(jserrorlog);
		}
	}

	/**
	 * Returns the number of jserrorlogs where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching jserrorlogs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JSERRORLOG_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "jserrorlog.groupId = ?";

	public jserrorlogPersistenceImpl() {
		setModelClass(jserrorlog.class);
	}

	/**
	 * Caches the jserrorlog in the entity cache if it is enabled.
	 *
	 * @param jserrorlog the jserrorlog
	 */
	@Override
	public void cacheResult(jserrorlog jserrorlog) {
		EntityCacheUtil.putResult(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
			jserrorlogImpl.class, jserrorlog.getPrimaryKey(), jserrorlog);

		jserrorlog.resetOriginalValues();
	}

	/**
	 * Caches the jserrorlogs in the entity cache if it is enabled.
	 *
	 * @param jserrorlogs the jserrorlogs
	 */
	@Override
	public void cacheResult(List<jserrorlog> jserrorlogs) {
		for (jserrorlog jserrorlog : jserrorlogs) {
			if (EntityCacheUtil.getResult(
						jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
						jserrorlogImpl.class, jserrorlog.getPrimaryKey()) == null) {
				cacheResult(jserrorlog);
			}
			else {
				jserrorlog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all jserrorlogs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(jserrorlogImpl.class.getName());
		}

		EntityCacheUtil.clearCache(jserrorlogImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the jserrorlog.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(jserrorlog jserrorlog) {
		EntityCacheUtil.removeResult(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
			jserrorlogImpl.class, jserrorlog.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<jserrorlog> jserrorlogs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (jserrorlog jserrorlog : jserrorlogs) {
			EntityCacheUtil.removeResult(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
				jserrorlogImpl.class, jserrorlog.getPrimaryKey());
		}
	}

	/**
	 * Creates a new jserrorlog with the primary key. Does not add the jserrorlog to the database.
	 *
	 * @param jserrorlogId the primary key for the new jserrorlog
	 * @return the new jserrorlog
	 */
	@Override
	public jserrorlog create(long jserrorlogId) {
		jserrorlog jserrorlog = new jserrorlogImpl();

		jserrorlog.setNew(true);
		jserrorlog.setPrimaryKey(jserrorlogId);

		return jserrorlog;
	}

	/**
	 * Removes the jserrorlog with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jserrorlogId the primary key of the jserrorlog
	 * @return the jserrorlog that was removed
	 * @throws it.baxtheman.stacktracejs.NoSuchjserrorlogException if a jserrorlog with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public jserrorlog remove(long jserrorlogId)
		throws NoSuchjserrorlogException, SystemException {
		return remove((Serializable)jserrorlogId);
	}

	/**
	 * Removes the jserrorlog with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jserrorlog
	 * @return the jserrorlog that was removed
	 * @throws it.baxtheman.stacktracejs.NoSuchjserrorlogException if a jserrorlog with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public jserrorlog remove(Serializable primaryKey)
		throws NoSuchjserrorlogException, SystemException {
		Session session = null;

		try {
			session = openSession();

			jserrorlog jserrorlog = (jserrorlog)session.get(jserrorlogImpl.class,
					primaryKey);

			if (jserrorlog == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchjserrorlogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jserrorlog);
		}
		catch (NoSuchjserrorlogException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected jserrorlog removeImpl(jserrorlog jserrorlog)
		throws SystemException {
		jserrorlog = toUnwrappedModel(jserrorlog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jserrorlog)) {
				jserrorlog = (jserrorlog)session.get(jserrorlogImpl.class,
						jserrorlog.getPrimaryKeyObj());
			}

			if (jserrorlog != null) {
				session.delete(jserrorlog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (jserrorlog != null) {
			clearCache(jserrorlog);
		}

		return jserrorlog;
	}

	@Override
	public jserrorlog updateImpl(
		it.baxtheman.stacktracejs.model.jserrorlog jserrorlog)
		throws SystemException {
		jserrorlog = toUnwrappedModel(jserrorlog);

		boolean isNew = jserrorlog.isNew();

		jserrorlogModelImpl jserrorlogModelImpl = (jserrorlogModelImpl)jserrorlog;

		Session session = null;

		try {
			session = openSession();

			if (jserrorlog.isNew()) {
				session.save(jserrorlog);

				jserrorlog.setNew(false);
			}
			else {
				session.merge(jserrorlog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !jserrorlogModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((jserrorlogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						jserrorlogModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { jserrorlogModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
			jserrorlogImpl.class, jserrorlog.getPrimaryKey(), jserrorlog);

		return jserrorlog;
	}

	protected jserrorlog toUnwrappedModel(jserrorlog jserrorlog) {
		if (jserrorlog instanceof jserrorlogImpl) {
			return jserrorlog;
		}

		jserrorlogImpl jserrorlogImpl = new jserrorlogImpl();

		jserrorlogImpl.setNew(jserrorlog.isNew());
		jserrorlogImpl.setPrimaryKey(jserrorlog.getPrimaryKey());

		jserrorlogImpl.setJserrorlogId(jserrorlog.getJserrorlogId());
		jserrorlogImpl.setGroupId(jserrorlog.getGroupId());
		jserrorlogImpl.setCompanyId(jserrorlog.getCompanyId());
		jserrorlogImpl.setUserId(jserrorlog.getUserId());
		jserrorlogImpl.setUserName(jserrorlog.getUserName());
		jserrorlogImpl.setCreateDate(jserrorlog.getCreateDate());
		jserrorlogImpl.setLocation(jserrorlog.getLocation());
		jserrorlogImpl.setMsg(jserrorlog.getMsg());
		jserrorlogImpl.setUrl(jserrorlog.getUrl());
		jserrorlogImpl.setLine(jserrorlog.getLine());

		return jserrorlogImpl;
	}

	/**
	 * Returns the jserrorlog with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the jserrorlog
	 * @return the jserrorlog
	 * @throws it.baxtheman.stacktracejs.NoSuchjserrorlogException if a jserrorlog with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public jserrorlog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchjserrorlogException, SystemException {
		jserrorlog jserrorlog = fetchByPrimaryKey(primaryKey);

		if (jserrorlog == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchjserrorlogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return jserrorlog;
	}

	/**
	 * Returns the jserrorlog with the primary key or throws a {@link it.baxtheman.stacktracejs.NoSuchjserrorlogException} if it could not be found.
	 *
	 * @param jserrorlogId the primary key of the jserrorlog
	 * @return the jserrorlog
	 * @throws it.baxtheman.stacktracejs.NoSuchjserrorlogException if a jserrorlog with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public jserrorlog findByPrimaryKey(long jserrorlogId)
		throws NoSuchjserrorlogException, SystemException {
		return findByPrimaryKey((Serializable)jserrorlogId);
	}

	/**
	 * Returns the jserrorlog with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jserrorlog
	 * @return the jserrorlog, or <code>null</code> if a jserrorlog with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public jserrorlog fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		jserrorlog jserrorlog = (jserrorlog)EntityCacheUtil.getResult(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
				jserrorlogImpl.class, primaryKey);

		if (jserrorlog == _nulljserrorlog) {
			return null;
		}

		if (jserrorlog == null) {
			Session session = null;

			try {
				session = openSession();

				jserrorlog = (jserrorlog)session.get(jserrorlogImpl.class,
						primaryKey);

				if (jserrorlog != null) {
					cacheResult(jserrorlog);
				}
				else {
					EntityCacheUtil.putResult(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
						jserrorlogImpl.class, primaryKey, _nulljserrorlog);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(jserrorlogModelImpl.ENTITY_CACHE_ENABLED,
					jserrorlogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return jserrorlog;
	}

	/**
	 * Returns the jserrorlog with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jserrorlogId the primary key of the jserrorlog
	 * @return the jserrorlog, or <code>null</code> if a jserrorlog with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public jserrorlog fetchByPrimaryKey(long jserrorlogId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)jserrorlogId);
	}

	/**
	 * Returns all the jserrorlogs.
	 *
	 * @return the jserrorlogs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<jserrorlog> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<jserrorlog> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<jserrorlog> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<jserrorlog> list = (List<jserrorlog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_JSERRORLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JSERRORLOG;

				if (pagination) {
					sql = sql.concat(jserrorlogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<jserrorlog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<jserrorlog>(list);
				}
				else {
					list = (List<jserrorlog>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the jserrorlogs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (jserrorlog jserrorlog : findAll()) {
			remove(jserrorlog);
		}
	}

	/**
	 * Returns the number of jserrorlogs.
	 *
	 * @return the number of jserrorlogs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JSERRORLOG);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the jserrorlog persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.it.baxtheman.stacktracejs.model.jserrorlog")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<jserrorlog>> listenersList = new ArrayList<ModelListener<jserrorlog>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<jserrorlog>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(jserrorlogImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_JSERRORLOG = "SELECT jserrorlog FROM jserrorlog jserrorlog";
	private static final String _SQL_SELECT_JSERRORLOG_WHERE = "SELECT jserrorlog FROM jserrorlog jserrorlog WHERE ";
	private static final String _SQL_COUNT_JSERRORLOG = "SELECT COUNT(jserrorlog) FROM jserrorlog jserrorlog";
	private static final String _SQL_COUNT_JSERRORLOG_WHERE = "SELECT COUNT(jserrorlog) FROM jserrorlog jserrorlog WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jserrorlog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No jserrorlog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No jserrorlog exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(jserrorlogPersistenceImpl.class);
	private static jserrorlog _nulljserrorlog = new jserrorlogImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<jserrorlog> toCacheModel() {
				return _nulljserrorlogCacheModel;
			}
		};

	private static CacheModel<jserrorlog> _nulljserrorlogCacheModel = new CacheModel<jserrorlog>() {
			@Override
			public jserrorlog toEntityModel() {
				return _nulljserrorlog;
			}
		};
}