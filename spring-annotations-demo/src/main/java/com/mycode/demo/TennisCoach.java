package com.mycode.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Constructor injection Demo
//Qualifier Annotation Demo

@Component("myTennisCoach")  //default bean id will be the class name with first letter in lowercase - tennisCoach
public class TennisCoach implements Coach {

	
	private NutritionService nutritionService;
	
	//As of Spring Framework 4.3, an @Autowired annotation on a constructor is no longer necessary if the target bean only defines one constructor to begin with. However, if several constructors are available, at least one must be annotated to teach the container which one to use.
	@Autowired  //dependency injection
	public TennisCoach(@Qualifier("dailyNutrition")NutritionService nutritionService) {
		this.nutritionService = nutritionService;
	}
	
	public String getDailyWorkout() {
		return "practice serve for 30 min";
	}

	public String getDailyDeit() {
		return nutritionService.getDiet();
	}

}
