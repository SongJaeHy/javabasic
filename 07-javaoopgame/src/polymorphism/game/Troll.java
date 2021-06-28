package polymorphism.game;

public class Troll extends Monster{
	public Troll() {
		super("트롤",40,10,5,30);
	}
	public void doBattle(int uAtk) {
		setHp(getHp() + getDp() - uAtk);
		if(getHp() <= 0) {
			System.out.println("좀비 몬스터는 죽었습니다.");
		}
	}
}
