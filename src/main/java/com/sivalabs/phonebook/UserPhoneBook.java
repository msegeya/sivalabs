/**
 * 
 */
package com.sivalabs.phonebook;

import java.util.ArrayList;
import java.util.List;

import com.sivalabs.core.domain.User;

/**
 * @author skatam
 *
 */
public class UserPhoneBook
{
	private User user;
	private List<Contact> contacts = new ArrayList<Contact>();
	public User getUser()
	{
		return user;
	}
	public void setUser(User user)
	{
		this.user = user;
	}
	public List<Contact> getContacts()
	{
		return contacts;
	}
	public void setContacts(List<Contact> contacts)
	{
		this.contacts = contacts;
	}
	
}
