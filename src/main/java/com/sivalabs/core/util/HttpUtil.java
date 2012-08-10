/**
 * 
 */
package com.sivalabs.core.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author skatam
 *
 */
public class HttpUtil
{
	public static Object getRequestScopedAttributeValue(HttpServletRequest request, String attributeName)
	{
		return request.getAttribute(attributeName);
	}
	
	public static Object getSessionScopedAttributeValue(HttpServletRequest request, String attributeName)
	{
		return request.getSession().getAttribute(attributeName);
	}
	
	public static Object getSessionScopedAttributeValue(HttpSession session, String attributeName)
	{
		return session.getAttribute(attributeName);
	}
	
	public static void setSessionScopedAttributeValue(HttpServletRequest request, String attributeName, Object value)
	{
		request.getSession().setAttribute(attributeName, value);
	}
	
	public static void setSessionScopedAttributeValue(HttpSession session, String attributeName, Object value)
	{
		session.setAttribute(attributeName, value);
	}
}
