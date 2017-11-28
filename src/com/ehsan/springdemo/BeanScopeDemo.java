package com.ehsan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach myCoach = context.getBean("myCoach",Coach.class);
		Coach myCoach2 = context.getBean("myCoach",Coach.class);
		System.out.println("result is : "+(myCoach == myCoach2));
		System.out.println("My Coach : " +myCoach);
		System.out.println("My Coach2 : " +myCoach2);
		context.close();
	}

}
