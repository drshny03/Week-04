package com.tit.day01.generics.mealplangenerator;

class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public String toString() {
        return mealName + " (" + getMealType() + ")";
    }
}
