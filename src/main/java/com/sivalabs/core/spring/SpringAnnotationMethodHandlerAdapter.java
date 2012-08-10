/**
 * 
 */
package com.sivalabs.core.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

/**
 * @author skatam
 *
 */
public class SpringAnnotationMethodHandlerAdapter extends AnnotationMethodHandlerAdapter
{
	@Override
	public ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception
	{
		System.out.println("*******handle(req,resp,obj)*************");
		System.out.println("HandlerClass == "+handler.getClass());
		return super.handle(request, response, handler);
	}
	
}
