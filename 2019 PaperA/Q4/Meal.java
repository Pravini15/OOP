package Q4;

public abstract class Meal {

	IPrepareQuickly prepquick;
	IPrepareDeliciously prepdelicious;
	
	public void setFlavour(IPrepareDeliciously prepdelicious) {
		this.prepdelicious = prepdelicious;
	}
	
	public void setDuration(IPrepareQuickly prepquick) {
		this.prepquick = prepquick;
	}
	
	public void mealWithFlavour() {
	    prepdelicious.addFlavour();
	}
	
	public void mealInDuration() {
		prepquick.deliveryTime();
	}
	
	public abstract void displayMeal();
	
	public abstract void displayCost();
}
