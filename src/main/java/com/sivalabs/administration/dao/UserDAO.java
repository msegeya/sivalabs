/**
 * 
 */
package com.sivalabs.administration.dao;

import java.util.Collection;

import com.sivalabs.core.dao.GenericDAO;
import com.sivalabs.core.domain.User;

/**
 * @author skatam
 *
 */
public interface UserDAO extends GenericDAO<User, Integer>
{
	Collection<User> searchUsers(String name);
}
