package com.sivalabs.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sivalabs.core.domain.User;

/**
 * @author skatam
 *
 */
@Service
@Transactional
public class LoginService
{
	private LoginDAO loginDAO;
	@Autowired
	public void setLoginDAO(LoginDAO loginDAO)
	{
		this.loginDAO = loginDAO;
	}
	
	public User login(String userName, String password)
	{
		return this.loginDAO.login(userName, password);
	}
}
