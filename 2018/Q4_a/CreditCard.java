package Q4_a;

public class CreditCard {
	
    private static CreditCard uniqueinstance;
    
    private CreditCard() {}
    
    public static synchronized CreditCard getInstance() {
    	
    	if(uniqueinstance==null){
    		uniqueinstance=new CreditCard();
    	}
    	return uniqueinstance;
    }
    
    public boolean validate (String cardno, int code) {
    	
    	if(cardno.length()==16 && code%3==0) {
    		return true;
    	}
    	return false;
    }
	
}
