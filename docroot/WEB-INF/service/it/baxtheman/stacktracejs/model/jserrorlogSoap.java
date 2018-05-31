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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link it.baxtheman.stacktracejs.service.http.jserrorlogServiceSoap}.
 *
 * @author @baxtheman
 * @see it.baxtheman.stacktracejs.service.http.jserrorlogServiceSoap
 * @generated
 */
public class jserrorlogSoap implements Serializable {
	public static jserrorlogSoap toSoapModel(jserrorlog model) {
		jserrorlogSoap soapModel = new jserrorlogSoap();

		soapModel.setJserrorlogId(model.getJserrorlogId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setLocation(model.getLocation());
		soapModel.setMsg(model.getMsg());
		soapModel.setUrl(model.getUrl());
		soapModel.setLine(model.getLine());

		return soapModel;
	}

	public static jserrorlogSoap[] toSoapModels(jserrorlog[] models) {
		jserrorlogSoap[] soapModels = new jserrorlogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static jserrorlogSoap[][] toSoapModels(jserrorlog[][] models) {
		jserrorlogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new jserrorlogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new jserrorlogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static jserrorlogSoap[] toSoapModels(List<jserrorlog> models) {
		List<jserrorlogSoap> soapModels = new ArrayList<jserrorlogSoap>(models.size());

		for (jserrorlog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new jserrorlogSoap[soapModels.size()]);
	}

	public jserrorlogSoap() {
	}

	public long getPrimaryKey() {
		return _jserrorlogId;
	}

	public void setPrimaryKey(long pk) {
		setJserrorlogId(pk);
	}

	public long getJserrorlogId() {
		return _jserrorlogId;
	}

	public void setJserrorlogId(long jserrorlogId) {
		_jserrorlogId = jserrorlogId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getMsg() {
		return _msg;
	}

	public void setMsg(String msg) {
		_msg = msg;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getLine() {
		return _line;
	}

	public void setLine(String line) {
		_line = line;
	}

	private long _jserrorlogId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private String _location;
	private String _msg;
	private String _url;
	private String _line;
}