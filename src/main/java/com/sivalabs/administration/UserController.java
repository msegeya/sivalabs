package com.sivalabs.administration;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sivalabs.core.domain.User;

@Controller
public class UserController
{
	private static final long serialVersionUID = 1L;
	
	private AdminService adminService;
	
	@Autowired
	public void setAdminService(AdminService adminService)
	{
		this.adminService = adminService;
	}
		
	@RequestMapping(value="/showUsers")
	public ModelAndView showUsers()
	{
		ModelAndView mav = new ModelAndView("showUsers");
		Collection<User> users = this.adminService.getAllUsers();
		mav.getModel().put("USERS_KEY", users);
		return mav;
	}
	
	@RequestMapping(value="/searchUsers")
	public ModelAndView searchUsers()
	{
		ModelAndView mav = new ModelAndView("showUsers");
		Collection<User> users = this.adminService.getAllUsers();
		mav.getModel().put("USERS_KEY", users);
		return mav;
	}
	
	@RequestMapping(value="/createUser", method=RequestMethod.GET)
	public ModelAndView showNewUserForm()
	{
		ModelAndView mav = new ModelAndView("newUser");
		User user = new User();
		mav.getModel().put("newUser", user);
		return mav;
	}
	
	@RequestMapping(value="/createUser", method=RequestMethod.POST)
	public ModelAndView createUser(@ModelAttribute("newUser") User user)
	{
		ModelAndView mav = new ModelAndView("redirect:showUsers.do");
		this.adminService.create(user);
		return mav;
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.GET)
	public ModelAndView editUserForm(@RequestParam("userId") int id)
	{
		ModelAndView mav = new ModelAndView("editUser");
		User user = this.adminService.getUserById(id);
		mav.getModel().put("editUser", user);
		return mav;
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.POST)
	public ModelAndView updateUser(@ModelAttribute("editUser") User user)
	{
		ModelAndView mav = new ModelAndView("redirect:showUsers.do");
		this.adminService.update(user);
		return mav;
	}
	
	@RequestMapping("/deleteUser")
	public ModelAndView deleteUser(@RequestParam("userId") int id)
	{
		ModelAndView mav = new ModelAndView("redirect:showUsers.do");
		User user = new User();
		user.setUserId(id);
		this.adminService.delete(user);
		return mav;
	}
}
