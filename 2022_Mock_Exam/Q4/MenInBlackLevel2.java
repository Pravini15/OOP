package Q4;

public class MenInBlackLevel2 extends MenInBlack{

	public MenInBlackLevel2(AlienPack alienpack) {
		
		super(alienpack);
		
	}

	public void kill() {
		
		int random;
		
		for(Alien alien : alienpack.getAlien()) {
			
			score += alien.getScore();
			random = (int)(Math.random()*10);
			if(random%2 == 1) {
				
				score -= 2;
			}
			
		}
	}
	 
}
