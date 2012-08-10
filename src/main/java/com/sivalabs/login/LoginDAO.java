/**
 * 
 */
package com.sivalabs.login;

import com.sivalabs.core.domain.User;

/**
 * @author skatam
 *
 */
public interface LoginDAO
{
	public User login(String userName, String password);
}
