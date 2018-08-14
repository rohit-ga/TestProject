package com.websystique.spring.scheduling;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;


public class MyBean {

//	@Value("#{@getSchedules.getData()}")
//	private String spelWithDefaultValue;
	
//	@Value("#{T(java.lang.System).getProperty('cronjob')}")
//	private String spelWithDefaultValue;
	
	@Scheduled(cron="${cron.schedule}")
	public void printMessage() {
		System.out.println("I am called by Spring scheduler: "+ new Date());
	}
}
