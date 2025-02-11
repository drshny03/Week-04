package com.tit.day01.generics.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

class MealPlanGenerator<T extends MealPlan> {
    private List<Meal<T>> meals = new ArrayList<>();

    public void addMeal(Meal<T> meal) {
        meals.add(meal);
    }

    public List<Meal<T>> getMeals() {
        return meals;
    }

    public static <T extends MealPlan> void generateMealPlan(MealPlanGenerator<T> mealPlan) {
        System.out.println("Generated Meal Plan:");
        for (Meal<T> meal : mealPlan.getMeals()) {
            System.out.println(meal);
        }
    }
}
