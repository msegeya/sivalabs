/**
 * 
 */
package com.sivalabs.login;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sivalabs.core.dao.HibernateDAO;
import com.sivalabs.core.domain.User;

/**
 * @author skatam
 *
 */
@Repository
public class LoginDAOImpl extends HibernateDAO implements LoginDAO
{
	@SuppressWarnings("unchecked")
	@Override
	public User login(String userName, String password)
	{
		Criteria criteria = this.getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", userName));
		criteria.add(Restrictions.eq("password", password));
		List<User> list = criteria.list();
		if (list!=null && list.size() > 0 ){			
			return list.get(0);
		}
		return null;
	}
}
