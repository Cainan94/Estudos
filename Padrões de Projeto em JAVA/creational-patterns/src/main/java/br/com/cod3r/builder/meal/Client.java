package br.com.cod3r.builder.meal;

import br.com.cod3r.builder.meal.builder.FastFoodMealBuilder2;
import br.com.cod3r.builder.meal.builder.MealBuilder;
import br.com.cod3r.builder.meal.model.FastFoodMeal;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("=========================");
		MealBuilder mealBuilder = new MealBuilder();
		mealBuilder.buildMain("Macarrão");
		mealBuilder.buildDrink("Coca");
		mealBuilder.buildGift("Impostos para pagar");

		System.out.println(mealBuilder.getMeal().toString());

		System.out.println("=========================");
		 FastFoodMeal meal = new FastFoodMealBuilder2().setMain("Lasanha").setSide("Arroz").setDessert("Sorvete").setDrink("Limonada").setGift("Impostos para pagar").build();
		System.out.println(meal.toString()		);

	}
}