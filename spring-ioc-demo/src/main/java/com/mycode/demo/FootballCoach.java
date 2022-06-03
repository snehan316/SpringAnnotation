package com.mycode.demo;

public class FootballCoach implements Coach {

	//dependency
	private NutritionService nutritinService;
	
	//constructor for dependency injection
	public FootballCoach(NutritionService nutritinService) {
		this.nutritinService = nutritinService;
	}
	
	public String getDailyWorkout() {
		return "Practice GoalKeeping";
	}

	public String getDailtDiet() {
		return nutritinService.getDiet();
	}

}
