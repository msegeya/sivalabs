/**
 * 
 */
package com.sivalabs.administration.dao;

import org.springframework.stereotype.Repository;

import com.sivalabs.core.dao.HibernateGenericDAO;
import com.sivalabs.core.domain.Privilege;

/**
 * @author siva
 *
 */
@Repository
public class PrivilegeDAOImpl extends HibernateGenericDAO<Privilege, Integer>  
		implements PrivilegeDAO 
{
	
	

}
