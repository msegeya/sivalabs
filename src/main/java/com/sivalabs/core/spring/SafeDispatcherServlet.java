/**
 * 
 */
package com.sivalabs.core.spring;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author skatam
 *
 */
public class SafeDispatcherServlet extends DispatcherServlet 
{
	private static final long serialVersionUID = 1L;
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
}
