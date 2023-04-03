package com.spring.beanscope;

public class BaseballCoach implements Coach{
	
	String instruction="Practice batting for 30mins a day";
	
	@Override
	public String getDailyWorkout()
	{
		return instruction;
	}
	
	public void doStart()
	{
		System.out.println("Init method called - started");
	}
	
	public void doStop()
	{
		System.out.println("Destroy method called - stopped");
	}
	

}
