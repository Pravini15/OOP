package Q1c;

public class Calculation {

	private int total=0;
	
	public void sum(int start,int end) {
		
		for(int i=start; i<=end; i++) {
			this.total=this.total+i;
		}
	
	}
	
	public int getTotal() {
		
		return total;
	}
}
