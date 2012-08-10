/**
 * 
 */
package com.sivalabs.phonebook;

import java.util.Collection;

import com.sivalabs.core.dao.GenericDAO;

/**
 * @author skatam
 *
 */
public interface PhoneBookDAO extends GenericDAO<Contact, Integer>
{

	Collection<Contact> searchUserContacts(int userId, String name);

	Collection<Contact> getAllUserContacts(int userId);

}
