package generics.mealplanner;

class VeganMeal implements MealPlan {
    @Override
    public String getDescription() {
        return "Vegan Meal: Excludes all animal products.";
    }
}
