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

package it.baxtheman.stacktracejs.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link jserrorlog}.
 * </p>
 *
 * @author @baxtheman
 * @see jserrorlog
 * @generated
 */
public class jserrorlogWrapper implements jserrorlog, ModelWrapper<jserrorlog> {
	public jserrorlogWrapper(jserrorlog jserrorlog) {
		_jserrorlog = jserrorlog;
	}

	@Override
	public Class<?> getModelClass() {
		return jserrorlog.class;
	}

	@Override
	public String getModelClassName() {
		return jserrorlog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jserrorlogId", getJserrorlogId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("location", getLocation());
		attributes.put("msg", getMsg());
		attributes.put("url", getUrl());
		attributes.put("line", getLine());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jserrorlogId = (Long)attributes.get("jserrorlogId");

		if (jserrorlogId != null) {
			setJserrorlogId(jserrorlogId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String msg = (String)attributes.get("msg");

		if (msg != null) {
			setMsg(msg);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String line = (String)attributes.get("line");

		if (line != null) {
			setLine(line);
		}
	}

	/**
	* Returns the primary key of this jserrorlog.
	*
	* @return the primary key of this jserrorlog
	*/
	@Override
	public long getPrimaryKey() {
		return _jserrorlog.getPrimaryKey();
	}

	/**
	* Sets the primary key of this jserrorlog.
	*
	* @param primaryKey the primary key of this jserrorlog
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_jserrorlog.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the jserrorlog ID of this jserrorlog.
	*
	* @return the jserrorlog ID of this jserrorlog
	*/
	@Override
	public long getJserrorlogId() {
		return _jserrorlog.getJserrorlogId();
	}

	/**
	* Sets the jserrorlog ID of this jserrorlog.
	*
	* @param jserrorlogId the jserrorlog ID of this jserrorlog
	*/
	@Override
	public void setJserrorlogId(long jserrorlogId) {
		_jserrorlog.setJserrorlogId(jserrorlogId);
	}

	/**
	* Returns the group ID of this jserrorlog.
	*
	* @return the group ID of this jserrorlog
	*/
	@Override
	public long getGroupId() {
		return _jserrorlog.getGroupId();
	}

	/**
	* Sets the group ID of this jserrorlog.
	*
	* @param groupId the group ID of this jserrorlog
	*/
	@Override
	public void setGroupId(long groupId) {
		_jserrorlog.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this jserrorlog.
	*
	* @return the company ID of this jserrorlog
	*/
	@Override
	public long getCompanyId() {
		return _jserrorlog.getCompanyId();
	}

	/**
	* Sets the company ID of this jserrorlog.
	*
	* @param companyId the company ID of this jserrorlog
	*/
	@Override
	public void setCompanyId(long companyId) {
		_jserrorlog.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this jserrorlog.
	*
	* @return the user ID of this jserrorlog
	*/
	@Override
	public long getUserId() {
		return _jserrorlog.getUserId();
	}

	/**
	* Sets the user ID of this jserrorlog.
	*
	* @param userId the user ID of this jserrorlog
	*/
	@Override
	public void setUserId(long userId) {
		_jserrorlog.setUserId(userId);
	}

	/**
	* Returns the user uuid of this jserrorlog.
	*
	* @return the user uuid of this jserrorlog
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jserrorlog.getUserUuid();
	}

	/**
	* Sets the user uuid of this jserrorlog.
	*
	* @param userUuid the user uuid of this jserrorlog
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_jserrorlog.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this jserrorlog.
	*
	* @return the user name of this jserrorlog
	*/
	@Override
	public java.lang.String getUserName() {
		return _jserrorlog.getUserName();
	}

	/**
	* Sets the user name of this jserrorlog.
	*
	* @param userName the user name of this jserrorlog
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_jserrorlog.setUserName(userName);
	}

	/**
	* Returns the create date of this jserrorlog.
	*
	* @return the create date of this jserrorlog
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _jserrorlog.getCreateDate();
	}

	/**
	* Sets the create date of this jserrorlog.
	*
	* @param createDate the create date of this jserrorlog
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_jserrorlog.setCreateDate(createDate);
	}

	/**
	* Returns the location of this jserrorlog.
	*
	* @return the location of this jserrorlog
	*/
	@Override
	public java.lang.String getLocation() {
		return _jserrorlog.getLocation();
	}

	/**
	* Sets the location of this jserrorlog.
	*
	* @param location the location of this jserrorlog
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_jserrorlog.setLocation(location);
	}

	/**
	* Returns the msg of this jserrorlog.
	*
	* @return the msg of this jserrorlog
	*/
	@Override
	public java.lang.String getMsg() {
		return _jserrorlog.getMsg();
	}

	/**
	* Sets the msg of this jserrorlog.
	*
	* @param msg the msg of this jserrorlog
	*/
	@Override
	public void setMsg(java.lang.String msg) {
		_jserrorlog.setMsg(msg);
	}

	/**
	* Returns the url of this jserrorlog.
	*
	* @return the url of this jserrorlog
	*/
	@Override
	public java.lang.String getUrl() {
		return _jserrorlog.getUrl();
	}

	/**
	* Sets the url of this jserrorlog.
	*
	* @param url the url of this jserrorlog
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_jserrorlog.setUrl(url);
	}

	/**
	* Returns the line of this jserrorlog.
	*
	* @return the line of this jserrorlog
	*/
	@Override
	public java.lang.String getLine() {
		return _jserrorlog.getLine();
	}

	/**
	* Sets the line of this jserrorlog.
	*
	* @param line the line of this jserrorlog
	*/
	@Override
	public void setLine(java.lang.String line) {
		_jserrorlog.setLine(line);
	}

	@Override
	public boolean isNew() {
		return _jserrorlog.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_jserrorlog.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _jserrorlog.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jserrorlog.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _jserrorlog.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _jserrorlog.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_jserrorlog.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _jserrorlog.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_jserrorlog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_jserrorlog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_jserrorlog.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new jserrorlogWrapper((jserrorlog)_jserrorlog.clone());
	}

	@Override
	public int compareTo(it.baxtheman.stacktracejs.model.jserrorlog jserrorlog) {
		return _jserrorlog.compareTo(jserrorlog);
	}

	@Override
	public int hashCode() {
		return _jserrorlog.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<it.baxtheman.stacktracejs.model.jserrorlog> toCacheModel() {
		return _jserrorlog.toCacheModel();
	}

	@Override
	public it.baxtheman.stacktracejs.model.jserrorlog toEscapedModel() {
		return new jserrorlogWrapper(_jserrorlog.toEscapedModel());
	}

	@Override
	public it.baxtheman.stacktracejs.model.jserrorlog toUnescapedModel() {
		return new jserrorlogWrapper(_jserrorlog.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _jserrorlog.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _jserrorlog.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_jserrorlog.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof jserrorlogWrapper)) {
			return false;
		}

		jserrorlogWrapper jserrorlogWrapper = (jserrorlogWrapper)obj;

		if (Validator.equals(_jserrorlog, jserrorlogWrapper._jserrorlog)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public jserrorlog getWrappedjserrorlog() {
		return _jserrorlog;
	}

	@Override
	public jserrorlog getWrappedModel() {
		return _jserrorlog;
	}

	@Override
	public void resetOriginalValues() {
		_jserrorlog.resetOriginalValues();
	}

	private jserrorlog _jserrorlog;
}