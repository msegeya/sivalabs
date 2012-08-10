/**
 * 
 */
package com.sivalabs.mockdata;

import java.util.Date;

import com.sivalabs.core.domain.DomainObject;

/**
 * @author skatam
 *
 */
public class Employee extends DomainObject implements Identifiable<Integer>
{	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String emailId;
	private Date dob;
	
	public Employee()
	{
	}
	public Employee(Integer id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public Employee(Integer id, String name, String emailId, Date dob)
	{
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.dob = dob;
	}
	
	@Override
	public void setId(Integer id)
	{
		this.id = id;
	}

	@Override
	public Integer getId()
	{
		return this.id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public Date getDob()
	{
		return dob;
	}

	public void setDob(Date dob)
	{
		this.dob = dob;
	}

}
