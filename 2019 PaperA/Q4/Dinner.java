package Q4;

public class Dinner extends Meal{

	public Dinner() {
		System.out.println("Preparing Dinner...");
	}
	public void displayMeal() {
		mealWithFlavour();
        mealInDuration();
        displayCost();
	}
	
	
	public void displayCost() {
		System.out.println("Cost for meal is = "+prepdelicious.getCost());
	}
}
