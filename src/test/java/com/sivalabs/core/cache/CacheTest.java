package com.sivalabs.core.cache;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.sivalabs.core.cache.CacheId;
import com.sivalabs.core.cache.CacheManager;
import com.sivalabs.core.cache.CacheManagerImpl;
import com.sivalabs.core.cache.RolesCache;
import com.sivalabs.core.domain.Role;
import com.sivalabs.test.BaseTest;

public class CacheTest extends BaseTest
{
	CacheManager cacheManager = null;
	@Override
	public void before()
	{
		cacheManager = new CacheManagerImpl();
		super.before();
	}
	@Override
	public void after()
	{
		cacheManager = null;
		super.after();
	}
	
	@Test
	public void testCacheLoading() 
	{
		RolesCache cache = (RolesCache) cacheManager.getCache(CacheId.ROLES_CACHE_ID);
		Assert.assertNotNull(cache);
		List<Role> roles = cache.getCacheData();
		Assert.assertNotNull(roles);
		for (Role role : roles) {
			System.out.println(role);
		}
	}

}
