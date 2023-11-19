package br.com.cod3r.builder.meal.builder;

public class MealBuilder extends FastFoodMealBuilder{

    @Override
    public void buildDrink(String drink) {
        meal.setDrink(drink);
    }

    @Override
    public void buildMain(String main) {
        meal.setMain(main);
    }

    @Override
    public void buildSide(String side) {
        meal.setSide(side);
    }

    @Override
    public void buildDessert(String dessert) {
    meal.setDessert(dessert);
    }

    @Override
    public void buildGift(String gift) {
        meal.setToy(gift);
    }
}
