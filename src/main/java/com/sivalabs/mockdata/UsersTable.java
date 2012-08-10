/**
 * 
 */
package com.sivalabs.mockdata;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.sivalabs.core.domain.User;

/**
 * @author skatam
 *
 */
public class UsersTable
{
	private static final Map<Integer, User> USERS_TABLE = new HashMap<Integer, User>();
	static
	{
		User admin = new User();
		admin.setUserId(1);
		admin.setUserName("admin");
		admin.setPassword("admin");
		admin.setFirstName("Administrator");
		
		User guest = new User();
		guest.setUserId(2);
		guest.setUserName("guest");
		guest.setPassword("guest");
		guest.setFirstName("Guest");
		
		
		USERS_TABLE.put(1, admin);
		USERS_TABLE.put(2, guest);
	}
	private UsersTable()
	{
	}
	public static Integer create(User user)
	{
		int id = getMaxUserId();
		user.setUserId(id);
		USERS_TABLE.put(id, user);
		return id;
	}
	public static User getUserById(int id)
	{
		return USERS_TABLE.get(id);
	}
	public static Collection<User> getUsers()
	{
		return USERS_TABLE.values();
	}
	public static void update(User user)
	{
		if(user==null || !USERS_TABLE.containsKey(user.getUserId())){
			throw new RuntimeException("User is null or UserId not found");
		}
		USERS_TABLE.put(user.getUserId(), user);
	}
	public static void delete(User user)
	{
		if(user==null){
			throw new RuntimeException("User is null or UserId not found");
		}
		if(!USERS_TABLE.containsKey(user.getUserId())){
			System.out.println("There is no User with Id "+ user.getUserId());
		} else{
			USERS_TABLE.remove(user.getUserId());
		}
	}
	
	public static User login(String userId, String password)
	{
		Collection<User> values = USERS_TABLE.values();
		for (User user : values) 
		{
			if(userId.equals(user.getUserName()) && password.equals(user.getPassword())){
				return user;
			}
		}
		return null;
	}
	private static int getMaxUserId(){
		int maxId = 1;
		Set<Integer> ids = USERS_TABLE.keySet();
		for (Integer id : ids) {
			if(id > maxId){
				maxId = id;
			}
		}
		return maxId;
	}
}
