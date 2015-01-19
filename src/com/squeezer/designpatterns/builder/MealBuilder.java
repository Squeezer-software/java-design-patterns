package com.squeezer.designpatterns.builder;

public class MealBuilder {

    public Meal prepareMeal1() {
        Meal meal = new Meal();
        meal.addItem(new CheeseBurger());
        meal.addItem(new Apla());
        return meal;
    }

    public Meal prepareMeal2() {
        Meal meal = new Meal();
        meal.addItem(new DoubleBurger());
        meal.addItem(new Boga());
        return meal;
    }
}