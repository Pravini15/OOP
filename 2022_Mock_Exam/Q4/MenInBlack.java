package Q4;

public class MenInBlack {

	int score;
	
	AlienPack alienpack;

	public MenInBlack(AlienPack alienpack) {
	
		this.score = 0;
		this.alienpack = alienpack;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public AlienPack getAlienpack() {
		return alienpack;
	}

	public void setAlienpack(AlienPack alienpack) {
		this.alienpack = alienpack;
	}
	
	public void kill() {
		
		  for (Alien alien : alienpack.getAlien()){
	            
			  score += alien.getScore();
	      }
	}
	
}
