package com.mycode.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Field Injection Demo
//Injecting propertied from property file demo 


@Component //default bean id will be the class name with first letter in lowercase - footballCoach
public class FootballCoach implements Coach {

	@Autowired
	@Qualifier("dailyNutrition")
	private NutritionService nutritionService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
		
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public String getDailyWorkout() {
		return "Practice GoalKeeping";
	}

	public String getDailyDeit() {
		return "follow Strict Diet";
	}

}
