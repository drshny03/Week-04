package com.tit.day01.generics.mealplangenerator;

class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealType() {
        return "High-Protein";
    }

    @Override
    public String toString() {
        return mealName + " (" + getMealType() + ")";
    }
}
