/**
 * 
 */
package com.sivalabs.core.cache;

import java.util.ArrayList;
import java.util.List;

import com.sivalabs.core.domain.Role;

/**
 * @author siva
 *
 */
public class RolesCache extends Cache<List<Role>> 
{
	@Override
	public List<Role> getCacheData() 
	{
		System.out.println("Loading RolesCache data....");
		List<Role> roles = new ArrayList<Role>();
		roles.add(new Role(1, "Admin", "Administrator"));
		roles.add(new Role(1, "User", "Normal User"));
		System.out.println("Loading RolesCache data completed.");
		return roles;
	}

}
