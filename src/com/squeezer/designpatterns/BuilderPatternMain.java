package com.squeezer.designpatterns;

import com.squeezer.designpatterns.builder.Apla;
import com.squeezer.designpatterns.builder.CheeseBurger;
import com.squeezer.designpatterns.builder.Meal;
import com.squeezer.designpatterns.builder.MealBuilder;
import com.squeezer.designpatterns.builder.MealBuilder2;

public class BuilderPatternMain {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal1 = mealBuilder.prepareMeal1();
        System.out.println("Meal 1");
        meal1.showItems();
        System.out.println("Total Cost: " + meal1.getCost());

        Meal meal2 = mealBuilder.prepareMeal2();
        System.out.println("\n\nMeal2");
        meal2.showItems();
        System.out.println("Total Cost: " + meal2.getCost());

        // New Builder way
        MealBuilder2 mealBuilder2 = new MealBuilder2();

        Meal meal21 = mealBuilder2.setBurger(new CheeseBurger())
                .setDrink(new Apla()).create();

        System.out.println("Meal 21");
        meal21.showItems();
        System.out.println("Total Cost: " + meal21.getCost());

    }
}