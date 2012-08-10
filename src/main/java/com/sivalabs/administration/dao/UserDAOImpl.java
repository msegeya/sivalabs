/**
 * 
 */
package com.sivalabs.administration.dao;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sivalabs.core.dao.HibernateGenericDAO;
import com.sivalabs.core.domain.User;

/**
 * @author skatam
 *
 */
@Repository
public class UserDAOImpl extends HibernateGenericDAO<User, Integer> 
						 implements UserDAO
{

	@SuppressWarnings("unchecked")
	@Override
	public Collection<User> searchUsers(String name)
	{
		Criteria criteria = this.getSession().createCriteria(User.class);
		criteria.add(Restrictions.ilike("firstName", name));
		criteria.add(Restrictions.ilike("lastName", name));
		return criteria.list();
	}

}
