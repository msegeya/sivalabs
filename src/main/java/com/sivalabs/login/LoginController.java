/**
 * 
 */
package com.sivalabs.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sivalabs.appcontext.UserContext;
import com.sivalabs.appcontext.UserSessionHolder;
import com.sivalabs.core.domain.User;

/**
 * @author skatam
 *
 */
@Controller
public class LoginController
{
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(LoginController.class);
	
	private LoginService loginService;
	
	@Autowired
	public void setLoginService(LoginService loginService)
	{
		this.loginService = loginService;
	}
		
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView showLoginForm()
	{
		ModelAndView mav = new ModelAndView("login");
		User loginBean = new User();
		mav.getModel().put("login", loginBean);
		//mav.getModelMap().put("login", loginBean);
		return mav;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("login") User loginBean,
							HttpServletRequest request, 
							HttpServletResponse response) 
				
	{
		ModelAndView mav = new ModelAndView();
		String view = "login";
		String userName = loginBean.getUserName();
		String password = loginBean.getPassword();
		
		User user = loginService.login(userName, password);
		if(user != null)
		{
			logger.debug("User authenticated successfully");
			UserContext userContext = new UserContext();
			userContext.setLoggedinUser(user);
			UserSessionHolder.setUserContext(request.getSession(), userContext );
			view = "redirect:showUsers.do";
		} else {
			logger.error("User authentication failed");
			request.setAttribute("ERROR", "Invalid Username and Password");
		}
		mav.setViewName(view);
		return mav;
	}
}
