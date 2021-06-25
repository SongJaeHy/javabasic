package accessmodifier.game;

public class Main1 {
	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		w1.getAllData();
		w1.doubleAttack();
		w1.getAllData();
		w1.hunt();
		w1.getAllData();
		
		Archer w2 = new Archer();
		w2.getAlldata();
		w2.MutilShot();
		w2.getAlldata();
		w2.hunt();
		w2.getAlldata();
		w2.threeShot();
		w2.getAlldata();
		
		Magician w3 = new Magician();
		w3.getAlldata();
		w3.fireBall();
		w3.getAlldata();
		w3.hunt();
		w3.getAlldata();
		w3.Storm();
		w3.getAlldata();
	}
}
