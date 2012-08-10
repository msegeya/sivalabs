/**
 * 
 */
package com.sivalabs.phonebook;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.criterion.Junction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sivalabs.core.dao.HibernateGenericDAO;

/**
 * @author skatam
 *
 */
@Repository
public class PhoneBookDAOImpl extends HibernateGenericDAO<Contact, Integer> implements PhoneBookDAO
{

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Contact> searchUserContacts(int userId, String name)
	{
		Criteria criteria = this.getSession().createCriteria(Contact.class);
		criteria.add(Restrictions.eq("userId", userId));
		Junction condition = Restrictions.disjunction().
					add(Restrictions.ilike("firstName", "%"+name+"%")).
					add(Restrictions.ilike("lastName", "%"+name+"%"));
			
		criteria.add(condition);		
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Contact> getAllUserContacts(int userId)
	{
		Criteria criteria = this.getSession().createCriteria(Contact.class);
		criteria.add(Restrictions.eq("userId", userId));
		return criteria.list();
	}

}
