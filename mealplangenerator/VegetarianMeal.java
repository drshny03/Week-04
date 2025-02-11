package com.tit.day01.generics.mealplangenerator;

class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public String toString() {
        return mealName + " (" + getMealType() + ")";
    }
}
