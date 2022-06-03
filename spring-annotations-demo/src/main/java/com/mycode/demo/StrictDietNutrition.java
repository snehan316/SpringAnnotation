package com.mycode.demo;

import org.springframework.stereotype.Component;


@Component
public class StrictDietNutrition implements NutritionService {

	public String getDiet() {
		return "Its Strict Diet this week";
	}

}
