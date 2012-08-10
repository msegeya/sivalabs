/**
 * 
 */
package com.sivalabs.administration.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.sivalabs.core.dao.HibernateGenericDAO;
import com.sivalabs.core.domain.Privilege;
import com.sivalabs.core.domain.Role;

/**
 * @author siva
 *
 */
@Repository
public class RoleDAOImpl extends HibernateGenericDAO<Role, Integer>  
		implements RoleDAO 
{
	
	@Override
	public Collection<Privilege> getRolePrivileges(Role role) 
	{
		//Criteria criteria = this.getSession().createCriteria(Role.class);
		//criteria.add(Restrictions.e)
		return role.getPrivileges();
	}

}
