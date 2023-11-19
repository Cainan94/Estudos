package br.com.cod3r.builder.meal.builder;

import br.com.cod3r.builder.meal.model.FastFoodMeal;

public class FastFoodMealBuilder2 {
    private String main;
    private String drink;
    private String side;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder2(){

    }

    public FastFoodMealBuilder2 setMain(String main){
        this.main = main;
        return this;
    }

    public FastFoodMealBuilder2 setDrink(String drink){
        this.drink = drink;
        return this;
    }
    public FastFoodMealBuilder2 setSide(String side){
        this.side = side;
        return this;
    }

    public FastFoodMealBuilder2 setDessert(String dessert){
        this.dessert = dessert;
        return this;
    }
    public FastFoodMealBuilder2 setGift(String gift){
        this.gift = drink;
        return this;
    }

    public FastFoodMeal build(){
        return new FastFoodMeal(drink,main,side,dessert,gift);
    }
}
