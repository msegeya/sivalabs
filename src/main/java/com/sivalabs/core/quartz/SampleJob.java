/**
 * 
 */
package com.sivalabs.core.quartz;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author siva
 *
 */
public class SampleJob extends QuartzJobBean
{

	@Override
	protected void executeInternal(JobExecutionContext jec)
			throws JobExecutionException {
			System.out.println("SampleJob : "+new Date());
	}

}
