package Q4;

public class AlienPack {

	Alien [] aliens;

	public AlienPack(int size) {
	
		aliens = new Alien[size];
	}
	
	public void addAlien(Alien alien, int index) {
		
		this.aliens[index] = alien;
	}
	
	public Alien [] getAlien() {
		
		return aliens;
	}
}
