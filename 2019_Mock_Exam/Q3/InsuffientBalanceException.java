package Q3;

public class InsuffientBalanceException extends Exception{

	private double amount;

    public InsuffientBalanceException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    
}
