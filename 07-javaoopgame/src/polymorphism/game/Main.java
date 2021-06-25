package polymorphism.game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior w1 = new Warrior();
		Zombie z1 = new Zombie();
		
		w1.hunt(z1);
		w1.showStatus();	
		
	}

}
