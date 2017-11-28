package com.ehsan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		Coach myCoach = context.getBean("myCoach",Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		context.close();

	}

}
