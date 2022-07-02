package Q4;

public class Breakfast extends Meal{

	public Breakfast() {
		System.out.println("Preparing Breakfast...");
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
