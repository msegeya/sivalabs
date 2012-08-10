/**
 * 
 */
package com.sivalabs.phonebook;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author skatam
 *
 */
@Service
@Transactional
public class PhoneBookService
{
	private PhoneBookDAO phoneBookDAO;
	@Autowired
	public void setPhoneBookDAO(PhoneBookDAO phoneBookDAO)
	{
		this.phoneBookDAO = phoneBookDAO;
	}
	
	public Integer create(Contact obj)
	{
		return this.phoneBookDAO.create(obj);
	}

	
	public Contact getById(Integer id)
	{
		return this.phoneBookDAO.getById(id);
	}

	
	public Collection<Contact> getAll()
	{
		return this.phoneBookDAO.getAll();
	}

	
	public void update(Contact obj)
	{
		this.phoneBookDAO.update(obj);		
	}
	
	public void delete(Contact obj)
	{
		this.phoneBookDAO.delete(obj);		
	}

	
	public void deleteById(Integer id)
	{
		this.phoneBookDAO.deleteById(id);		
	}

	public Collection<Contact> getAllUserContacts(int userId)
	{		
		return this.phoneBookDAO.getAllUserContacts(userId);
	}

	public Collection<Contact> searchUserContacts(int userId, String name)
	{
		return this.phoneBookDAO.searchUserContacts(userId, name);
	}

}
