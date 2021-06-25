package accessmodifier.game;

public class ProtectedMain1 {
	public static void main(String[] args) {
		ProtectedWarrior w1 = new ProtectedWarrior();
		w1.getAlldata();
		w1.doubleAttack();
		w1.getAlldata();
		w1.hunt();
		w1.getAlldata();
		
		ProtectedArcher w2 = new ProtectedArcher();
		w2.getAlldata();
		w2.MultiShot();
		w2.getAlldata();
		w2.hunt();
		w2.getAlldata();
		
		ProtectedMagician w3 = new ProtectedMagician();
		w3.getAlldata();
		w3.FireBall();
		w3.getAlldata();
		w3.hunt();
		w3.getAlldata();
	}	
}
