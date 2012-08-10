/**
 * 
 */
package com.sivalabs.administration;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sivalabs.administration.dao.PrivilegeDAO;
import com.sivalabs.administration.dao.RoleDAO;
import com.sivalabs.administration.dao.UserDAO;
import com.sivalabs.core.domain.Privilege;
import com.sivalabs.core.domain.Role;
import com.sivalabs.core.domain.User;

/**
 * @author skatam
 *
 */
@Service
@Transactional
public class AdminService
{
	private UserDAO userDAO;
	private RoleDAO roleDAO;
	private PrivilegeDAO privilegeDAO;
	
	@Autowired
	public void setUserDAO(UserDAO userDAO)
	{
		this.userDAO = userDAO;
	}
	@Autowired
	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}
	@Autowired
	public void setPrivilegeDAO(PrivilegeDAO privilegeDAO) {
		this.privilegeDAO = privilegeDAO;
	}
	
	public Integer create(User obj)
	{
		return this.userDAO.create(obj);
	}

	public User getUserById(Integer id)
	{
		return this.userDAO.getById(id);
	}

	public Collection<User> getAllUsers()
	{
		return this.userDAO.getAll();
	}

	public void update(User obj)
	{
		this.userDAO.update(obj);
	}

	public void delete(User obj)
	{
		this.userDAO.delete(obj);
	}

	public void deleteById(Integer id)
	{
		this.userDAO.deleteById(id);
	}

	public User login(String userName, String password)
	{
		return this.userDAO.login(userName, password);
	}
	/******************************************************/
	public Integer create(Role obj) {
		return this.roleDAO.create(obj);
	}
	public void update(Role obj) {
		this.roleDAO.update(obj);		
	}
	public void delete(Role obj) {
		this.roleDAO.delete(obj);		
	}
	public Role getRoleById(Integer id)
	{
		return this.roleDAO.getById(id);
	}

	public Collection<Role> getAllRoles()
	{
		return this.roleDAO.getAll();
	}
	/******************************************************/
	public Integer create(Privilege obj) {
		return this.privilegeDAO.create(obj);
	}
	public void update(Privilege obj) {
		this.privilegeDAO.update(obj);
	}
	public void delete(Privilege obj) {
		this.privilegeDAO.delete(obj);	
	}
	public Privilege getPrivilegeById(Integer id)
	{
		return this.privilegeDAO.getById(id);
	}

	public Collection<Privilege> getAllPrivileges()
	{
		return this.privilegeDAO.getAll();
	}

}
