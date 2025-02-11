package com.tit.day01.generics.mealplangenerator;

import static com.tit.day01.generics.mealplangenerator.MealPlanGenerator.generateMealPlan;

public class MealPlannerMain {


    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal1 = new Meal<>(new VegetarianMeal("Grilled Paneer Salad"));
        Meal<VeganMeal> veganMeal1 = new Meal<>(new VeganMeal("Tofu Stir Fry"));
        Meal<KetoMeal> ketoMeal1 = new Meal<>(new KetoMeal("Avocado and Egg Bowl"));
        Meal<HighProteinMeal> proteinMeal1 = new Meal<>(new HighProteinMeal("Grilled Chicken with Broccoli"));

        MealPlanGenerator<VegetarianMeal> vegPlan = new MealPlanGenerator<>();
        vegPlan.addMeal(vegMeal1);

        MealPlanGenerator<VeganMeal> veganPlan = new MealPlanGenerator<>();
        veganPlan.addMeal(veganMeal1);

        MealPlanGenerator<KetoMeal> ketoPlan = new MealPlanGenerator<>();
        ketoPlan.addMeal(ketoMeal1);

        MealPlanGenerator<HighProteinMeal> proteinPlan = new MealPlanGenerator<>();
        proteinPlan.addMeal(proteinMeal1);

        // Display Meal Plans
        System.out.println("Vegetarian Meal Plan:");
        generateMealPlan(vegPlan);

        System.out.println("\nVegan Meal Plan:");
        generateMealPlan(veganPlan);

        System.out.println("\nKeto Meal Plan:");
        generateMealPlan(ketoPlan);

        System.out.println("\nHigh-Protein Meal Plan:");
        generateMealPlan(proteinPlan);
    }
}
