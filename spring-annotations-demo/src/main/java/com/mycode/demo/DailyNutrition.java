package com.mycode.demo;

import org.springframework.stereotype.Component;

@Component
public class DailyNutrition implements NutritionService {

	public String getDiet() {
		
		return "Follow your daily diet";
	}

}
