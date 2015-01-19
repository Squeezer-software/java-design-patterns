package com.squeezer.designpatterns.builder;

public class MealBuilder2 {
    private Meal meal = new Meal();

    public MealBuilder2 setBurger(Burger burger) {

        meal.addItem(burger);
        return this;
    }

    public MealBuilder2 setDrink(ColdDrink drink) {

        meal.addItem(drink);
        return this;
    }

    public Meal create() {

        return meal;
    }
}