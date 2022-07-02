package Q4_a;

public class MainApp {

	public static void main(String[] args) {
		
		CreditCard c1 = CreditCard.getInstance();
		CreditCard c2 = CreditCard.getInstance();
		
		System.out.println(""+c1.validate("3575930278094321",6));
		System.out.println(""+c2.validate("5477987909",6));
		
		System.out.println(""+c1.equals(c2));
	}
}
