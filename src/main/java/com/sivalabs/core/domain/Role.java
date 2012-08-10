/**
 * 
 */
package com.sivalabs.core.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author skatam
 *
 */
@Entity
@Table(name="roles_master")
public class Role extends DomainObject
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	
	@Transient
	private Set<Privilege> privileges = new HashSet<Privilege>();
	
	public Role()
	{
	}
	
	public Role(int id, String name, String description)
	{
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}

	public Set<Privilege> getPrivileges()
	{
		return privileges;
	}
	public void addPrivilege(Privilege privilege)
	{
		this.privileges.add(privilege);
	}
	public void addPrivileges(Collection<Privilege> privileges)
	{
		this.privileges.addAll(privileges);
	}
	
}
