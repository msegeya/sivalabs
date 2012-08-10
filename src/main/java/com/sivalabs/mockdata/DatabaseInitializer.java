/**
 * 
 */
package com.sivalabs.mockdata;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sivalabs.administration.AdminService;
import com.sivalabs.core.domain.User;

/**
 * @author skatam
 *
 */
@Component
public class DatabaseInitializer
{
	public DatabaseInitializer()
	{
	}
	private boolean initialize = false;
	public void setInitialize(boolean initialize) {
		this.initialize = initialize;
	}
	private AdminService adminService;
	
	@Autowired
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	@PostConstruct
	public void init()
	{
		if(!initialize){
			return;
		}
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
		
		try {
			System.out.println("******** Inserting Sample Users Data **************");
			this.adminService.create(admin);
			this.adminService.create(guest);
			System.out.println("**************************************************");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
