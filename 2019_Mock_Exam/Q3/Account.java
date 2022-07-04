package Q3;


	public class Account {
	    int accountNo;
	    double balance;

	    public Account(int accountNo) {
	        this.accountNo = accountNo;
	    }

	    public int getAccountNo() {
	        return accountNo;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount){
	        balance += amount;
	    }

	    public void withdraw(double amount) throws InsuffientBalanceException {
	        balance -= amount;

	        if(balance < 0){
	            balance +=amount;
	            throw new InsuffientBalanceException(balance);
	        }
	    }
}
