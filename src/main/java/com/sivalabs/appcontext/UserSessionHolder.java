/**
 * 
 */
package com.sivalabs.appcontext;

import javax.servlet.http.HttpSession;

import com.sivalabs.core.util.HttpUtil;

/**
 * @author skatam
 *
 */
public class UserSessionHolder
{
	public static void setUserContext(HttpSession session, UserContext userContext)
	{
		HttpUtil.setSessionScopedAttributeValue(session, "LOGGEDIN_USER_CONTEXT", userContext);
	}
	
	public static UserContext getUserContext(HttpSession session)
	{
		return (UserContext) HttpUtil.getSessionScopedAttributeValue(session, "LOGGEDIN_USER_CONTEXT");
	}
}
