<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<portlet:actionURL var="logURL" name="log">
</portlet:actionURL>

<aui:script use="aui-io-request">

window.onerror = function(errorMessage, errorUrl, errorLine) {

	A.io.request(
	'<%= logURL.toString() %>',
	{
		method: 'POST',
		data : {
			<portlet:namespace/>userAgent : navigator.userAgent,
			<portlet:namespace/>location : window.location.href,
			<portlet:namespace/>msg : errorMessage,
			<portlet:namespace/>url : errorUrl,
			<portlet:namespace/>line : errorLine
		}
	});

	// Prevent firing of default error handler.
	//return true;
}

</aui:script>
