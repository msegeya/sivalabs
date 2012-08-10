/**
 * 
 */
package com.sivalabs.phonebook;

/**
 * @author skatam
 *
 */
public class Contact
{
	private int contactId;
	private int userId;
	private String firstname;
	private String lastname;
	private String emailId;
	private String mobile;
	private String phone;
	public Contact()
	{
	}
	
	public int getContactId()
	{
		return contactId;
	}
	public void setContactId(int contactId)
	{
		this.contactId = contactId;
	}
	public int getUserId()
	{
		return userId;
	}
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	public String getFirstname()
	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	public String getLastname()
	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public String getEmailId()
	{
		return emailId;
	}
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	public String getMobile()
	{
		return mobile;
	}
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
}
