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

package it.baxtheman.stacktracejs.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import it.baxtheman.stacktracejs.model.jserrorlog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing jserrorlog in entity cache.
 *
 * @author @baxtheman
 * @see jserrorlog
 * @generated
 */
public class jserrorlogCacheModel implements CacheModel<jserrorlog>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{jserrorlogId=");
		sb.append(jserrorlogId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", location=");
		sb.append(location);
		sb.append(", msg=");
		sb.append(msg);
		sb.append(", url=");
		sb.append(url);
		sb.append(", line=");
		sb.append(line);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public jserrorlog toEntityModel() {
		jserrorlogImpl jserrorlogImpl = new jserrorlogImpl();

		jserrorlogImpl.setJserrorlogId(jserrorlogId);
		jserrorlogImpl.setGroupId(groupId);
		jserrorlogImpl.setCompanyId(companyId);
		jserrorlogImpl.setUserId(userId);

		if (userName == null) {
			jserrorlogImpl.setUserName(StringPool.BLANK);
		}
		else {
			jserrorlogImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jserrorlogImpl.setCreateDate(null);
		}
		else {
			jserrorlogImpl.setCreateDate(new Date(createDate));
		}

		if (location == null) {
			jserrorlogImpl.setLocation(StringPool.BLANK);
		}
		else {
			jserrorlogImpl.setLocation(location);
		}

		if (msg == null) {
			jserrorlogImpl.setMsg(StringPool.BLANK);
		}
		else {
			jserrorlogImpl.setMsg(msg);
		}

		if (url == null) {
			jserrorlogImpl.setUrl(StringPool.BLANK);
		}
		else {
			jserrorlogImpl.setUrl(url);
		}

		if (line == null) {
			jserrorlogImpl.setLine(StringPool.BLANK);
		}
		else {
			jserrorlogImpl.setLine(line);
		}

		jserrorlogImpl.resetOriginalValues();

		return jserrorlogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jserrorlogId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		location = objectInput.readUTF();
		msg = objectInput.readUTF();
		url = objectInput.readUTF();
		line = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(jserrorlogId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (msg == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(msg);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		if (line == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(line);
		}
	}

	public long jserrorlogId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public String location;
	public String msg;
	public String url;
	public String line;
}