package polymorphism.game;

public class Zombie extends Monster{

	public Zombie() {
		super("좀비",20,5,0);
	}
	public void doBattle(int uAtk) {
		setHp(getHp() + getDp() - uAtk);
		if(getHp() <= 0) {
			System.out.println("좀비 몬스터는 죽었습니다.");
		}
	
	}
}

