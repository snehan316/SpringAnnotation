package com.mycode.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myTennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyDeit());
		
		System.out.println("---------------------------------");
		
		Coach myCoach = context.getBean("myCricketCoach", Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyDeit());
		
		System.out.println("---------------------------------");
		
		FootballCoach fooCoach = context.getBean("footballCoach", FootballCoach.class);
		System.out.println(fooCoach.getDailyWorkout());
		System.out.println(fooCoach.getDailyDeit());
		System.out.println(fooCoach.getEmail());
		System.out.println(fooCoach.getTeam());
	}

}
