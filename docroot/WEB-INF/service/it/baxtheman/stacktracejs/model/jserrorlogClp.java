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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import it.baxtheman.stacktracejs.service.ClpSerializer;
import it.baxtheman.stacktracejs.service.jserrorlogLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author @baxtheman
 */
public class jserrorlogClp extends BaseModelImpl<jserrorlog>
	implements jserrorlog {
	public jserrorlogClp() {
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
	public long getPrimaryKey() {
		return _jserrorlogId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJserrorlogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jserrorlogId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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
		attributes.put("userAgent", getUserAgent());
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

		String userAgent = (String)attributes.get("userAgent");

		if (userAgent != null) {
			setUserAgent(userAgent);
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

	@Override
	public long getJserrorlogId() {
		return _jserrorlogId;
	}

	@Override
	public void setJserrorlogId(long jserrorlogId) {
		_jserrorlogId = jserrorlogId;

		if (_jserrorlogRemoteModel != null) {
			try {
				Class<?> clazz = _jserrorlogRemoteModel.getClass();

				Method method = clazz.getMethod("setJserrorlogId", long.class);

				method.invoke(_jserrorlogRemoteModel, jserrorlogId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_jserrorlogRemoteModel != null) {
			try {
				Class<?> clazz = _jserrorlogRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_jserrorlogRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_jserrorlogRemoteModel != null) {
			try {
				Class<?> clazz = _jserrorlogRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_jserrorlogRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_jserrorlogRemoteModel != null) {
			try {
				Class<?> clazz = _jserrorlogRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_jserrorlogRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_jserrorlogRemoteModel != null) {
			try {
				Class<?> clazz = _jserrorlogRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_jserrorlogRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_jserrorlogRemoteModel != null) {
			try {
				Class<?> clazz = _jserrorlogRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_jserrorlogRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserAgent() {
		return _userAgent;
	}

	@Override
	public void setUserAgent(String userAgent) {
		_userAgent = userAgent;

		if (_jserrorlogRemoteModel != null) {
			try {
				Class<?> clazz = _jserrorlogRemoteModel.getClass();

				Method method = clazz.getMethod("setUserAgent", String.class);

				method.invoke(_jserrorlogRemoteModel, userAgent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocation() {
		return _location;
	}

	@Override
	public void setLocation(String location) {
		_location = location;

		if (_jserrorlogRemoteModel != null) {
			try {
				Class<?> clazz = _jserrorlogRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", String.class);

				method.invoke(_jserrorlogRemoteModel, location);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMsg() {
		return _msg;
	}

	@Override
	public void setMsg(String msg) {
		_msg = msg;

		if (_jserrorlogRemoteModel != null) {
			try {
				Class<?> clazz = _jserrorlogRemoteModel.getClass();

				Method method = clazz.getMethod("setMsg", String.class);

				method.invoke(_jserrorlogRemoteModel, msg);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUrl() {
		return _url;
	}

	@Override
	public void setUrl(String url) {
		_url = url;

		if (_jserrorlogRemoteModel != null) {
			try {
				Class<?> clazz = _jserrorlogRemoteModel.getClass();

				Method method = clazz.getMethod("setUrl", String.class);

				method.invoke(_jserrorlogRemoteModel, url);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLine() {
		return _line;
	}

	@Override
	public void setLine(String line) {
		_line = line;

		if (_jserrorlogRemoteModel != null) {
			try {
				Class<?> clazz = _jserrorlogRemoteModel.getClass();

				Method method = clazz.getMethod("setLine", String.class);

				method.invoke(_jserrorlogRemoteModel, line);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getjserrorlogRemoteModel() {
		return _jserrorlogRemoteModel;
	}

	public void setjserrorlogRemoteModel(BaseModel<?> jserrorlogRemoteModel) {
		_jserrorlogRemoteModel = jserrorlogRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _jserrorlogRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_jserrorlogRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			jserrorlogLocalServiceUtil.addjserrorlog(this);
		}
		else {
			jserrorlogLocalServiceUtil.updatejserrorlog(this);
		}
	}

	@Override
	public jserrorlog toEscapedModel() {
		return (jserrorlog)ProxyUtil.newProxyInstance(jserrorlog.class.getClassLoader(),
			new Class[] { jserrorlog.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		jserrorlogClp clone = new jserrorlogClp();

		clone.setJserrorlogId(getJserrorlogId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setUserAgent(getUserAgent());
		clone.setLocation(getLocation());
		clone.setMsg(getMsg());
		clone.setUrl(getUrl());
		clone.setLine(getLine());

		return clone;
	}

	@Override
	public int compareTo(jserrorlog jserrorlog) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), jserrorlog.getCreateDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof jserrorlogClp)) {
			return false;
		}

		jserrorlogClp jserrorlog = (jserrorlogClp)obj;

		long primaryKey = jserrorlog.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{jserrorlogId=");
		sb.append(getJserrorlogId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", userAgent=");
		sb.append(getUserAgent());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", msg=");
		sb.append(getMsg());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", line=");
		sb.append(getLine());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("it.baxtheman.stacktracejs.model.jserrorlog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jserrorlogId</column-name><column-value><![CDATA[");
		sb.append(getJserrorlogId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userAgent</column-name><column-value><![CDATA[");
		sb.append(getUserAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>msg</column-name><column-value><![CDATA[");
		sb.append(getMsg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>line</column-name><column-value><![CDATA[");
		sb.append(getLine());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _jserrorlogId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private String _userAgent;
	private String _location;
	private String _msg;
	private String _url;
	private String _line;
	private BaseModel<?> _jserrorlogRemoteModel;
	private Class<?> _clpSerializerClass = it.baxtheman.stacktracejs.service.ClpSerializer.class;
}