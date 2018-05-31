
package it.baxtheman.stacktracejs.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import it.baxtheman.stacktracejs.service.jserrorlogLocalServiceUtil;

public class StackTracePortlet extends MVCPortlet {

	private static final Log logger =
		LogFactoryUtil.getLog(StackTracePortlet.class);

	public void log(ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortalException, SystemException {

		ThemeDisplay themeDisplay =
			(ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		String location = ParamUtil.getString(actionRequest, "location");
		String msg = ParamUtil.getString(actionRequest, "msg");
		String url = ParamUtil.getString(actionRequest, "url");
		String line = ParamUtil.getString(actionRequest, "line");

		jserrorlogLocalServiceUtil.addjserrorlog(
			themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), location,
			msg, url, line);
	}
}
