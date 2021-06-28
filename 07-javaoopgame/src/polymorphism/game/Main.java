package polymorphism.game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior w1 = new Warrior();
		Archer w2 = new Archer();
		Monster z1 = new Zombie();
		Monster t1 = new Troll();
		Monster o1 = new Ogresse();
		Monster m1 = new Wyvern();
		
		w1.doubleAttack(z1);
		w1.showStatus();
		
		w2.MutilShot(o1);
		w2.hunt(o1);
		w2.showStatus();
	}
}
