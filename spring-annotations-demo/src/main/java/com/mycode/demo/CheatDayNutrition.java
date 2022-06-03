package com.mycode.demo;

import org.springframework.stereotype.Component;

@Component
public class CheatDayNutrition implements NutritionService {

	public String getDiet() {
		
		return "Enjoy, today is a cheat day";
	}

}
