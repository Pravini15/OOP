package Q4;

public class Lunch extends Meal{

	public Lunch() {
		System.out.println("Preparing Lunch...");
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
