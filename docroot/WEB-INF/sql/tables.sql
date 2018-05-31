create table baxtheman_jserrorlog (
	jserrorlogId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	location VARCHAR(2000) null,
	msg VARCHAR(2000) null,
	url VARCHAR(2000) null,
	line VARCHAR(75) null
);

create table stacktracejs_jserrorlog (
	jserrorlogId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	userAgent VARCHAR(150) null,
	location VARCHAR(2000) null,
	msg VARCHAR(2000) null,
	url VARCHAR(2000) null,
	line VARCHAR(75) null
);