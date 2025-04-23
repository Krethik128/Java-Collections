package generics.mealplanner;

class PersonalizedMealPlanGenerator {
    public static <T extends MealPlan> Meal<T> validateAndGenerate(String preference) {
        if (preference.equalsIgnoreCase("Vegetarian")) {
            return new Meal<>((T) new VegetarianMeal());
        } else if (preference.equalsIgnoreCase("Vegan")) {
            return new Meal<>((T) new VeganMeal());
        } else if (preference.equalsIgnoreCase("Keto")) {
            return new Meal<>((T) new KetoMeal());
        } else if (preference.equalsIgnoreCase("High-Protein")) {
            return new Meal<>((T) new HighProteinMeal());
        } else {
            System.out.println("Invalid preference. Generating default Vegetarian plan.");
            return new Meal<>((T) new VegetarianMeal());
        }
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianPlan = validateAndGenerate("Vegetarian");
        System.out.println(vegetarianPlan.generatePlan());

        Meal<VeganMeal> veganPlan = validateAndGenerate("Vegan");
        System.out.println(veganPlan.generatePlan());

        Meal<KetoMeal> ketoPlan = validateAndGenerate("Keto");
        System.out.println(ketoPlan.generatePlan());

        Meal<HighProteinMeal> highProteinPlan = validateAndGenerate("High-Protein");
        System.out.println(highProteinPlan.generatePlan());

        Meal<? extends MealPlan> defaultPlan = validateAndGenerate("Invalid");
        System.out.println(defaultPlan.generatePlan());
    }
}
