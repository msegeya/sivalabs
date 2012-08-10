/**
 * 
 */
package com.sivalabs.administration.dao;

import java.util.Collection;

import com.sivalabs.core.dao.GenericDAO;
import com.sivalabs.core.domain.Privilege;
import com.sivalabs.core.domain.Role;

/**
 * @author siva
 *
 */
public interface RoleDAO extends GenericDAO<Role, Integer>
{
	public Collection<Privilege> getRolePrivileges(Role role);
}
