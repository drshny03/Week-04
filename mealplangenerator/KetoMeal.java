package com.tit.day01.generics.mealplangenerator;

class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public String toString() {
        return mealName + " (" + getMealType() + ")";
    }
}
