package Q2_b;

public class Calculation {

	private double ans=1;

	public double getAns() {
		return ans;
	}
	
	public void Factorial(int start,int end) {
		
		for(int i=start; i<=end;i++) {
			ans=ans*i;
		}
	}

	
	
}
 