package com.mycode.demo;

public class CricketCoach implements Coach {

	private NutritionService nutritionService;
	
	private String email;
	private String team;
	
	public CricketCoach() {
		
	}
	
	public String getDailyWorkout() {
		return "Practice batting for 30 mins";
	}

	public String getDailtDiet() {
		return nutritionService.getDiet();
	}
	
	public void setNutritionService(NutritionService nutritionService) {
		this.nutritionService = nutritionService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	
}
