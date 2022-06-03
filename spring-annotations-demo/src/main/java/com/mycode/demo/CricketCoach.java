package com.mycode.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// Setter Injection Demo


@Component("myCricketCoach")
public class CricketCoach implements Coach {

	private NutritionService nutritionService;
	
	public String getDailyWorkout() {
		return "Practice batting for 30 mins";
	}

	public String getDailyDeit() {
		return "Follow daily diet";
	}

	@Autowired
	@Qualifier("strictDietNutrition")
	public void setNutritionService(NutritionService nutritionService) {
		this.nutritionService = nutritionService;
	}
	
	//Method Injection - can use @Autowired on any method for dependency injection
	/*	@Autowired
	public void doSomeCrazyStuff(NutritionService nutritionService) {
		this.nutritionService = nutritionService;
	} */
	
	

}
