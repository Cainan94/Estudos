package br.com.cod3r.builder.meal.builder;

import br.com.cod3r.builder.meal.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
    protected FastFoodMeal meal;

    public FastFoodMealBuilder(){
        meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal(){
        return meal;
    }

    public abstract void buildDrink(String drink);
    public abstract void buildMain(String main);
    public abstract void buildSide(String side);
    public abstract void buildDessert(String dessert);
    public abstract void buildGift(String gift);
	
}
