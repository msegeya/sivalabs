/**
 * 
 */
package com.sivalabs.appcontext;

import com.sivalabs.core.domain.User;

/**
 * @author skatam
 *
 */
public class UserContext
{
	private User loggedinUser;

	public User getLoggedinUser()
	{
		return loggedinUser;
	}

	public void setLoggedinUser(User loggedinUser)
	{
		this.loggedinUser = loggedinUser;
	}
	
}
