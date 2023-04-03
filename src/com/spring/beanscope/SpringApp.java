package com.spring.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	
	public static void main(String[] args) {
		 
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach c=context.getBean("baseballcoach",Coach.class);
		
		Coach c1=context.getBean("baseballcoach",Coach.class);
		
		Boolean b=c1==c;
		
		System.out.println("\nFirst Instace "+c);
		
		System.out.println("\nSecond Instace "+c1);
		
		System.out.println("\nResult "+b);
		
		context.close();
	}

}
